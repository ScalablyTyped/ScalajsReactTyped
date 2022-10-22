package typingsJapgolly.popmotion

import typingsJapgolly.popmotion.anon.FnCall
import typingsJapgolly.popmotion.anon.Typeofspring
import typingsJapgolly.popmotion.libAnimationsTypesMod.Animation
import typingsJapgolly.popmotion.libAnimationsTypesMod.DecayOptions
import typingsJapgolly.popmotion.popmotionStrings.decay
import typingsJapgolly.popmotion.popmotionStrings.keyframes
import typingsJapgolly.popmotion.popmotionStrings.spring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnimationsUtilsDetectAnimationFromOptionsMod {
  
  @JSImport("popmotion/lib/animations/utils/detect-animation-from-options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def detectAnimationFromOptions[T /* <: Options */](config: T): Typeofspring | FnCall | (js.Function1[
    /* hasVelocityFromPowerTimeConstantRestDeltaModifyTarget */ DecayOptions, 
    Animation[Double]
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("detectAnimationFromOptions")(config.asInstanceOf[js.Any]).asInstanceOf[Typeofspring | FnCall | (js.Function1[
    /* hasVelocityFromPowerTimeConstantRestDeltaModifyTarget */ DecayOptions, 
    Animation[Double]
  ])]
  
  trait Options extends StObject {
    
    var to: js.UndefOr[Any] = js.undefined
    
    var `type`: js.UndefOr[decay | keyframes | spring] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setTo(value: Any): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setType(value: decay | keyframes | spring): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
