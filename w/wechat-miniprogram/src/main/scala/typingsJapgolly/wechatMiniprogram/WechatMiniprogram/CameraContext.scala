package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraContext extends StObject {
  
  /** [[CameraFrameListener](https://developers.weixin.qq.com/miniprogram/dev/api/media/camera/CameraFrameListener.html) CameraContext.onCameraFrame(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/camera/CameraContext.onCameraFrame.html)
  *
  * 获取 Camera 实时帧数据
  *
  * ****
  *
  * 注： 使用该接口需同时在 [camera](https://developers.weixin.qq.com/miniprogram/dev/component/camera.html) 组件属性中指定 frame-size。
  *
  * **示例代码**
  *
  *
  * ```js
  const context = wx.createCameraContext()
  const listener = context.onCameraFrame((frame) => {
    console.log(frame.data instanceof ArrayBuffer, frame.width, frame.height)
  })
  listener.start()
  ```
  *
  * 最低基础库： `2.7.0` */
  def onCameraFrame(/** 回调函数 */
  callback: OnCameraFrameCallback): CameraFrameListener
  
  /** [CameraContext.setZoom(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/camera/CameraContext.setZoom.html)
    *
    * 设置缩放级别
    *
    * 最低基础库： `2.10.0` */
  def setZoom(option: SetZoomOption): Unit
  
  /** [CameraContext.startRecord(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/camera/CameraContext.startRecord.html)
    *
    * 开始录像 */
  def startRecord(option: CameraContextStartRecordOption): Unit
  
  /** [CameraContext.stopRecord(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/camera/CameraContext.stopRecord.html)
    *
    * 结束录像 */
  def stopRecord(option: CameraContextStopRecordOption): Unit
  
  /** [CameraContext.takePhoto(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/camera/CameraContext.takePhoto.html)
    *
    * 拍摄照片 */
  def takePhoto(option: TakePhotoOption): Unit
}
object CameraContext {
  
  inline def apply(
    onCameraFrame: OnCameraFrameCallback => CameraFrameListener,
    setZoom: SetZoomOption => Callback,
    startRecord: CameraContextStartRecordOption => Callback,
    stopRecord: CameraContextStopRecordOption => Callback,
    takePhoto: TakePhotoOption => Callback
  ): CameraContext = {
    val __obj = js.Dynamic.literal(onCameraFrame = js.Any.fromFunction1(onCameraFrame), setZoom = js.Any.fromFunction1((t0: SetZoomOption) => setZoom(t0).runNow()), startRecord = js.Any.fromFunction1((t0: CameraContextStartRecordOption) => startRecord(t0).runNow()), stopRecord = js.Any.fromFunction1((t0: CameraContextStopRecordOption) => stopRecord(t0).runNow()), takePhoto = js.Any.fromFunction1((t0: TakePhotoOption) => takePhoto(t0).runNow()))
    __obj.asInstanceOf[CameraContext]
  }
  
  extension [Self <: CameraContext](x: Self) {
    
    inline def setOnCameraFrame(value: OnCameraFrameCallback => CameraFrameListener): Self = StObject.set(x, "onCameraFrame", js.Any.fromFunction1(value))
    
    inline def setSetZoom(value: SetZoomOption => Callback): Self = StObject.set(x, "setZoom", js.Any.fromFunction1((t0: SetZoomOption) => value(t0).runNow()))
    
    inline def setStartRecord(value: CameraContextStartRecordOption => Callback): Self = StObject.set(x, "startRecord", js.Any.fromFunction1((t0: CameraContextStartRecordOption) => value(t0).runNow()))
    
    inline def setStopRecord(value: CameraContextStopRecordOption => Callback): Self = StObject.set(x, "stopRecord", js.Any.fromFunction1((t0: CameraContextStopRecordOption) => value(t0).runNow()))
    
    inline def setTakePhoto(value: TakePhotoOption => Callback): Self = StObject.set(x, "takePhoto", js.Any.fromFunction1((t0: TakePhotoOption) => value(t0).runNow()))
  }
}
