package typingsJapgolly.physijs.Physijs

import typingsJapgolly.three.mod.Geometry
import typingsJapgolly.three.mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Physijs.Vehicle")
@js.native
class Vehicle protected () extends js.Object {
  def this(mesh: Mesh) = this()
  def this(mesh: Mesh, tuning: VehicleTuning) = this()
  var mesh: typingsJapgolly.three.mod.Mesh = js.native
  var wheels: js.Array[typingsJapgolly.three.mod.Mesh] = js.native
  def addWheel(
    wheel_geometry: Geometry,
    wheel_material: typingsJapgolly.three.mod.Material,
    connection_point: Vector3,
    wheel_direction: Vector3,
    wheel_axle: Vector3,
    suspension_rest_length: Double,
    wheel_radius: Double,
    is_front_wheel: Boolean
  ): Unit = js.native
  def addWheel(
    wheel_geometry: Geometry,
    wheel_material: typingsJapgolly.three.mod.Material,
    connection_point: Vector3,
    wheel_direction: Vector3,
    wheel_axle: Vector3,
    suspension_rest_length: Double,
    wheel_radius: Double,
    is_front_wheel: Boolean,
    tuning: VehicleTuning
  ): Unit = js.native
  def applyEngineForce(amount: Double): Unit = js.native
  def applyEngineForce(amount: Double, wheel: typingsJapgolly.three.mod.Mesh): Unit = js.native
  def setBrake(amount: Double): Unit = js.native
  def setBrake(amount: Double, wheel: typingsJapgolly.three.mod.Mesh): Unit = js.native
  def setSteering(amount: Double): Unit = js.native
  def setSteering(amount: Double, wheel: typingsJapgolly.three.mod.Mesh): Unit = js.native
}

