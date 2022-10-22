package typingsJapgolly.senchaTouch.Ext.field

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITextArea
  extends StObject
     with IText {
  
  /** [Method] Returns the value of maxRows
    * @returns Number
    */
  var getMaxRows: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Config Option] (Number) */
  var maxRows: js.UndefOr[Double] = js.undefined
  
  /** [Method] Sets the value of maxRows
    * @param maxRows Number The new value.
    */
  var setMaxRows: js.UndefOr[js.Function1[/* maxRows */ js.UndefOr[Double], Unit]] = js.undefined
}
object ITextArea {
  
  inline def apply(): ITextArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextArea]
  }
  
  extension [Self <: ITextArea](x: Self) {
    
    inline def setGetMaxRows(value: CallbackTo[Double]): Self = StObject.set(x, "getMaxRows", value.toJsFn)
    
    inline def setGetMaxRowsUndefined: Self = StObject.set(x, "getMaxRows", js.undefined)
    
    inline def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
    
    inline def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
    
    inline def setSetMaxRows(value: /* maxRows */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setMaxRows", js.Any.fromFunction1((t0: /* maxRows */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetMaxRowsUndefined: Self = StObject.set(x, "setMaxRows", js.undefined)
  }
}
