package typingsJapgolly.fabric.fabricImplMod

import typingsJapgolly.fabric.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "PencilBrush")
@js.native
class PencilBrush () extends BaseBrush {
  /**
  	 * Converts points to SVG path
  	 * @param points Array of points
  	 */
  def convertPointsToSVGPath(points: js.Array[AnonX]): js.Array[String] = js.native
  def convertPointsToSVGPath(points: js.Array[AnonX], minX: Double): js.Array[String] = js.native
  def convertPointsToSVGPath(points: js.Array[AnonX], minX: Double, minY: Double): js.Array[String] = js.native
  /**
  	 * Creates fabric.Path object to add on canvas
  	 * @param pathData Path data
  	 */
  def createPath(pathData: String): Path = js.native
}

