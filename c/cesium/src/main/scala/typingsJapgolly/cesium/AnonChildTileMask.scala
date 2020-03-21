package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.Credit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildTileMask extends js.Object {
  var buffer: scala.scalajs.js.typedarray.ArrayBuffer
  var childTileMask: js.UndefOr[Double] = js.undefined
  var createdByUpsampling: js.UndefOr[Boolean] = js.undefined
  var credits: js.UndefOr[js.Array[Credit]] = js.undefined
  var negativeAltitudeExponentBias: Double
  var negativeElevationThreshold: Double
}

object AnonChildTileMask {
  @scala.inline
  def apply(
    buffer: scala.scalajs.js.typedarray.ArrayBuffer,
    negativeAltitudeExponentBias: Double,
    negativeElevationThreshold: Double,
    childTileMask: Int | Double = null,
    createdByUpsampling: js.UndefOr[Boolean] = js.undefined,
    credits: js.Array[Credit] = null
  ): AnonChildTileMask = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], negativeAltitudeExponentBias = negativeAltitudeExponentBias.asInstanceOf[js.Any], negativeElevationThreshold = negativeElevationThreshold.asInstanceOf[js.Any])
    if (childTileMask != null) __obj.updateDynamic("childTileMask")(childTileMask.asInstanceOf[js.Any])
    if (!js.isUndefined(createdByUpsampling)) __obj.updateDynamic("createdByUpsampling")(createdByUpsampling.asInstanceOf[js.Any])
    if (credits != null) __obj.updateDynamic("credits")(credits.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildTileMask]
  }
}

