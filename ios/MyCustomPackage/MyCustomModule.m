#import <React/RCTBridgeModule.h>

@interface RCT_EXTERN_MODULE(MyCustomModule, NSObject)


RCT_EXTERN_METHOD(openNativeScreen:(NSString *)message)

// Required for DispatchQueue.main.async
+ (BOOL)requiresMainQueueSetup
{
    return YES;
}

@end
