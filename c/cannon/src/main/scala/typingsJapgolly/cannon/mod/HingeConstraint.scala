package typingsJapgolly.cannon.mod

import typingsJapgolly.cannon.CANNON.IHingeConstraintOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "HingeConstraint")
@js.native
class HingeConstraint protected ()
  extends typingsJapgolly.cannon.CANNON.HingeConstraint {
  def this(bodyA: typingsJapgolly.cannon.CANNON.Body, bodyB: typingsJapgolly.cannon.CANNON.Body) = this()
  def this(
    bodyA: typingsJapgolly.cannon.CANNON.Body,
    bodyB: typingsJapgolly.cannon.CANNON.Body,
    options: IHingeConstraintOptions
  ) = this()
}

