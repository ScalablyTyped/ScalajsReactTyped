package typingsJapgolly.threeTdsLoader

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.three.shapeUtilsMod.Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofShapeUtils extends js.Object {
  def area(contour: js.Array[Vec2]): Double
  def isClockWise(pts: js.Array[Vec2]): Boolean
  def triangulateShape(contour: js.Array[Vec2], holes: js.Array[js.Array[Vec2]]): js.Array[js.Array[Double]]
}

object TypeofShapeUtils {
  @scala.inline
  def apply(
    area: js.Array[Vec2] => CallbackTo[Double],
    isClockWise: js.Array[Vec2] => CallbackTo[Boolean],
    triangulateShape: (js.Array[Vec2], js.Array[js.Array[Vec2]]) => CallbackTo[js.Array[js.Array[Double]]]
  ): TypeofShapeUtils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("area")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.three.shapeUtilsMod.Vec2]) => area(t0).runNow()))
    __obj.updateDynamic("isClockWise")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.three.shapeUtilsMod.Vec2]) => isClockWise(t0).runNow()))
    __obj.updateDynamic("triangulateShape")(js.Any.fromFunction2((t0: js.Array[typingsJapgolly.three.shapeUtilsMod.Vec2], t1: js.Array[js.Array[typingsJapgolly.three.shapeUtilsMod.Vec2]]) => triangulateShape(t0, t1).runNow()))
    __obj.asInstanceOf[TypeofShapeUtils]
  }
}

