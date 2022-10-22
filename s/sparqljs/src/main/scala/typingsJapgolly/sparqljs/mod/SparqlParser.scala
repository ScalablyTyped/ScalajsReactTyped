package typingsJapgolly.sparqljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparqlParser extends StObject {
  
  def parse(query: String): SparqlQuery
}
object SparqlParser {
  
  inline def apply(parse: String => SparqlQuery): SparqlParser = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[SparqlParser]
  }
  
  extension [Self <: SparqlParser](x: Self) {
    
    inline def setParse(value: String => SparqlQuery): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
  }
}
