package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatafeedStatusError extends StObject {
  
  /** The code of the error, for example, "validation/invalid_value". */
  var code: js.UndefOr[String] = js.undefined
  
  /** The number of occurrences of the error in the feed. */
  var count: js.UndefOr[String] = js.undefined
  
  /** A list of example occurrences of the error, grouped by product. */
  var examples: js.UndefOr[js.Array[DatafeedStatusExample]] = js.undefined
  
  /** The error message, for example, "Invalid price". */
  var message: js.UndefOr[String] = js.undefined
}
object DatafeedStatusError {
  
  inline def apply(): DatafeedStatusError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatafeedStatusError]
  }
  
  extension [Self <: DatafeedStatusError](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setExamples(value: js.Array[DatafeedStatusExample]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    inline def setExamplesVarargs(value: DatafeedStatusExample*): Self = StObject.set(x, "examples", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
