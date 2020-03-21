package typingsJapgolly.figma.mod._Global_

import typingsJapgolly.figma.figmaStrings.CROP
import typingsJapgolly.figma.figmaStrings.FILL
import typingsJapgolly.figma.figmaStrings.FIT
import typingsJapgolly.figma.figmaStrings.IMAGE
import typingsJapgolly.figma.figmaStrings.TILE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePaint extends Paint {
  val blendMode: js.UndefOr[BlendMode] = js.undefined
   // setting for "TILE"
  val filters: js.UndefOr[ImageFilters] = js.undefined
  val imageHash: String | Null
  val imageTransform: js.UndefOr[Transform] = js.undefined
  val opacity: js.UndefOr[Double] = js.undefined
  val scaleMode: FILL | FIT | CROP | TILE
   // setting for "CROP"
  val scalingFactor: js.UndefOr[Double] = js.undefined
  val `type`: IMAGE
  val visible: js.UndefOr[Boolean] = js.undefined
}

object ImagePaint {
  @scala.inline
  def apply(
    scaleMode: FILL | FIT | CROP | TILE,
    `type`: IMAGE,
    blendMode: BlendMode = null,
    filters: ImageFilters = null,
    imageHash: String = null,
    imageTransform: Transform = null,
    opacity: Int | Double = null,
    scalingFactor: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ImagePaint = {
    val __obj = js.Dynamic.literal(scaleMode = scaleMode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (blendMode != null) __obj.updateDynamic("blendMode")(blendMode.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (imageHash != null) __obj.updateDynamic("imageHash")(imageHash.asInstanceOf[js.Any])
    if (imageTransform != null) __obj.updateDynamic("imageTransform")(imageTransform.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (scalingFactor != null) __obj.updateDynamic("scalingFactor")(scalingFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePaint]
  }
}

