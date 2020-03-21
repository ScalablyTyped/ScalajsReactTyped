package typingsJapgolly.antDesignReactNative.cameraRollPickerMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.reactNative.mod.CameraRollAssetType
import typingsJapgolly.reactNative.mod.CameraRollGroupType
import typingsJapgolly.reactNative.mod.GetPhotosParamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraRollPickerProps extends GetPhotosParamType {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var callback: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var containerWidth: js.UndefOr[Double] = js.undefined
  var imageMargin: Double
  var imagesPerRow: Double
  var maximum: Double
  var selectSingleItem: js.UndefOr[Boolean] = js.undefined
  var selected: js.UndefOr[js.Array[_]] = js.undefined
  var selectedMarker: js.UndefOr[Element] = js.undefined
}

object CameraRollPickerProps {
  @scala.inline
  def apply(
    first: Double,
    imageMargin: Double,
    imagesPerRow: Double,
    maximum: Double,
    after: String = null,
    assetType: CameraRollAssetType = null,
    backgroundColor: String = null,
    callback: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    containerWidth: Int | Double = null,
    groupName: String = null,
    groupTypes: CameraRollGroupType = null,
    mimeTypes: js.Array[String] = null,
    selectSingleItem: js.UndefOr[Boolean] = js.undefined,
    selected: js.Array[_] = null,
    selectedMarker: VdomElement = null
  ): CameraRollPickerProps = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], imageMargin = imageMargin.asInstanceOf[js.Any], imagesPerRow = imagesPerRow.asInstanceOf[js.Any], maximum = maximum.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (assetType != null) __obj.updateDynamic("assetType")(assetType.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => callback(t0).runNow()))
    if (containerWidth != null) __obj.updateDynamic("containerWidth")(containerWidth.asInstanceOf[js.Any])
    if (groupName != null) __obj.updateDynamic("groupName")(groupName.asInstanceOf[js.Any])
    if (groupTypes != null) __obj.updateDynamic("groupTypes")(groupTypes.asInstanceOf[js.Any])
    if (mimeTypes != null) __obj.updateDynamic("mimeTypes")(mimeTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(selectSingleItem)) __obj.updateDynamic("selectSingleItem")(selectSingleItem.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (selectedMarker != null) __obj.updateDynamic("selectedMarker")(selectedMarker.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraRollPickerProps]
  }
}

