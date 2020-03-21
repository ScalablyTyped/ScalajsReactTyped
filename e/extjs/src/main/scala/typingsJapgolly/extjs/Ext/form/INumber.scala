package typingsJapgolly.extjs.Ext.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumber
  extends typingsJapgolly.extjs.Ext.form.field.ISpinner {
  /** [Config Option] (Boolean) */
  var allowDecimals: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var allowExponential: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var autoStripChars: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var baseChars: js.UndefOr[String] = js.undefined
  /** [Method] Template method to do any pre blur processing  */
  @JSName("beforeBlur")
  var beforeBlur_INumber: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Number) */
  var decimalPrecision: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var decimalSeparator: js.UndefOr[String] = js.undefined
  /** [Method] Returns the value that would be included in a standard form submit for this field
  		* @returns String The value to be submitted, or null.
  		*/
  @JSName("getSubmitValue")
  var getSubmitValue_INumber: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Config Option] (String) */
  var maxText: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var minText: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var nanText: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var negativeText: js.UndefOr[String] = js.undefined
  /** [Method] Replaces any existing maxValue with the new value
  		* @param value Number The maximum value
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Replaces any existing minValue with the new value
  		* @param value Number The minimum value
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets whether the spinner down button is enabled
  		* @param enabled Object
  		* @param internal Object
  		*/
  @JSName("setSpinDownEnabled")
  var setSpinDownEnabled_INumber: js.UndefOr[
    js.Function2[/* enabled */ js.UndefOr[js.Any], /* internal */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Sets whether the spinner up button is enabled
  		* @param enabled Object
  		* @param internal Object
  		*/
  @JSName("setSpinUpEnabled")
  var setSpinUpEnabled_INumber: js.UndefOr[
    js.Function2[/* enabled */ js.UndefOr[js.Any], /* internal */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Config Option] (Number) */
  var step: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var submitLocaleSeparator: js.UndefOr[Boolean] = js.undefined
}

object INumber {
  @scala.inline
  def apply(
    ISpinner: typingsJapgolly.extjs.Ext.form.field.ISpinner = null,
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    allowExponential: js.UndefOr[Boolean] = js.undefined,
    autoStripChars: js.UndefOr[Boolean] = js.undefined,
    baseChars: String = null,
    beforeBlur: js.UndefOr[Callback] = js.undefined,
    decimalPrecision: Int | Double = null,
    decimalSeparator: String = null,
    getSubmitValue: js.UndefOr[CallbackTo[String]] = js.undefined,
    maxText: String = null,
    maxValue: Int | Double = null,
    minText: String = null,
    minValue: Int | Double = null,
    nanText: String = null,
    negativeText: String = null,
    setMaxValue: /* value */ js.UndefOr[Double] => Callback = null,
    setMinValue: /* value */ js.UndefOr[Double] => Callback = null,
    setSpinDownEnabled: (/* enabled */ js.UndefOr[js.Any], /* internal */ js.UndefOr[js.Any]) => Callback = null,
    setSpinUpEnabled: (/* enabled */ js.UndefOr[js.Any], /* internal */ js.UndefOr[js.Any]) => Callback = null,
    step: Int | Double = null,
    submitLocaleSeparator: js.UndefOr[Boolean] = js.undefined
  ): INumber = {
    val __obj = js.Dynamic.literal()
    if (ISpinner != null) js.Dynamic.global.Object.assign(__obj, ISpinner)
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.asInstanceOf[js.Any])
    if (!js.isUndefined(allowExponential)) __obj.updateDynamic("allowExponential")(allowExponential.asInstanceOf[js.Any])
    if (!js.isUndefined(autoStripChars)) __obj.updateDynamic("autoStripChars")(autoStripChars.asInstanceOf[js.Any])
    if (baseChars != null) __obj.updateDynamic("baseChars")(baseChars.asInstanceOf[js.Any])
    beforeBlur.foreach(p => __obj.updateDynamic("beforeBlur")(p.toJsFn))
    if (decimalPrecision != null) __obj.updateDynamic("decimalPrecision")(decimalPrecision.asInstanceOf[js.Any])
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator.asInstanceOf[js.Any])
    getSubmitValue.foreach(p => __obj.updateDynamic("getSubmitValue")(p.toJsFn))
    if (maxText != null) __obj.updateDynamic("maxText")(maxText.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minText != null) __obj.updateDynamic("minText")(minText.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (nanText != null) __obj.updateDynamic("nanText")(nanText.asInstanceOf[js.Any])
    if (negativeText != null) __obj.updateDynamic("negativeText")(negativeText.asInstanceOf[js.Any])
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[scala.Double]) => setMaxValue(t0).runNow()))
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[scala.Double]) => setMinValue(t0).runNow()))
    if (setSpinDownEnabled != null) __obj.updateDynamic("setSpinDownEnabled")(js.Any.fromFunction2((t0: /* enabled */ js.UndefOr[js.Any], t1: /* internal */ js.UndefOr[js.Any]) => setSpinDownEnabled(t0, t1).runNow()))
    if (setSpinUpEnabled != null) __obj.updateDynamic("setSpinUpEnabled")(js.Any.fromFunction2((t0: /* enabled */ js.UndefOr[js.Any], t1: /* internal */ js.UndefOr[js.Any]) => setSpinUpEnabled(t0, t1).runNow()))
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (!js.isUndefined(submitLocaleSeparator)) __obj.updateDynamic("submitLocaleSeparator")(submitLocaleSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[INumber]
  }
}

