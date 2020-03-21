package typingsJapgolly.senchaTouch.Ext.field

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelect extends IText {
  /** [Config Option] (Boolean) */
  var autoSelect: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object) */
  var defaultPhonePickerConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var defaultTabletPickerConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Number) */
  var displayField: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of autoSelect
  		* @returns Boolean
  		*/
  var getAutoSelect: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of defaultPhonePickerConfig
  		* @returns Object
  		*/
  var getDefaultPhonePickerConfig: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of defaultTabletPickerConfig
  		* @returns Object
  		*/
  var getDefaultTabletPickerConfig: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of displayField
  		* @returns String/Number
  		*/
  var getDisplayField: js.UndefOr[js.Function0[_]] = js.undefined
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
  var getStore: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of usePicker
  		* @returns String/Boolean
  		*/
  var getUsePicker: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of valueField
  		* @returns String/Number
  		*/
  var getValueField: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (String) */
  var hiddenName: js.UndefOr[String] = js.undefined
  /** [Method] Called when the internal store s data has changed
  		* @param store Object
  		*/
  var onStoreDataChanged: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Array) */
  var options: js.UndefOr[Array] = js.undefined
  /** [Method] Sets the value of autoSelect
  		* @param autoSelect Boolean The new value.
  		*/
  var setAutoSelect: js.UndefOr[js.Function1[/* autoSelect */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of defaultPhonePickerConfig
  		* @param defaultPhonePickerConfig Object The new value.
  		*/
  var setDefaultPhonePickerConfig: js.UndefOr[js.Function1[/* defaultPhonePickerConfig */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of defaultTabletPickerConfig
  		* @param defaultTabletPickerConfig Object The new value.
  		*/
  var setDefaultTabletPickerConfig: js.UndefOr[js.Function1[/* defaultTabletPickerConfig */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of displayField
  		* @param displayField String/Number The new value.
  		*/
  var setDisplayField: js.UndefOr[js.Function1[/* displayField */ js.UndefOr[js.Any], Unit]] = js.undefined
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
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of usePicker
  		* @param usePicker String/Boolean The new value.
  		*/
  var setUsePicker: js.UndefOr[js.Function1[/* usePicker */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of valueField
  		* @param valueField String/Number The new value.
  		*/
  var setValueField: js.UndefOr[js.Function1[/* valueField */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Shows the picker for the select field whether that is a Ext picker Picker or a simple list  */
  var showPicker: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Ext.data.Store/Object/String) */
  var store: js.UndefOr[js.Any] = js.undefined
  /** [Method] Updates the underlying lt options gt list with new values
  		* @param newOptions Array An array of options configurations to insert or append. selectBox.setOptions([  {text: 'First Option', value: 'first'},  {text: 'Second Option', value: 'second'},  {text: 'Third Option', value: 'third'} ]).setValue('third');  Note: option object member names should correspond with defined valueField and displayField values.
  		* @returns Ext.field.Select this
  		*/
  var updateOptions: js.UndefOr[js.Function1[/* newOptions */ js.UndefOr[Array], this.type]] = js.undefined
  /** [Config Option] (String/Boolean) */
  var usePicker: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Number) */
  var valueField: js.UndefOr[js.Any] = js.undefined
}

object ISelect {
  @scala.inline
  def apply(
    IText: IText = null,
    autoSelect: js.UndefOr[Boolean] = js.undefined,
    defaultPhonePickerConfig: js.Any = null,
    defaultTabletPickerConfig: js.Any = null,
    displayField: js.Any = null,
    getAutoSelect: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getDefaultPhonePickerConfig: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getDefaultTabletPickerConfig: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getDisplayField: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getHiddenName: js.UndefOr[CallbackTo[String]] = js.undefined,
    getOptions: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getStore: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getUsePicker: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getValueField: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    hiddenName: String = null,
    onStoreDataChanged: /* store */ js.UndefOr[js.Any] => Callback = null,
    options: Array = null,
    setAutoSelect: /* autoSelect */ js.UndefOr[Boolean] => Callback = null,
    setDefaultPhonePickerConfig: /* defaultPhonePickerConfig */ js.UndefOr[js.Any] => Callback = null,
    setDefaultTabletPickerConfig: /* defaultTabletPickerConfig */ js.UndefOr[js.Any] => Callback = null,
    setDisplayField: /* displayField */ js.UndefOr[js.Any] => Callback = null,
    setHiddenName: /* hiddenName */ js.UndefOr[String] => Callback = null,
    setOptions: /* options */ js.UndefOr[Array] => Callback = null,
    setStore: /* store */ js.UndefOr[js.Any] => Callback = null,
    setUsePicker: /* usePicker */ js.UndefOr[js.Any] => Callback = null,
    setValueField: /* valueField */ js.UndefOr[js.Any] => Callback = null,
    showPicker: js.UndefOr[Callback] = js.undefined,
    store: js.Any = null,
    updateOptions: /* newOptions */ js.UndefOr[Array] => CallbackTo[ISelect] = null,
    usePicker: js.Any = null,
    valueField: js.Any = null
  ): ISelect = {
    val __obj = js.Dynamic.literal()
    if (IText != null) js.Dynamic.global.Object.assign(__obj, IText)
    if (!js.isUndefined(autoSelect)) __obj.updateDynamic("autoSelect")(autoSelect.asInstanceOf[js.Any])
    if (defaultPhonePickerConfig != null) __obj.updateDynamic("defaultPhonePickerConfig")(defaultPhonePickerConfig.asInstanceOf[js.Any])
    if (defaultTabletPickerConfig != null) __obj.updateDynamic("defaultTabletPickerConfig")(defaultTabletPickerConfig.asInstanceOf[js.Any])
    if (displayField != null) __obj.updateDynamic("displayField")(displayField.asInstanceOf[js.Any])
    getAutoSelect.foreach(p => __obj.updateDynamic("getAutoSelect")(p.toJsFn))
    getDefaultPhonePickerConfig.foreach(p => __obj.updateDynamic("getDefaultPhonePickerConfig")(p.toJsFn))
    getDefaultTabletPickerConfig.foreach(p => __obj.updateDynamic("getDefaultTabletPickerConfig")(p.toJsFn))
    getDisplayField.foreach(p => __obj.updateDynamic("getDisplayField")(p.toJsFn))
    getHiddenName.foreach(p => __obj.updateDynamic("getHiddenName")(p.toJsFn))
    getOptions.foreach(p => __obj.updateDynamic("getOptions")(p.toJsFn))
    getStore.foreach(p => __obj.updateDynamic("getStore")(p.toJsFn))
    getUsePicker.foreach(p => __obj.updateDynamic("getUsePicker")(p.toJsFn))
    getValueField.foreach(p => __obj.updateDynamic("getValueField")(p.toJsFn))
    if (hiddenName != null) __obj.updateDynamic("hiddenName")(hiddenName.asInstanceOf[js.Any])
    if (onStoreDataChanged != null) __obj.updateDynamic("onStoreDataChanged")(js.Any.fromFunction1((t0: /* store */ js.UndefOr[js.Any]) => onStoreDataChanged(t0).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (setAutoSelect != null) __obj.updateDynamic("setAutoSelect")(js.Any.fromFunction1((t0: /* autoSelect */ js.UndefOr[scala.Boolean]) => setAutoSelect(t0).runNow()))
    if (setDefaultPhonePickerConfig != null) __obj.updateDynamic("setDefaultPhonePickerConfig")(js.Any.fromFunction1((t0: /* defaultPhonePickerConfig */ js.UndefOr[js.Any]) => setDefaultPhonePickerConfig(t0).runNow()))
    if (setDefaultTabletPickerConfig != null) __obj.updateDynamic("setDefaultTabletPickerConfig")(js.Any.fromFunction1((t0: /* defaultTabletPickerConfig */ js.UndefOr[js.Any]) => setDefaultTabletPickerConfig(t0).runNow()))
    if (setDisplayField != null) __obj.updateDynamic("setDisplayField")(js.Any.fromFunction1((t0: /* displayField */ js.UndefOr[js.Any]) => setDisplayField(t0).runNow()))
    if (setHiddenName != null) __obj.updateDynamic("setHiddenName")(js.Any.fromFunction1((t0: /* hiddenName */ js.UndefOr[java.lang.String]) => setHiddenName(t0).runNow()))
    if (setOptions != null) __obj.updateDynamic("setOptions")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setOptions(t0).runNow()))
    if (setStore != null) __obj.updateDynamic("setStore")(js.Any.fromFunction1((t0: /* store */ js.UndefOr[js.Any]) => setStore(t0).runNow()))
    if (setUsePicker != null) __obj.updateDynamic("setUsePicker")(js.Any.fromFunction1((t0: /* usePicker */ js.UndefOr[js.Any]) => setUsePicker(t0).runNow()))
    if (setValueField != null) __obj.updateDynamic("setValueField")(js.Any.fromFunction1((t0: /* valueField */ js.UndefOr[js.Any]) => setValueField(t0).runNow()))
    showPicker.foreach(p => __obj.updateDynamic("showPicker")(p.toJsFn))
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (updateOptions != null) __obj.updateDynamic("updateOptions")(js.Any.fromFunction1((t0: /* newOptions */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => updateOptions(t0).runNow()))
    if (usePicker != null) __obj.updateDynamic("usePicker")(usePicker.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelect]
  }
}

