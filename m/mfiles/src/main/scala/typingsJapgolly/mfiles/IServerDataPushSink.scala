package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerDataPushSink extends js.Object {
  def OnServerDataPush(RequestID: Double, JsonDataContent: String): Unit
}

object IServerDataPushSink {
  @scala.inline
  def apply(OnServerDataPush: (Double, String) => Callback): IServerDataPushSink = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("OnServerDataPush")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => OnServerDataPush(t0, t1).runNow()))
    __obj.asInstanceOf[IServerDataPushSink]
  }
}

