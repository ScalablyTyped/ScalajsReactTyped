package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.Ellipsoid
import typingsJapgolly.cesium.mod.Rectangle
import typingsJapgolly.cesium.mod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRectangle extends js.Object {
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var extrudedHeight: js.UndefOr[Double] = js.undefined
  var granularity: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var rectangle: Rectangle
  var rotation: js.UndefOr[Double] = js.undefined
  var stRotation: js.UndefOr[Double] = js.undefined
  var vertexFormat: js.UndefOr[VertexFormat] = js.undefined
}

object AnonRectangle {
  @scala.inline
  def apply(
    rectangle: Rectangle,
    ellipsoid: Ellipsoid = null,
    extrudedHeight: Int | Double = null,
    granularity: Int | Double = null,
    height: Int | Double = null,
    rotation: Int | Double = null,
    stRotation: Int | Double = null,
    vertexFormat: VertexFormat = null
  ): AnonRectangle = {
    val __obj = js.Dynamic.literal(rectangle = rectangle.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (extrudedHeight != null) __obj.updateDynamic("extrudedHeight")(extrudedHeight.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (stRotation != null) __obj.updateDynamic("stRotation")(stRotation.asInstanceOf[js.Any])
    if (vertexFormat != null) __obj.updateDynamic("vertexFormat")(vertexFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRectangle]
  }
}

