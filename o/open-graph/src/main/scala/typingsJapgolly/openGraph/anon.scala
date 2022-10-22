package typingsJapgolly.openGraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alternate extends StObject {
    
    /** An array of other locales this page is available in. */
    var alternate: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Alternate {
    
    inline def apply(): Alternate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Alternate]
    }
    
    extension [Self <: Alternate](x: Self) {
      
      inline def setAlternate(value: String | js.Array[String]): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
      
      inline def setAlternateUndefined: Self = StObject.set(x, "alternate", js.undefined)
      
      inline def setAlternateVarargs(value: String*): Self = StObject.set(x, "alternate", js.Array(value*))
    }
  }
}
