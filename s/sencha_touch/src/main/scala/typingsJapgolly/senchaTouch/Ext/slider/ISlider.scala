package typingsJapgolly.senchaTouch.Ext.slider

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlider extends IContainer {
  /** [Config Option] (Boolean) */
  var allowThumbsOverlapping: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var animation: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var animationDuration: js.UndefOr[Boolean] = js.undefined
  /** [Method] Sets the increment configuration
  		* @param increment Number
  		* @returns Number
  		*/
  var applyIncrement: js.UndefOr[js.Function1[/* increment */ js.UndefOr[Double], Double]] = js.undefined
  /** [Method] Returns the value of allowThumbsOverlapping
  		* @returns Boolean
  		*/
  var getAllowThumbsOverlapping: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of animation
  		* @returns Boolean/Object
  		*/
  var getAnimation: js.UndefOr[js.Function0[_]] = js.undefined
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
  /** [Method] Returns the Thumb instance bound to this Slider
  		* @param index Number The index of Thumb to return.
  		* @returns Ext.slider.Thumb The thumb instance
  		*/
  var getThumb: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], IThumb]] = js.undefined
  /** [Method] Returns the value of thumbConfig
  		* @returns Object
  		*/
  var getThumbConfig: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the Thumb instances bound to this Slider
  		* @returns Ext.slider.Thumb[] The thumb instances
  		*/
  var getThumbs: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of value
  		* @returns Number/Number[]
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.undefined
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
  /** [Method] Sets the value of allowThumbsOverlapping
  		* @param allowThumbsOverlapping Boolean The new value.
  		*/
  var setAllowThumbsOverlapping: js.UndefOr[js.Function1[/* allowThumbsOverlapping */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of animation
  		* @param animation Boolean/Object The new value.
  		*/
  var setAnimation: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], Unit]] = js.undefined
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
  /** [Method] Sets the value of thumbConfig
  		* @param thumbConfig Object The new value.
  		*/
  var setThumbConfig: js.UndefOr[js.Function1[/* thumbConfig */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of value
  		* @param value Number/Number[] The new value.
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Convenience method
  		* @param value Object
  		*/
  var setValues: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Object) */
  var thumbConfig: js.UndefOr[js.Any] = js.undefined
  /** [Method] Updates the sliders thumbs with their new value s
  		* @param newValue Object
  		* @param oldValue Object
  		*/
  var updateValue: js.UndefOr[
    js.Function2[/* newValue */ js.UndefOr[js.Any], /* oldValue */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Config Option] (Number/Number[]) */
  var value: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number/Number[]) */
  var values: js.UndefOr[js.Any] = js.undefined
}

object ISlider {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    allowThumbsOverlapping: js.UndefOr[Boolean] = js.undefined,
    animation: js.Any = null,
    animationDuration: js.UndefOr[Boolean] = js.undefined,
    applyIncrement: /* increment */ js.UndefOr[Double] => CallbackTo[Double] = null,
    getAllowThumbsOverlapping: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getAnimation: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getIncrement: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMaxValue: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMinValue: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getReadOnly: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getThumb: /* index */ js.UndefOr[Double] => CallbackTo[IThumb] = null,
    getThumbConfig: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getThumbs: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getValue: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getValues: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    increment: Int | Double = null,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    setAllowThumbsOverlapping: /* allowThumbsOverlapping */ js.UndefOr[Boolean] => Callback = null,
    setAnimation: /* animation */ js.UndefOr[js.Any] => Callback = null,
    setIncrement: /* increment */ js.UndefOr[Double] => Callback = null,
    setMaxValue: /* maxValue */ js.UndefOr[Double] => Callback = null,
    setMinValue: /* minValue */ js.UndefOr[Double] => Callback = null,
    setReadOnly: /* readOnly */ js.UndefOr[Boolean] => Callback = null,
    setThumbConfig: /* thumbConfig */ js.UndefOr[js.Any] => Callback = null,
    setValue: /* value */ js.UndefOr[js.Any] => Callback = null,
    setValues: /* value */ js.UndefOr[js.Any] => Callback = null,
    thumbConfig: js.Any = null,
    updateValue: (/* newValue */ js.UndefOr[js.Any], /* oldValue */ js.UndefOr[js.Any]) => Callback = null,
    value: js.Any = null,
    values: js.Any = null
  ): ISlider = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (!js.isUndefined(allowThumbsOverlapping)) __obj.updateDynamic("allowThumbsOverlapping")(allowThumbsOverlapping.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (applyIncrement != null) __obj.updateDynamic("applyIncrement")(js.Any.fromFunction1((t0: /* increment */ js.UndefOr[scala.Double]) => applyIncrement(t0).runNow()))
    getAllowThumbsOverlapping.foreach(p => __obj.updateDynamic("getAllowThumbsOverlapping")(p.toJsFn))
    getAnimation.foreach(p => __obj.updateDynamic("getAnimation")(p.toJsFn))
    getIncrement.foreach(p => __obj.updateDynamic("getIncrement")(p.toJsFn))
    getMaxValue.foreach(p => __obj.updateDynamic("getMaxValue")(p.toJsFn))
    getMinValue.foreach(p => __obj.updateDynamic("getMinValue")(p.toJsFn))
    getReadOnly.foreach(p => __obj.updateDynamic("getReadOnly")(p.toJsFn))
    if (getThumb != null) __obj.updateDynamic("getThumb")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => getThumb(t0).runNow()))
    getThumbConfig.foreach(p => __obj.updateDynamic("getThumbConfig")(p.toJsFn))
    getThumbs.foreach(p => __obj.updateDynamic("getThumbs")(p.toJsFn))
    getValue.foreach(p => __obj.updateDynamic("getValue")(p.toJsFn))
    getValues.foreach(p => __obj.updateDynamic("getValues")(p.toJsFn))
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (setAllowThumbsOverlapping != null) __obj.updateDynamic("setAllowThumbsOverlapping")(js.Any.fromFunction1((t0: /* allowThumbsOverlapping */ js.UndefOr[scala.Boolean]) => setAllowThumbsOverlapping(t0).runNow()))
    if (setAnimation != null) __obj.updateDynamic("setAnimation")(js.Any.fromFunction1((t0: /* animation */ js.UndefOr[js.Any]) => setAnimation(t0).runNow()))
    if (setIncrement != null) __obj.updateDynamic("setIncrement")(js.Any.fromFunction1((t0: /* increment */ js.UndefOr[scala.Double]) => setIncrement(t0).runNow()))
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(js.Any.fromFunction1((t0: /* maxValue */ js.UndefOr[scala.Double]) => setMaxValue(t0).runNow()))
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(js.Any.fromFunction1((t0: /* minValue */ js.UndefOr[scala.Double]) => setMinValue(t0).runNow()))
    if (setReadOnly != null) __obj.updateDynamic("setReadOnly")(js.Any.fromFunction1((t0: /* readOnly */ js.UndefOr[scala.Boolean]) => setReadOnly(t0).runNow()))
    if (setThumbConfig != null) __obj.updateDynamic("setThumbConfig")(js.Any.fromFunction1((t0: /* thumbConfig */ js.UndefOr[js.Any]) => setThumbConfig(t0).runNow()))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => setValue(t0).runNow()))
    if (setValues != null) __obj.updateDynamic("setValues")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => setValues(t0).runNow()))
    if (thumbConfig != null) __obj.updateDynamic("thumbConfig")(thumbConfig.asInstanceOf[js.Any])
    if (updateValue != null) __obj.updateDynamic("updateValue")(js.Any.fromFunction2((t0: /* newValue */ js.UndefOr[js.Any], t1: /* oldValue */ js.UndefOr[js.Any]) => updateValue(t0, t1).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISlider]
  }
}

