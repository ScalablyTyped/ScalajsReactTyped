package typingsJapgolly.semanticUiReact.ratingIconMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RatingIconProps
  extends StrictRatingIconProps
     with /* key */ StringDictionary[js.Any]

object RatingIconProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    className: String = null,
    index: Int | Double = null,
    onClick: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ RatingIconProps) => Callback = null,
    onKeyUp: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ RatingIconProps) => Callback = null,
    onMouseEnter: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ RatingIconProps) => Callback = null,
    selected: js.UndefOr[Boolean] = js.undefined
  ): RatingIconProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticUiReact.ratingIconMod.RatingIconProps) => onClick(t0, t1).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticUiReact.ratingIconMod.RatingIconProps) => onKeyUp(t0, t1).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticUiReact.ratingIconMod.RatingIconProps) => onMouseEnter(t0, t1).runNow()))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatingIconProps]
  }
}

