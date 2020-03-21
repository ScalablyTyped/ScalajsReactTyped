package typingsJapgolly.builderUtilRuntime.httpExecutorMod

import typingsJapgolly.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadCallOptions extends js.Object {
  var destination: String | Null = js.native
  var options: DownloadOptions = js.native
  var responseHandler: (js.Function2[
    /* response */ IncomingMessage, 
    /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
    Unit
  ]) | Null = js.native
  def callback(): Unit = js.native
  def callback(error: js.Error): Unit = js.native
  def onCancel(callback: js.Function0[Unit]): Unit = js.native
}

