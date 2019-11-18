package typingsJapgolly.three.threeMod

import typingsJapgolly.three.srcExtrasShapeUtilsMod.Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "ShapeUtils")
@js.native
object ShapeUtils extends js.Object {
  def area(contour: js.Array[Vec2]): Double = js.native
  def isClockWise(pts: js.Array[Vec2]): Boolean = js.native
  def triangulateShape(contour: js.Array[Vec2], holes: js.Array[js.Array[Vec2]]): js.Array[js.Array[Double]] = js.native
}

