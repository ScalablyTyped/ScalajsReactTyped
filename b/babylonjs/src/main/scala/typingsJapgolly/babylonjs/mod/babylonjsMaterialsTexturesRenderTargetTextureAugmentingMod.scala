package typingsJapgolly.babylonjs.mod

import typingsJapgolly.babylonjs.materialsTexturesPrePassRenderTargetMod.PrePassRenderTarget
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsMaterialsTexturesRenderTargetTextureAugmentingMod {
  
  trait RenderTargetTexture extends StObject {
    
    /** @internal */
    var _prePassRenderTarget: Nullable[PrePassRenderTarget]
  }
  object RenderTargetTexture {
    
    inline def apply(): typingsJapgolly.babylonjs.mod.babylonjsMaterialsTexturesRenderTargetTextureAugmentingMod.RenderTargetTexture = {
      val __obj = js.Dynamic.literal(_prePassRenderTarget = null)
      __obj.asInstanceOf[typingsJapgolly.babylonjs.mod.babylonjsMaterialsTexturesRenderTargetTextureAugmentingMod.RenderTargetTexture]
    }
    
    extension [Self <: typingsJapgolly.babylonjs.mod.babylonjsMaterialsTexturesRenderTargetTextureAugmentingMod.RenderTargetTexture](x: Self) {
      
      inline def set_prePassRenderTarget(value: Nullable[PrePassRenderTarget]): Self = StObject.set(x, "_prePassRenderTarget", value.asInstanceOf[js.Any])
      
      inline def set_prePassRenderTargetNull: Self = StObject.set(x, "_prePassRenderTarget", null)
    }
  }
}
