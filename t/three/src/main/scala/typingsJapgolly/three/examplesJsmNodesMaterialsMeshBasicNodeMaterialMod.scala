package typingsJapgolly.three

import typingsJapgolly.three.srcMaterialsShaderMaterialMod.ShaderMaterialParameters
import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesMaterialsMeshBasicNodeMaterialMod {
  
  @JSImport("three/examples/jsm/nodes/materials/MeshBasicNodeMaterial", JSImport.Default)
  @js.native
  open class default () extends MeshBasicNodeMaterial {
    def this(paramters: ShaderMaterialParameters) = this()
  }
  
  @js.native
  trait MeshBasicNodeMaterial
    extends typingsJapgolly.three.examplesJsmNodesMaterialsNodeMaterialMod.default {
    
    var alphaTestNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var colorNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    def copy(source: MeshBasicNodeMaterial): this.type = js.native
    
    var isMeshBasicNodeMaterial: `true` = js.native
    
    var lightNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var opacityNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var positionNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
  }
}
