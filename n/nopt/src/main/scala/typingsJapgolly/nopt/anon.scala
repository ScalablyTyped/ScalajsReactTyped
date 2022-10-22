package typingsJapgolly.nopt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cooked extends StObject {
    
    var cooked: js.Array[String]
    
    var original: js.Array[String]
    
    var remain: js.Array[String]
  }
  object Cooked {
    
    inline def apply(cooked: js.Array[String], original: js.Array[String], remain: js.Array[String]): Cooked = {
      val __obj = js.Dynamic.literal(cooked = cooked.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], remain = remain.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cooked]
    }
    
    extension [Self <: Cooked](x: Self) {
      
      inline def setCooked(value: js.Array[String]): Self = StObject.set(x, "cooked", value.asInstanceOf[js.Any])
      
      inline def setCookedVarargs(value: String*): Self = StObject.set(x, "cooked", js.Array(value*))
      
      inline def setOriginal(value: js.Array[String]): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      inline def setOriginalVarargs(value: String*): Self = StObject.set(x, "original", js.Array(value*))
      
      inline def setRemain(value: js.Array[String]): Self = StObject.set(x, "remain", value.asInstanceOf[js.Any])
      
      inline def setRemainVarargs(value: String*): Self = StObject.set(x, "remain", js.Array(value*))
    }
  }
}
