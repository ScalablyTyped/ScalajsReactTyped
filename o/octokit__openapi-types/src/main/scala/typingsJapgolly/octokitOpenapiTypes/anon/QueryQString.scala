package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryQString extends StObject {
  
  var query: QString
}
object QueryQString {
  
  inline def apply(query: QString): QueryQString = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryQString]
  }
  
  extension [Self <: QueryQString](x: Self) {
    
    inline def setQuery(value: QString): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
