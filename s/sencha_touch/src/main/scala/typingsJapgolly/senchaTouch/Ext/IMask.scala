package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMask
  extends StObject
     with IComponent {
  
  /** [Method] Returns the value of transparent
    * @returns Boolean
    */
  var getTransparent: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Sets the value of transparent
    * @param transparent Boolean The new value.
    */
  var setTransparent: js.UndefOr[js.Function1[/* transparent */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var transparent: js.UndefOr[Boolean] = js.undefined
}
object IMask {
  
  inline def apply(): IMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMask]
  }
  
  extension [Self <: IMask](x: Self) {
    
    inline def setGetTransparent(value: CallbackTo[Boolean]): Self = StObject.set(x, "getTransparent", value.toJsFn)
    
    inline def setGetTransparentUndefined: Self = StObject.set(x, "getTransparent", js.undefined)
    
    inline def setSetTransparent(value: /* transparent */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setTransparent", js.Any.fromFunction1((t0: /* transparent */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetTransparentUndefined: Self = StObject.set(x, "setTransparent", js.undefined)
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
  }
}
