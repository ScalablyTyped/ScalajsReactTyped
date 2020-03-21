package typingsJapgolly.heredatalens.H.datalens.RasterLayer

import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("H.datalens.RasterLayer")
@js.native
object ^ extends js.Object {
  /**
    * Default value for dataToRows callback option.
    * It represents each row as an object where property names correspond to data column names.
    */
  var defaultDataToRows: js.Any = js.native
  /**
    * This is a default implementation of renderTile callback. This method represents each point as a black 1x1 pixel square.
    * @param points - Input data points within a tile
    * @param canvas - The target canvas
    */
  def defaultRenderTile(points: js.Array[TilePoint], canvas: HTMLCanvasElement): Unit = js.native
}

