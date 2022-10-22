package typingsJapgolly.senchaTouch.Ext.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISelect
  extends StObject
     with typingsJapgolly.senchaTouch.Ext.field.IText {
  
  /** [Config Option] (Boolean) */
  var autoSelect: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Object) */
  var defaultPhonePickerConfig: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var defaultTabletPickerConfig: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String/Number) */
  var displayField: js.UndefOr[Any] = js.undefined
  
  /** [Method] Returns the value of autoSelect
    * @returns Boolean
    */
  var getAutoSelect: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of defaultPhonePickerConfig
    * @returns Object
    */
  var getDefaultPhonePickerConfig: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of defaultTabletPickerConfig
    * @returns Object
    */
  var getDefaultTabletPickerConfig: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of displayField
    * @returns String/Number
    */
  var getDisplayField: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of hiddenName
    * @returns String
    */
  var getHiddenName: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of options
    * @returns Array
    */
  var getOptions: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the value of store
    * @returns Ext.data.Store/Object/String
    */
  var getStore: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of usePicker
    * @returns String/Boolean
    */
  var getUsePicker: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of valueField
    * @returns String/Number
    */
  var getValueField: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Config Option] (String) */
  var hiddenName: js.UndefOr[String] = js.undefined
  
  /** [Method] Called when the internal store s data has changed
    * @param store Object
    */
  var onStoreDataChanged: js.UndefOr[js.Function1[/* store */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (Array) */
  var options: js.UndefOr[Array] = js.undefined
  
  /** [Method] Sets the value of autoSelect
    * @param autoSelect Boolean The new value.
    */
  var setAutoSelect: js.UndefOr[js.Function1[/* autoSelect */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of defaultPhonePickerConfig
    * @param defaultPhonePickerConfig Object The new value.
    */
  var setDefaultPhonePickerConfig: js.UndefOr[js.Function1[/* defaultPhonePickerConfig */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of defaultTabletPickerConfig
    * @param defaultTabletPickerConfig Object The new value.
    */
  var setDefaultTabletPickerConfig: js.UndefOr[js.Function1[/* defaultTabletPickerConfig */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of displayField
    * @param displayField String/Number The new value.
    */
  var setDisplayField: js.UndefOr[js.Function1[/* displayField */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of hiddenName
    * @param hiddenName String The new value.
    */
  var setHiddenName: js.UndefOr[js.Function1[/* hiddenName */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of options
    * @param options Array The new value.
    */
  var setOptions: js.UndefOr[js.Function1[/* options */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Sets the value of store
    * @param store Ext.data.Store/Object/String The new value.
    */
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of usePicker
    * @param usePicker String/Boolean The new value.
    */
  var setUsePicker: js.UndefOr[js.Function1[/* usePicker */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of valueField
    * @param valueField String/Number The new value.
    */
  var setValueField: js.UndefOr[js.Function1[/* valueField */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Shows the picker for the select field whether that is a Ext picker Picker or a simple list  */
  var showPicker: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Ext.data.Store/Object/String) */
  var store: js.UndefOr[Any] = js.undefined
  
  /** [Method] Updates the underlying lt options gt list with new values
    * @param newOptions Array An array of options configurations to insert or append. selectBox.setOptions([  {text: 'First Option', value: 'first'},  {text: 'Second Option', value: 'second'},  {text: 'Third Option', value: 'third'} ]).setValue('third');  Note: option object member names should correspond with defined valueField and displayField values.
    * @returns Ext.field.Select this
    */
  var updateOptions: js.UndefOr[js.Function1[/* newOptions */ js.UndefOr[Array], this.type]] = js.undefined
  
  /** [Config Option] (String/Boolean) */
  var usePicker: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String/Number) */
  var valueField: js.UndefOr[Any] = js.undefined
}
object ISelect {
  
  inline def apply(): ISelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISelect]
  }
  
  extension [Self <: ISelect](x: Self) {
    
    inline def setAutoSelect(value: Boolean): Self = StObject.set(x, "autoSelect", value.asInstanceOf[js.Any])
    
    inline def setAutoSelectUndefined: Self = StObject.set(x, "autoSelect", js.undefined)
    
    inline def setDefaultPhonePickerConfig(value: Any): Self = StObject.set(x, "defaultPhonePickerConfig", value.asInstanceOf[js.Any])
    
    inline def setDefaultPhonePickerConfigUndefined: Self = StObject.set(x, "defaultPhonePickerConfig", js.undefined)
    
    inline def setDefaultTabletPickerConfig(value: Any): Self = StObject.set(x, "defaultTabletPickerConfig", value.asInstanceOf[js.Any])
    
    inline def setDefaultTabletPickerConfigUndefined: Self = StObject.set(x, "defaultTabletPickerConfig", js.undefined)
    
    inline def setDisplayField(value: Any): Self = StObject.set(x, "displayField", value.asInstanceOf[js.Any])
    
    inline def setDisplayFieldUndefined: Self = StObject.set(x, "displayField", js.undefined)
    
    inline def setGetAutoSelect(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAutoSelect", value.toJsFn)
    
    inline def setGetAutoSelectUndefined: Self = StObject.set(x, "getAutoSelect", js.undefined)
    
    inline def setGetDefaultPhonePickerConfig(value: CallbackTo[Any]): Self = StObject.set(x, "getDefaultPhonePickerConfig", value.toJsFn)
    
    inline def setGetDefaultPhonePickerConfigUndefined: Self = StObject.set(x, "getDefaultPhonePickerConfig", js.undefined)
    
    inline def setGetDefaultTabletPickerConfig(value: CallbackTo[Any]): Self = StObject.set(x, "getDefaultTabletPickerConfig", value.toJsFn)
    
    inline def setGetDefaultTabletPickerConfigUndefined: Self = StObject.set(x, "getDefaultTabletPickerConfig", js.undefined)
    
    inline def setGetDisplayField(value: CallbackTo[Any]): Self = StObject.set(x, "getDisplayField", value.toJsFn)
    
    inline def setGetDisplayFieldUndefined: Self = StObject.set(x, "getDisplayField", js.undefined)
    
    inline def setGetHiddenName(value: CallbackTo[String]): Self = StObject.set(x, "getHiddenName", value.toJsFn)
    
    inline def setGetHiddenNameUndefined: Self = StObject.set(x, "getHiddenName", js.undefined)
    
    inline def setGetOptions(value: CallbackTo[Array]): Self = StObject.set(x, "getOptions", value.toJsFn)
    
    inline def setGetOptionsUndefined: Self = StObject.set(x, "getOptions", js.undefined)
    
    inline def setGetStore(value: CallbackTo[Any]): Self = StObject.set(x, "getStore", value.toJsFn)
    
    inline def setGetStoreUndefined: Self = StObject.set(x, "getStore", js.undefined)
    
    inline def setGetUsePicker(value: CallbackTo[Any]): Self = StObject.set(x, "getUsePicker", value.toJsFn)
    
    inline def setGetUsePickerUndefined: Self = StObject.set(x, "getUsePicker", js.undefined)
    
    inline def setGetValueField(value: CallbackTo[Any]): Self = StObject.set(x, "getValueField", value.toJsFn)
    
    inline def setGetValueFieldUndefined: Self = StObject.set(x, "getValueField", js.undefined)
    
    inline def setHiddenName(value: String): Self = StObject.set(x, "hiddenName", value.asInstanceOf[js.Any])
    
    inline def setHiddenNameUndefined: Self = StObject.set(x, "hiddenName", js.undefined)
    
    inline def setOnStoreDataChanged(value: /* store */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "onStoreDataChanged", js.Any.fromFunction1((t0: /* store */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setOnStoreDataChangedUndefined: Self = StObject.set(x, "onStoreDataChanged", js.undefined)
    
    inline def setOptions(value: Array): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setSetAutoSelect(value: /* autoSelect */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setAutoSelect", js.Any.fromFunction1((t0: /* autoSelect */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetAutoSelectUndefined: Self = StObject.set(x, "setAutoSelect", js.undefined)
    
    inline def setSetDefaultPhonePickerConfig(value: /* defaultPhonePickerConfig */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setDefaultPhonePickerConfig", js.Any.fromFunction1((t0: /* defaultPhonePickerConfig */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetDefaultPhonePickerConfigUndefined: Self = StObject.set(x, "setDefaultPhonePickerConfig", js.undefined)
    
    inline def setSetDefaultTabletPickerConfig(value: /* defaultTabletPickerConfig */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setDefaultTabletPickerConfig", js.Any.fromFunction1((t0: /* defaultTabletPickerConfig */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetDefaultTabletPickerConfigUndefined: Self = StObject.set(x, "setDefaultTabletPickerConfig", js.undefined)
    
    inline def setSetDisplayField(value: /* displayField */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setDisplayField", js.Any.fromFunction1((t0: /* displayField */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetDisplayFieldUndefined: Self = StObject.set(x, "setDisplayField", js.undefined)
    
    inline def setSetHiddenName(value: /* hiddenName */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setHiddenName", js.Any.fromFunction1((t0: /* hiddenName */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetHiddenNameUndefined: Self = StObject.set(x, "setHiddenName", js.undefined)
    
    inline def setSetOptions(value: /* options */ js.UndefOr[Array] => Callback): Self = StObject.set(x, "setOptions", js.Any.fromFunction1((t0: /* options */ js.UndefOr[Array]) => value(t0).runNow()))
    
    inline def setSetOptionsUndefined: Self = StObject.set(x, "setOptions", js.undefined)
    
    inline def setSetStore(value: /* store */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setStore", js.Any.fromFunction1((t0: /* store */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetStoreUndefined: Self = StObject.set(x, "setStore", js.undefined)
    
    inline def setSetUsePicker(value: /* usePicker */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setUsePicker", js.Any.fromFunction1((t0: /* usePicker */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetUsePickerUndefined: Self = StObject.set(x, "setUsePicker", js.undefined)
    
    inline def setSetValueField(value: /* valueField */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setValueField", js.Any.fromFunction1((t0: /* valueField */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetValueFieldUndefined: Self = StObject.set(x, "setValueField", js.undefined)
    
    inline def setShowPicker(value: Callback): Self = StObject.set(x, "showPicker", value.toJsFn)
    
    inline def setShowPickerUndefined: Self = StObject.set(x, "showPicker", js.undefined)
    
    inline def setStore(value: Any): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    inline def setUpdateOptions(value: /* newOptions */ js.UndefOr[Array] => ISelect): Self = StObject.set(x, "updateOptions", js.Any.fromFunction1(value))
    
    inline def setUpdateOptionsUndefined: Self = StObject.set(x, "updateOptions", js.undefined)
    
    inline def setUsePicker(value: Any): Self = StObject.set(x, "usePicker", value.asInstanceOf[js.Any])
    
    inline def setUsePickerUndefined: Self = StObject.set(x, "usePicker", js.undefined)
    
    inline def setValueField(value: Any): Self = StObject.set(x, "valueField", value.asInstanceOf[js.Any])
    
    inline def setValueFieldUndefined: Self = StObject.set(x, "valueField", js.undefined)
  }
}
