package typingsJapgolly.figma.mod._Global_

import typingsJapgolly.figma.figmaStrings.GRADIENT_ANGULAR
import typingsJapgolly.figma.figmaStrings.GRADIENT_DIAMOND
import typingsJapgolly.figma.figmaStrings.GRADIENT_LINEAR
import typingsJapgolly.figma.figmaStrings.GRADIENT_RADIAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradientPaint extends Paint {
  val blendMode: js.UndefOr[BlendMode] = js.undefined
  val gradientStops: js.Array[ColorStop]
  val gradientTransform: Transform
  val opacity: js.UndefOr[Double] = js.undefined
  val `type`: GRADIENT_LINEAR | GRADIENT_RADIAL | GRADIENT_ANGULAR | GRADIENT_DIAMOND
  val visible: js.UndefOr[Boolean] = js.undefined
}

object GradientPaint {
  @scala.inline
  def apply(
    gradientStops: js.Array[ColorStop],
    gradientTransform: Transform,
    `type`: GRADIENT_LINEAR | GRADIENT_RADIAL | GRADIENT_ANGULAR | GRADIENT_DIAMOND,
    blendMode: BlendMode = null,
    opacity: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): GradientPaint = {
    val __obj = js.Dynamic.literal(gradientStops = gradientStops.asInstanceOf[js.Any], gradientTransform = gradientTransform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (blendMode != null) __obj.updateDynamic("blendMode")(blendMode.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientPaint]
  }
}

