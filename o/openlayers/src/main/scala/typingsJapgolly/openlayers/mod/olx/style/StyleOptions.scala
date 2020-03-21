package typingsJapgolly.openlayers.mod.olx.style

import typingsJapgolly.openlayers.mod.StyleGeometryFunction
import typingsJapgolly.openlayers.mod.geom.Geometry
import typingsJapgolly.openlayers.mod.style.Fill
import typingsJapgolly.openlayers.mod.style.Image
import typingsJapgolly.openlayers.mod.style.Stroke
import typingsJapgolly.openlayers.mod.style.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleOptions extends js.Object {
  var fill: js.UndefOr[Fill] = js.undefined
  var geometry: js.UndefOr[String | Geometry | StyleGeometryFunction] = js.undefined
  var image: js.UndefOr[Image] = js.undefined
  var stroke: js.UndefOr[Stroke] = js.undefined
  var text: js.UndefOr[Text] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object StyleOptions {
  @scala.inline
  def apply(
    fill: Fill = null,
    geometry: String | Geometry | StyleGeometryFunction = null,
    image: Image = null,
    stroke: Stroke = null,
    text: Text = null,
    zIndex: Int | Double = null
  ): StyleOptions = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleOptions]
  }
}

