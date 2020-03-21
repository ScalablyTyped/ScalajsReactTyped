package typingsJapgolly.reactNativeRatings.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeRatings.mod.RatingProps
import typingsJapgolly.reactNativeRatings.reactNativeRatingsStrings.bell
import typingsJapgolly.reactNativeRatings.reactNativeRatingsStrings.custom
import typingsJapgolly.reactNativeRatings.reactNativeRatingsStrings.heart
import typingsJapgolly.reactNativeRatings.reactNativeRatingsStrings.rocket
import typingsJapgolly.reactNativeRatings.reactNativeRatingsStrings.star
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Rating {
  def apply(
    fractions: Int | Double = null,
    imageSize: Int | Double = null,
    minValue: Int | Double = null,
    onFinishRating: /* rating */ Double => Callback = null,
    onStartRating: js.UndefOr[Callback] = js.undefined,
    ratingBackgroundColor: String = null,
    ratingColor: String = null,
    ratingCount: Int | Double = null,
    ratingImage: ImageURISource = null,
    ratingTextColor: String = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    showRating: js.UndefOr[Boolean] = js.undefined,
    startingValue: Int | Double = null,
    style: Validator[js.UndefOr[StyleProp[ViewStyle]]] = null,
    tintColor: String = null,
    `type`: star | rocket | bell | heart | custom = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[RatingProps, typingsJapgolly.reactNativeRatings.mod.Rating, Unit, RatingProps] = {
    val __obj = js.Dynamic.literal()
  
      if (fractions != null) __obj.updateDynamic("fractions")(fractions.asInstanceOf[js.Any])
    if (imageSize != null) __obj.updateDynamic("imageSize")(imageSize.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (onFinishRating != null) __obj.updateDynamic("onFinishRating")(js.Any.fromFunction1((t0: /* rating */ scala.Double) => onFinishRating(t0).runNow()))
    onStartRating.foreach(p => __obj.updateDynamic("onStartRating")(p.toJsFn))
    if (ratingBackgroundColor != null) __obj.updateDynamic("ratingBackgroundColor")(ratingBackgroundColor.asInstanceOf[js.Any])
    if (ratingColor != null) __obj.updateDynamic("ratingColor")(ratingColor.asInstanceOf[js.Any])
    if (ratingCount != null) __obj.updateDynamic("ratingCount")(ratingCount.asInstanceOf[js.Any])
    if (ratingImage != null) __obj.updateDynamic("ratingImage")(ratingImage.asInstanceOf[js.Any])
    if (ratingTextColor != null) __obj.updateDynamic("ratingTextColor")(ratingTextColor.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (!js.isUndefined(showRating)) __obj.updateDynamic("showRating")(showRating.asInstanceOf[js.Any])
    if (startingValue != null) __obj.updateDynamic("startingValue")(startingValue.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeRatings.mod.RatingProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeRatings.mod.Rating](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeRatings.mod.RatingProps])(children: _*)
  }
  @JSImport("react-native-ratings", "Rating")
  @js.native
  object componentImport extends js.Object
  
}

