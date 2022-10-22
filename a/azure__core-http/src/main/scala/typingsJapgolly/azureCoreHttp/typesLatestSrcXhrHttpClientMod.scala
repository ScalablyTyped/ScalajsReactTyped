package typingsJapgolly.azureCoreHttp

import org.scalajs.dom.XMLHttpRequest
import typingsJapgolly.azureCoreHttp.typesLatestSrcHttpHeadersMod.HttpHeadersLike
import typingsJapgolly.azureCoreHttp.typesLatestSrcHttpOperationResponseMod.HttpOperationResponse
import typingsJapgolly.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicy
import typingsJapgolly.azureCoreHttp.typesLatestSrcWebResourceMod.WebResourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcXhrHttpClientMod {
  
  @JSImport("@azure/core-http/types/latest/src/xhrHttpClient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-http/types/latest/src/xhrHttpClient", "XhrHttpClient")
  @js.native
  open class XhrHttpClient ()
    extends StObject
       with RequestPolicy {
    
    /**
      * A method that retrieves an {@link HttpOperationResponse} given a {@link WebResourceLike} describing the request to be made.
      * @param httpRequest - {@link WebResourceLike} describing the request to be made.
      */
    /* CompleteClass */
    override def sendRequest(httpRequest: WebResourceLike): js.Promise[HttpOperationResponse] = js.native
  }
  
  inline def parseHeaders(xhr: XMLHttpRequest): HttpHeadersLike = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHeaders")(xhr.asInstanceOf[js.Any]).asInstanceOf[HttpHeadersLike]
}
