package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsJapgolly.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksParticleParticleBlendMultiplyBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/Particle/particleBlendMultiplyBlock", "ParticleBlendMultiplyBlock")
  @js.native
  open class ParticleBlendMultiplyBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new ParticleBlendMultiplyBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the alphaColor input component
      */
    def alphaColor: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the alphaTexture input component
      */
    def alphaTexture: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the blendColor output component
      */
    def blendColor: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the color input component
      */
    def color: NodeMaterialConnectionPoint = js.native
  }
}
