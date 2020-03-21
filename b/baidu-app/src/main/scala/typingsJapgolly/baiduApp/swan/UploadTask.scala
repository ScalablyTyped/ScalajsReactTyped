package typingsJapgolly.baiduApp.swan

import typingsJapgolly.baiduApp.AnonProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadTask extends js.Object {
  /**
  		 * 中断下载任务
  		 * @version 1.4.0
  		 */
  def abort(): Unit = js.native
  /**
  		 * 监听上传进度变化
  		 * @version 1.4.0
  		 */
  def onProgressUpdate(): Unit = js.native
  def onProgressUpdate(callback: js.Function1[/* res */ AnonProgress, Unit]): Unit = js.native
}

