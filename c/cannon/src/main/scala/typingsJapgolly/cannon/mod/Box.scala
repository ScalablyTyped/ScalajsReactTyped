package typingsJapgolly.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "Box")
@js.native
class Box protected ()
  extends typingsJapgolly.cannon.CANNON.Box {
  def this(halfExtents: typingsJapgolly.cannon.CANNON.Vec3) = this()
}

/* static members */
@JSImport("cannon", "Box")
@js.native
object Box extends js.Object {
  def calculateIntertia(
    halfExtents: typingsJapgolly.cannon.CANNON.Vec3,
    mass: Double,
    target: typingsJapgolly.cannon.CANNON.Vec3
  ): Unit = js.native
}

