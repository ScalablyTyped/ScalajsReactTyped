package typingsJapgolly.tern.anon

import typingsJapgolly.tern.libTernMod.TypeQuery
import typingsJapgolly.tern.libTernMod.TypeQueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Result extends StObject {
  
  var query: TypeQuery
  
  var result: TypeQueryResult
}
object Result {
  
  inline def apply(query: TypeQuery, result: TypeQueryResult): Result = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  extension [Self <: Result](x: Self) {
    
    inline def setQuery(value: TypeQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setResult(value: TypeQueryResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
