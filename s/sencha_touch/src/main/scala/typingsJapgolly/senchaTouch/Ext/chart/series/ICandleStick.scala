package typingsJapgolly.senchaTouch.Ext.chart.series

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICandleStick
  extends StObject
     with ICartesian {
  
  /** [Config Option] (String) */
  var closeField: js.UndefOr[String] = js.undefined
  
  /** [Method] Returns the value of closeField
    * @returns String
    */
  var getCloseField: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of highField
    * @returns String
    */
  var getHighField: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of lowField
    * @returns String
    */
  var getLowField: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of openField
    * @returns String
    */
  var getOpenField: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Config Option] (String) */
  var highField: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var lowField: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var openField: js.UndefOr[String] = js.undefined
  
  /** [Method] Sets the value of closeField
    * @param closeField String The new value.
    */
  var setCloseField: js.UndefOr[js.Function1[/* closeField */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of highField
    * @param highField String The new value.
    */
  var setHighField: js.UndefOr[js.Function1[/* highField */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of lowField
    * @param lowField String The new value.
    */
  var setLowField: js.UndefOr[js.Function1[/* lowField */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of openField
    * @param openField String The new value.
    */
  var setOpenField: js.UndefOr[js.Function1[/* openField */ js.UndefOr[String], Unit]] = js.undefined
}
object ICandleStick {
  
  inline def apply(): ICandleStick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICandleStick]
  }
  
  extension [Self <: ICandleStick](x: Self) {
    
    inline def setCloseField(value: String): Self = StObject.set(x, "closeField", value.asInstanceOf[js.Any])
    
    inline def setCloseFieldUndefined: Self = StObject.set(x, "closeField", js.undefined)
    
    inline def setGetCloseField(value: CallbackTo[String]): Self = StObject.set(x, "getCloseField", value.toJsFn)
    
    inline def setGetCloseFieldUndefined: Self = StObject.set(x, "getCloseField", js.undefined)
    
    inline def setGetHighField(value: CallbackTo[String]): Self = StObject.set(x, "getHighField", value.toJsFn)
    
    inline def setGetHighFieldUndefined: Self = StObject.set(x, "getHighField", js.undefined)
    
    inline def setGetLowField(value: CallbackTo[String]): Self = StObject.set(x, "getLowField", value.toJsFn)
    
    inline def setGetLowFieldUndefined: Self = StObject.set(x, "getLowField", js.undefined)
    
    inline def setGetOpenField(value: CallbackTo[String]): Self = StObject.set(x, "getOpenField", value.toJsFn)
    
    inline def setGetOpenFieldUndefined: Self = StObject.set(x, "getOpenField", js.undefined)
    
    inline def setHighField(value: String): Self = StObject.set(x, "highField", value.asInstanceOf[js.Any])
    
    inline def setHighFieldUndefined: Self = StObject.set(x, "highField", js.undefined)
    
    inline def setLowField(value: String): Self = StObject.set(x, "lowField", value.asInstanceOf[js.Any])
    
    inline def setLowFieldUndefined: Self = StObject.set(x, "lowField", js.undefined)
    
    inline def setOpenField(value: String): Self = StObject.set(x, "openField", value.asInstanceOf[js.Any])
    
    inline def setOpenFieldUndefined: Self = StObject.set(x, "openField", js.undefined)
    
    inline def setSetCloseField(value: /* closeField */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setCloseField", js.Any.fromFunction1((t0: /* closeField */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetCloseFieldUndefined: Self = StObject.set(x, "setCloseField", js.undefined)
    
    inline def setSetHighField(value: /* highField */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setHighField", js.Any.fromFunction1((t0: /* highField */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetHighFieldUndefined: Self = StObject.set(x, "setHighField", js.undefined)
    
    inline def setSetLowField(value: /* lowField */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setLowField", js.Any.fromFunction1((t0: /* lowField */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetLowFieldUndefined: Self = StObject.set(x, "setLowField", js.undefined)
    
    inline def setSetOpenField(value: /* openField */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setOpenField", js.Any.fromFunction1((t0: /* openField */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetOpenFieldUndefined: Self = StObject.set(x, "setOpenField", js.undefined)
  }
}
