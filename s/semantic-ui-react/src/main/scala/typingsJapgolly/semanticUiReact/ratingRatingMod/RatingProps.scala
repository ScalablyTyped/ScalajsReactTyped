package typingsJapgolly.semanticUiReact.ratingRatingMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.auto
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.heart
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.huge
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.large
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.massive
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.mini
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.small
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.star
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RatingProps
  extends StrictRatingProps
     with /* key */ StringDictionary[js.Any]

object RatingProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    className: String = null,
    clearable: Boolean | auto = null,
    defaultRating: Double | String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: star | heart = null,
    maxRating: Double | String = null,
    onRate: (/* event */ ReactMouseEventFrom[HTMLDivElement], /* data */ RatingProps) => Callback = null,
    rating: Double | String = null,
    size: mini | tiny | small | large | huge | massive = null
  ): RatingProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clearable != null) __obj.updateDynamic("clearable")(clearable.asInstanceOf[js.Any])
    if (defaultRating != null) __obj.updateDynamic("defaultRating")(defaultRating.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (maxRating != null) __obj.updateDynamic("maxRating")(maxRating.asInstanceOf[js.Any])
    if (onRate != null) __obj.updateDynamic("onRate")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement], t1: /* data */ typingsJapgolly.semanticUiReact.ratingRatingMod.RatingProps) => onRate(t0, t1).runNow()))
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatingProps]
  }
}

