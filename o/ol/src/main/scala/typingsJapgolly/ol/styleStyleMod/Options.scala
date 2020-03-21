package typingsJapgolly.ol.styleStyleMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.renderMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fill: js.UndefOr[typingsJapgolly.ol.fillMod.default] = js.undefined
  var geometry: js.UndefOr[String | typingsJapgolly.ol.geometryMod.default | GeometryFunction] = js.undefined
  var image: js.UndefOr[typingsJapgolly.ol.styleImageMod.default] = js.undefined
  var renderer: js.UndefOr[RenderFunction] = js.undefined
  var stroke: js.UndefOr[typingsJapgolly.ol.strokeMod.default] = js.undefined
  var text: js.UndefOr[typingsJapgolly.ol.textMod.default] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fill: typingsJapgolly.ol.fillMod.default = null,
    geometry: String | typingsJapgolly.ol.geometryMod.default | GeometryFunction = null,
    image: typingsJapgolly.ol.styleImageMod.default = null,
    renderer: (/* p0 */ Coordinate | (js.Array[js.Array[Coordinate] | Coordinate]), /* p1 */ State) => Callback = null,
    stroke: typingsJapgolly.ol.strokeMod.default = null,
    text: typingsJapgolly.ol.textMod.default = null,
    zIndex: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction2((t0: /* p0 */ typingsJapgolly.ol.coordinateMod.Coordinate | (js.Array[
  js.Array[typingsJapgolly.ol.coordinateMod.Coordinate] | typingsJapgolly.ol.coordinateMod.Coordinate]), t1: /* p1 */ typingsJapgolly.ol.renderMod.State) => renderer(t0, t1).runNow()))
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

