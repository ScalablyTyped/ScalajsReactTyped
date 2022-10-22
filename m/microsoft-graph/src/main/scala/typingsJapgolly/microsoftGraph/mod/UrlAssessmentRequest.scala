package typingsJapgolly.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlAssessmentRequest
  extends StObject
     with ThreatAssessmentRequest {
  
  // The URL string.
  var url: js.UndefOr[String] = js.undefined
}
object UrlAssessmentRequest {
  
  inline def apply(): UrlAssessmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlAssessmentRequest]
  }
  
  extension [Self <: UrlAssessmentRequest](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
