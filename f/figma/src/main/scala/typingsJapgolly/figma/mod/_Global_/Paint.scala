package typingsJapgolly.figma.mod._Global_

import typingsJapgolly.figma.figmaStrings.CROP
import typingsJapgolly.figma.figmaStrings.FILL
import typingsJapgolly.figma.figmaStrings.FIT
import typingsJapgolly.figma.figmaStrings.GRADIENT_ANGULAR
import typingsJapgolly.figma.figmaStrings.GRADIENT_DIAMOND
import typingsJapgolly.figma.figmaStrings.GRADIENT_LINEAR
import typingsJapgolly.figma.figmaStrings.GRADIENT_RADIAL
import typingsJapgolly.figma.figmaStrings.IMAGE
import typingsJapgolly.figma.figmaStrings.SOLID
import typingsJapgolly.figma.figmaStrings.TILE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.figma.mod._Global_.SolidPaint
  - typingsJapgolly.figma.mod._Global_.GradientPaint
  - typingsJapgolly.figma.mod._Global_.ImagePaint
*/
trait Paint extends js.Object

object Paint {
  @scala.inline
  def SolidPaint(
    color: RGB,
    `type`: SOLID,
    blendMode: BlendMode = null,
    opacity: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Paint = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (blendMode != null) __obj.updateDynamic("blendMode")(blendMode.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paint]
  }
  @scala.inline
  def GradientPaint(
    gradientStops: js.Array[ColorStop],
    gradientTransform: Transform,
    `type`: GRADIENT_LINEAR | GRADIENT_RADIAL | GRADIENT_ANGULAR | GRADIENT_DIAMOND,
    blendMode: BlendMode = null,
    opacity: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Paint = {
    val __obj = js.Dynamic.literal(gradientStops = gradientStops.asInstanceOf[js.Any], gradientTransform = gradientTransform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (blendMode != null) __obj.updateDynamic("blendMode")(blendMode.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paint]
  }
  @scala.inline
  def ImagePaint(
    scaleMode: FILL | FIT | CROP | TILE,
    `type`: IMAGE,
    blendMode: BlendMode = null,
    filters: ImageFilters = null,
    imageHash: String = null,
    imageTransform: Transform = null,
    opacity: Int | Double = null,
    scalingFactor: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Paint = {
    val __obj = js.Dynamic.literal(scaleMode = scaleMode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (blendMode != null) __obj.updateDynamic("blendMode")(blendMode.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (imageHash != null) __obj.updateDynamic("imageHash")(imageHash.asInstanceOf[js.Any])
    if (imageTransform != null) __obj.updateDynamic("imageTransform")(imageTransform.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (scalingFactor != null) __obj.updateDynamic("scalingFactor")(scalingFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paint]
  }
}

