package typingsJapgolly.reactNativeElements

import japgolly.scalajs.react.Callback
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.bell
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.custom
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.heart
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.rocket
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.star
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-ratings.react-native-ratings.RatingProps> */
trait PartialRatingProps extends js.Object {
  var fractions: js.UndefOr[Double] = js.undefined
  var imageSize: js.UndefOr[Double] = js.undefined
  var minValue: js.UndefOr[Double] = js.undefined
  var onFinishRating: js.UndefOr[js.Function1[/* rating */ Double, Unit]] = js.undefined
  var onStartRating: js.UndefOr[js.Function0[Unit]] = js.undefined
  var ratingBackgroundColor: js.UndefOr[String] = js.undefined
  var ratingColor: js.UndefOr[String] = js.undefined
  var ratingCount: js.UndefOr[Double] = js.undefined
  var ratingImage: js.UndefOr[ImageURISource] = js.undefined
  var ratingTextColor: js.UndefOr[String] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var showRating: js.UndefOr[Boolean] = js.undefined
  var startingValue: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[Validator[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[star | rocket | bell | heart | custom] = js.undefined
}

object PartialRatingProps {
  @scala.inline
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
    `type`: star | rocket | bell | heart | custom = null
  ): PartialRatingProps = {
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
    __obj.asInstanceOf[PartialRatingProps]
  }
}

