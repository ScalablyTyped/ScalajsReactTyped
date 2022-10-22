package typingsJapgolly.retextProfanities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Plural extends StObject {
    
    def plural(word: String): String
    
    def singular(word: String): String
  }
  object Plural {
    
    inline def apply(plural: String => String, singular: String => String): Plural = {
      val __obj = js.Dynamic.literal(plural = js.Any.fromFunction1(plural), singular = js.Any.fromFunction1(singular))
      __obj.asInstanceOf[Plural]
    }
    
    extension [Self <: Plural](x: Self) {
      
      inline def setPlural(value: String => String): Self = StObject.set(x, "plural", js.Any.fromFunction1(value))
      
      inline def setSingular(value: String => String): Self = StObject.set(x, "singular", js.Any.fromFunction1(value))
    }
  }
}
