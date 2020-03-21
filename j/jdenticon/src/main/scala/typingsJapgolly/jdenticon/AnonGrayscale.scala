package typingsJapgolly.jdenticon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGrayscale extends js.Object {
  /**
    * Specifies the saturation of originally colored shapes of an icon. The saturation is expressed as a
    * number in the range [0.0, 1.0].
    */
  var color: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the saturation of originally grayscale shapes of an icon. The saturation is expressed as a
    * number in the range [0.0, 1.0].
    */
  var grayscale: js.UndefOr[Double] = js.undefined
}

object AnonGrayscale {
  @scala.inline
  def apply(color: Int | Double = null, grayscale: Int | Double = null): AnonGrayscale = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (grayscale != null) __obj.updateDynamic("grayscale")(grayscale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGrayscale]
  }
}

