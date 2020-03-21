package typingsJapgolly.cannon.mod

import typingsJapgolly.cannon.CANNON.IConstraintOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "Constraint")
@js.native
class Constraint protected ()
  extends typingsJapgolly.cannon.CANNON.Constraint {
  def this(bodyA: typingsJapgolly.cannon.CANNON.Body, bodyB: typingsJapgolly.cannon.CANNON.Body) = this()
  def this(
    bodyA: typingsJapgolly.cannon.CANNON.Body,
    bodyB: typingsJapgolly.cannon.CANNON.Body,
    options: IConstraintOptions
  ) = this()
}

