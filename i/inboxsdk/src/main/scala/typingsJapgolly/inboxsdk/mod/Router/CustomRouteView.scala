package typingsJapgolly.inboxsdk.mod.Router

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomRouteView extends RouteView {
  def getElement(): HTMLElement
  def setFullWidth(fullWidth: Boolean): Unit
}

object CustomRouteView {
  @scala.inline
  def apply(
    destroyed: Boolean,
    getElement: CallbackTo[HTMLElement],
    getParams: CallbackTo[RouteParams],
    getRouteID: CallbackTo[String],
    getRouteType: CallbackTo[RouteTypes],
    on: (destroy, js.Function0[Unit]) => Callback,
    setFullWidth: Boolean => Callback
  ): CustomRouteView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any])
    __obj.updateDynamic("getElement")(getElement.toJsFn)
    __obj.updateDynamic("getParams")(getParams.toJsFn)
    __obj.updateDynamic("getRouteID")(getRouteID.toJsFn)
    __obj.updateDynamic("getRouteType")(getRouteType.toJsFn)
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: typingsJapgolly.inboxsdk.inboxsdkStrings.destroy, t1: js.Function0[scala.Unit]) => on(t0, t1).runNow()))
    __obj.updateDynamic("setFullWidth")(js.Any.fromFunction1((t0: scala.Boolean) => setFullWidth(t0).runNow()))
    __obj.asInstanceOf[CustomRouteView]
  }
}

