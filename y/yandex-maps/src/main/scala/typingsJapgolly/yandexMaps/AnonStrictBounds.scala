package typingsJapgolly.yandexMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStrictBounds extends js.Object {
  var boundedBy: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
  var strictBounds: js.UndefOr[Boolean] = js.undefined
}

object AnonStrictBounds {
  @scala.inline
  def apply(
    boundedBy: js.Array[js.Array[Double]] = null,
    results: Int | Double = null,
    strictBounds: js.UndefOr[Boolean] = js.undefined
  ): AnonStrictBounds = {
    val __obj = js.Dynamic.literal()
    if (boundedBy != null) __obj.updateDynamic("boundedBy")(boundedBy.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (!js.isUndefined(strictBounds)) __obj.updateDynamic("strictBounds")(strictBounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStrictBounds]
  }
}

