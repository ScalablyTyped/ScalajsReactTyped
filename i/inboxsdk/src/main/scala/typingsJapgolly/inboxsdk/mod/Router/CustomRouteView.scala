package typingsJapgolly.inboxsdk.mod.Router

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.inboxsdk.inboxsdkStrings.destroy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomRouteView
  extends StObject
     with RouteView {
  
  def getElement(): HTMLElement
  
  def setFullWidth(fullWidth: Boolean): Unit
}
object CustomRouteView {
  
  inline def apply(
    destroyed: Boolean,
    getElement: CallbackTo[HTMLElement],
    getParams: CallbackTo[RouteParams],
    getRouteID: CallbackTo[String],
    getRouteType: CallbackTo[RouteTypes],
    on: (destroy, js.Function0[Unit]) => Callback,
    setFullWidth: Boolean => Callback
  ): CustomRouteView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any], getElement = getElement.toJsFn, getParams = getParams.toJsFn, getRouteID = getRouteID.toJsFn, getRouteType = getRouteType.toJsFn, on = js.Any.fromFunction2((t0: destroy, t1: js.Function0[Unit]) => (on(t0, t1)).runNow()), setFullWidth = js.Any.fromFunction1((t0: Boolean) => setFullWidth(t0).runNow()))
    __obj.asInstanceOf[CustomRouteView]
  }
  
  extension [Self <: CustomRouteView](x: Self) {
    
    inline def setGetElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getElement", value.toJsFn)
    
    inline def setSetFullWidth(value: Boolean => Callback): Self = StObject.set(x, "setFullWidth", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
