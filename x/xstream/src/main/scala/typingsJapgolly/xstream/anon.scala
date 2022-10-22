package typingsJapgolly.xstream

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ease extends StObject {
    
    def ease(x: Double, from: Double, to: Double): Double
    @JSName("ease")
    var ease_Original: typingsJapgolly.xstream.extraTweenMod.Ease
  }
  object Ease {
    
    inline def apply(ease: (/* x */ Double, /* from */ Double, /* to */ Double) => Double): Ease = {
      val __obj = js.Dynamic.literal(ease = js.Any.fromFunction3(ease))
      __obj.asInstanceOf[Ease]
    }
    
    extension [Self <: Ease](x: Self) {
      
      inline def setEase(value: (/* x */ Double, /* from */ Double, /* to */ Double) => Double): Self = StObject.set(x, "ease", js.Any.fromFunction3(value))
    }
  }
  
  trait Subscribe extends StObject {
    
    var subscribe: Any
  }
  object Subscribe {
    
    inline def apply(subscribe: Any): Subscribe = {
      val __obj = js.Dynamic.literal(subscribe = subscribe.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subscribe]
    }
    
    extension [Self <: Subscribe](x: Self) {
      
      inline def setSubscribe(value: Any): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
    }
  }
}
