package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgRating
  extends /**
	 * Option for igRating
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets custom css votes.
  	 * That object should be 2-dimentional array or object with indexes, where every item of first level represents settings for a vote at that index.
  	 * Second level of an item is settings for a vote and it should contain classes for a specific state of vote.
  	 * Item at index [0] on second level is used for css class of vote in normal state.
  	 * Item at index [1] on second level is used for css class of vote in selected state.
  	 * Item at index [2] on second level is used for css class of vote in hover state.
  	 * Examples:
  	 * { 1: { 0: "normalCss", 1: "selectedCss", 2: "hoverCss"} }
  	 * will customize only second vote with [normalCss](ui.igrating#theming:ui-igrating ui-state-default ui-widget-content) for normal state, [hoverCss](ui.igrating#theming:ui-igrating-hover ui-state-hover) for hover state and [selectedCss](ui.igrating#theming:ui-igrating-voteselected) for selected state.
  	 * [[null, 's1', 'h1'], [null, 's2', 'h2'], [null, 's3', 'h3']]
  	 * will customize selected and hover states for first 3 votes with classes h# and s#.
  	 *
  	 */
  var cssVotes: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets if igRating can have focus. Change of that option is not supported after igRating was created.
  	 * Value true: can get focus and process key events.
  	 * Value false: cannot get focus.
  	 *
  	 */
  var focusable: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Fired before hover value is changed.
  	 * If the application returns false, then the action is canceled and the value remains unchanged.
  	 */
  var hoverChange: js.UndefOr[HoverChangeEvent] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets/Sets precision. Precision of value and valueHover.
  	 *
  	 *
  	 * Valid values:
  	 * "exact" Value corresponds location of mouse.
  	 * "half" Value is rounded to the half of vote.
  	 * "whole" Value is rounded to the number of votes.
  	 */
  var precision: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets part of vote-size, which is considered as zero value.
  	 * It has effect only when precision is set to "half" or "whole".
  	 * If user clicks between edge of the first vote and (sizeOfVote * precisionZeroVote), then value is set to 0.
  	 * Same is applied for mouseover as well.
  	 *
  	 */
  var precisionZeroVote: js.UndefOr[Double] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * Gets/Sets number of decimal places used to round value and value-hover.
  	 * Negative value will disable that option and value will not be rounded.
  	 * Notes:
  	 * If precision is "whole" or "half" and roundedDecimalPlaces is set in range of 0..2, then 3 is used.
  	 * If valueAsPercent is enabled and roundedDecimalPlaces is set to 0, then 1 is used.
  	 * If it is larger than 15, then 15 is used.
  	 *
  	 */
  var roundedDecimalPlaces: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets the direction of selected and hovered votes. Change of that option is not supported after igRating was created.
  	 * Value true: from left to right or from top to bottom.
  	 * Value false: from right to left or from bottom to left.
  	 *
  	 */
  var swapDirection: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets selector for css classes.
  	 * That option allows replacing all default css styles by custom values.
  	 * Application should provide css classes for all members defined in the css options with "theme" selector.
  	 *
  	 */
  var theme: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets object which contains options supported by igValidator.
  	 * Note that for onblur validation depends on the [focusable](ui.igrating#options:focusable) option.
  	 *
  	 */
  var validatorOptions: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets/Sets value (selected votes or percent). If the value is of type string, it should be suitable for parsing to number. According to [valueAsPercent](ui.igrating#options:valueAsPercent) options the value is used as number of selected votes or as a percent of the votes.
  	 *
  	 */
  var value: js.UndefOr[Double | String] = js.undefined
  /**
  	 * Gets/Sets percent or vote number to measure value and value-hover.
  	 * Value true: value is measured as percent (from 0 to 1).
  	 * Value false: value is measured in number of voted (from 0 to voteCount)
  	 *
  	 */
  var valueAsPercent: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Fired before (selected) value is changed.
  	 * If the application returns false, then the action is canceled and the value remains unchanged.
  	 */
  var valueChange: js.UndefOr[ValueChangeEvent] = js.undefined
  /**
  	 * Gets/Sets value-hover (hovered votes or percent of hovered votes). The default is same as value. If the value is of type string, it should be suitable for parsing to number. According to [valueAsPercent](ui.igrating#options:valueAsPercent) options the valueHover is used as number of hovered votes or as a percent of the hovered votes.
  	 *
  	 */
  var valueHover: js.UndefOr[Double | String] = js.undefined
  /**
  	 * Gets a vertical or horizontal orientation for the votes.
  	 * Change of that option is not supported after igRating was created.
  	 *
  	 */
  var vertical: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets number of votes.
  	 *
  	 */
  var voteCount: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets/Sets custom height of a vote in pixels. In case of 0 the run time style value is used.
  	 *
  	 */
  var voteHeight: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets/Sets custom width of a vote in pixels. In case of 0 the run time style value is used.
  	 *
  	 */
  var voteWidth: js.UndefOr[Double] = js.undefined
}

object IgRating {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igRating
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    cssVotes: js.Any = null,
    focusable: js.UndefOr[Boolean] = js.undefined,
    hoverChange: (/* event */ Event_, /* ui */ HoverChangeEventUIParam) => Callback = null,
    language: String = null,
    locale: js.Any = null,
    precision: String = null,
    precisionZeroVote: Int | Double = null,
    regional: String | js.Object = null,
    roundedDecimalPlaces: Int | Double = null,
    swapDirection: js.UndefOr[Boolean] = js.undefined,
    theme: String = null,
    validatorOptions: js.Any = null,
    value: Double | String = null,
    valueAsPercent: js.UndefOr[Boolean] = js.undefined,
    valueChange: (/* event */ Event_, /* ui */ ValueChangeEventUIParam) => Callback = null,
    valueHover: Double | String = null,
    vertical: js.UndefOr[Boolean] = js.undefined,
    voteCount: Int | Double = null,
    voteHeight: Int | Double = null,
    voteWidth: Int | Double = null
  ): IgRating = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cssVotes != null) __obj.updateDynamic("cssVotes")(cssVotes.asInstanceOf[js.Any])
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
    if (hoverChange != null) __obj.updateDynamic("hoverChange")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.HoverChangeEventUIParam) => hoverChange(t0, t1).runNow()))
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (precisionZeroVote != null) __obj.updateDynamic("precisionZeroVote")(precisionZeroVote.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (roundedDecimalPlaces != null) __obj.updateDynamic("roundedDecimalPlaces")(roundedDecimalPlaces.asInstanceOf[js.Any])
    if (!js.isUndefined(swapDirection)) __obj.updateDynamic("swapDirection")(swapDirection.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (validatorOptions != null) __obj.updateDynamic("validatorOptions")(validatorOptions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(valueAsPercent)) __obj.updateDynamic("valueAsPercent")(valueAsPercent.asInstanceOf[js.Any])
    if (valueChange != null) __obj.updateDynamic("valueChange")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ValueChangeEventUIParam) => valueChange(t0, t1).runNow()))
    if (valueHover != null) __obj.updateDynamic("valueHover")(valueHover.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (voteCount != null) __obj.updateDynamic("voteCount")(voteCount.asInstanceOf[js.Any])
    if (voteHeight != null) __obj.updateDynamic("voteHeight")(voteHeight.asInstanceOf[js.Any])
    if (voteWidth != null) __obj.updateDynamic("voteWidth")(voteWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgRating]
  }
}

