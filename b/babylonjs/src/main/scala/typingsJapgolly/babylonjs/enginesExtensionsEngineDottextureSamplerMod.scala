package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import typingsJapgolly.babylonjs.materialsTexturesTextureSamplerMod.TextureSampler
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesExtensionsEngineDottextureSamplerMod {
  
  /* augmented module */
  object babylonjsEnginesThinEngineAugmentingMod {
    
    trait ThinEngine extends StObject {
      
      /**
        * Sets a texture sampler to the according uniform.
        * @param name The name of the uniform in the effect
        * @param sampler The sampler to apply
        */
      def setTextureSampler(name: String, sampler: Nullable[TextureSampler]): Unit
    }
    object ThinEngine {
      
      inline def apply(setTextureSampler: (String, Nullable[TextureSampler]) => Callback): ThinEngine = {
        val __obj = js.Dynamic.literal(setTextureSampler = js.Any.fromFunction2((t0: String, t1: Nullable[TextureSampler]) => (setTextureSampler(t0, t1)).runNow()))
        __obj.asInstanceOf[ThinEngine]
      }
      
      extension [Self <: ThinEngine](x: Self) {
        
        inline def setSetTextureSampler(value: (String, Nullable[TextureSampler]) => Callback): Self = StObject.set(x, "setTextureSampler", js.Any.fromFunction2((t0: String, t1: Nullable[TextureSampler]) => (value(t0, t1)).runNow()))
      }
    }
  }
}
