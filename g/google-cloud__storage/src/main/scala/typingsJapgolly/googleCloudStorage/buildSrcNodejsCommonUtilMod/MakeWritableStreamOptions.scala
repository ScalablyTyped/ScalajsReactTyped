package typingsJapgolly.googleCloudStorage.buildSrcNodejsCommonUtilMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.googleCloudStorage.anon.ContentType
import typingsJapgolly.googleCloudStorage.anon.OnAuthenticated
import typingsJapgolly.teenyRequest.mod.Options
import typingsJapgolly.teenyRequest.mod.OptionsWithUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MakeWritableStreamOptions extends StObject {
  
  /**
    * A connection instance used to get a token with and send the request
    * through.
    */
  var connection: js.UndefOr[js.Object] = js.undefined
  
  def makeAuthenticatedRequest(reqOpts: OptionsWithUri, fnobj: OnAuthenticated): Unit
  
  /**
    * Metadata to send at the head of the request.
    */
  var metadata: js.UndefOr[ContentType] = js.undefined
  
  /**
    * Request object, in the format of a standard Node.js http.request() object.
    */
  var request: js.UndefOr[Options] = js.undefined
}
object MakeWritableStreamOptions {
  
  inline def apply(makeAuthenticatedRequest: (OptionsWithUri, OnAuthenticated) => Callback): MakeWritableStreamOptions = {
    val __obj = js.Dynamic.literal(makeAuthenticatedRequest = js.Any.fromFunction2((t0: OptionsWithUri, t1: OnAuthenticated) => (makeAuthenticatedRequest(t0, t1)).runNow()))
    __obj.asInstanceOf[MakeWritableStreamOptions]
  }
  
  extension [Self <: MakeWritableStreamOptions](x: Self) {
    
    inline def setConnection(value: js.Object): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    inline def setMakeAuthenticatedRequest(value: (OptionsWithUri, OnAuthenticated) => Callback): Self = StObject.set(x, "makeAuthenticatedRequest", js.Any.fromFunction2((t0: OptionsWithUri, t1: OnAuthenticated) => (value(t0, t1)).runNow()))
    
    inline def setMetadata(value: ContentType): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setRequest(value: Options): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
  }
}
