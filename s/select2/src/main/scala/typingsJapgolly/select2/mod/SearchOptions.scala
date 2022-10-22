package typingsJapgolly.select2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchOptions extends StObject {
  
  var term: String
}
object SearchOptions {
  
  inline def apply(term: String): SearchOptions = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
  
  extension [Self <: SearchOptions](x: Self) {
    
    inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
  }
}
