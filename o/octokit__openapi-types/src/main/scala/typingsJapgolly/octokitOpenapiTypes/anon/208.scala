package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `208` extends StObject {
  
  var query: Filter
}
object `208` {
  
  inline def apply(query: Filter): `208` = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[`208`]
  }
  
  extension [Self <: `208`](x: Self) {
    
    inline def setQuery(value: Filter): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
