package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraContext extends StObject {
  
  /** 开始录像 */
  def startRecord(options: StartRecordOptions): Unit
  
  /** 结束录像，成功则返回封面与视频 */
  def stopRecord(options: StopRecordOptions): Unit
  
  /** 拍照，可指定质量，成功则返回图片 */
  def takePhoto(options: TakePhotoOptions): Unit
}
object CameraContext {
  
  inline def apply(
    startRecord: StartRecordOptions => Callback,
    stopRecord: StopRecordOptions => Callback,
    takePhoto: TakePhotoOptions => Callback
  ): CameraContext = {
    val __obj = js.Dynamic.literal(startRecord = js.Any.fromFunction1((t0: StartRecordOptions) => startRecord(t0).runNow()), stopRecord = js.Any.fromFunction1((t0: StopRecordOptions) => stopRecord(t0).runNow()), takePhoto = js.Any.fromFunction1((t0: TakePhotoOptions) => takePhoto(t0).runNow()))
    __obj.asInstanceOf[CameraContext]
  }
  
  extension [Self <: CameraContext](x: Self) {
    
    inline def setStartRecord(value: StartRecordOptions => Callback): Self = StObject.set(x, "startRecord", js.Any.fromFunction1((t0: StartRecordOptions) => value(t0).runNow()))
    
    inline def setStopRecord(value: StopRecordOptions => Callback): Self = StObject.set(x, "stopRecord", js.Any.fromFunction1((t0: StopRecordOptions) => value(t0).runNow()))
    
    inline def setTakePhoto(value: TakePhotoOptions => Callback): Self = StObject.set(x, "takePhoto", js.Any.fromFunction1((t0: TakePhotoOptions) => value(t0).runNow()))
  }
}
