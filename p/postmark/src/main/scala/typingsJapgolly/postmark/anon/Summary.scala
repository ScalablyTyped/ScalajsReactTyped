package typingsJapgolly.postmark.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Summary extends StObject {
  
  var Summary: String
}
object Summary {
  
  inline def apply(Summary: String): Summary = {
    val __obj = js.Dynamic.literal(Summary = Summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Summary]
  }
  
  extension [Self <: Summary](x: Self) {
    
    inline def setSummary(value: String): Self = StObject.set(x, "Summary", value.asInstanceOf[js.Any])
  }
}
