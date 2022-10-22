package typingsJapgolly.uuidBrowser

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.uuidBrowser.interfacesMod.InputBuffer
import typingsJapgolly.uuidBrowser.interfacesMod.V4Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Random
    extends StObject
       with V4Options {
    
    var random: InputBuffer
  }
  object Random {
    
    inline def apply(random: InputBuffer): Random = {
      val __obj = js.Dynamic.literal(random = random.asInstanceOf[js.Any])
      __obj.asInstanceOf[Random]
    }
    
    extension [Self <: Random](x: Self) {
      
      inline def setRandom(value: InputBuffer): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rng
    extends StObject
       with V4Options {
    
    def rng(): InputBuffer
  }
  object Rng {
    
    inline def apply(rng: CallbackTo[InputBuffer]): Rng = {
      val __obj = js.Dynamic.literal(rng = rng.toJsFn)
      __obj.asInstanceOf[Rng]
    }
    
    extension [Self <: Rng](x: Self) {
      
      inline def setRng(value: CallbackTo[InputBuffer]): Self = StObject.set(x, "rng", value.toJsFn)
    }
  }
}
