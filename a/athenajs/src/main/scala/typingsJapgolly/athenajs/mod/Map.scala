package typingsJapgolly.athenajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", "Map")
@js.native
class Map protected () extends js.Object {
  def this(options: MapOptions) = this()
  var duration: Double = js.native
  var height: Double = js.native
  var numCols: Double = js.native
  var numRows: Double = js.native
  var tileHeight: Double = js.native
  var tileWidth: Double = js.native
  var width: Double = js.native
  def addObject(obj: Drawable): Unit = js.native
  def addObject(obj: Drawable, layerIndex: Double): Unit = js.native
  def addTileSet(tiles: js.Array[TileDesc]): Unit = js.native
  def checkMatrixForCollision(buffer: js.Array[Double], matrixWidth: Double, x: Double, y: Double, behavior: Double): Boolean = js.native
  def clear(): Unit = js.native
  def clear(tileNum: Double): Unit = js.native
  def clear(tileNum: Double, behavior: Double): Unit = js.native
  def getTileBehaviorAtIndex(col: Double, row: Double): Double = js.native
  def getTileIndexFromPixel(x: Double, y: Double): pixelPos = js.native
  def moveTo(x: Double, y: Double): Unit = js.native
  def respawn(): Unit = js.native
  def setData(map: scala.scalajs.js.typedarray.Uint8Array, behaviors: scala.scalajs.js.typedarray.Uint8Array): Unit = js.native
  def setEasing(easing: String): Unit = js.native
  def shift(startLine: Double, height: Double): Unit = js.native
  def updateTile(col: Double, row: Double): Unit = js.native
  def updateTile(col: Double, row: Double, tileNum: Double): Unit = js.native
  def updateTile(col: Double, row: Double, tileNum: Double, behavior: Double): Unit = js.native
}

