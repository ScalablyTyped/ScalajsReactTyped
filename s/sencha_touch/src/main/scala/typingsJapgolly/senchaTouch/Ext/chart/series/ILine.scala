package typingsJapgolly.senchaTouch.Ext.chart.series

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILine
  extends StObject
     with ICartesian {
  
  /** [Config Option] (Boolean) */
  var fill: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Returns the value of aggregator
    * @returns Object
    */
  var getAggregator: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of fill
    * @returns Boolean
    */
  var getFill: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of selectionTolerance
    * @returns Number
    */
  var getSelectionTolerance: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of smooth
    * @returns Boolean/Number
    */
  var getSmooth: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of step
    * @returns Boolean
    */
  var getStep: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Config Option] (Number) */
  var selectionTolerance: js.UndefOr[Double] = js.undefined
  
  /** [Method] Sets the value of aggregator
    * @param aggregator Object The new value.
    */
  var setAggregator: js.UndefOr[js.Function1[/* aggregator */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of fill
    * @param fill Boolean The new value.
    */
  var setFill: js.UndefOr[js.Function1[/* fill */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of selectionTolerance
    * @param selectionTolerance Number The new value.
    */
  var setSelectionTolerance: js.UndefOr[js.Function1[/* selectionTolerance */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of smooth
    * @param smooth Boolean/Number The new value.
    */
  var setSmooth: js.UndefOr[js.Function1[/* smooth */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of step
    * @param step Boolean The new value.
    */
  var setStep: js.UndefOr[js.Function1[/* step */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Config Option] (Boolean/Number) */
  var smooth: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var step: js.UndefOr[Boolean] = js.undefined
}
object ILine {
  
  inline def apply(): ILine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILine]
  }
  
  extension [Self <: ILine](x: Self) {
    
    inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setGetAggregator(value: CallbackTo[Any]): Self = StObject.set(x, "getAggregator", value.toJsFn)
    
    inline def setGetAggregatorUndefined: Self = StObject.set(x, "getAggregator", js.undefined)
    
    inline def setGetFill(value: CallbackTo[Boolean]): Self = StObject.set(x, "getFill", value.toJsFn)
    
    inline def setGetFillUndefined: Self = StObject.set(x, "getFill", js.undefined)
    
    inline def setGetSelectionTolerance(value: CallbackTo[Double]): Self = StObject.set(x, "getSelectionTolerance", value.toJsFn)
    
    inline def setGetSelectionToleranceUndefined: Self = StObject.set(x, "getSelectionTolerance", js.undefined)
    
    inline def setGetSmooth(value: CallbackTo[Any]): Self = StObject.set(x, "getSmooth", value.toJsFn)
    
    inline def setGetSmoothUndefined: Self = StObject.set(x, "getSmooth", js.undefined)
    
    inline def setGetStep(value: CallbackTo[Boolean]): Self = StObject.set(x, "getStep", value.toJsFn)
    
    inline def setGetStepUndefined: Self = StObject.set(x, "getStep", js.undefined)
    
    inline def setSelectionTolerance(value: Double): Self = StObject.set(x, "selectionTolerance", value.asInstanceOf[js.Any])
    
    inline def setSelectionToleranceUndefined: Self = StObject.set(x, "selectionTolerance", js.undefined)
    
    inline def setSetAggregator(value: /* aggregator */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setAggregator", js.Any.fromFunction1((t0: /* aggregator */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetAggregatorUndefined: Self = StObject.set(x, "setAggregator", js.undefined)
    
    inline def setSetFill(value: /* fill */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setFill", js.Any.fromFunction1((t0: /* fill */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetFillUndefined: Self = StObject.set(x, "setFill", js.undefined)
    
    inline def setSetSelectionTolerance(value: /* selectionTolerance */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setSelectionTolerance", js.Any.fromFunction1((t0: /* selectionTolerance */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetSelectionToleranceUndefined: Self = StObject.set(x, "setSelectionTolerance", js.undefined)
    
    inline def setSetSmooth(value: /* smooth */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setSmooth", js.Any.fromFunction1((t0: /* smooth */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetSmoothUndefined: Self = StObject.set(x, "setSmooth", js.undefined)
    
    inline def setSetStep(value: /* step */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setStep", js.Any.fromFunction1((t0: /* step */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetStepUndefined: Self = StObject.set(x, "setStep", js.undefined)
    
    inline def setSmooth(value: Any): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
    
    inline def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
    
    inline def setStep(value: Boolean): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
