package typingsJapgolly.angularAnimations.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationKeyframesSequenceMetadata
  extends StObject
     with AnimationMetadata {
  
  /**
    * An array of animation styles.
    */
  var steps: js.Array[AnimationStyleMetadata]
}
object AnimationKeyframesSequenceMetadata {
  
  inline def apply(steps: js.Array[AnimationStyleMetadata], `type`: AnimationMetadataType): AnimationKeyframesSequenceMetadata = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationKeyframesSequenceMetadata]
  }
  
  extension [Self <: AnimationKeyframesSequenceMetadata](x: Self) {
    
    inline def setSteps(value: js.Array[AnimationStyleMetadata]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: AnimationStyleMetadata*): Self = StObject.set(x, "steps", js.Array(value*))
  }
}
