package typingsJapgolly.sinonjsFakeTimers

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Now extends StObject {
    
    def now(): Double
  }
  object Now {
    
    inline def apply(now: CallbackTo[Double]): Now = {
      val __obj = js.Dynamic.literal(now = now.toJsFn)
      __obj.asInstanceOf[Now]
    }
    
    extension [Self <: Now](x: Self) {
      
      inline def setNow(value: CallbackTo[Double]): Self = StObject.set(x, "now", value.toJsFn)
    }
  }
}
