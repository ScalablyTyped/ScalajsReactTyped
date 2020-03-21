package typingsJapgolly.reactNativeRatings.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNativeRatings.mod.AirbnbRatingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AirbnbRating {
  def apply(
    count: Int | Double = null,
    defaultRating: Int | Double = null,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    onFinishRating: /* value */ Double => Callback = null,
    reviews: js.Array[String] = null,
    showRating: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null,
    starStyle: ImageStyle = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    AirbnbRatingProps, 
    typingsJapgolly.reactNativeRatings.mod.AirbnbRating, 
    Unit, 
    AirbnbRatingProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (defaultRating != null) __obj.updateDynamic("defaultRating")(defaultRating.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.asInstanceOf[js.Any])
    if (onFinishRating != null) __obj.updateDynamic("onFinishRating")(js.Any.fromFunction1((t0: /* value */ scala.Double) => onFinishRating(t0).runNow()))
    if (reviews != null) __obj.updateDynamic("reviews")(reviews.asInstanceOf[js.Any])
    if (!js.isUndefined(showRating)) __obj.updateDynamic("showRating")(showRating.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (starStyle != null) __obj.updateDynamic("starStyle")(starStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeRatings.mod.AirbnbRatingProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeRatings.mod.AirbnbRating](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeRatings.mod.AirbnbRatingProps])(children: _*)
  }
  @JSImport("react-native-ratings", "AirbnbRating")
  @js.native
  object componentImport extends js.Object
  
}

