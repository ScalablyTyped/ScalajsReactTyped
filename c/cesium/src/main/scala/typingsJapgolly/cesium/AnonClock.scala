package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.Clock
import typingsJapgolly.cesium.mod.Credit
import typingsJapgolly.cesium.mod.Ellipsoid
import typingsJapgolly.cesium.mod.Rectangle
import typingsJapgolly.cesium.mod.TilingScheme
import typingsJapgolly.cesium.mod.TimeIntervalCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClock extends js.Object {
  var clock: js.UndefOr[Clock] = js.undefined
  var credit: js.UndefOr[Credit | String] = js.undefined
  var dimensions: js.UndefOr[js.Any] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var layer: String
  var maximumLevel: js.UndefOr[Double] = js.undefined
  var minimumLevel: js.UndefOr[Double] = js.undefined
  var rectangle: js.UndefOr[Rectangle] = js.undefined
  var style: String
  var subdomains: js.UndefOr[String | js.Array[String]] = js.undefined
  var tileHeight: js.UndefOr[Double] = js.undefined
  var tileMatrixLabels: js.UndefOr[js.Array[_]] = js.undefined
  var tileMatrixSetID: String
  var tileWidth: js.UndefOr[Double] = js.undefined
  var tilingScheme: js.UndefOr[TilingScheme] = js.undefined
  var times: js.UndefOr[TimeIntervalCollection] = js.undefined
  var url: String
}

object AnonClock {
  @scala.inline
  def apply(
    layer: String,
    style: String,
    tileMatrixSetID: String,
    url: String,
    clock: Clock = null,
    credit: Credit | String = null,
    dimensions: js.Any = null,
    ellipsoid: Ellipsoid = null,
    format: String = null,
    maximumLevel: Int | Double = null,
    minimumLevel: Int | Double = null,
    rectangle: Rectangle = null,
    subdomains: String | js.Array[String] = null,
    tileHeight: Int | Double = null,
    tileMatrixLabels: js.Array[_] = null,
    tileWidth: Int | Double = null,
    tilingScheme: TilingScheme = null,
    times: TimeIntervalCollection = null
  ): AnonClock = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tileMatrixSetID = tileMatrixSetID.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (clock != null) __obj.updateDynamic("clock")(clock.asInstanceOf[js.Any])
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (maximumLevel != null) __obj.updateDynamic("maximumLevel")(maximumLevel.asInstanceOf[js.Any])
    if (minimumLevel != null) __obj.updateDynamic("minimumLevel")(minimumLevel.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    if (subdomains != null) __obj.updateDynamic("subdomains")(subdomains.asInstanceOf[js.Any])
    if (tileHeight != null) __obj.updateDynamic("tileHeight")(tileHeight.asInstanceOf[js.Any])
    if (tileMatrixLabels != null) __obj.updateDynamic("tileMatrixLabels")(tileMatrixLabels.asInstanceOf[js.Any])
    if (tileWidth != null) __obj.updateDynamic("tileWidth")(tileWidth.asInstanceOf[js.Any])
    if (tilingScheme != null) __obj.updateDynamic("tilingScheme")(tilingScheme.asInstanceOf[js.Any])
    if (times != null) __obj.updateDynamic("times")(times.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClock]
  }
}

