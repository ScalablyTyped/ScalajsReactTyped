package typingsJapgolly.reactInstantsearchCore.anon

import typingsJapgolly.reactInstantsearchCore.mod.BasicDoc
import typingsJapgolly.reactInstantsearchCore.mod.SearchResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Results extends StObject {
  
  var results: SearchResults[BasicDoc]
}
object Results {
  
  inline def apply(results: SearchResults[BasicDoc]): Results = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
  
  extension [Self <: Results](x: Self) {
    
    inline def setResults(value: SearchResults[BasicDoc]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
  }
}
