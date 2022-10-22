package typingsJapgolly.senchaTouch.Ext.chart

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IChart
  extends StObject
     with IAbstractChart {
  
  /** [Config Option] (Boolean) */
  var flipXY: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Returns the value of flipXY
    * @returns Boolean
    */
  var getFlipXY: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of innerRegion
    * @returns Array
    */
  var getInnerRegion: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Layout the axes and series  */
  var performLayout: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Sets the value of flipXY
    * @param flipXY Boolean The new value.
    */
  var setFlipXY: js.UndefOr[js.Function1[/* flipXY */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of innerRegion
    * @param innerRegion Array The new value.
    */
  var setInnerRegion: js.UndefOr[js.Function1[/* innerRegion */ js.UndefOr[Array], Unit]] = js.undefined
}
object IChart {
  
  inline def apply(): IChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChart]
  }
  
  extension [Self <: IChart](x: Self) {
    
    inline def setFlipXY(value: Boolean): Self = StObject.set(x, "flipXY", value.asInstanceOf[js.Any])
    
    inline def setFlipXYUndefined: Self = StObject.set(x, "flipXY", js.undefined)
    
    inline def setGetFlipXY(value: CallbackTo[Boolean]): Self = StObject.set(x, "getFlipXY", value.toJsFn)
    
    inline def setGetFlipXYUndefined: Self = StObject.set(x, "getFlipXY", js.undefined)
    
    inline def setGetInnerRegion(value: CallbackTo[Array]): Self = StObject.set(x, "getInnerRegion", value.toJsFn)
    
    inline def setGetInnerRegionUndefined: Self = StObject.set(x, "getInnerRegion", js.undefined)
    
    inline def setPerformLayout(value: Callback): Self = StObject.set(x, "performLayout", value.toJsFn)
    
    inline def setPerformLayoutUndefined: Self = StObject.set(x, "performLayout", js.undefined)
    
    inline def setSetFlipXY(value: /* flipXY */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setFlipXY", js.Any.fromFunction1((t0: /* flipXY */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetFlipXYUndefined: Self = StObject.set(x, "setFlipXY", js.undefined)
    
    inline def setSetInnerRegion(value: /* innerRegion */ js.UndefOr[Array] => Callback): Self = StObject.set(x, "setInnerRegion", js.Any.fromFunction1((t0: /* innerRegion */ js.UndefOr[Array]) => value(t0).runNow()))
    
    inline def setSetInnerRegionUndefined: Self = StObject.set(x, "setInnerRegion", js.undefined)
  }
}
