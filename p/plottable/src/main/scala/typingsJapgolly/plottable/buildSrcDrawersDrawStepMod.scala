package typingsJapgolly.plottable

import typingsJapgolly.plottable.buildSrcAnimatorsAnimatorMod.IAnimator
import typingsJapgolly.plottable.buildSrcCoreInterfacesMod.AttributeToAppliedProjector
import typingsJapgolly.plottable.buildSrcCoreInterfacesMod.AttributeToProjector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcDrawersDrawStepMod {
  
  trait AppliedDrawStep extends StObject {
    
    var animator: IAnimator
    
    var attrToAppliedProjector: AttributeToAppliedProjector
  }
  object AppliedDrawStep {
    
    inline def apply(animator: IAnimator, attrToAppliedProjector: AttributeToAppliedProjector): AppliedDrawStep = {
      val __obj = js.Dynamic.literal(animator = animator.asInstanceOf[js.Any], attrToAppliedProjector = attrToAppliedProjector.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppliedDrawStep]
    }
    
    extension [Self <: AppliedDrawStep](x: Self) {
      
      inline def setAnimator(value: IAnimator): Self = StObject.set(x, "animator", value.asInstanceOf[js.Any])
      
      inline def setAttrToAppliedProjector(value: AttributeToAppliedProjector): Self = StObject.set(x, "attrToAppliedProjector", value.asInstanceOf[js.Any])
    }
  }
  
  trait DrawStep extends StObject {
    
    var animator: IAnimator
    
    var attrToProjector: AttributeToProjector
  }
  object DrawStep {
    
    inline def apply(animator: IAnimator, attrToProjector: AttributeToProjector): DrawStep = {
      val __obj = js.Dynamic.literal(animator = animator.asInstanceOf[js.Any], attrToProjector = attrToProjector.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawStep]
    }
    
    extension [Self <: DrawStep](x: Self) {
      
      inline def setAnimator(value: IAnimator): Self = StObject.set(x, "animator", value.asInstanceOf[js.Any])
      
      inline def setAttrToProjector(value: AttributeToProjector): Self = StObject.set(x, "attrToProjector", value.asInstanceOf[js.Any])
    }
  }
}
