package typingsJapgolly.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartMailboxExportJobResponse extends StObject {
  
  /**
    * The job ID.
    */
  var JobId: js.UndefOr[MailboxExportJobId] = js.undefined
}
object StartMailboxExportJobResponse {
  
  inline def apply(): StartMailboxExportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartMailboxExportJobResponse]
  }
  
  extension [Self <: StartMailboxExportJobResponse](x: Self) {
    
    inline def setJobId(value: MailboxExportJobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
