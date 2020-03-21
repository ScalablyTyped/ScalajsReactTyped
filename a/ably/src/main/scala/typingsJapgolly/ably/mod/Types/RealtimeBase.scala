package typingsJapgolly.ably.mod.Types

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealtimeBase extends RestBase {
  var clientId: String
  def close(): Unit
  def connect(): Unit
}

object RealtimeBase {
  @scala.inline
  def apply(clientId: String, close: Callback, connect: Callback): RealtimeBase = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("connect")(connect.toJsFn)
    __obj.asInstanceOf[RealtimeBase]
  }
}

