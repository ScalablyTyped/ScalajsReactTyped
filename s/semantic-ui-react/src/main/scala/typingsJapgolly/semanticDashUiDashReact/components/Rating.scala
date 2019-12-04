package typingsJapgolly.semanticDashUiDashReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesRatingMod.default
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesRatingRatingMod.RatingProps
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.auto
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.heart
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.huge
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.large
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.massive
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.mini
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.small
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.star
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.tiny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Rating {
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
    size: mini | tiny | small | large | huge | massive = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[RatingProps, default, Unit, RatingProps] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clearable != null) __obj.updateDynamic("clearable")(clearable.asInstanceOf[js.Any])
    if (defaultRating != null) __obj.updateDynamic("defaultRating")(defaultRating.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (maxRating != null) __obj.updateDynamic("maxRating")(maxRating.asInstanceOf[js.Any])
    if (onRate != null) __obj.updateDynamic("onRate")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement], t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesRatingRatingMod.RatingProps) => onRate(t0, t1).runNow()))
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesRatingRatingMod.RatingProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesRatingMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesRatingRatingMod.RatingProps])(children: _*)
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Rating", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

