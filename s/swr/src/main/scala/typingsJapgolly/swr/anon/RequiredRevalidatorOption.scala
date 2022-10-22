package typingsJapgolly.swr.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<swr.swr/dist/types.RevalidatorOptions> */
trait RequiredRevalidatorOption extends StObject {
  
  var dedupe: Boolean
  
  var retryCount: Double
}
object RequiredRevalidatorOption {
  
  inline def apply(dedupe: Boolean, retryCount: Double): RequiredRevalidatorOption = {
    val __obj = js.Dynamic.literal(dedupe = dedupe.asInstanceOf[js.Any], retryCount = retryCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredRevalidatorOption]
  }
  
  extension [Self <: RequiredRevalidatorOption](x: Self) {
    
    inline def setDedupe(value: Boolean): Self = StObject.set(x, "dedupe", value.asInstanceOf[js.Any])
    
    inline def setRetryCount(value: Double): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
  }
}
