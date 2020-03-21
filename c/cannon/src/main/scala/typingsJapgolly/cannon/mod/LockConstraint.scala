package typingsJapgolly.cannon.mod

import typingsJapgolly.cannon.CANNON.ILockConstraintOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "LockConstraint")
@js.native
class LockConstraint protected ()
  extends typingsJapgolly.cannon.CANNON.LockConstraint {
  def this(bodyA: typingsJapgolly.cannon.CANNON.Body, bodyB: typingsJapgolly.cannon.CANNON.Body) = this()
  def this(
    bodyA: typingsJapgolly.cannon.CANNON.Body,
    bodyB: typingsJapgolly.cannon.CANNON.Body,
    options: ILockConstraintOptions
  ) = this()
}

