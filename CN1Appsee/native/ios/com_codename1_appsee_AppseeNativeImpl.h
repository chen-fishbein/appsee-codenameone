#import <Foundation/Foundation.h>

@interface com_codename1_appsee_AppseeNativeImpl : NSObject {
}

-(void)start:(NSString*)param;
-(void)resume;
-(void)stop;
-(void)setLocation:(double)param param1:(double)param1 param2:(float)param2 param3:(float)param3;
-(void)addEvent:(NSString*)param;
-(void)pause;
-(void)setLocationDescription:(NSString*)param;
-(void)setOptOutStatus:(BOOL)param;
-(void)stopAndUpload;
-(BOOL)getOptOutStatus;
-(void)startScreen:(NSString*)param;
-(void)setUserId:(NSString*)param;
-(BOOL)isSupported;
@end
