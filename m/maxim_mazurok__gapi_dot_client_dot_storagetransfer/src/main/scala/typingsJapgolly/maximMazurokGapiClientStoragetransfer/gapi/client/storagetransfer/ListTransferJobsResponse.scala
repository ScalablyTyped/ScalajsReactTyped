package typingsJapgolly.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTransferJobsResponse extends StObject {
  
  /** The list next page token. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** A list of transfer jobs. */
  var transferJobs: js.UndefOr[js.Array[TransferJob]] = js.undefined
}
object ListTransferJobsResponse {
  
  inline def apply(): ListTransferJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTransferJobsResponse]
  }
  
  extension [Self <: ListTransferJobsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTransferJobs(value: js.Array[TransferJob]): Self = StObject.set(x, "transferJobs", value.asInstanceOf[js.Any])
    
    inline def setTransferJobsUndefined: Self = StObject.set(x, "transferJobs", js.undefined)
    
    inline def setTransferJobsVarargs(value: TransferJob*): Self = StObject.set(x, "transferJobs", js.Array(value*))
  }
}
