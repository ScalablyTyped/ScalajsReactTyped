package typingsJapgolly.senchaTouch.Ext.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPositionMap
  extends StObject
     with IBase {
  
  /** [Method] Returns the value of minimumHeight
    * @returns Number
    */
  var getMinimumHeight: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Sets the value of minimumHeight
    * @param minimumHeight Number The new value.
    */
  var setMinimumHeight: js.UndefOr[js.Function1[/* minimumHeight */ js.UndefOr[Double], Unit]] = js.undefined
}
object IPositionMap {
  
  inline def apply(): IPositionMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPositionMap]
  }
  
  extension [Self <: IPositionMap](x: Self) {
    
    inline def setGetMinimumHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getMinimumHeight", value.toJsFn)
    
    inline def setGetMinimumHeightUndefined: Self = StObject.set(x, "getMinimumHeight", js.undefined)
    
    inline def setSetMinimumHeight(value: /* minimumHeight */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setMinimumHeight", js.Any.fromFunction1((t0: /* minimumHeight */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetMinimumHeightUndefined: Self = StObject.set(x, "setMinimumHeight", js.undefined)
  }
}
