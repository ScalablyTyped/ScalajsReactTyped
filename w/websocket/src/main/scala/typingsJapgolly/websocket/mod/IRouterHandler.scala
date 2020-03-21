package typingsJapgolly.websocket.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRouterHandler extends js.Object {
  var path: String
  var pathString: String
  var protocol: String
  def callback(request: IRouterRequest): Unit
}

object IRouterHandler {
  @scala.inline
  def apply(callback: IRouterRequest => Callback, path: String, pathString: String, protocol: String): IRouterHandler = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], pathString = pathString.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: typingsJapgolly.websocket.mod.IRouterRequest) => callback(t0).runNow()))
    __obj.asInstanceOf[IRouterHandler]
  }
}

