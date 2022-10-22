package typingsJapgolly.popmotionPose.libTypesMod

import typingsJapgolly.popmotionPose.popmotionPoseStrings.spring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringProps * / any */ trait SpringDefinition
  extends StObject
     with TransitionDefinitionCommonProps
     with NoEase
     with _TransitionDefinition {
  
  var `type`: spring
}
object SpringDefinition {
  
  inline def apply(ease: Unit): SpringDefinition = {
    val __obj = js.Dynamic.literal(ease = ease.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("spring")
    __obj.asInstanceOf[SpringDefinition]
  }
  
  extension [Self <: SpringDefinition](x: Self) {
    
    inline def setType(value: spring): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
