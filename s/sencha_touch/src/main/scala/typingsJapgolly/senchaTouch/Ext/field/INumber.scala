package typingsJapgolly.senchaTouch.Ext.field

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INumber
  extends StObject
     with IText {
  
  /** [Method] Returns the value of maxValue
    * @returns Number
    */
  var getMaxValue: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of minValue
    * @returns Number
    */
  var getMinValue: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of stepValue
    * @returns Number
    */
  var getStepValue: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[Double] = js.undefined
  
  /** [Method] Sets the value of maxValue
    * @param maxValue Number The new value.
    */
  var setMaxValue: js.UndefOr[js.Function1[/* maxValue */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of minValue
    * @param minValue Number The new value.
    */
  var setMinValue: js.UndefOr[js.Function1[/* minValue */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of stepValue
    * @param stepValue Number The new value.
    */
  var setStepValue: js.UndefOr[js.Function1[/* stepValue */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Config Option] (Number) */
  var stepValue: js.UndefOr[Double] = js.undefined
}
object INumber {
  
  inline def apply(): INumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INumber]
  }
  
  extension [Self <: INumber](x: Self) {
    
    inline def setGetMaxValue(value: CallbackTo[Double]): Self = StObject.set(x, "getMaxValue", value.toJsFn)
    
    inline def setGetMaxValueUndefined: Self = StObject.set(x, "getMaxValue", js.undefined)
    
    inline def setGetMinValue(value: CallbackTo[Double]): Self = StObject.set(x, "getMinValue", value.toJsFn)
    
    inline def setGetMinValueUndefined: Self = StObject.set(x, "getMinValue", js.undefined)
    
    inline def setGetStepValue(value: CallbackTo[Double]): Self = StObject.set(x, "getStepValue", value.toJsFn)
    
    inline def setGetStepValueUndefined: Self = StObject.set(x, "getStepValue", js.undefined)
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setSetMaxValue(value: /* maxValue */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setMaxValue", js.Any.fromFunction1((t0: /* maxValue */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetMaxValueUndefined: Self = StObject.set(x, "setMaxValue", js.undefined)
    
    inline def setSetMinValue(value: /* minValue */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setMinValue", js.Any.fromFunction1((t0: /* minValue */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetMinValueUndefined: Self = StObject.set(x, "setMinValue", js.undefined)
    
    inline def setSetStepValue(value: /* stepValue */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setStepValue", js.Any.fromFunction1((t0: /* stepValue */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetStepValueUndefined: Self = StObject.set(x, "setStepValue", js.undefined)
    
    inline def setStepValue(value: Double): Self = StObject.set(x, "stepValue", value.asInstanceOf[js.Any])
    
    inline def setStepValueUndefined: Self = StObject.set(x, "stepValue", js.undefined)
  }
}
