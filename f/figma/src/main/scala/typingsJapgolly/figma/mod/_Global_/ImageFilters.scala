package typingsJapgolly.figma.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageFilters extends js.Object {
  val contrast: js.UndefOr[Double] = js.undefined
  val exposure: js.UndefOr[Double] = js.undefined
  val highlights: js.UndefOr[Double] = js.undefined
  val saturation: js.UndefOr[Double] = js.undefined
  val shadows: js.UndefOr[Double] = js.undefined
  val temperature: js.UndefOr[Double] = js.undefined
  val tint: js.UndefOr[Double] = js.undefined
}

object ImageFilters {
  @scala.inline
  def apply(
    contrast: Int | Double = null,
    exposure: Int | Double = null,
    highlights: Int | Double = null,
    saturation: Int | Double = null,
    shadows: Int | Double = null,
    temperature: Int | Double = null,
    tint: Int | Double = null
  ): ImageFilters = {
    val __obj = js.Dynamic.literal()
    if (contrast != null) __obj.updateDynamic("contrast")(contrast.asInstanceOf[js.Any])
    if (exposure != null) __obj.updateDynamic("exposure")(exposure.asInstanceOf[js.Any])
    if (highlights != null) __obj.updateDynamic("highlights")(highlights.asInstanceOf[js.Any])
    if (saturation != null) __obj.updateDynamic("saturation")(saturation.asInstanceOf[js.Any])
    if (shadows != null) __obj.updateDynamic("shadows")(shadows.asInstanceOf[js.Any])
    if (temperature != null) __obj.updateDynamic("temperature")(temperature.asInstanceOf[js.Any])
    if (tint != null) __obj.updateDynamic("tint")(tint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageFilters]
  }
}

