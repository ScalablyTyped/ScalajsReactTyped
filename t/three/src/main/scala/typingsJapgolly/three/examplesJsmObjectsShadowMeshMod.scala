package typingsJapgolly.three

import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcThreeMod.Mesh
import typingsJapgolly.three.srcThreeMod.Plane
import typingsJapgolly.three.srcThreeMod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmObjectsShadowMeshMod {
  
  @JSImport("three/examples/jsm/objects/ShadowMesh", "ShadowMesh")
  @js.native
  open class ShadowMesh ()
    extends Mesh[BufferGeometry, Material | js.Array[Material]] {
    
    def update(plane: Plane, lightPosition4D: Vector4): Unit = js.native
  }
}
