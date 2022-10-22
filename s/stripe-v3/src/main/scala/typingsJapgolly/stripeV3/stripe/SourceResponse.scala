package typingsJapgolly.stripeV3.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceResponse extends StObject {
  
  var error: js.UndefOr[Error] = js.undefined
  
  var source: js.UndefOr[Source] = js.undefined
}
object SourceResponse {
  
  inline def apply(): SourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceResponse]
  }
  
  extension [Self <: SourceResponse](x: Self) {
    
    inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
