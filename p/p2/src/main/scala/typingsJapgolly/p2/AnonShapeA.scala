package typingsJapgolly.p2

import typingsJapgolly.p2.mod.Body
import typingsJapgolly.p2.mod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShapeA extends js.Object {
  var bodyA: Body
  var bodyB: Body
  var shapeA: Shape
  var shapeB: Shape
  var `type`: String
}

object AnonShapeA {
  @scala.inline
  def apply(bodyA: Body, bodyB: Body, shapeA: Shape, shapeB: Shape, `type`: String): AnonShapeA = {
    val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], shapeA = shapeA.asInstanceOf[js.Any], shapeB = shapeB.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShapeA]
  }
}

