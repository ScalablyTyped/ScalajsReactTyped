package typingsJapgolly.three

import typingsJapgolly.three.anon.DiffuseColorNode
import typingsJapgolly.three.anon.OutgoingLightNode
import typingsJapgolly.three.srcThreeMod.Material
import typingsJapgolly.three.srcThreeMod.ShaderMaterial
import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesMaterialsNodeMaterialMod {
  
  @JSImport("three/examples/jsm/nodes/materials/NodeMaterial", JSImport.Default)
  @js.native
  open class default () extends NodeMaterial
  /* static members */
  object default {
    
    @JSImport("three/examples/jsm/nodes/materials/NodeMaterial", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromMaterial(m: Material): NodeMaterial = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMaterial")(m.asInstanceOf[js.Any]).asInstanceOf[NodeMaterial]
  }
  
  @js.native
  trait NodeMaterial extends ShaderMaterial {
    
    def build(builder: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default): Unit = js.native
    
    def generateDiffuseColor(builder: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default): Unit = js.native
    
    def generateLight(
      builder: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default,
      lights: DiffuseColorNode
    ): Unit = js.native
    
    def generateOutput(
      builder: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default,
      lights: OutgoingLightNode
    ): Unit = js.native
    
    def generatePosition(builder: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default): Unit = js.native
    
    var isNodeMaterial: `true` = js.native
    
    @JSName("lights")
    var lights_NodeMaterial: `true` = js.native
  }
}
