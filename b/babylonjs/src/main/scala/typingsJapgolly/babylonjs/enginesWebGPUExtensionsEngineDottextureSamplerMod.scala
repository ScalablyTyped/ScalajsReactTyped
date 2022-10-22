package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import typingsJapgolly.babylonjs.materialsTexturesTextureSamplerMod.TextureSampler
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesWebGPUExtensionsEngineDottextureSamplerMod {
  
  /* augmented module */
  object babylonjsMaterialsEffectAugmentingMod {
    
    trait Effect extends StObject {
      
      /**
        * Sets a sampler on the engine to be used in the shader.
        * @param name Name of the sampler variable.
        * @param sampler Sampler to set.
        */
      def setTextureSampler(name: String, sampler: Nullable[TextureSampler]): Unit
    }
    object Effect {
      
      inline def apply(setTextureSampler: (String, Nullable[TextureSampler]) => Callback): Effect = {
        val __obj = js.Dynamic.literal(setTextureSampler = js.Any.fromFunction2((t0: String, t1: Nullable[TextureSampler]) => (setTextureSampler(t0, t1)).runNow()))
        __obj.asInstanceOf[Effect]
      }
      
      extension [Self <: Effect](x: Self) {
        
        inline def setSetTextureSampler(value: (String, Nullable[TextureSampler]) => Callback): Self = StObject.set(x, "setTextureSampler", js.Any.fromFunction2((t0: String, t1: Nullable[TextureSampler]) => (value(t0, t1)).runNow()))
      }
    }
  }
}
