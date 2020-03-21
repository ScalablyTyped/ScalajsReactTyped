package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAssetType extends js.Object {
  var assetType: String
  var backgroundColor: String
  var first: Double
  var groupTypes: String
  var imageMargin: Double
  var imagesPerRow: Double
  var maximum: Double
  var selectSingleItem: Boolean
  var selected: js.Array[scala.Nothing]
  def callback(selectedImages: js.Any, currentImage: js.Any): Unit
}

object AnonAssetType {
  @scala.inline
  def apply(
    assetType: String,
    backgroundColor: String,
    callback: (js.Any, js.Any) => Callback,
    first: Double,
    groupTypes: String,
    imageMargin: Double,
    imagesPerRow: Double,
    maximum: Double,
    selectSingleItem: Boolean,
    selected: js.Array[scala.Nothing]
  ): AnonAssetType = {
    val __obj = js.Dynamic.literal(assetType = assetType.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], groupTypes = groupTypes.asInstanceOf[js.Any], imageMargin = imageMargin.asInstanceOf[js.Any], imagesPerRow = imagesPerRow.asInstanceOf[js.Any], maximum = maximum.asInstanceOf[js.Any], selectSingleItem = selectSingleItem.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => callback(t0, t1).runNow()))
    __obj.asInstanceOf[AnonAssetType]
  }
}

