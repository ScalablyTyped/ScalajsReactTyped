package typingsJapgolly.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiRequestLogsResult extends StObject {
  
  /**
    * Reserved: TBD
    */
  var apiRequestLogs: js.UndefOr[js.Array[/* Contains API request log information. */ ApiRequestLog]] = js.undefined
}
object ApiRequestLogsResult {
  
  inline def apply(): ApiRequestLogsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiRequestLogsResult]
  }
  
  extension [Self <: ApiRequestLogsResult](x: Self) {
    
    inline def setApiRequestLogs(value: js.Array[/* Contains API request log information. */ ApiRequestLog]): Self = StObject.set(x, "apiRequestLogs", value.asInstanceOf[js.Any])
    
    inline def setApiRequestLogsUndefined: Self = StObject.set(x, "apiRequestLogs", js.undefined)
    
    inline def setApiRequestLogsVarargs(value: (/* Contains API request log information. */ ApiRequestLog)*): Self = StObject.set(x, "apiRequestLogs", js.Array(value*))
  }
}
