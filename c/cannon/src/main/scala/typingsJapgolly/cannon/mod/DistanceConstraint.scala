package typingsJapgolly.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "DistanceConstraint")
@js.native
class DistanceConstraint protected ()
  extends typingsJapgolly.cannon.CANNON.DistanceConstraint {
  def this(
    bodyA: typingsJapgolly.cannon.CANNON.Body,
    bodyB: typingsJapgolly.cannon.CANNON.Body,
    distance: Double
  ) = this()
  def this(
    bodyA: typingsJapgolly.cannon.CANNON.Body,
    bodyB: typingsJapgolly.cannon.CANNON.Body,
    distance: Double,
    maxForce: Double
  ) = this()
}

