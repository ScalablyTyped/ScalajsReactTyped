package typingsJapgolly.ol.bingMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageryProvider extends js.Object {
  var attribution: js.UndefOr[String] = js.undefined
  var coverageAreas: js.Array[CoverageArea]
}

object ImageryProvider {
  @scala.inline
  def apply(coverageAreas: js.Array[CoverageArea], attribution: String = null): ImageryProvider = {
    val __obj = js.Dynamic.literal(coverageAreas = coverageAreas.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageryProvider]
  }
}

