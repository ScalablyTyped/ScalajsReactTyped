package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.Cartesian2
import typingsJapgolly.cesium.mod.Cartesian3
import typingsJapgolly.cesium.mod.CornerType
import typingsJapgolly.cesium.mod.Ellipsoid
import typingsJapgolly.cesium.mod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPolylinePositions extends js.Object {
  var cornerType: js.UndefOr[CornerType] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var granularity: js.UndefOr[Double] = js.undefined
  var polylinePositions: js.Array[Cartesian3]
  var shapePositions: js.Array[Cartesian2]
  var vertexFormat: js.UndefOr[VertexFormat] = js.undefined
}

object AnonPolylinePositions {
  @scala.inline
  def apply(
    polylinePositions: js.Array[Cartesian3],
    shapePositions: js.Array[Cartesian2],
    cornerType: CornerType = null,
    ellipsoid: Ellipsoid = null,
    granularity: Int | Double = null,
    vertexFormat: VertexFormat = null
  ): AnonPolylinePositions = {
    val __obj = js.Dynamic.literal(polylinePositions = polylinePositions.asInstanceOf[js.Any], shapePositions = shapePositions.asInstanceOf[js.Any])
    if (cornerType != null) __obj.updateDynamic("cornerType")(cornerType.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (vertexFormat != null) __obj.updateDynamic("vertexFormat")(vertexFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPolylinePositions]
  }
}

