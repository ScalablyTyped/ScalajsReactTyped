package typingsJapgolly.reactNativeStarRating.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeStarRating.mod.StarRatingProps
import typingsJapgolly.reactNativeStarRating.mod.default
import typingsJapgolly.reactNativeStarRating.reactNativeStarRatingStrings.bounce
import typingsJapgolly.reactNativeStarRating.reactNativeStarRatingStrings.flash
import typingsJapgolly.reactNativeStarRating.reactNativeStarRatingStrings.jello
import typingsJapgolly.reactNativeStarRating.reactNativeStarRatingStrings.pulse
import typingsJapgolly.reactNativeStarRating.reactNativeStarRatingStrings.rotate
import typingsJapgolly.reactNativeStarRating.reactNativeStarRatingStrings.rubberBand
import typingsJapgolly.reactNativeStarRating.reactNativeStarRatingStrings.shake
import typingsJapgolly.reactNativeStarRating.reactNativeStarRatingStrings.swing
import typingsJapgolly.reactNativeStarRating.reactNativeStarRatingStrings.tada
import typingsJapgolly.reactNativeStarRating.reactNativeStarRatingStrings.wobble
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeStarRating {
  def apply(
    activeOpacity: Int | Double = null,
    animation: bounce | flash | jello | pulse | rotate | rubberBand | shake | swing | tada | wobble = null,
    buttonStyle: StyleProp[ViewStyle] = null,
    containerStyle: StyleProp[ViewStyle] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    emptyStar: String | ImageURISource = null,
    emptyStarColor: String = null,
    fullStar: String | ImageURISource = null,
    fullStarColor: String = null,
    halfStar: String | ImageURISource = null,
    halfStarColor: String = null,
    halfStarEnabled: js.UndefOr[Boolean] = js.undefined,
    iconSet: String = null,
    maxStars: Int | Double = null,
    rating: Int | Double = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    selectedStar: /* rating */ Double => Callback = null,
    starSize: Int | Double = null,
    starStyle: StyleProp[ViewStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[StarRatingProps, default, Unit, StarRatingProps] = {
    val __obj = js.Dynamic.literal()
  
      if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (emptyStar != null) __obj.updateDynamic("emptyStar")(emptyStar.asInstanceOf[js.Any])
    if (emptyStarColor != null) __obj.updateDynamic("emptyStarColor")(emptyStarColor.asInstanceOf[js.Any])
    if (fullStar != null) __obj.updateDynamic("fullStar")(fullStar.asInstanceOf[js.Any])
    if (fullStarColor != null) __obj.updateDynamic("fullStarColor")(fullStarColor.asInstanceOf[js.Any])
    if (halfStar != null) __obj.updateDynamic("halfStar")(halfStar.asInstanceOf[js.Any])
    if (halfStarColor != null) __obj.updateDynamic("halfStarColor")(halfStarColor.asInstanceOf[js.Any])
    if (!js.isUndefined(halfStarEnabled)) __obj.updateDynamic("halfStarEnabled")(halfStarEnabled.asInstanceOf[js.Any])
    if (iconSet != null) __obj.updateDynamic("iconSet")(iconSet.asInstanceOf[js.Any])
    if (maxStars != null) __obj.updateDynamic("maxStars")(maxStars.asInstanceOf[js.Any])
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    if (selectedStar != null) __obj.updateDynamic("selectedStar")(js.Any.fromFunction1((t0: /* rating */ scala.Double) => selectedStar(t0).runNow()))
    if (starSize != null) __obj.updateDynamic("starSize")(starSize.asInstanceOf[js.Any])
    if (starStyle != null) __obj.updateDynamic("starStyle")(starStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeStarRating.mod.StarRatingProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeStarRating.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeStarRating.mod.StarRatingProps])(children: _*)
  }
  @JSImport("react-native-star-rating", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

