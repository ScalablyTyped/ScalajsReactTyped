package typingsJapgolly.senchaTouch.Ext.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumber
  extends typingsJapgolly.senchaTouch.Ext.field.IText {
  /** [Method] Returns the value of maxValue
  		* @returns Number
  		*/
  var getMaxValue: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of minValue
  		* @returns Number
  		*/
  var getMinValue: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of stepValue
  		* @returns Number
  		*/
  var getStepValue: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[Double] = js.undefined
  /** [Method] Sets the value of maxValue
  		* @param maxValue Number The new value.
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* maxValue */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of minValue
  		* @param minValue Number The new value.
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* minValue */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of stepValue
  		* @param stepValue Number The new value.
  		*/
  var setStepValue: js.UndefOr[js.Function1[/* stepValue */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var stepValue: js.UndefOr[Double] = js.undefined
}

object INumber {
  @scala.inline
  def apply(
    IText: typingsJapgolly.senchaTouch.Ext.field.IText = null,
    getMaxValue: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMinValue: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getStepValue: js.UndefOr[CallbackTo[Double]] = js.undefined,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    setMaxValue: /* maxValue */ js.UndefOr[Double] => Callback = null,
    setMinValue: /* minValue */ js.UndefOr[Double] => Callback = null,
    setStepValue: /* stepValue */ js.UndefOr[Double] => Callback = null,
    stepValue: Int | Double = null
  ): INumber = {
    val __obj = js.Dynamic.literal()
    if (IText != null) js.Dynamic.global.Object.assign(__obj, IText)
    getMaxValue.foreach(p => __obj.updateDynamic("getMaxValue")(p.toJsFn))
    getMinValue.foreach(p => __obj.updateDynamic("getMinValue")(p.toJsFn))
    getStepValue.foreach(p => __obj.updateDynamic("getStepValue")(p.toJsFn))
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(js.Any.fromFunction1((t0: /* maxValue */ js.UndefOr[scala.Double]) => setMaxValue(t0).runNow()))
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(js.Any.fromFunction1((t0: /* minValue */ js.UndefOr[scala.Double]) => setMinValue(t0).runNow()))
    if (setStepValue != null) __obj.updateDynamic("setStepValue")(js.Any.fromFunction1((t0: /* stepValue */ js.UndefOr[scala.Double]) => setStepValue(t0).runNow()))
    if (stepValue != null) __obj.updateDynamic("stepValue")(stepValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[INumber]
  }
}

