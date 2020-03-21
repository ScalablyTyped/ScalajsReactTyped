package typingsJapgolly.antDesignReactNative.imageItemMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageItemProps extends js.Object {
  var containerWidth: js.UndefOr[Double] = js.undefined
  var imageMargin: Double
  var imagesPerRow: Double
  var item: js.UndefOr[js.Any] = js.undefined
  var onPress: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var selectedMarker: js.UndefOr[Element] = js.undefined
}

object ImageItemProps {
  @scala.inline
  def apply(
    imageMargin: Double,
    imagesPerRow: Double,
    containerWidth: Int | Double = null,
    item: js.Any = null,
    onPress: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    selectedMarker: VdomElement = null
  ): ImageItemProps = {
    val __obj = js.Dynamic.literal(imageMargin = imageMargin.asInstanceOf[js.Any], imagesPerRow = imagesPerRow.asInstanceOf[js.Any])
    if (containerWidth != null) __obj.updateDynamic("containerWidth")(containerWidth.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onPress(t0).runNow()))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (selectedMarker != null) __obj.updateDynamic("selectedMarker")(selectedMarker.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageItemProps]
  }
}

