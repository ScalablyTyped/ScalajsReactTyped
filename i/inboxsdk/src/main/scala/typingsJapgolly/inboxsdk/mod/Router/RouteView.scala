package typingsJapgolly.inboxsdk.mod.Router

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteView extends js.Object {
  var destroyed: Boolean
  def getParams(): RouteParams
  def getRouteID(): String
  def getRouteType(): RouteTypes
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
}

object RouteView {
  @scala.inline
  def apply(
    destroyed: Boolean,
    getParams: CallbackTo[RouteParams],
    getRouteID: CallbackTo[String],
    getRouteType: CallbackTo[RouteTypes],
    on: (destroy, js.Function0[Unit]) => Callback
  ): RouteView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any])
    __obj.updateDynamic("getParams")(getParams.toJsFn)
    __obj.updateDynamic("getRouteID")(getRouteID.toJsFn)
    __obj.updateDynamic("getRouteType")(getRouteType.toJsFn)
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: typingsJapgolly.inboxsdk.inboxsdkStrings.destroy, t1: js.Function0[scala.Unit]) => on(t0, t1).runNow()))
    __obj.asInstanceOf[RouteView]
  }
}

