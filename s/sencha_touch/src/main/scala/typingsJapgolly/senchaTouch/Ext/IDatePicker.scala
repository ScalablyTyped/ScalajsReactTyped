package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDatePicker
  extends StObject
     with typingsJapgolly.senchaTouch.Ext.picker.IPicker {
  
  /** [Config Option] (String) */
  var dayText: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Returns the value of dayText
    * @returns String
    */
  var getDayText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of monthText
    * @returns String
    */
  var getMonthText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of slotOrder
    * @returns Array
    */
  var getSlotOrder: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the value of yearFrom
    * @returns Number
    */
  var getYearFrom: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of yearText
    * @returns String
    */
  var getYearText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of yearTo
    * @returns Number
    */
  var getYearTo: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Config Option] (String) */
  var monthText: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Sets the value of dayText
    * @param dayText String The new value.
    */
  var setDayText: js.UndefOr[js.Function1[/* dayText */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of monthText
    * @param monthText String The new value.
    */
  var setMonthText: js.UndefOr[js.Function1[/* monthText */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of slotOrder
    * @param slotOrder Array The new value.
    */
  var setSlotOrder: js.UndefOr[js.Function1[/* slotOrder */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Sets the values of the pickers slots
    * @param value Object
    * @param animated Object
    * @returns Ext.Picker this This picker.
    */
  @JSName("setValue")
  var setValue_IDatePicker: js.UndefOr[
    js.Function2[/* value */ js.UndefOr[Any], /* animated */ js.UndefOr[Any], IPicker]
  ] = js.undefined
  
  /** [Method] Sets the value of yearFrom
    * @param yearFrom Number The new value.
    */
  var setYearFrom: js.UndefOr[js.Function1[/* yearFrom */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of yearText
    * @param yearText String The new value.
    */
  var setYearText: js.UndefOr[js.Function1[/* yearText */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of yearTo
    * @param yearTo Number The new value.
    */
  var setYearTo: js.UndefOr[js.Function1[/* yearTo */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Config Option] (Array) */
  var slotOrder: js.UndefOr[Array] = js.undefined
  
  /** [Method] Updates the dayText configuration
    * @param newDayText Object
    * @param oldDayText Object
    */
  var updateDayText: js.UndefOr[
    js.Function2[/* newDayText */ js.UndefOr[Any], /* oldDayText */ js.UndefOr[Any], Unit]
  ] = js.undefined
  
  /** [Method] Updates the monthText configuration
    * @param newMonthText Object
    * @param oldMonthText Object
    */
  var updateMonthText: js.UndefOr[
    js.Function2[/* newMonthText */ js.UndefOr[Any], /* oldMonthText */ js.UndefOr[Any], Unit]
  ] = js.undefined
  
  /** [Method] Updates the yearFrom configuration */
  var updateYearFrom: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Updates the yearText configuration
    * @param yearText Object
    */
  var updateYearText: js.UndefOr[js.Function1[/* yearText */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Updates the yearTo configuration */
  var updateYearTo: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Number) */
  var yearFrom: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (String) */
  var yearText: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Number) */
  var yearTo: js.UndefOr[Double] = js.undefined
}
object IDatePicker {
  
  inline def apply(): IDatePicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatePicker]
  }
  
  extension [Self <: IDatePicker](x: Self) {
    
    inline def setDayText(value: java.lang.String): Self = StObject.set(x, "dayText", value.asInstanceOf[js.Any])
    
    inline def setDayTextUndefined: Self = StObject.set(x, "dayText", js.undefined)
    
    inline def setGetDayText(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getDayText", value.toJsFn)
    
    inline def setGetDayTextUndefined: Self = StObject.set(x, "getDayText", js.undefined)
    
    inline def setGetMonthText(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getMonthText", value.toJsFn)
    
    inline def setGetMonthTextUndefined: Self = StObject.set(x, "getMonthText", js.undefined)
    
    inline def setGetSlotOrder(value: CallbackTo[Array]): Self = StObject.set(x, "getSlotOrder", value.toJsFn)
    
    inline def setGetSlotOrderUndefined: Self = StObject.set(x, "getSlotOrder", js.undefined)
    
    inline def setGetYearFrom(value: CallbackTo[Double]): Self = StObject.set(x, "getYearFrom", value.toJsFn)
    
    inline def setGetYearFromUndefined: Self = StObject.set(x, "getYearFrom", js.undefined)
    
    inline def setGetYearText(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getYearText", value.toJsFn)
    
    inline def setGetYearTextUndefined: Self = StObject.set(x, "getYearText", js.undefined)
    
    inline def setGetYearTo(value: CallbackTo[Double]): Self = StObject.set(x, "getYearTo", value.toJsFn)
    
    inline def setGetYearToUndefined: Self = StObject.set(x, "getYearTo", js.undefined)
    
    inline def setMonthText(value: java.lang.String): Self = StObject.set(x, "monthText", value.asInstanceOf[js.Any])
    
    inline def setMonthTextUndefined: Self = StObject.set(x, "monthText", js.undefined)
    
    inline def setSetDayText(value: /* dayText */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setDayText", js.Any.fromFunction1((t0: /* dayText */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
    
    inline def setSetDayTextUndefined: Self = StObject.set(x, "setDayText", js.undefined)
    
    inline def setSetMonthText(value: /* monthText */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setMonthText", js.Any.fromFunction1((t0: /* monthText */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
    
    inline def setSetMonthTextUndefined: Self = StObject.set(x, "setMonthText", js.undefined)
    
    inline def setSetSlotOrder(value: /* slotOrder */ js.UndefOr[Array] => Callback): Self = StObject.set(x, "setSlotOrder", js.Any.fromFunction1((t0: /* slotOrder */ js.UndefOr[Array]) => value(t0).runNow()))
    
    inline def setSetSlotOrderUndefined: Self = StObject.set(x, "setSlotOrder", js.undefined)
    
    inline def setSetValue(value: (/* value */ js.UndefOr[Any], /* animated */ js.UndefOr[Any]) => IPicker): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
    
    inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    inline def setSetYearFrom(value: /* yearFrom */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setYearFrom", js.Any.fromFunction1((t0: /* yearFrom */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetYearFromUndefined: Self = StObject.set(x, "setYearFrom", js.undefined)
    
    inline def setSetYearText(value: /* yearText */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setYearText", js.Any.fromFunction1((t0: /* yearText */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
    
    inline def setSetYearTextUndefined: Self = StObject.set(x, "setYearText", js.undefined)
    
    inline def setSetYearTo(value: /* yearTo */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setYearTo", js.Any.fromFunction1((t0: /* yearTo */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetYearToUndefined: Self = StObject.set(x, "setYearTo", js.undefined)
    
    inline def setSlotOrder(value: Array): Self = StObject.set(x, "slotOrder", value.asInstanceOf[js.Any])
    
    inline def setSlotOrderUndefined: Self = StObject.set(x, "slotOrder", js.undefined)
    
    inline def setUpdateDayText(value: (/* newDayText */ js.UndefOr[Any], /* oldDayText */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "updateDayText", js.Any.fromFunction2((t0: /* newDayText */ js.UndefOr[Any], t1: /* oldDayText */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
    
    inline def setUpdateDayTextUndefined: Self = StObject.set(x, "updateDayText", js.undefined)
    
    inline def setUpdateMonthText(value: (/* newMonthText */ js.UndefOr[Any], /* oldMonthText */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "updateMonthText", js.Any.fromFunction2((t0: /* newMonthText */ js.UndefOr[Any], t1: /* oldMonthText */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
    
    inline def setUpdateMonthTextUndefined: Self = StObject.set(x, "updateMonthText", js.undefined)
    
    inline def setUpdateYearFrom(value: Callback): Self = StObject.set(x, "updateYearFrom", value.toJsFn)
    
    inline def setUpdateYearFromUndefined: Self = StObject.set(x, "updateYearFrom", js.undefined)
    
    inline def setUpdateYearText(value: /* yearText */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "updateYearText", js.Any.fromFunction1((t0: /* yearText */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setUpdateYearTextUndefined: Self = StObject.set(x, "updateYearText", js.undefined)
    
    inline def setUpdateYearTo(value: Callback): Self = StObject.set(x, "updateYearTo", value.toJsFn)
    
    inline def setUpdateYearToUndefined: Self = StObject.set(x, "updateYearTo", js.undefined)
    
    inline def setYearFrom(value: Double): Self = StObject.set(x, "yearFrom", value.asInstanceOf[js.Any])
    
    inline def setYearFromUndefined: Self = StObject.set(x, "yearFrom", js.undefined)
    
    inline def setYearText(value: java.lang.String): Self = StObject.set(x, "yearText", value.asInstanceOf[js.Any])
    
    inline def setYearTextUndefined: Self = StObject.set(x, "yearText", js.undefined)
    
    inline def setYearTo(value: Double): Self = StObject.set(x, "yearTo", value.asInstanceOf[js.Any])
    
    inline def setYearToUndefined: Self = StObject.set(x, "yearTo", js.undefined)
  }
}
