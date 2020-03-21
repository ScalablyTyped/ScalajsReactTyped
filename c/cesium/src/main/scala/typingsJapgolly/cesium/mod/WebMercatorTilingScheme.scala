package typingsJapgolly.cesium.mod

import typingsJapgolly.cesium.AnonNumberOfLevelZeroTilesY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "WebMercatorTilingScheme")
@js.native
class WebMercatorTilingScheme () extends js.Object {
  def this(options: AnonNumberOfLevelZeroTilesY) = this()
  var ellipsoid: Ellipsoid = js.native
  var projection: MapProjection = js.native
  var rectangle: Rectangle = js.native
  def getNumberOfXTilesAtLevel(level: Double): Double = js.native
  def getNumberOfYTilesAtLevel(level: Double): Double = js.native
  def positionToTileXY(position: Cartographic, level: Double): Cartesian2 = js.native
  def positionToTileXY(position: Cartographic, level: Double, result: Cartesian2): Cartesian2 = js.native
  def rectangleToNativeRectangle(rectangle: Rectangle): Rectangle = js.native
  def rectangleToNativeRectangle(rectangle: Rectangle, result: Rectangle): Rectangle = js.native
  def tileXYToNativeRectangle(x: Double, y: Double, level: Double): Rectangle = js.native
  def tileXYToNativeRectangle(x: Double, y: Double, level: Double, result: js.Any): Rectangle = js.native
  def tileXYToRectangle(x: Double, y: Double, level: Double): Rectangle = js.native
  def tileXYToRectangle(x: Double, y: Double, level: Double, result: js.Any): Rectangle = js.native
}

