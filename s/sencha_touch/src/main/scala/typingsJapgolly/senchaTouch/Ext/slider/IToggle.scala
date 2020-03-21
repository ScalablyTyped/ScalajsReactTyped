package typingsJapgolly.senchaTouch.Ext.slider

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToggle extends ISlider {
  /** [Method] Sets the increment configuration
  		* @returns Number
  		*/
  @JSName("applyIncrement")
  var applyIncrement_IToggle: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of maxValueCls
  		* @returns String
  		*/
  var getMaxValueCls: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of minValueCls
  		* @returns String
  		*/
  var getMinValueCls: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Config Option] (String) */
  var maxValueCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var minValueCls: js.UndefOr[String] = js.undefined
  /** [Method] Sets the value of maxValueCls
  		* @param maxValueCls String The new value.
  		*/
  var setMaxValueCls: js.UndefOr[js.Function1[/* maxValueCls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of minValueCls
  		* @param minValueCls String The new value.
  		*/
  var setMinValueCls: js.UndefOr[js.Function1[/* minValueCls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of value
  		* @param newValue Object
  		* @param oldValue Object
  		*/
  @JSName("setValue")
  var setValue_IToggle: js.UndefOr[
    js.Function2[/* newValue */ js.UndefOr[js.Any], /* oldValue */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
}

object IToggle {
  @scala.inline
  def apply(
    ISlider: ISlider = null,
    applyIncrement: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMaxValueCls: js.UndefOr[CallbackTo[String]] = js.undefined,
    getMinValueCls: js.UndefOr[CallbackTo[String]] = js.undefined,
    maxValueCls: String = null,
    minValueCls: String = null,
    setMaxValueCls: /* maxValueCls */ js.UndefOr[String] => Callback = null,
    setMinValueCls: /* minValueCls */ js.UndefOr[String] => Callback = null,
    setValue: (/* newValue */ js.UndefOr[js.Any], /* oldValue */ js.UndefOr[js.Any]) => Callback = null
  ): IToggle = {
    val __obj = js.Dynamic.literal()
    if (ISlider != null) js.Dynamic.global.Object.assign(__obj, ISlider)
    applyIncrement.foreach(p => __obj.updateDynamic("applyIncrement")(p.toJsFn))
    getMaxValueCls.foreach(p => __obj.updateDynamic("getMaxValueCls")(p.toJsFn))
    getMinValueCls.foreach(p => __obj.updateDynamic("getMinValueCls")(p.toJsFn))
    if (maxValueCls != null) __obj.updateDynamic("maxValueCls")(maxValueCls.asInstanceOf[js.Any])
    if (minValueCls != null) __obj.updateDynamic("minValueCls")(minValueCls.asInstanceOf[js.Any])
    if (setMaxValueCls != null) __obj.updateDynamic("setMaxValueCls")(js.Any.fromFunction1((t0: /* maxValueCls */ js.UndefOr[java.lang.String]) => setMaxValueCls(t0).runNow()))
    if (setMinValueCls != null) __obj.updateDynamic("setMinValueCls")(js.Any.fromFunction1((t0: /* minValueCls */ js.UndefOr[java.lang.String]) => setMinValueCls(t0).runNow()))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction2((t0: /* newValue */ js.UndefOr[js.Any], t1: /* oldValue */ js.UndefOr[js.Any]) => setValue(t0, t1).runNow()))
    __obj.asInstanceOf[IToggle]
  }
}

