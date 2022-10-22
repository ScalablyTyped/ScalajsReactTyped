package typingsJapgolly.extjs.Ext.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITimeField
  extends StObject
     with typingsJapgolly.extjs.Ext.form.field.IComboBox {
  
  /** [Config Option] (String) */
  var altFormats: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Number) */
  var increment: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (String) */
  var maxText: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Date/String) */
  var maxValue: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var minText: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Date/String) */
  var minValue: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Number) */
  var pickerMaxHeight: js.UndefOr[Double] = js.undefined
  
  /** [Method] Replaces any existing maxValue with the new time and refreshes the picker s range
    * @param value Date/String The maximum time that can be selected
    */
  var setMaxValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Replaces any existing minValue with the new time and refreshes the picker s range
    * @param value Date/String The minimum time that can be selected
    */
  var setMinValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the specified value s into the field
    * @returns any this
    */
  @JSName("setValue")
  var setValue_ITimeField: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var snapToIncrement: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var submitFormat: js.UndefOr[String] = js.undefined
}
object ITimeField {
  
  inline def apply(): ITimeField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimeField]
  }
  
  extension [Self <: ITimeField](x: Self) {
    
    inline def setAltFormats(value: String): Self = StObject.set(x, "altFormats", value.asInstanceOf[js.Any])
    
    inline def setAltFormatsUndefined: Self = StObject.set(x, "altFormats", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
    
    inline def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
    
    inline def setMaxText(value: String): Self = StObject.set(x, "maxText", value.asInstanceOf[js.Any])
    
    inline def setMaxTextUndefined: Self = StObject.set(x, "maxText", js.undefined)
    
    inline def setMaxValue(value: Any): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinText(value: String): Self = StObject.set(x, "minText", value.asInstanceOf[js.Any])
    
    inline def setMinTextUndefined: Self = StObject.set(x, "minText", js.undefined)
    
    inline def setMinValue(value: Any): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setPickerMaxHeight(value: Double): Self = StObject.set(x, "pickerMaxHeight", value.asInstanceOf[js.Any])
    
    inline def setPickerMaxHeightUndefined: Self = StObject.set(x, "pickerMaxHeight", js.undefined)
    
    inline def setSetMaxValue(value: /* value */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setMaxValue", js.Any.fromFunction1((t0: /* value */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetMaxValueUndefined: Self = StObject.set(x, "setMaxValue", js.undefined)
    
    inline def setSetMinValue(value: /* value */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setMinValue", js.Any.fromFunction1((t0: /* value */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetMinValueUndefined: Self = StObject.set(x, "setMinValue", js.undefined)
    
    inline def setSetValue(value: CallbackTo[Any]): Self = StObject.set(x, "setValue", value.toJsFn)
    
    inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    inline def setSnapToIncrement(value: Boolean): Self = StObject.set(x, "snapToIncrement", value.asInstanceOf[js.Any])
    
    inline def setSnapToIncrementUndefined: Self = StObject.set(x, "snapToIncrement", js.undefined)
    
    inline def setSubmitFormat(value: String): Self = StObject.set(x, "submitFormat", value.asInstanceOf[js.Any])
    
    inline def setSubmitFormatUndefined: Self = StObject.set(x, "submitFormat", js.undefined)
  }
}
