package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.Color
import typingsJapgolly.cesium.mod.Ellipsoid
import typingsJapgolly.cesium.mod.TilingScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCanvasSize extends js.Object {
  var canvasSize: js.UndefOr[Double] = js.undefined
  var cells: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[Color] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var glowColor: js.UndefOr[Color] = js.undefined
  var glowWidth: js.UndefOr[Double] = js.undefined
  var tileHeight: js.UndefOr[Double] = js.undefined
  var tileWidth: js.UndefOr[Double] = js.undefined
  var tilingScheme: js.UndefOr[TilingScheme] = js.undefined
}

object AnonCanvasSize {
  @scala.inline
  def apply(
    canvasSize: Int | Double = null,
    cells: Int | Double = null,
    color: Color = null,
    ellipsoid: Ellipsoid = null,
    glowColor: Color = null,
    glowWidth: Int | Double = null,
    tileHeight: Int | Double = null,
    tileWidth: Int | Double = null,
    tilingScheme: TilingScheme = null
  ): AnonCanvasSize = {
    val __obj = js.Dynamic.literal()
    if (canvasSize != null) __obj.updateDynamic("canvasSize")(canvasSize.asInstanceOf[js.Any])
    if (cells != null) __obj.updateDynamic("cells")(cells.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (glowColor != null) __obj.updateDynamic("glowColor")(glowColor.asInstanceOf[js.Any])
    if (glowWidth != null) __obj.updateDynamic("glowWidth")(glowWidth.asInstanceOf[js.Any])
    if (tileHeight != null) __obj.updateDynamic("tileHeight")(tileHeight.asInstanceOf[js.Any])
    if (tileWidth != null) __obj.updateDynamic("tileWidth")(tileWidth.asInstanceOf[js.Any])
    if (tilingScheme != null) __obj.updateDynamic("tilingScheme")(tilingScheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCanvasSize]
  }
}

