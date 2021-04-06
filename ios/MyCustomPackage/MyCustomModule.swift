@objc (MyCustomModule)
class MyCustomModule: NSObject {
  
  @objc(openNativeScreen:)
  func openNativeScreen(message: NSString) -> Void {
    print(message);
    DispatchQueue.main.async {
      let appDelegate = UIApplication.shared.delegate as! AppDelegate
      let viewController = NativeViewController()
      viewController.message = message as String
      viewController.modalPresentationStyle = .fullScreen
      appDelegate.window?.rootViewController?.present(viewController, animated: false)
    }
  }
}





