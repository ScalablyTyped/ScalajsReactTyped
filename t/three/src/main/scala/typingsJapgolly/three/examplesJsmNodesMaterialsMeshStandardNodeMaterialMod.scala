package typingsJapgolly.three

import typingsJapgolly.three.srcMaterialsShaderMaterialMod.ShaderMaterialParameters
import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesMaterialsMeshStandardNodeMaterialMod {
  
  @JSImport("three/examples/jsm/nodes/materials/MeshStandardNodeMaterial", JSImport.Default)
  @js.native
  open class default () extends MeshStandardNodeMaterial {
    def this(paramters: ShaderMaterialParameters) = this()
  }
  
  @js.native
  trait MeshStandardNodeMaterial
    extends typingsJapgolly.three.examplesJsmNodesMaterialsNodeMaterialMod.default {
    
    var alphaTestNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var clearcoatNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var clearcoatRoughnessNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var colorNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    def copy(source: MeshStandardNodeMaterial): this.type = js.native
    
    var emissiveNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var envNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var isMeshStandardNodeMaterial: `true` = js.native
    
    var lightsNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var metalnessNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var normalNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var opacityNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var positionNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var roughnessNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
  }
}
