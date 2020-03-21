package typingsJapgolly.angularSignalrHub.ngSignalr

import typingsJapgolly.jquery.JQueryDeferred
import typingsJapgolly.jquery.JQueryPromise
import typingsJapgolly.signalr.SignalR.Connection
import typingsJapgolly.signalr.SignalR.Hub.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ngSignalr.Hub")
@js.native
class Hub () extends js.Object {
  var connection: Connection = js.native
  var hubName: String = js.native
  var proxy: Proxy = js.native
  def connect(): JQueryPromise[_] = js.native
  def disconnect(): Unit = js.native
  def invoke(method: String, args: js.Any*): JQueryDeferred[_] = js.native
  def on(event: String, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
}

