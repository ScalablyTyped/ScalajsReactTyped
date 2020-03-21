package typingsJapgolly.jqueryTimeentry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeEntryOptions extends ITimeEntryRegionalOptions {
  /**
    * Add content to display after each time field. This may contain HTML markup.
    *
    * default: ''
    */
  var appendText: js.UndefOr[String] = js.undefined
  /**
    * A function that accepts the old and new times, and minimum and maximum times, and returns an updated time.
    * This refers to the associated input field. This call is made just before the time is updated into the field
    * allowing for additional restrictions to be applied. Leave as null for no additional restrictions.
    *
    * default: null
    */
  var beforeSetTime: js.UndefOr[js.Function] = js.undefined
  /**
    * A function that accepts an input field and returns a settings object containing new settings for the time
    * entry for this field. For example, you can use it to set up a time range wherein both fields restrict the
    * possible values of the other field. this refers to the input field as well. Leave as null for no per-field
    * customisation.
    *
    * default: null
    */
  var beforeShow: js.UndefOr[js.Function] = js.undefined
  /**
    * The default time to show when no other value has been entered. This may be a Date object
    * (but the year/month/day values are ignored), a string in the current time format, a numeric
    * value as seconds offset from now, or a string value indicating a number and units, e.g. '+2h'.
    * In the latter case, use 'h' for hours, 'm' for minutes, or 's' for seconds. Letters may be upper
    * or lower case. Multiple offsets may be combined into one setting, e.g. '-2h -20m'. Prefix with '!'
    * to prevent a wrap around into another day. Leave as null to default to the current time.
    *
    * default: null
    */
  var defaultTime: js.UndefOr[js.Date | Double | String] = js.undefined
  /**
    * The number of the portion of the time field to highlight initially.
    * Use 0 for hours, 1 for minutes, etc., or null for the user selection.
    *
    * default: null
    */
  var initialField: js.UndefOr[Double] = js.undefined
  /**
    * The maximum time that may be selected, or null for no limit. See defaultTime for a description of the possible
    * formats. Use an array of number for hours, minutes, seconds in conjunction with unlimitedHours.
    *
    * Note that the maxTime may be set to less than the minTime in which case the entered time is restricted to
    * the period between the minimum and the maximum on the "next day".
    *
    * default: null
    */
  var maxTime: js.UndefOr[js.Date | Double | js.Array[Double] | String] = js.undefined
  /**
    * The minimum time that may be selected, or null for no limit. See defaultTime for a description
    * of the possible formats. Use an array of number for hours, minutes, seconds in conjunction with unlimitedHours.
    *
    * default: null
    */
  var minTime: js.UndefOr[js.Date | Double | js.Array[Double] | String] = js.undefined
  /**
    * Set to true to allow direct entry of a time from the keyboard without needing to type separators,
    * i.e. the field moves on after two digits.
    *
    * default: false
    */
  var noSeparatorEntry: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicate whether or not the seconds part of the time should be displayed.
    *
    * default: False
    */
  var showSeconds: js.UndefOr[Boolean] = js.undefined
  /**
    * The URL for an expanded spinner image to use, or '' for no expansion. The layout is the same as for
    * spinnerImage but should be a larger size. The expanded spinner appears when the user hovers over the
    * original spinner and disappears when they move off it.
    *
    * default: ''
    */
  var spinnerBigImage: js.UndefOr[String] = js.undefined
  /**
    * The dimensions of the expanded spinner image for determining which "button" was clicked. The first two values
    * are the width and height of the individual images, the third is the size of the central button for setting the
    * current time, or 0 for no central button.
    *
    * default: [40, 40, 16]
    */
  var spinnerBigSize: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * The URL for the spinner images to use, or '' for no spinner. The file must contain seven images horizontally
    * for the normal view, then for each "button" pressed (now, previous, next, increment, and decrement), and,
    * finally, the disabled view.
    *
    * default: 'spinnerDefault.png'
    */
  var spinnerImage: js.UndefOr[String] = js.undefined
  /**
    * Set to true to have only the increment and decrement buttons on the spinner, or false for all the buttons.
    *
    * default: false
    */
  var spinnerIncDecOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * The times in milliseconds for the auto-repeat feature on the increment and decrement spinner buttons.
    * The first value is the initial delay and the second one is the subsequent delay. Hold the mouse button down
    * on these spinner buttons to trigger this feature. Use [0, 0] to disable the auto-repeat.
    *
    * default: [500, 250]
    */
  var spinnerRepeat: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * The dimensions of the spinner image for determining which "button" was clicked. The first two values are the
    * width and height of the individual images, the third is the size of the central button for setting the current
    * time, or 0 for no central button.
    *
    * default: [20, 20, 8]
    */
  var spinnerSize: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * true to have the tab key exit this field and move to the next one, or false to have the tab key step
    * through the date subfields.
    *
    * default: false
    */
  var tabToExit: js.UndefOr[Boolean] = js.undefined
  /**
    * The increment/decrement values for each of the time portions - hours, minutes, and seconds.
    * Use this to constrain the portions, e.g. [1, 15, 0] restricts the times to quarter hours.
    *
    * default: [1,1,1]
    */
  var timeSteps: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Indicate whether to restrict hours to just those in one day (false) or to allow for any value for hours (true).
    *
    * default: false
    */
  var unlimitedHours: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to true to use the mouse wheel for increment/decrement if possible, or false to never use it.
    *
    * default: true
    */
  var useMouseWheel: js.UndefOr[Boolean] = js.undefined
}

object ITimeEntryOptions {
  @scala.inline
  def apply(
    ampmNames: js.Array[String] = null,
    ampmPrefix: String = null,
    appendText: String = null,
    beforeSetTime: js.Function = null,
    beforeShow: js.Function = null,
    defaultTime: js.Date | Double | String = null,
    initialField: Int | Double = null,
    maxTime: js.Date | Double | js.Array[Double] | String = null,
    minTime: js.Date | Double | js.Array[Double] | String = null,
    noSeparatorEntry: js.UndefOr[Boolean] = js.undefined,
    separator: String = null,
    show24Hours: js.UndefOr[Boolean] = js.undefined,
    showSeconds: js.UndefOr[Boolean] = js.undefined,
    spinnerBigImage: String = null,
    spinnerBigSize: js.Array[Double] = null,
    spinnerImage: String = null,
    spinnerIncDecOnly: js.UndefOr[Boolean] = js.undefined,
    spinnerRepeat: js.Array[Double] = null,
    spinnerSize: js.Array[Double] = null,
    spinnerTexts: js.Array[String] = null,
    tabToExit: js.UndefOr[Boolean] = js.undefined,
    timeSteps: js.Array[Double] = null,
    unlimitedHours: js.UndefOr[Boolean] = js.undefined,
    useMouseWheel: js.UndefOr[Boolean] = js.undefined
  ): ITimeEntryOptions = {
    val __obj = js.Dynamic.literal()
    if (ampmNames != null) __obj.updateDynamic("ampmNames")(ampmNames.asInstanceOf[js.Any])
    if (ampmPrefix != null) __obj.updateDynamic("ampmPrefix")(ampmPrefix.asInstanceOf[js.Any])
    if (appendText != null) __obj.updateDynamic("appendText")(appendText.asInstanceOf[js.Any])
    if (beforeSetTime != null) __obj.updateDynamic("beforeSetTime")(beforeSetTime.asInstanceOf[js.Any])
    if (beforeShow != null) __obj.updateDynamic("beforeShow")(beforeShow.asInstanceOf[js.Any])
    if (defaultTime != null) __obj.updateDynamic("defaultTime")(defaultTime.asInstanceOf[js.Any])
    if (initialField != null) __obj.updateDynamic("initialField")(initialField.asInstanceOf[js.Any])
    if (maxTime != null) __obj.updateDynamic("maxTime")(maxTime.asInstanceOf[js.Any])
    if (minTime != null) __obj.updateDynamic("minTime")(minTime.asInstanceOf[js.Any])
    if (!js.isUndefined(noSeparatorEntry)) __obj.updateDynamic("noSeparatorEntry")(noSeparatorEntry.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(show24Hours)) __obj.updateDynamic("show24Hours")(show24Hours.asInstanceOf[js.Any])
    if (!js.isUndefined(showSeconds)) __obj.updateDynamic("showSeconds")(showSeconds.asInstanceOf[js.Any])
    if (spinnerBigImage != null) __obj.updateDynamic("spinnerBigImage")(spinnerBigImage.asInstanceOf[js.Any])
    if (spinnerBigSize != null) __obj.updateDynamic("spinnerBigSize")(spinnerBigSize.asInstanceOf[js.Any])
    if (spinnerImage != null) __obj.updateDynamic("spinnerImage")(spinnerImage.asInstanceOf[js.Any])
    if (!js.isUndefined(spinnerIncDecOnly)) __obj.updateDynamic("spinnerIncDecOnly")(spinnerIncDecOnly.asInstanceOf[js.Any])
    if (spinnerRepeat != null) __obj.updateDynamic("spinnerRepeat")(spinnerRepeat.asInstanceOf[js.Any])
    if (spinnerSize != null) __obj.updateDynamic("spinnerSize")(spinnerSize.asInstanceOf[js.Any])
    if (spinnerTexts != null) __obj.updateDynamic("spinnerTexts")(spinnerTexts.asInstanceOf[js.Any])
    if (!js.isUndefined(tabToExit)) __obj.updateDynamic("tabToExit")(tabToExit.asInstanceOf[js.Any])
    if (timeSteps != null) __obj.updateDynamic("timeSteps")(timeSteps.asInstanceOf[js.Any])
    if (!js.isUndefined(unlimitedHours)) __obj.updateDynamic("unlimitedHours")(unlimitedHours.asInstanceOf[js.Any])
    if (!js.isUndefined(useMouseWheel)) __obj.updateDynamic("useMouseWheel")(useMouseWheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeEntryOptions]
  }
}

