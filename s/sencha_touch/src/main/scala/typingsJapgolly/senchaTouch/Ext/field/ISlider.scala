package typingsJapgolly.senchaTouch.Ext.field

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlider extends IField {
  /** [Method] Returns the value of cls
  		* @returns String
  		*/
  @JSName("getCls")
  var getCls_ISlider: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of increment
  		* @returns Number
  		*/
  var getIncrement: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of maxValue
  		* @returns Number
  		*/
  var getMaxValue: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of minValue
  		* @returns Number
  		*/
  var getMinValue: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of readOnly
  		* @returns Boolean
  		*/
  var getReadOnly: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Convenience method
  		* @returns Object
  		*/
  var getValues: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Number) */
  var increment: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** [Method] Resets the current field value back to the original value on this field when it was created
  		* @returns Ext.field.Field this
  		*/
  @JSName("reset")
  var reset_ISlider: js.UndefOr[js.Function0[IField]] = js.undefined
  /** [Method] Sets the value of cls
  		* @param cls String The new value.
  		*/
  @JSName("setCls")
  var setCls_ISlider: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of increment
  		* @param increment Number The new value.
  		*/
  var setIncrement: js.UndefOr[js.Function1[/* increment */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of maxValue
  		* @param maxValue Number The new value.
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* maxValue */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of minValue
  		* @param minValue Number The new value.
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* minValue */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of readOnly
  		* @param readOnly Boolean The new value.
  		*/
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of tabIndex
  		* @param tabIndex Object The new value.
  		*/
  @JSName("setTabIndex")
  var setTabIndex_ISlider: js.UndefOr[js.Function1[/* tabIndex */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Convenience method
  		* @param value Object
  		*/
  var setValues: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Number/Number[]) */
  var values: js.UndefOr[js.Any] = js.undefined
}

object ISlider {
  @scala.inline
  def apply(
    IField: IField = null,
    getCls: js.UndefOr[CallbackTo[String]] = js.undefined,
    getIncrement: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMaxValue: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMinValue: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getReadOnly: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getValues: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    increment: Int | Double = null,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    reset: js.UndefOr[CallbackTo[IField]] = js.undefined,
    setCls: /* cls */ js.UndefOr[String] => Callback = null,
    setIncrement: /* increment */ js.UndefOr[Double] => Callback = null,
    setMaxValue: /* maxValue */ js.UndefOr[Double] => Callback = null,
    setMinValue: /* minValue */ js.UndefOr[Double] => Callback = null,
    setReadOnly: /* readOnly */ js.UndefOr[Boolean] => Callback = null,
    setTabIndex: /* tabIndex */ js.UndefOr[js.Any] => Callback = null,
    setValues: /* value */ js.UndefOr[js.Any] => Callback = null,
    values: js.Any = null
  ): ISlider = {
    val __obj = js.Dynamic.literal()
    if (IField != null) js.Dynamic.global.Object.assign(__obj, IField)
    getCls.foreach(p => __obj.updateDynamic("getCls")(p.toJsFn))
    getIncrement.foreach(p => __obj.updateDynamic("getIncrement")(p.toJsFn))
    getMaxValue.foreach(p => __obj.updateDynamic("getMaxValue")(p.toJsFn))
    getMinValue.foreach(p => __obj.updateDynamic("getMinValue")(p.toJsFn))
    getReadOnly.foreach(p => __obj.updateDynamic("getReadOnly")(p.toJsFn))
    getValues.foreach(p => __obj.updateDynamic("getValues")(p.toJsFn))
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    reset.foreach(p => __obj.updateDynamic("reset")(p.toJsFn))
    if (setCls != null) __obj.updateDynamic("setCls")(js.Any.fromFunction1((t0: /* cls */ js.UndefOr[java.lang.String]) => setCls(t0).runNow()))
    if (setIncrement != null) __obj.updateDynamic("setIncrement")(js.Any.fromFunction1((t0: /* increment */ js.UndefOr[scala.Double]) => setIncrement(t0).runNow()))
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(js.Any.fromFunction1((t0: /* maxValue */ js.UndefOr[scala.Double]) => setMaxValue(t0).runNow()))
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(js.Any.fromFunction1((t0: /* minValue */ js.UndefOr[scala.Double]) => setMinValue(t0).runNow()))
    if (setReadOnly != null) __obj.updateDynamic("setReadOnly")(js.Any.fromFunction1((t0: /* readOnly */ js.UndefOr[scala.Boolean]) => setReadOnly(t0).runNow()))
    if (setTabIndex != null) __obj.updateDynamic("setTabIndex")(js.Any.fromFunction1((t0: /* tabIndex */ js.UndefOr[js.Any]) => setTabIndex(t0).runNow()))
    if (setValues != null) __obj.updateDynamic("setValues")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => setValues(t0).runNow()))
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISlider]
  }
}

