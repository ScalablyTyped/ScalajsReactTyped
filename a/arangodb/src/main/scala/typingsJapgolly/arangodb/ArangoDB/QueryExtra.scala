package typingsJapgolly.arangodb.ArangoDB

import typingsJapgolly.arangodb.anon.ExecutionTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryExtra extends StObject {
  
  var stats: ExecutionTime
  
  var warnings: js.Array[String]
}
object QueryExtra {
  
  inline def apply(stats: ExecutionTime, warnings: js.Array[String]): QueryExtra = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExtra]
  }
  
  extension [Self <: QueryExtra](x: Self) {
    
    inline def setStats(value: ExecutionTime): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
