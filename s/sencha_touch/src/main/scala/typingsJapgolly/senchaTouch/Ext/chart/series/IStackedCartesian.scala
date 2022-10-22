package typingsJapgolly.senchaTouch.Ext.chart.series

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStackedCartesian
  extends StObject
     with ICartesian {
  
  /** [Method] Returns the value of stacked
    * @returns Boolean
    */
  var getStacked: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Config Option] (Array) */
  @JSName("hidden")
  var hidden_IStackedCartesian: js.UndefOr[Array] = js.undefined
  
  /** [Method] Sets the value of hidden
    * @param hidden Array The new value.
    */
  @JSName("setHidden")
  var setHidden_IStackedCartesian: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Sets the value of stacked
    * @param stacked Boolean The new value.
    */
  var setStacked: js.UndefOr[js.Function1[/* stacked */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var stacked: js.UndefOr[Boolean] = js.undefined
}
object IStackedCartesian {
  
  inline def apply(): IStackedCartesian = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStackedCartesian]
  }
  
  extension [Self <: IStackedCartesian](x: Self) {
    
    inline def setGetStacked(value: CallbackTo[Boolean]): Self = StObject.set(x, "getStacked", value.toJsFn)
    
    inline def setGetStackedUndefined: Self = StObject.set(x, "getStacked", js.undefined)
    
    inline def setHidden(value: Array): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setSetHidden(value: /* hidden */ js.UndefOr[Array] => Callback): Self = StObject.set(x, "setHidden", js.Any.fromFunction1((t0: /* hidden */ js.UndefOr[Array]) => value(t0).runNow()))
    
    inline def setSetHiddenUndefined: Self = StObject.set(x, "setHidden", js.undefined)
    
    inline def setSetStacked(value: /* stacked */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setStacked", js.Any.fromFunction1((t0: /* stacked */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetStackedUndefined: Self = StObject.set(x, "setStacked", js.undefined)
    
    inline def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
    
    inline def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
  }
}
