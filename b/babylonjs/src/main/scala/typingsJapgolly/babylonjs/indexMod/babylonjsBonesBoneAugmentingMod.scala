package typingsJapgolly.babylonjs.indexMod

import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsBonesBoneAugmentingMod {
  
  trait Bone extends StObject {
    
    /**
      * Copy an animation range from another bone
      * @param source defines the source bone
      * @param rangeName defines the range name to copy
      * @param frameOffset defines the frame offset
      * @param rescaleAsRequired defines if rescaling must be applied if required
      * @param skelDimensionsRatio defines the scaling ratio
      * @returns true if operation was successful
      */
    def copyAnimationRange(
      source: typingsJapgolly.babylonjs.animationsAnimatableMod.babylonjsBonesBoneAugmentingMod.Bone,
      rangeName: String,
      frameOffset: Double,
      rescaleAsRequired: Boolean,
      skelDimensionsRatio: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
    ): Boolean
  }
  object Bone {
    
    inline def apply(
      copyAnimationRange: (typingsJapgolly.babylonjs.animationsAnimatableMod.babylonjsBonesBoneAugmentingMod.Bone, String, Double, Boolean, Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]) => Boolean
    ): typingsJapgolly.babylonjs.indexMod.babylonjsBonesBoneAugmentingMod.Bone = {
      val __obj = js.Dynamic.literal(copyAnimationRange = js.Any.fromFunction5(copyAnimationRange))
      __obj.asInstanceOf[typingsJapgolly.babylonjs.indexMod.babylonjsBonesBoneAugmentingMod.Bone]
    }
    
    extension [Self <: typingsJapgolly.babylonjs.indexMod.babylonjsBonesBoneAugmentingMod.Bone](x: Self) {
      
      inline def setCopyAnimationRange(
        value: (typingsJapgolly.babylonjs.animationsAnimatableMod.babylonjsBonesBoneAugmentingMod.Bone, String, Double, Boolean, Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]) => Boolean
      ): Self = StObject.set(x, "copyAnimationRange", js.Any.fromFunction5(value))
    }
  }
}
