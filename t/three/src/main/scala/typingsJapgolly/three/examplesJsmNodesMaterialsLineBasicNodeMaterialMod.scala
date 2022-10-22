package typingsJapgolly.three

import typingsJapgolly.three.examplesJsmNodesNodesMod.Node
import typingsJapgolly.three.srcMaterialsShaderMaterialMod.ShaderMaterialParameters
import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesMaterialsLineBasicNodeMaterialMod {
  
  @JSImport("three/examples/jsm/nodes/materials/LineBasicNodeMaterial", JSImport.Default)
  @js.native
  open class default () extends LineBasicNodeMaterial {
    def this(parameters: ShaderMaterialParameters) = this()
  }
  
  @js.native
  trait LineBasicNodeMaterial
    extends typingsJapgolly.three.examplesJsmNodesMaterialsNodeMaterialMod.default {
    
    var alphaTestNode: Node | Null = js.native
    
    var colorNode: Node | Null = js.native
    
    def copy(source: LineBasicNodeMaterial): this.type = js.native
    
    var isLineBasicNodeMaterial: `true` = js.native
    
    var lightNode: Node | Null = js.native
    
    var opacityNode: Node | Null = js.native
    
    var positionNode: Node | Null = js.native
  }
}
