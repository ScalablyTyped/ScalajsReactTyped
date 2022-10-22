package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDecorator
  extends StObject
     with IComponent {
  
  /** [Config Option] (Object) */
  var component: js.UndefOr[Any] = js.undefined
  
  /** [Method] Returns the value of component
    * @returns Object
    */
  var getComponent: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Sets the value of component
    * @param component Object The new value.
    */
  var setComponent: js.UndefOr[js.Function1[/* component */ js.UndefOr[Any], Unit]] = js.undefined
}
object IDecorator {
  
  inline def apply(): IDecorator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDecorator]
  }
  
  extension [Self <: IDecorator](x: Self) {
    
    inline def setComponent(value: Any): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setGetComponent(value: CallbackTo[Any]): Self = StObject.set(x, "getComponent", value.toJsFn)
    
    inline def setGetComponentUndefined: Self = StObject.set(x, "getComponent", js.undefined)
    
    inline def setSetComponent(value: /* component */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setComponent", js.Any.fromFunction1((t0: /* component */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetComponentUndefined: Self = StObject.set(x, "setComponent", js.undefined)
  }
}
