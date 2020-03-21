package typingsJapgolly.physijs.Physijs

import typingsJapgolly.three.mod.Object3D
import typingsJapgolly.three.mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Physijs.PointConstraint")
@js.native
class PointConstraint protected () extends Constraint {
  def this(objecta: Object3D, objectb: Object3D) = this()
  def this(objecta: Object3D, objectb: Object3D, position: Vector3) = this()
  /* CompleteClass */
  override def getDefinition(): js.Any = js.native
}

