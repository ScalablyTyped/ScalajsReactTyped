package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraContext extends js.Object {
  /** 开始录像 */
  def startRecord(options: StartRecordOptions): Unit
  /** 结束录像，成功则返回封面与视频 */
  def stopRecord(options: StopRecordOptions): Unit
  /** 拍照，可指定质量，成功则返回图片 */
  def takePhoto(options: TakePhotoOptions): Unit
}

object CameraContext {
  @scala.inline
  def apply(
    startRecord: StartRecordOptions => Callback,
    stopRecord: StopRecordOptions => Callback,
    takePhoto: TakePhotoOptions => Callback
  ): CameraContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("startRecord")(js.Any.fromFunction1((t0: typingsJapgolly.baiduApp.swan.StartRecordOptions) => startRecord(t0).runNow()))
    __obj.updateDynamic("stopRecord")(js.Any.fromFunction1((t0: typingsJapgolly.baiduApp.swan.StopRecordOptions) => stopRecord(t0).runNow()))
    __obj.updateDynamic("takePhoto")(js.Any.fromFunction1((t0: typingsJapgolly.baiduApp.swan.TakePhotoOptions) => takePhoto(t0).runNow()))
    __obj.asInstanceOf[CameraContext]
  }
}

