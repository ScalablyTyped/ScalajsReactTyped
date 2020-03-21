package typingsJapgolly.extjs.Ext.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeField
  extends typingsJapgolly.extjs.Ext.form.field.IComboBox {
  /** [Config Option] (String) */
  var altFormats: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var increment: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var maxText: js.UndefOr[String] = js.undefined
  /** [Config Option] (Date/String) */
  var maxValue: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var minText: js.UndefOr[String] = js.undefined
  /** [Config Option] (Date/String) */
  var minValue: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var pickerMaxHeight: js.UndefOr[Double] = js.undefined
  /** [Method] Replaces any existing maxValue with the new time and refreshes the picker s range
  		* @param value Date/String The maximum time that can be selected
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Replaces any existing minValue with the new time and refreshes the picker s range
  		* @param value Date/String The minimum time that can be selected
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the specified value s into the field
  		* @returns any this
  		*/
  @JSName("setValue")
  var setValue_ITimeField: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Boolean) */
  var snapToIncrement: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var submitFormat: js.UndefOr[String] = js.undefined
}

object ITimeField {
  @scala.inline
  def apply(
    IComboBox: typingsJapgolly.extjs.Ext.form.field.IComboBox = null,
    altFormats: String = null,
    format: String = null,
    increment: Int | Double = null,
    maxText: String = null,
    maxValue: js.Any = null,
    minText: String = null,
    minValue: js.Any = null,
    pickerMaxHeight: Int | Double = null,
    setMaxValue: /* value */ js.UndefOr[js.Any] => Callback = null,
    setMinValue: /* value */ js.UndefOr[js.Any] => Callback = null,
    setValue: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    snapToIncrement: js.UndefOr[Boolean] = js.undefined,
    submitFormat: String = null
  ): ITimeField = {
    val __obj = js.Dynamic.literal()
    if (IComboBox != null) js.Dynamic.global.Object.assign(__obj, IComboBox)
    if (altFormats != null) __obj.updateDynamic("altFormats")(altFormats.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (maxText != null) __obj.updateDynamic("maxText")(maxText.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minText != null) __obj.updateDynamic("minText")(minText.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (pickerMaxHeight != null) __obj.updateDynamic("pickerMaxHeight")(pickerMaxHeight.asInstanceOf[js.Any])
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => setMaxValue(t0).runNow()))
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => setMinValue(t0).runNow()))
    setValue.foreach(p => __obj.updateDynamic("setValue")(p.toJsFn))
    if (!js.isUndefined(snapToIncrement)) __obj.updateDynamic("snapToIncrement")(snapToIncrement.asInstanceOf[js.Any])
    if (submitFormat != null) __obj.updateDynamic("submitFormat")(submitFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeField]
  }
}

