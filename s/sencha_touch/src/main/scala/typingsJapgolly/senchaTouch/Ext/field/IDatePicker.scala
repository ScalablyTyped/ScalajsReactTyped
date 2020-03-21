package typingsJapgolly.senchaTouch.Ext.field

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePicker extends ISelect {
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
  var picker: js.UndefOr[js.Any] = js.undefined
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
  var setPicker: js.UndefOr[js.Function1[/* picker */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IDatePicker {
  @scala.inline
  def apply(
    ISelect: ISelect = null,
    dateFormat: String = null,
    destroyPickerOnHide: js.UndefOr[Boolean] = js.undefined,
    getDateFormat: js.UndefOr[CallbackTo[String]] = js.undefined,
    getDatePicker: js.UndefOr[Callback] = js.undefined,
    getDestroyPickerOnHide: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getFormattedValue: /* format */ js.UndefOr[String] => CallbackTo[String] = null,
    onChange: js.UndefOr[Callback] = js.undefined,
    picker: js.Any = null,
    reset: js.UndefOr[CallbackTo[ISelect]] = js.undefined,
    setDateFormat: /* dateFormat */ js.UndefOr[String] => Callback = null,
    setDestroyPickerOnHide: /* destroyPickerOnHide */ js.UndefOr[Boolean] => Callback = null,
    setPicker: /* picker */ js.UndefOr[js.Any] => Callback = null
  ): IDatePicker = {
    val __obj = js.Dynamic.literal()
    if (ISelect != null) js.Dynamic.global.Object.assign(__obj, ISelect)
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyPickerOnHide)) __obj.updateDynamic("destroyPickerOnHide")(destroyPickerOnHide.asInstanceOf[js.Any])
    getDateFormat.foreach(p => __obj.updateDynamic("getDateFormat")(p.toJsFn))
    getDatePicker.foreach(p => __obj.updateDynamic("getDatePicker")(p.toJsFn))
    getDestroyPickerOnHide.foreach(p => __obj.updateDynamic("getDestroyPickerOnHide")(p.toJsFn))
    if (getFormattedValue != null) __obj.updateDynamic("getFormattedValue")(js.Any.fromFunction1((t0: /* format */ js.UndefOr[java.lang.String]) => getFormattedValue(t0).runNow()))
    onChange.foreach(p => __obj.updateDynamic("onChange")(p.toJsFn))
    if (picker != null) __obj.updateDynamic("picker")(picker.asInstanceOf[js.Any])
    reset.foreach(p => __obj.updateDynamic("reset")(p.toJsFn))
    if (setDateFormat != null) __obj.updateDynamic("setDateFormat")(js.Any.fromFunction1((t0: /* dateFormat */ js.UndefOr[java.lang.String]) => setDateFormat(t0).runNow()))
    if (setDestroyPickerOnHide != null) __obj.updateDynamic("setDestroyPickerOnHide")(js.Any.fromFunction1((t0: /* destroyPickerOnHide */ js.UndefOr[scala.Boolean]) => setDestroyPickerOnHide(t0).runNow()))
    if (setPicker != null) __obj.updateDynamic("setPicker")(js.Any.fromFunction1((t0: /* picker */ js.UndefOr[js.Any]) => setPicker(t0).runNow()))
    __obj.asInstanceOf[IDatePicker]
  }
}

