package typingsJapgolly.senchaTouch.Ext.field

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDatePicker
  extends StObject
     with ISelect {
  
  /** [Config Option] (String) */
  var dateFormat: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var destroyPickerOnHide: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Returns the value of dateFormat
    * @returns String
    */
  var getDateFormat: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method]  */
  var getDatePicker: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Returns the value of destroyPickerOnHide
    * @returns Boolean
    */
  var getDestroyPickerOnHide: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of the field formatted using the specified format
    * @param format String The format to be returned.
    * @returns String The formatted date.
    */
  var getFormattedValue: js.UndefOr[js.Function1[/* format */ js.UndefOr[String], String]] = js.undefined
  
  /** [Method] Override this or change event will be fired twice  */
  var onChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Object/Ext.picker.Date) */
  var picker: js.UndefOr[Any] = js.undefined
  
  /** [Method] Resets the Select field to the value of the first record in the store
    * @returns Ext.field.Select this
    */
  @JSName("reset")
  var reset_IDatePicker: js.UndefOr[js.Function0[ISelect]] = js.undefined
  
  /** [Method] Sets the value of dateFormat
    * @param dateFormat String The new value.
    */
  var setDateFormat: js.UndefOr[js.Function1[/* dateFormat */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of destroyPickerOnHide
    * @param destroyPickerOnHide Boolean The new value.
    */
  var setDestroyPickerOnHide: js.UndefOr[js.Function1[/* destroyPickerOnHide */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of picker
    * @param picker Object/Ext.picker.Date The new value.
    */
  var setPicker: js.UndefOr[js.Function1[/* picker */ js.UndefOr[Any], Unit]] = js.undefined
}
object IDatePicker {
  
  inline def apply(): IDatePicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatePicker]
  }
  
  extension [Self <: IDatePicker](x: Self) {
    
    inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    inline def setDestroyPickerOnHide(value: Boolean): Self = StObject.set(x, "destroyPickerOnHide", value.asInstanceOf[js.Any])
    
    inline def setDestroyPickerOnHideUndefined: Self = StObject.set(x, "destroyPickerOnHide", js.undefined)
    
    inline def setGetDateFormat(value: CallbackTo[String]): Self = StObject.set(x, "getDateFormat", value.toJsFn)
    
    inline def setGetDateFormatUndefined: Self = StObject.set(x, "getDateFormat", js.undefined)
    
    inline def setGetDatePicker(value: Callback): Self = StObject.set(x, "getDatePicker", value.toJsFn)
    
    inline def setGetDatePickerUndefined: Self = StObject.set(x, "getDatePicker", js.undefined)
    
    inline def setGetDestroyPickerOnHide(value: CallbackTo[Boolean]): Self = StObject.set(x, "getDestroyPickerOnHide", value.toJsFn)
    
    inline def setGetDestroyPickerOnHideUndefined: Self = StObject.set(x, "getDestroyPickerOnHide", js.undefined)
    
    inline def setGetFormattedValue(value: /* format */ js.UndefOr[String] => String): Self = StObject.set(x, "getFormattedValue", js.Any.fromFunction1(value))
    
    inline def setGetFormattedValueUndefined: Self = StObject.set(x, "getFormattedValue", js.undefined)
    
    inline def setOnChange(value: Callback): Self = StObject.set(x, "onChange", value.toJsFn)
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setPicker(value: Any): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
    
    inline def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
    
    inline def setReset(value: CallbackTo[ISelect]): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setSetDateFormat(value: /* dateFormat */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setDateFormat", js.Any.fromFunction1((t0: /* dateFormat */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetDateFormatUndefined: Self = StObject.set(x, "setDateFormat", js.undefined)
    
    inline def setSetDestroyPickerOnHide(value: /* destroyPickerOnHide */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setDestroyPickerOnHide", js.Any.fromFunction1((t0: /* destroyPickerOnHide */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetDestroyPickerOnHideUndefined: Self = StObject.set(x, "setDestroyPickerOnHide", js.undefined)
    
    inline def setSetPicker(value: /* picker */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setPicker", js.Any.fromFunction1((t0: /* picker */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetPickerUndefined: Self = StObject.set(x, "setPicker", js.undefined)
  }
}
