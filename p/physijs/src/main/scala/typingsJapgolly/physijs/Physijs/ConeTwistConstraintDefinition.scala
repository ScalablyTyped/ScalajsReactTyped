package typingsJapgolly.physijs.Physijs

import typingsJapgolly.three.mod.Object3D
import typingsJapgolly.three.mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConeTwistConstraintDefinition extends js.Object {
  var axisa: Vector3
  var axisb: Vector3
  var id: Double
  var objecta: Object3D
  var objectb: Object3D
  var positiona: Vector3
  var positionb: Vector3
  var `type`: String
}

object ConeTwistConstraintDefinition {
  @scala.inline
  def apply(
    axisa: Vector3,
    axisb: Vector3,
    id: Double,
    objecta: Object3D,
    objectb: Object3D,
    positiona: Vector3,
    positionb: Vector3,
    `type`: String
  ): ConeTwistConstraintDefinition = {
    val __obj = js.Dynamic.literal(axisa = axisa.asInstanceOf[js.Any], axisb = axisb.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], objecta = objecta.asInstanceOf[js.Any], objectb = objectb.asInstanceOf[js.Any], positiona = positiona.asInstanceOf[js.Any], positionb = positionb.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConeTwistConstraintDefinition]
  }
}

