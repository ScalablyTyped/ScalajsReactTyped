package typingsJapgolly.three

import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcThreeMod.BufferGeometry
import typingsJapgolly.three.srcThreeMod.Euler
import typingsJapgolly.three.srcThreeMod.Mesh
import typingsJapgolly.three.srcThreeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmGeometriesDecalGeometryMod {
  
  @JSImport("three/examples/jsm/geometries/DecalGeometry", "DecalGeometry")
  @js.native
  open class DecalGeometry protected () extends BufferGeometry {
    def this(
      mesh: Mesh[
            typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry, 
            Material | js.Array[Material]
          ],
      position: Vector3,
      orientation: Euler,
      size: Vector3
    ) = this()
  }
  
  @JSImport("three/examples/jsm/geometries/DecalGeometry", "DecalVertex")
  @js.native
  open class DecalVertex protected () extends StObject {
    def this(position: Vector3, normal: Vector3) = this()
  }
}
