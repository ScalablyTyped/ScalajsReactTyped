package typingsJapgolly.jsonRulesEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Fact extends StObject {
    
    var fact: String
  }
  object Fact {
    
    inline def apply(fact: String): Fact = {
      val __obj = js.Dynamic.literal(fact = fact.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fact]
    }
    
    extension [Self <: Fact](x: Self) {
      
      inline def setFact(value: String): Self = StObject.set(x, "fact", value.asInstanceOf[js.Any])
    }
  }
}
