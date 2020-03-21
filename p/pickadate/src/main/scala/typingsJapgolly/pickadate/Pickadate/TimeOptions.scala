package typingsJapgolly.pickadate.Pickadate

import japgolly.scalajs.react.Callback
import typingsJapgolly.pickadate.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeOptions extends Options {
  /**
    * Disable a specific or arbitrary set of times selectable on the picker.
    * Accepts an array of Date objects, arrays formatted as [HOUR, MINUTE],
    * integers representing hours (from 0 to 23), or objects with a range of
    * times. Switch to a whitelist by setting `true` as the first item in the
    * collection. Enable times that fall within a range of disabled times by
    * adding an `inverted` parameter to the item within the collection.
    */
  var disable: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The formatLabel option is unique. It can contain HTML and it can
    * also be a function if you want to create the label during run-time.
    */
  var formatLabel: js.UndefOr[String | (js.Function1[/* time */ TimeItem, String])] = js.undefined
  /**
    * Choose the interval in minutes between each time in the list.
    * Default is 30.
    */
  var interval: js.UndefOr[Double] = js.undefined
  // Classes
  var klass: js.UndefOr[TimeKlassOptions] = js.undefined
  /**
    * Set the maximum selectable time on the picker.
    * Accepts the same values as the `min` property.
    */
  var max: js.UndefOr[MinOrMaxTimeOption] = js.undefined
  /**
    * Set the minimum selectable time on the picker. Accepts a Date object,
    * array formatted as [HOUR, MINUTE], a positive or negative integer
    * for a time relative to now, or a boolean (`true` sets it to now, and
    * `false` removes any limit).
    */
  var min: js.UndefOr[MinOrMaxTimeOption] = js.undefined
}

object TimeOptions {
  @scala.inline
  def apply(
    clear: String = null,
    closeOnClear: js.UndefOr[Boolean] = js.undefined,
    closeOnSelect: js.UndefOr[Boolean] = js.undefined,
    container: String | JQuery = null,
    containerHidden: String = null,
    disable: js.Array[_] = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    formatLabel: String | (js.Function1[/* time */ TimeItem, String]) = null,
    formatSubmit: String = null,
    hiddenName: js.UndefOr[Boolean] = js.undefined,
    hiddenPrefix: String = null,
    hiddenSuffix: String = null,
    interval: Int | Double = null,
    klass: TimeKlassOptions = null,
    max: MinOrMaxTimeOption = null,
    min: MinOrMaxTimeOption = null,
    onClose: /* event */ js.Any => Callback = null,
    onOpen: /* event */ js.Any => Callback = null,
    onRender: /* event */ js.Any => Callback = null,
    onSet: /* event */ js.Any => Callback = null,
    onStart: /* event */ js.Any => Callback = null,
    onStop: /* event */ js.Any => Callback = null
  ): TimeOptions = {
    val __obj = js.Dynamic.literal()
    if (clear != null) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClear)) __obj.updateDynamic("closeOnClear")(closeOnClear.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnSelect)) __obj.updateDynamic("closeOnSelect")(closeOnSelect.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (containerHidden != null) __obj.updateDynamic("containerHidden")(containerHidden.asInstanceOf[js.Any])
    if (disable != null) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatLabel != null) __obj.updateDynamic("formatLabel")(formatLabel.asInstanceOf[js.Any])
    if (formatSubmit != null) __obj.updateDynamic("formatSubmit")(formatSubmit.asInstanceOf[js.Any])
    if (!js.isUndefined(hiddenName)) __obj.updateDynamic("hiddenName")(hiddenName.asInstanceOf[js.Any])
    if (hiddenPrefix != null) __obj.updateDynamic("hiddenPrefix")(hiddenPrefix.asInstanceOf[js.Any])
    if (hiddenSuffix != null) __obj.updateDynamic("hiddenSuffix")(hiddenSuffix.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (klass != null) __obj.updateDynamic("klass")(klass.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* event */ js.Any) => onClose(t0).runNow()))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1((t0: /* event */ js.Any) => onOpen(t0).runNow()))
    if (onRender != null) __obj.updateDynamic("onRender")(js.Any.fromFunction1((t0: /* event */ js.Any) => onRender(t0).runNow()))
    if (onSet != null) __obj.updateDynamic("onSet")(js.Any.fromFunction1((t0: /* event */ js.Any) => onSet(t0).runNow()))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction1((t0: /* event */ js.Any) => onStart(t0).runNow()))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction1((t0: /* event */ js.Any) => onStop(t0).runNow()))
    __obj.asInstanceOf[TimeOptions]
  }
}

