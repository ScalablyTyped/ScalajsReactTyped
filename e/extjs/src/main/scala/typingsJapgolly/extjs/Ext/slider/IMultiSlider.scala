package typingsJapgolly.extjs.Ext.slider

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.form.field.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMultiSlider extends IBase {
  /** [Method] Creates a new thumb and adds it to the slider
  		* @param value Number The initial value to set on the thumb.
  		* @returns any The thumb
  		*/
  var addThumb: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], _]] = js.undefined
  /** [Config Option] (Boolean) */
  @JSName("animate")
  var animate_IMultiSlider: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var clickToChange: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var constrainThumbs: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number/Boolean) */
  var decimalPrecision: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Boolean) */
  var dragging: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the current value of the slider
  		* @param index Number The index of the thumb to return a value for
  		* @returns any The current value of the slider at the given index, or an array of all thumb values if no index is given.
  		*/
  @JSName("getValue")
  var getValue_IMultiSlider: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], _]] = js.undefined
  /** [Method] Returns an array of values  one for the location of each thumb
  		* @returns any The set of thumb values
  		*/
  var getValues: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Number) */
  var increment: js.UndefOr[Double] = js.undefined
  /** [Method] private override */
  @JSName("initValue")
  var initValue_IMultiSlider: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Number) */
  var keyIncrement: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[Double] = js.undefined
  /** [Method] Resets the current field value to the originally loaded value and clears any validation messages  */
  @JSName("reset")
  var reset_IMultiSlider: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets the maximum value for the slider instance
  		* @param val Number The new maximum value
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* val */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the minimum value for the slider instance
  		* @param val Number The new minimum value
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* val */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the read only state of this field
  		* @param readOnly Object
  		*/
  @JSName("setReadOnly")
  var setReadOnly_IMultiSlider: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Synchronizes thumbs position to the proper proportion of the total component width based on the current slider value  */
  var syncThumbs: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (Array) */
  var thumbs: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Function) */
  var tipText: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object/Boolean) */
  var useTips: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  @JSName("value")
  var value_IMultiSlider: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number[]) */
  var values: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Boolean) */
  var vertical: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var zeroBasedSnapping: js.UndefOr[Boolean] = js.undefined
}

object IMultiSlider {
  @scala.inline
  def apply(
    IBase: IBase = null,
    addThumb: /* value */ js.UndefOr[Double] => CallbackTo[js.Any] = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    clickToChange: js.UndefOr[Boolean] = js.undefined,
    constrainThumbs: js.UndefOr[Boolean] = js.undefined,
    decimalPrecision: js.Any = null,
    dragging: js.UndefOr[Boolean] = js.undefined,
    getValue: /* index */ js.UndefOr[Double] => CallbackTo[js.Any] = null,
    getValues: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    increment: Int | Double = null,
    initValue: js.UndefOr[Callback] = js.undefined,
    keyIncrement: Int | Double = null,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    reset: js.UndefOr[Callback] = js.undefined,
    setMaxValue: /* val */ js.UndefOr[Double] => Callback = null,
    setMinValue: /* val */ js.UndefOr[Double] => Callback = null,
    setReadOnly: /* readOnly */ js.UndefOr[js.Any] => Callback = null,
    syncThumbs: js.UndefOr[Callback] = js.undefined,
    thumbs: Array = null,
    tipText: js.Any = null,
    useTips: js.Any = null,
    value: Int | Double = null,
    values: Array = null,
    vertical: js.UndefOr[Boolean] = js.undefined,
    zeroBasedSnapping: js.UndefOr[Boolean] = js.undefined
  ): IMultiSlider = {
    val __obj = js.Dynamic.literal()
    if (IBase != null) js.Dynamic.global.Object.assign(__obj, IBase)
    if (addThumb != null) __obj.updateDynamic("addThumb")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[scala.Double]) => addThumb(t0).runNow()))
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (!js.isUndefined(clickToChange)) __obj.updateDynamic("clickToChange")(clickToChange.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainThumbs)) __obj.updateDynamic("constrainThumbs")(constrainThumbs.asInstanceOf[js.Any])
    if (decimalPrecision != null) __obj.updateDynamic("decimalPrecision")(decimalPrecision.asInstanceOf[js.Any])
    if (!js.isUndefined(dragging)) __obj.updateDynamic("dragging")(dragging.asInstanceOf[js.Any])
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => getValue(t0).runNow()))
    getValues.foreach(p => __obj.updateDynamic("getValues")(p.toJsFn))
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    initValue.foreach(p => __obj.updateDynamic("initValue")(p.toJsFn))
    if (keyIncrement != null) __obj.updateDynamic("keyIncrement")(keyIncrement.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    reset.foreach(p => __obj.updateDynamic("reset")(p.toJsFn))
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(js.Any.fromFunction1((t0: /* val */ js.UndefOr[scala.Double]) => setMaxValue(t0).runNow()))
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(js.Any.fromFunction1((t0: /* val */ js.UndefOr[scala.Double]) => setMinValue(t0).runNow()))
    if (setReadOnly != null) __obj.updateDynamic("setReadOnly")(js.Any.fromFunction1((t0: /* readOnly */ js.UndefOr[js.Any]) => setReadOnly(t0).runNow()))
    syncThumbs.foreach(p => __obj.updateDynamic("syncThumbs")(p.toJsFn))
    if (thumbs != null) __obj.updateDynamic("thumbs")(thumbs.asInstanceOf[js.Any])
    if (tipText != null) __obj.updateDynamic("tipText")(tipText.asInstanceOf[js.Any])
    if (useTips != null) __obj.updateDynamic("useTips")(useTips.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (!js.isUndefined(zeroBasedSnapping)) __obj.updateDynamic("zeroBasedSnapping")(zeroBasedSnapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMultiSlider]
  }
}

