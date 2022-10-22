package typingsJapgolly.sparqljs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparqlGenerator extends StObject {
  
  def createGenerator(): Any
  
  def stringify(query: SparqlQuery): String
}
object SparqlGenerator {
  
  inline def apply(createGenerator: CallbackTo[Any], stringify: SparqlQuery => String): SparqlGenerator = {
    val __obj = js.Dynamic.literal(createGenerator = createGenerator.toJsFn, stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[SparqlGenerator]
  }
  
  extension [Self <: SparqlGenerator](x: Self) {
    
    inline def setCreateGenerator(value: CallbackTo[Any]): Self = StObject.set(x, "createGenerator", value.toJsFn)
    
    inline def setStringify(value: SparqlQuery => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
  }
}
