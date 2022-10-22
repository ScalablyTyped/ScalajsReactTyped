package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import typingsJapgolly.babylonjs.buffersStorageBufferMod.StorageBuffer
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesWebGPUExtensionsEngineDotstorageBufferMod {
  
  /* augmented module */
  object babylonjsMaterialsEffectAugmentingMod {
    
    trait Effect extends StObject {
      
      /**
        * Sets a storage buffer on the engine to be used in the shader.
        * @param name Name of the storage buffer variable.
        * @param buffer Storage buffer to set.
        */
      def setStorageBuffer(name: String, buffer: Nullable[StorageBuffer]): Unit
    }
    object Effect {
      
      inline def apply(setStorageBuffer: (String, Nullable[StorageBuffer]) => Callback): Effect = {
        val __obj = js.Dynamic.literal(setStorageBuffer = js.Any.fromFunction2((t0: String, t1: Nullable[StorageBuffer]) => (setStorageBuffer(t0, t1)).runNow()))
        __obj.asInstanceOf[Effect]
      }
      
      extension [Self <: Effect](x: Self) {
        
        inline def setSetStorageBuffer(value: (String, Nullable[StorageBuffer]) => Callback): Self = StObject.set(x, "setStorageBuffer", js.Any.fromFunction2((t0: String, t1: Nullable[StorageBuffer]) => (value(t0, t1)).runNow()))
      }
    }
  }
}
