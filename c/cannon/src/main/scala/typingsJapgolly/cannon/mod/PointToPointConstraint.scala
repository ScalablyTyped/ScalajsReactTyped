package typingsJapgolly.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "PointToPointConstraint")
@js.native
class PointToPointConstraint protected ()
  extends typingsJapgolly.cannon.CANNON.PointToPointConstraint {
  def this(
    bodyA: typingsJapgolly.cannon.CANNON.Body,
    pivotA: typingsJapgolly.cannon.CANNON.Vec3,
    bodyB: typingsJapgolly.cannon.CANNON.Body,
    pivotB: typingsJapgolly.cannon.CANNON.Vec3
  ) = this()
  def this(
    bodyA: typingsJapgolly.cannon.CANNON.Body,
    pivotA: typingsJapgolly.cannon.CANNON.Vec3,
    bodyB: typingsJapgolly.cannon.CANNON.Body,
    pivotB: typingsJapgolly.cannon.CANNON.Vec3,
    maxForce: Double
  ) = this()
}

