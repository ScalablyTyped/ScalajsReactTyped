package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryExecutionOptions extends StObject {
  
  var options: StringDictionary[Any]
}
object QueryExecutionOptions {
  
  inline def apply(options: StringDictionary[Any]): QueryExecutionOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecutionOptions]
  }
  
  extension [Self <: QueryExecutionOptions](x: Self) {
    
    inline def setOptions(value: StringDictionary[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
