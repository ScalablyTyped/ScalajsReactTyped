package typingsJapgolly.inboxsdk.mod.Router

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inboxsdk.inboxsdkStrings.destroy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteView extends StObject {
  
  var destroyed: Boolean
  
  def getParams(): RouteParams
  
  def getRouteID(): String
  
  def getRouteType(): RouteTypes
  
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
}
object RouteView {
  
  inline def apply(
    destroyed: Boolean,
    getParams: CallbackTo[RouteParams],
    getRouteID: CallbackTo[String],
    getRouteType: CallbackTo[RouteTypes],
    on: (destroy, js.Function0[Unit]) => Callback
  ): RouteView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any], getParams = getParams.toJsFn, getRouteID = getRouteID.toJsFn, getRouteType = getRouteType.toJsFn, on = js.Any.fromFunction2((t0: destroy, t1: js.Function0[Unit]) => (on(t0, t1)).runNow()))
    __obj.asInstanceOf[RouteView]
  }
  
  extension [Self <: RouteView](x: Self) {
    
    inline def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
    
    inline def setGetParams(value: CallbackTo[RouteParams]): Self = StObject.set(x, "getParams", value.toJsFn)
    
    inline def setGetRouteID(value: CallbackTo[String]): Self = StObject.set(x, "getRouteID", value.toJsFn)
    
    inline def setGetRouteType(value: CallbackTo[RouteTypes]): Self = StObject.set(x, "getRouteType", value.toJsFn)
    
    inline def setOn(value: (destroy, js.Function0[Unit]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: destroy, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
  }
}
