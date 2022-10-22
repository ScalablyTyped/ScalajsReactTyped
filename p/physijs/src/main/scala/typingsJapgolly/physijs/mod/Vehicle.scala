package typingsJapgolly.physijs.mod

import typingsJapgolly.three.mod.Vector3
import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("physijs", "Vehicle")
@js.native
open class Vehicle protected () extends StObject {
  def this(mesh: Mesh) = this()
  def this(mesh: Mesh, tuning: VehicleTuning) = this()
  
  def addWheel(
    wheel_geometry: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify THREE.Geometry */ Any,
    wheel_material: typingsJapgolly.three.mod.Material,
    connection_point: Vector3,
    wheel_direction: Vector3,
    wheel_axle: Vector3,
    suspension_rest_length: Double,
    wheel_radius: Double,
    is_front_wheel: Boolean
  ): Unit = js.native
  def addWheel(
    wheel_geometry: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify THREE.Geometry */ Any,
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
  def applyEngineForce(
    amount: Double,
    wheel: typingsJapgolly.three.mod.Mesh[
      BufferGeometry, 
      typingsJapgolly.three.srcMaterialsMaterialMod.Material | js.Array[typingsJapgolly.three.srcMaterialsMaterialMod.Material]
    ]
  ): Unit = js.native
  
  var mesh: typingsJapgolly.three.mod.Mesh[
    BufferGeometry, 
    typingsJapgolly.three.srcMaterialsMaterialMod.Material | js.Array[typingsJapgolly.three.srcMaterialsMaterialMod.Material]
  ] = js.native
  
  def setBrake(amount: Double): Unit = js.native
  def setBrake(
    amount: Double,
    wheel: typingsJapgolly.three.mod.Mesh[
      BufferGeometry, 
      typingsJapgolly.three.srcMaterialsMaterialMod.Material | js.Array[typingsJapgolly.three.srcMaterialsMaterialMod.Material]
    ]
  ): Unit = js.native
  
  def setSteering(amount: Double): Unit = js.native
  def setSteering(
    amount: Double,
    wheel: typingsJapgolly.three.mod.Mesh[
      BufferGeometry, 
      typingsJapgolly.three.srcMaterialsMaterialMod.Material | js.Array[typingsJapgolly.three.srcMaterialsMaterialMod.Material]
    ]
  ): Unit = js.native
  
  var wheels: js.Array[
    typingsJapgolly.three.mod.Mesh[
      BufferGeometry, 
      typingsJapgolly.three.srcMaterialsMaterialMod.Material | js.Array[typingsJapgolly.three.srcMaterialsMaterialMod.Material]
    ]
  ] = js.native
}
