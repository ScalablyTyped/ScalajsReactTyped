package typingsJapgolly.three

import typingsJapgolly.three.examplesJsmNodesNodesMod.NodeBuilder
import typingsJapgolly.three.srcMaterialsShaderMaterialMod.ShaderMaterialParameters
import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesMaterialsSpriteNodeMaterialMod {
  
  @JSImport("three/examples/jsm/nodes/materials/SpriteNodeMaterial", JSImport.Default)
  @js.native
  open class default () extends SpriteNodeMaterial {
    def this(parameters: ShaderMaterialParameters) = this()
  }
  
  @js.native
  trait SpriteNodeMaterial
    extends typingsJapgolly.three.examplesJsmNodesMaterialsNodeMaterialMod.default {
    
    var alphaTestNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var colorNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    def copy(source: SpriteNodeMaterial): this.type = js.native
    
    def generatePosition(builder: NodeBuilder): Unit = js.native
    
    var isSpriteNodeMaterial: `true` = js.native
    
    var lightNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var opacityNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var positionNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var rotationNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var scaleNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
  }
}
