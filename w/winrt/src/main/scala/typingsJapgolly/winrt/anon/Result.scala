package typingsJapgolly.winrt.anon

import typingsJapgolly.winrt.Windows.Data.Json.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Result extends StObject {
  
  var result: JsonValue
  
  var succeeded: Boolean
}
object Result {
  
  inline def apply(result: JsonValue, succeeded: Boolean): Result = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  extension [Self <: Result](x: Self) {
    
    inline def setResult(value: JsonValue): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setSucceeded(value: Boolean): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
  }
}
