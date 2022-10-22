package typingsJapgolly.three

import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcThreeMod.InstancedMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesAccessorsInstanceNodeMod {
  
  @JSImport("three/examples/jsm/nodes/accessors/InstanceNode", JSImport.Default)
  @js.native
  open class default protected () extends InstanceNode {
    def this(instanceMesh: InstancedMesh[BufferGeometry, Material | js.Array[Material]]) = this()
  }
  
  @js.native
  trait InstanceNode
    extends typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default {
    
    var instanceMatrixNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var instanceMesh: InstancedMesh[BufferGeometry, Material | js.Array[Material]] = js.native
  }
}
