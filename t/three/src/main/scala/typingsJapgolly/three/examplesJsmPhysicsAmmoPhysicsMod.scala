package typingsJapgolly.three

import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcThreeMod.Mesh
import typingsJapgolly.three.srcThreeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPhysicsAmmoPhysicsMod {
  
  @JSImport("three/examples/jsm/physics/AmmoPhysics", "AmmoPhysics")
  @js.native
  open class AmmoPhysics () extends StObject {
    
    def addMesh(mesh: Mesh[BufferGeometry, Material | js.Array[Material]], mass: Double): Unit = js.native
    
    def setMeshPosition(mesh: Mesh[BufferGeometry, Material | js.Array[Material]], position: Vector3, index: Double): Unit = js.native
  }
}
