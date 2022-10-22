package typingsJapgolly.popmotionPose

import typingsJapgolly.popmotionEasing.mod.Easing
import typingsJapgolly.popmotionPose.libTypesMod.CubicBezierArgs
import typingsJapgolly.popmotionPose.popmotionPoseStrings.anticipate
import typingsJapgolly.popmotionPose.popmotionPoseStrings.backIn
import typingsJapgolly.popmotionPose.popmotionPoseStrings.backInOut
import typingsJapgolly.popmotionPose.popmotionPoseStrings.backOut
import typingsJapgolly.popmotionPose.popmotionPoseStrings.circIn
import typingsJapgolly.popmotionPose.popmotionPoseStrings.circInOut
import typingsJapgolly.popmotionPose.popmotionPoseStrings.circOut
import typingsJapgolly.popmotionPose.popmotionPoseStrings.easeIn
import typingsJapgolly.popmotionPose.popmotionPoseStrings.easeInOut
import typingsJapgolly.popmotionPose.popmotionPoseStrings.easeOut
import typingsJapgolly.popmotionPose.popmotionPoseStrings.linear
import typingsJapgolly.popmotionPose.popmotionPoseStrings.tween
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Anticipate extends StObject {
    
    def anticipate(v: Double): Double
    @JSName("anticipate")
    var anticipate_Original: Easing
    
    def backIn(v: Double): Double
    
    def backInOut(v: Double): Double
    @JSName("backInOut")
    var backInOut_Original: Easing
    
    @JSName("backIn")
    var backIn_Original: Easing
    
    def backOut(v: Double): Double
    @JSName("backOut")
    var backOut_Original: Easing
    
    def circIn(v: Double): Double
    
    def circInOut(v: Double): Double
    @JSName("circInOut")
    var circInOut_Original: Easing
    
    @JSName("circIn")
    var circIn_Original: Easing
    
    def circOut(v: Double): Double
    @JSName("circOut")
    var circOut_Original: Easing
    
    def easeIn(v: Double): Double
    
    def easeInOut(v: Double): Double
    @JSName("easeInOut")
    var easeInOut_Original: Easing
    
    @JSName("easeIn")
    var easeIn_Original: Easing
    
    def easeOut(v: Double): Double
    @JSName("easeOut")
    var easeOut_Original: Easing
    
    def linear(v: Double): Double
    @JSName("linear")
    var linear_Original: Easing
  }
  object Anticipate {
    
    inline def apply(
      anticipate: /* v */ Double => Double,
      backIn: /* v */ Double => Double,
      backInOut: /* v */ Double => Double,
      backOut: /* v */ Double => Double,
      circIn: /* v */ Double => Double,
      circInOut: /* v */ Double => Double,
      circOut: /* v */ Double => Double,
      easeIn: /* v */ Double => Double,
      easeInOut: /* v */ Double => Double,
      easeOut: /* v */ Double => Double,
      linear: /* v */ Double => Double
    ): Anticipate = {
      val __obj = js.Dynamic.literal(anticipate = js.Any.fromFunction1(anticipate), backIn = js.Any.fromFunction1(backIn), backInOut = js.Any.fromFunction1(backInOut), backOut = js.Any.fromFunction1(backOut), circIn = js.Any.fromFunction1(circIn), circInOut = js.Any.fromFunction1(circInOut), circOut = js.Any.fromFunction1(circOut), easeIn = js.Any.fromFunction1(easeIn), easeInOut = js.Any.fromFunction1(easeInOut), easeOut = js.Any.fromFunction1(easeOut), linear = js.Any.fromFunction1(linear))
      __obj.asInstanceOf[Anticipate]
    }
    
    extension [Self <: Anticipate](x: Self) {
      
      inline def setAnticipate(value: /* v */ Double => Double): Self = StObject.set(x, "anticipate", js.Any.fromFunction1(value))
      
      inline def setBackIn(value: /* v */ Double => Double): Self = StObject.set(x, "backIn", js.Any.fromFunction1(value))
      
      inline def setBackInOut(value: /* v */ Double => Double): Self = StObject.set(x, "backInOut", js.Any.fromFunction1(value))
      
      inline def setBackOut(value: /* v */ Double => Double): Self = StObject.set(x, "backOut", js.Any.fromFunction1(value))
      
      inline def setCircIn(value: /* v */ Double => Double): Self = StObject.set(x, "circIn", js.Any.fromFunction1(value))
      
      inline def setCircInOut(value: /* v */ Double => Double): Self = StObject.set(x, "circInOut", js.Any.fromFunction1(value))
      
      inline def setCircOut(value: /* v */ Double => Double): Self = StObject.set(x, "circOut", js.Any.fromFunction1(value))
      
      inline def setEaseIn(value: /* v */ Double => Double): Self = StObject.set(x, "easeIn", js.Any.fromFunction1(value))
      
      inline def setEaseInOut(value: /* v */ Double => Double): Self = StObject.set(x, "easeInOut", js.Any.fromFunction1(value))
      
      inline def setEaseOut(value: /* v */ Double => Double): Self = StObject.set(x, "easeOut", js.Any.fromFunction1(value))
      
      inline def setLinear(value: /* v */ Double => Double): Self = StObject.set(x, "linear", js.Any.fromFunction1(value))
    }
  }
  
  trait Ease extends StObject {
    
    var ease: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TweenProps * / any['ease'] */ js.Any) | linear | easeIn | easeOut | easeInOut | circIn | circOut | circInOut | backIn | backOut | backInOut | anticipate | CubicBezierArgs
  }
  object Ease {
    
    inline def apply(
      ease: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TweenProps * / any['ease'] */ js.Any) | linear | easeIn | easeOut | easeInOut | circIn | circOut | circInOut | backIn | backOut | backInOut | anticipate | CubicBezierArgs
    ): Ease = {
      val __obj = js.Dynamic.literal(ease = ease.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ease]
    }
    
    extension [Self <: Ease](x: Self) {
      
      inline def setEase(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TweenProps * / any['ease'] */ js.Any) | linear | easeIn | easeOut | easeInOut | circIn | circOut | circInOut | backIn | backOut | backInOut | anticipate | CubicBezierArgs
      ): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
    }
  }
  
  trait ElementStyler extends StObject {
    
    var elementStyler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Styler */ Any
  }
  object ElementStyler {
    
    inline def apply(
      elementStyler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Styler */ Any
    ): ElementStyler = {
      val __obj = js.Dynamic.literal(elementStyler = elementStyler.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementStyler]
    }
    
    extension [Self <: ElementStyler](x: Self) {
      
      inline def setElementStyler(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Styler */ Any
      ): Self = StObject.set(x, "elementStyler", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: tween
  }
  object Type {
    
    inline def apply(): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("tween")
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: tween): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
