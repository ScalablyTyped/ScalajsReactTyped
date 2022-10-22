package typingsJapgolly.three

import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcThreeMod.SkinnedMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesAccessorsSkinningNodeMod {
  
  @JSImport("three/examples/jsm/nodes/accessors/SkinningNode", JSImport.Default)
  @js.native
  open class default protected () extends SkinningNode {
    def this(skinnedMesh: SkinnedMesh[BufferGeometry, Material | js.Array[Material]]) = this()
  }
  
  @js.native
  trait SkinningNode
    extends typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default {
    
    var bindMatrixInverseNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var bindMatrixNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var boneMatricesNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var skinIndexNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var skinWeightNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
  }
}
