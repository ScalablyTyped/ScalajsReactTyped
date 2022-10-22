package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.materialsEffectMod.Effect
import typingsJapgolly.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsJapgolly.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import typingsJapgolly.babylonjs.materialsTexturesTextureMod.Texture
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksDualImageSourceBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/Dual/imageSourceBlock", "ImageSourceBlock")
  @js.native
  open class ImageSourceBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new ImageSourceBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /* private */ var _samplerName: Any = js.native
    
    /* protected */ var _texture: Nullable[Texture] = js.native
    
    def bind(effect: Effect): Unit = js.native
    
    def isReady(): Boolean = js.native
    
    /**
      * Gets the sampler name associated with this image source
      */
    def samplerName: String = js.native
    
    /**
      * Gets the output component
      */
    def source: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets or sets the texture associated with the node
      */
    def texture: Nullable[Texture] = js.native
    def texture_=(texture: Nullable[Texture]): Unit = js.native
  }
}
