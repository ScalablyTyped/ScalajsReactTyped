package typingsJapgolly.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteContentReportJustification extends StObject {
  
  /** Optional. User-generated free-text justification for the content report. */
  var userJustification: js.UndefOr[String] = js.undefined
}
object AppsDynamiteContentReportJustification {
  
  inline def apply(): AppsDynamiteContentReportJustification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteContentReportJustification]
  }
  
  extension [Self <: AppsDynamiteContentReportJustification](x: Self) {
    
    inline def setUserJustification(value: String): Self = StObject.set(x, "userJustification", value.asInstanceOf[js.Any])
    
    inline def setUserJustificationUndefined: Self = StObject.set(x, "userJustification", js.undefined)
  }
}
