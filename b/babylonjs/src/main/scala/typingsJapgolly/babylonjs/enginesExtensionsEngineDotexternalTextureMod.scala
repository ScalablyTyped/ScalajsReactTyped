package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import typingsJapgolly.babylonjs.materialsTexturesExternalTextureMod.ExternalTexture
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesExtensionsEngineDotexternalTextureMod {
  
  /* augmented module */
  object babylonjsEnginesThinEngineAugmentingMod {
    
    trait ThinEngine extends StObject {
      
      /**
        * Creates an external texture
        * @param video video element
        * @returns the external texture, or null if external textures are not supported by the engine
        */
      def createExternalTexture(video: HTMLVideoElement): Nullable[ExternalTexture]
      
      /**
        * Sets an internal texture to the according uniform.
        * @param name The name of the uniform in the effect
        * @param texture The texture to apply
        */
      def setExternalTexture(name: String, texture: Nullable[ExternalTexture]): Unit
    }
    object ThinEngine {
      
      inline def apply(
        createExternalTexture: HTMLVideoElement => Nullable[ExternalTexture],
        setExternalTexture: (String, Nullable[ExternalTexture]) => Callback
      ): ThinEngine = {
        val __obj = js.Dynamic.literal(createExternalTexture = js.Any.fromFunction1(createExternalTexture), setExternalTexture = js.Any.fromFunction2((t0: String, t1: Nullable[ExternalTexture]) => (setExternalTexture(t0, t1)).runNow()))
        __obj.asInstanceOf[ThinEngine]
      }
      
      extension [Self <: ThinEngine](x: Self) {
        
        inline def setCreateExternalTexture(value: HTMLVideoElement => Nullable[ExternalTexture]): Self = StObject.set(x, "createExternalTexture", js.Any.fromFunction1(value))
        
        inline def setSetExternalTexture(value: (String, Nullable[ExternalTexture]) => Callback): Self = StObject.set(x, "setExternalTexture", js.Any.fromFunction2((t0: String, t1: Nullable[ExternalTexture]) => (value(t0, t1)).runNow()))
      }
    }
  }
}
