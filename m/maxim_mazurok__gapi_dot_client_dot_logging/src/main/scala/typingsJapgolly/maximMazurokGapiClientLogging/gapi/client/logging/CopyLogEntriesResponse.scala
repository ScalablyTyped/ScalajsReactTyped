package typingsJapgolly.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyLogEntriesResponse extends StObject {
  
  /** Number of log entries copied. */
  var logEntriesCopiedCount: js.UndefOr[String] = js.undefined
}
object CopyLogEntriesResponse {
  
  inline def apply(): CopyLogEntriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyLogEntriesResponse]
  }
  
  extension [Self <: CopyLogEntriesResponse](x: Self) {
    
    inline def setLogEntriesCopiedCount(value: String): Self = StObject.set(x, "logEntriesCopiedCount", value.asInstanceOf[js.Any])
    
    inline def setLogEntriesCopiedCountUndefined: Self = StObject.set(x, "logEntriesCopiedCount", js.undefined)
  }
}
