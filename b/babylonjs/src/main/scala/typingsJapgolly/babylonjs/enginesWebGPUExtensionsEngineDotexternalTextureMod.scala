package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import typingsJapgolly.babylonjs.materialsTexturesExternalTextureMod.ExternalTexture
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesWebGPUExtensionsEngineDotexternalTextureMod {
  
  /* augmented module */
  object babylonjsMaterialsEffectAugmentingMod {
    
    trait Effect extends StObject {
      
      /**
        * Sets an external texture on the engine to be used in the shader.
        * @param name Name of the external texture variable.
        * @param texture Texture to set.
        */
      def setExternalTexture(name: String, texture: Nullable[ExternalTexture]): Unit
    }
    object Effect {
      
      inline def apply(setExternalTexture: (String, Nullable[ExternalTexture]) => Callback): Effect = {
        val __obj = js.Dynamic.literal(setExternalTexture = js.Any.fromFunction2((t0: String, t1: Nullable[ExternalTexture]) => (setExternalTexture(t0, t1)).runNow()))
        __obj.asInstanceOf[Effect]
      }
      
      extension [Self <: Effect](x: Self) {
        
        inline def setSetExternalTexture(value: (String, Nullable[ExternalTexture]) => Callback): Self = StObject.set(x, "setExternalTexture", js.Any.fromFunction2((t0: String, t1: Nullable[ExternalTexture]) => (value(t0, t1)).runNow()))
      }
    }
  }
}
