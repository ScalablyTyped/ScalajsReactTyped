package typingsJapgolly.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object consisting of the position and size measurements.
  */
trait Dimension extends js.Object {
  /**
  	 * The height measurement.
  	 */
  var height: js.UndefOr[Double] = js.undefined
  /**
  	 * The width measurement.
  	 */
  var width: js.UndefOr[Double] = js.undefined
  /**
  	 * The x-axis coordinate of the position.
  	 */
  var x: js.UndefOr[Double] = js.undefined
  /**
  	 * The y-axis coordinate of the position.
  	 */
  var y: js.UndefOr[Double] = js.undefined
}

object Dimension {
  @scala.inline
  def apply(
    height: Int | Double = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): Dimension = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimension]
  }
}

