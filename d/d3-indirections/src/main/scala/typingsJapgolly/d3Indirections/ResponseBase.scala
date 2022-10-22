package typingsJapgolly.d3Indirections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base class for all GET responses. Should not be used directly.
  */
trait ResponseBase extends StObject {
  
  var result: Any
}
object ResponseBase {
  
  inline def apply(result: Any): ResponseBase = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseBase]
  }
  
  extension [Self <: ResponseBase](x: Self) {
    
    inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
