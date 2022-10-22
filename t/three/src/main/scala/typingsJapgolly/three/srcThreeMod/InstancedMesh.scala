package typingsJapgolly.three.srcThreeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "InstancedMesh")
@js.native
open class InstancedMesh[TGeometry /* <: typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry */, TMaterial /* <: typingsJapgolly.three.srcMaterialsMaterialMod.Material | js.Array[typingsJapgolly.three.srcMaterialsMaterialMod.Material] */] protected ()
  extends typingsJapgolly.three.srcObjectsInstancedMeshMod.InstancedMesh[TGeometry, TMaterial] {
  def this(geometry: TGeometry, material: TMaterial, count: Double) = this()
  def this(geometry: TGeometry, material: Unit, count: Double) = this()
  def this(geometry: Unit, material: TMaterial, count: Double) = this()
  def this(geometry: Unit, material: Unit, count: Double) = this()
}
