package typingsJapgolly.senchaTouch.Ext.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckbox
  extends typingsJapgolly.senchaTouch.Ext.field.IField {
  /** [Method] Set the checked state of the checkbox to true
  		* @returns Ext.field.Checkbox This checkbox.
  		*/
  var check: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var checked: js.UndefOr[Boolean] = js.undefined
  /** [Method] Method called when this Ext field Checkbox has been checked  */
  var doChecked: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Method called when this Ext field Checkbox has been unchecked  */
  var doUnChecked: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns the field checked value
  		* @returns Mixed The field value.
  		*/
  var getChecked: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns an array of values from the checkboxes in the group that are checked
  		* @returns Array
  		*/
  var getGroupValues: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the submit value for the checkbox which can be used when submitting forms
  		* @returns Boolean/String value The value of value or true, if checked.
  		*/
  var getSubmitValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of value
  		* @returns String
  		*/
  @JSName("getValue")
  var getValue_ICheckbox: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the checked state of the checkbox
  		* @returns Boolean true if checked, false otherwise.
  		*/
  var isChecked: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Resets the status of all matched checkboxes in the same group to checked
  		* @returns Ext.field.Checkbox This checkbox.
  		*/
  var resetGroupValues: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Resets the current field value back to the original value on this field when it was created
  		* @returns Ext.field.Field this
  		*/
  @JSName("reset")
  var reset_ICheckbox: js.UndefOr[js.Function0[typingsJapgolly.senchaTouch.Ext.field.IField]] = js.undefined
  /** [Method] Set the status of all matched checkboxes in the same group to checked
  		* @param values Array An array of values.
  		* @returns Ext.field.Checkbox This checkbox.
  		*/
  var setGroupValues: js.UndefOr[js.Function1[/* values */ js.UndefOr[Array], this.type]] = js.undefined
  /** [Method] Sets the value of value
  		* @param value String The new value.
  		*/
  @JSName("setValue")
  var setValue_ICheckbox: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Set the checked state of the checkbox to false
  		* @returns Ext.field.Checkbox This checkbox.
  		*/
  var uncheck: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (String) */
  @JSName("value")
  var value_ICheckbox: js.UndefOr[String] = js.undefined
}

object ICheckbox {
  @scala.inline
  def apply(
    IField: typingsJapgolly.senchaTouch.Ext.field.IField = null,
    check: js.UndefOr[CallbackTo[ICheckbox]] = js.undefined,
    checked: js.UndefOr[Boolean] = js.undefined,
    doChecked: js.UndefOr[Callback] = js.undefined,
    doUnChecked: js.UndefOr[Callback] = js.undefined,
    getChecked: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getGroupValues: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getSubmitValue: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getValue: js.UndefOr[CallbackTo[String]] = js.undefined,
    isChecked: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    reset: js.UndefOr[CallbackTo[typingsJapgolly.senchaTouch.Ext.field.IField]] = js.undefined,
    resetGroupValues: js.UndefOr[CallbackTo[ICheckbox]] = js.undefined,
    setGroupValues: /* values */ js.UndefOr[Array] => CallbackTo[ICheckbox] = null,
    setValue: /* value */ js.UndefOr[String] => Callback = null,
    uncheck: js.UndefOr[CallbackTo[ICheckbox]] = js.undefined,
    value: String = null
  ): ICheckbox = {
    val __obj = js.Dynamic.literal()
    if (IField != null) js.Dynamic.global.Object.assign(__obj, IField)
    check.foreach(p => __obj.updateDynamic("check")(p.toJsFn))
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    doChecked.foreach(p => __obj.updateDynamic("doChecked")(p.toJsFn))
    doUnChecked.foreach(p => __obj.updateDynamic("doUnChecked")(p.toJsFn))
    getChecked.foreach(p => __obj.updateDynamic("getChecked")(p.toJsFn))
    getGroupValues.foreach(p => __obj.updateDynamic("getGroupValues")(p.toJsFn))
    getSubmitValue.foreach(p => __obj.updateDynamic("getSubmitValue")(p.toJsFn))
    getValue.foreach(p => __obj.updateDynamic("getValue")(p.toJsFn))
    isChecked.foreach(p => __obj.updateDynamic("isChecked")(p.toJsFn))
    reset.foreach(p => __obj.updateDynamic("reset")(p.toJsFn))
    resetGroupValues.foreach(p => __obj.updateDynamic("resetGroupValues")(p.toJsFn))
    if (setGroupValues != null) __obj.updateDynamic("setGroupValues")(js.Any.fromFunction1((t0: /* values */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setGroupValues(t0).runNow()))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[java.lang.String]) => setValue(t0).runNow()))
    uncheck.foreach(p => __obj.updateDynamic("uncheck")(p.toJsFn))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckbox]
  }
}

