import Foundation

import UIKit

class NativeViewController: UIViewController {
  var message: String = ""
  override func viewDidLoad() {
    super.viewDidLoad()
    
    self.view.backgroundColor = .white
    
    let H = self.view.frame.height * 0.5
    let W = self.view.frame.width * 0.3
    let X = self.view.bounds.midX - (W/2)
    let Y = self.view.bounds.midY - (H/2)
    
    let lblMessage = UILabel(frame: CGRect(x:X, y: Y, width: W, height: H))
    lblMessage.textColor = UIColor.black
    lblMessage.text = message
    self.view.addSubview(lblMessage)
  }
}
