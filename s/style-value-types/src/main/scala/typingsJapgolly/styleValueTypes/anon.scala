package typingsJapgolly.styleValueTypes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictx
    extends StObject
       with /* x */ StringDictionary[Double] {
    
    var alpha: Double
  }
  object Dictx {
    
    inline def apply(alpha: Double): Dictx = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictx]
    }
    
    extension [Self <: Dictx](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    }
  }
}
