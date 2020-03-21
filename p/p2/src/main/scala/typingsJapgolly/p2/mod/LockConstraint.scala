package typingsJapgolly.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "LockConstraint")
@js.native
class LockConstraint protected () extends Constraint {
  def this(bodyA: Body, bodyB: Body) = this()
  def this(bodyA: Body, bodyB: Body, options: LockConstraintOptions) = this()
  def getMaxForce(): Double = js.native
  def setMaxForce(force: Double): Unit = js.native
}

