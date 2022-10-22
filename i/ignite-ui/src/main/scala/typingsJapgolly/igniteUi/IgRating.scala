package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgRating
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
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
  var cssVotes: js.UndefOr[Any] = js.undefined
  
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
  var locale: js.UndefOr[Any] = js.undefined
  
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
  var validatorOptions: js.UndefOr[Any] = js.undefined
  
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
  
  inline def apply(): IgRating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgRating]
  }
  
  extension [Self <: IgRating](x: Self) {
    
    inline def setCssVotes(value: Any): Self = StObject.set(x, "cssVotes", value.asInstanceOf[js.Any])
    
    inline def setCssVotesUndefined: Self = StObject.set(x, "cssVotes", js.undefined)
    
    inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    inline def setHoverChange(value: (/* event */ Event, /* ui */ HoverChangeEventUIParam) => Callback): Self = StObject.set(x, "hoverChange", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ HoverChangeEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setHoverChangeUndefined: Self = StObject.set(x, "hoverChange", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setPrecision(value: String): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setPrecisionZeroVote(value: Double): Self = StObject.set(x, "precisionZeroVote", value.asInstanceOf[js.Any])
    
    inline def setPrecisionZeroVoteUndefined: Self = StObject.set(x, "precisionZeroVote", js.undefined)
    
    inline def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    inline def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    inline def setRoundedDecimalPlaces(value: Double): Self = StObject.set(x, "roundedDecimalPlaces", value.asInstanceOf[js.Any])
    
    inline def setRoundedDecimalPlacesUndefined: Self = StObject.set(x, "roundedDecimalPlaces", js.undefined)
    
    inline def setSwapDirection(value: Boolean): Self = StObject.set(x, "swapDirection", value.asInstanceOf[js.Any])
    
    inline def setSwapDirectionUndefined: Self = StObject.set(x, "swapDirection", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setValidatorOptions(value: Any): Self = StObject.set(x, "validatorOptions", value.asInstanceOf[js.Any])
    
    inline def setValidatorOptionsUndefined: Self = StObject.set(x, "validatorOptions", js.undefined)
    
    inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueAsPercent(value: Boolean): Self = StObject.set(x, "valueAsPercent", value.asInstanceOf[js.Any])
    
    inline def setValueAsPercentUndefined: Self = StObject.set(x, "valueAsPercent", js.undefined)
    
    inline def setValueChange(value: (/* event */ Event, /* ui */ ValueChangeEventUIParam) => Callback): Self = StObject.set(x, "valueChange", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ ValueChangeEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setValueChangeUndefined: Self = StObject.set(x, "valueChange", js.undefined)
    
    inline def setValueHover(value: Double | String): Self = StObject.set(x, "valueHover", value.asInstanceOf[js.Any])
    
    inline def setValueHoverUndefined: Self = StObject.set(x, "valueHover", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    
    inline def setVoteCount(value: Double): Self = StObject.set(x, "voteCount", value.asInstanceOf[js.Any])
    
    inline def setVoteCountUndefined: Self = StObject.set(x, "voteCount", js.undefined)
    
    inline def setVoteHeight(value: Double): Self = StObject.set(x, "voteHeight", value.asInstanceOf[js.Any])
    
    inline def setVoteHeightUndefined: Self = StObject.set(x, "voteHeight", js.undefined)
    
    inline def setVoteWidth(value: Double): Self = StObject.set(x, "voteWidth", value.asInstanceOf[js.Any])
    
    inline def setVoteWidthUndefined: Self = StObject.set(x, "voteWidth", js.undefined)
  }
}
