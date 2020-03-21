package typingsJapgolly.extjs.Ext.picker

import japgolly.scalajs.react.Callback
import typingsJapgolly.extjs.Ext.view.IBoundList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITime extends IBoundList {
  /** [Method] Focuses a node in the view
  		* @param rec Object
  		*/
  @JSName("focusNode")
  var focusNode_ITime: js.UndefOr[js.Function1[/* rec */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var increment: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Date) */
  var maxValue: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Date) */
  var minValue: js.UndefOr[js.Any] = js.undefined
  /** [Method] Set the maxValue and update the list of available times
  		* @param value Date
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Set the minValue and update the list of available times
  		* @param value Date
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Update the list of available times in the list to be constrained within the minValue and maxValue  */
  var updateList: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object ITime {
  @scala.inline
  def apply(
    IBoundList: IBoundList = null,
    focusNode: /* rec */ js.UndefOr[js.Any] => Callback = null,
    format: String = null,
    increment: Int | Double = null,
    maxValue: js.Any = null,
    minValue: js.Any = null,
    setMaxValue: /* value */ js.UndefOr[js.Any] => Callback = null,
    setMinValue: /* value */ js.UndefOr[js.Any] => Callback = null,
    updateList: js.UndefOr[Callback] = js.undefined
  ): ITime = {
    val __obj = js.Dynamic.literal()
    if (IBoundList != null) js.Dynamic.global.Object.assign(__obj, IBoundList)
    if (focusNode != null) __obj.updateDynamic("focusNode")(js.Any.fromFunction1((t0: /* rec */ js.UndefOr[js.Any]) => focusNode(t0).runNow()))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => setMaxValue(t0).runNow()))
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => setMinValue(t0).runNow()))
    updateList.foreach(p => __obj.updateDynamic("updateList")(p.toJsFn))
    __obj.asInstanceOf[ITime]
  }
}

