package typingsJapgolly.syncFetch

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.nodeFetch.mod.Headers
import typingsJapgolly.syncFetch.mod.ResponseInit
import typingsJapgolly.syncFetch.mod.SyncBodyInit
import typingsJapgolly.syncFetch.mod.SyncRequest
import typingsJapgolly.syncFetch.mod.SyncRequestInfo
import typingsJapgolly.syncFetch.mod.SyncRequestInit
import typingsJapgolly.syncFetch.mod.SyncResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FetchError extends StObject {
    
    var FetchError: Instantiable2[/* message */ String, /* type */ String, typingsJapgolly.nodeFetch.mod.FetchError]
    
    var Headers: Instantiable0[typingsJapgolly.nodeFetch.mod.Headers]
    
    var Request: Instantiable2[/* input */ SyncRequestInfo, /* init */ js.UndefOr[SyncRequestInit], SyncRequest]
    
    var Response: Instantiable2[
        /* body */ js.UndefOr[SyncBodyInit], 
        /* init */ js.UndefOr[ResponseInit], 
        SyncResponse
      ]
  }
  object FetchError {
    
    inline def apply(
      FetchError: Instantiable2[/* message */ String, /* type */ String, typingsJapgolly.nodeFetch.mod.FetchError],
      Headers: Instantiable0[Headers],
      Request: Instantiable2[/* input */ SyncRequestInfo, /* init */ js.UndefOr[SyncRequestInit], SyncRequest],
      Response: Instantiable2[
          /* body */ js.UndefOr[SyncBodyInit], 
          /* init */ js.UndefOr[ResponseInit], 
          SyncResponse
        ]
    ): FetchError = {
      val __obj = js.Dynamic.literal(FetchError = FetchError.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], Request = Request.asInstanceOf[js.Any], Response = Response.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchError]
    }
    
    extension [Self <: FetchError](x: Self) {
      
      inline def setFetchError(
        value: Instantiable2[/* message */ String, /* type */ String, typingsJapgolly.nodeFetch.mod.FetchError]
      ): Self = StObject.set(x, "FetchError", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Instantiable0[Headers]): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
      
      inline def setRequest(
        value: Instantiable2[/* input */ SyncRequestInfo, /* init */ js.UndefOr[SyncRequestInit], SyncRequest]
      ): Self = StObject.set(x, "Request", value.asInstanceOf[js.Any])
      
      inline def setResponse(
        value: Instantiable2[
              /* body */ js.UndefOr[SyncBodyInit], 
              /* init */ js.UndefOr[ResponseInit], 
              SyncResponse
            ]
      ): Self = StObject.set(x, "Response", value.asInstanceOf[js.Any])
    }
  }
}
