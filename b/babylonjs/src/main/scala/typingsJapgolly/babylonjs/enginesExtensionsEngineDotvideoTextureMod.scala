package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import typingsJapgolly.babylonjs.materialsTexturesInternalTextureMod.InternalTexture
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesExtensionsEngineDotvideoTextureMod {
  
  /* augmented module */
  object babylonjsEnginesThinEngineAugmentingMod {
    
    trait ThinEngine extends StObject {
      
      /**
        * Update a video texture
        * @param texture defines the texture to update
        * @param video defines the video element to use
        * @param invertY defines if data must be stored with Y axis inverted
        */
      def updateVideoTexture(texture: Nullable[InternalTexture], video: HTMLVideoElement, invertY: Boolean): Unit
    }
    object ThinEngine {
      
      inline def apply(updateVideoTexture: (Nullable[InternalTexture], HTMLVideoElement, Boolean) => Callback): ThinEngine = {
        val __obj = js.Dynamic.literal(updateVideoTexture = js.Any.fromFunction3((t0: Nullable[InternalTexture], t1: HTMLVideoElement, t2: Boolean) => (updateVideoTexture(t0, t1, t2)).runNow()))
        __obj.asInstanceOf[ThinEngine]
      }
      
      extension [Self <: ThinEngine](x: Self) {
        
        inline def setUpdateVideoTexture(value: (Nullable[InternalTexture], HTMLVideoElement, Boolean) => Callback): Self = StObject.set(x, "updateVideoTexture", js.Any.fromFunction3((t0: Nullable[InternalTexture], t1: HTMLVideoElement, t2: Boolean) => (value(t0, t1, t2)).runNow()))
      }
    }
  }
}
