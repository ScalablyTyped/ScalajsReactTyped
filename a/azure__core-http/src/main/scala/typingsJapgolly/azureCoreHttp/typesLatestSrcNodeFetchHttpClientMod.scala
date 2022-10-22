package typingsJapgolly.azureCoreHttp

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Blob
import org.scalajs.dom.Headers
import org.scalajs.dom.ReferrerPolicy
import org.scalajs.dom.RequestCache
import org.scalajs.dom.RequestCredentials
import org.scalajs.dom.RequestMode
import org.scalajs.dom.RequestRedirect
import org.scalajs.dom.Response
import org.scalajs.dom.ResponseType
import typingsJapgolly.azureCoreHttp.anon.PartialRequestInit
import typingsJapgolly.azureCoreHttp.typesLatestSrcHttpHeadersMod.HttpHeadersLike
import typingsJapgolly.azureCoreHttp.typesLatestSrcHttpOperationResponseMod.HttpOperationResponse
import typingsJapgolly.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicy
import typingsJapgolly.azureCoreHttp.typesLatestSrcWebResourceMod.TransferProgressEvent
import typingsJapgolly.azureCoreHttp.typesLatestSrcWebResourceMod.WebResourceLike
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcNodeFetchHttpClientMod {
  
  @JSImport("@azure/core-http/types/latest/src/nodeFetchHttpClient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-http/types/latest/src/nodeFetchHttpClient", "NodeFetchHttpClient")
  @js.native
  open class NodeFetchHttpClient ()
    extends StObject
       with RequestPolicy {
    
    /* private */ val cookieJar: Any = js.native
    
    /**
      * Uses `node-fetch` to perform the request.
      */
    def fetch(input: CommonRequestInfo): js.Promise[CommonResponse] = js.native
    def fetch(input: CommonRequestInfo, init: CommonRequestInit): js.Promise[CommonResponse] = js.native
    
    /* private */ var getOrCreateAgent: Any = js.native
    
    /* private */ var keepAliveAgents: Any = js.native
    
    /**
      * Prepares a request based on the provided web resource.
      */
    def prepareRequest(httpRequest: WebResourceLike): js.Promise[PartialRequestInit] = js.native
    
    /**
      * Process an HTTP response. Handles persisting a cookie for subsequent requests if the response has a "Set-Cookie" header.
      */
    def processRequest(operationResponse: HttpOperationResponse): js.Promise[Unit] = js.native
    
    /* private */ var proxyAgentMap: Any = js.native
    
    /**
      * A method that retrieves an {@link HttpOperationResponse} given a {@link WebResourceLike} describing the request to be made.
      * @param httpRequest - {@link WebResourceLike} describing the request to be made.
      */
    /* CompleteClass */
    override def sendRequest(httpRequest: WebResourceLike): js.Promise[HttpOperationResponse] = js.native
  }
  
  @JSImport("@azure/core-http/types/latest/src/nodeFetchHttpClient", "ReportTransform")
  @js.native
  open class ReportTransform protected () extends Transform {
    def this(progressCallback: js.Function1[/* progress */ TransferProgressEvent, Unit]) = this()
    
    def _transform(chunk: String, _encoding: String, callback: js.Function1[/* arg */ Any, Unit]): Unit = js.native
    def _transform(chunk: Buffer, _encoding: String, callback: js.Function1[/* arg */ Any, Unit]): Unit = js.native
    
    /* private */ var loadedBytes: Any = js.native
    
    /* private */ var progressCallback: Any = js.native
  }
  
  inline def parseHeaders(headers: Headers): HttpHeadersLike = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHeaders")(headers.asInstanceOf[js.Any]).asInstanceOf[HttpHeadersLike]
  
  type CommonRequestInfo = String
  
  /* Inlined std.Omit<std.RequestInit, 'body' | 'headers' | 'signal'> & {  body :any | undefined,   headers :any | undefined,   signal :any | undefined} */
  trait CommonRequestInit extends StObject {
    
    var body: js.UndefOr[Any] = js.undefined
    
    var cache: js.UndefOr[RequestCache] = js.undefined
    
    var credentials: js.UndefOr[RequestCredentials] = js.undefined
    
    var headers: js.UndefOr[Any] = js.undefined
    
    var integrity: js.UndefOr[String] = js.undefined
    
    var keepalive: js.UndefOr[Boolean] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[RequestMode] = js.undefined
    
    var redirect: js.UndefOr[RequestRedirect] = js.undefined
    
    var referrer: js.UndefOr[String] = js.undefined
    
    var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
    
    var signal: js.UndefOr[Any] = js.undefined
    
    var window: js.UndefOr[Null] = js.undefined
  }
  object CommonRequestInit {
    
    inline def apply(): CommonRequestInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonRequestInit]
    }
    
    extension [Self <: CommonRequestInit](x: Self) {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCache(value: RequestCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMode(value: RequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
      
      inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
      
      inline def setSignal(value: Any): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  /* Inlined std.Omit<std.Response, 'body' | 'trailer' | 'formData'> & {  body :any,   trailer :any,   formData :any} */
  trait CommonResponse extends StObject {
    
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer]
    @JSName("arrayBuffer")
    var arrayBuffer_Original: js.Function0[js.Promise[js.typedarray.ArrayBuffer]]
    
    def blob(): js.Promise[Blob]
    @JSName("blob")
    var blob_Original: js.Function0[js.Promise[Blob]]
    
    var body: Any
    
    var bodyUsed: Boolean
    
    @JSName("clone")
    var clone_Original: js.Function0[Response]
    
    var formData: Any
    
    var headers: Headers
    
    def json(): js.Promise[Any]
    @JSName("json")
    var json_Original: js.Function0[js.Promise[Any]]
    
    var ok: Boolean
    
    var redirected: Boolean
    
    var status: Double
    
    var statusText: String
    
    def text(): js.Promise[String]
    @JSName("text")
    var text_Original: js.Function0[js.Promise[String]]
    
    var trailer: Any
    
    var `type`: ResponseType
    
    var url: String
  }
  object CommonResponse {
    
    inline def apply(
      arrayBuffer: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]],
      blob: CallbackTo[js.Promise[Blob]],
      body: Any,
      bodyUsed: Boolean,
      clone_ : CallbackTo[Response],
      formData: Any,
      headers: Headers,
      json: CallbackTo[js.Promise[Any]],
      ok: Boolean,
      redirected: Boolean,
      status: Double,
      statusText: String,
      text: CallbackTo[js.Promise[String]],
      trailer: Any,
      `type`: ResponseType,
      url: String
    ): CommonResponse = {
      val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer.toJsFn, blob = blob.toJsFn, body = body.asInstanceOf[js.Any], bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], json = json.toJsFn, ok = ok.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = text.toJsFn, trailer = trailer.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("clone")(clone_.toJsFn)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonResponse]
    }
    
    extension [Self <: CommonResponse](x: Self) {
      
      inline def setArrayBuffer(value: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]]): Self = StObject.set(x, "arrayBuffer", value.toJsFn)
      
      inline def setBlob(value: CallbackTo[js.Promise[Blob]]): Self = StObject.set(x, "blob", value.toJsFn)
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
      
      inline def setClone_(value: CallbackTo[Response]): Self = StObject.set(x, "clone", value.toJsFn)
      
      inline def setFormData(value: Any): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setJson(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "json", value.toJsFn)
      
      inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setRedirected(value: Boolean): Self = StObject.set(x, "redirected", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "text", value.toJsFn)
      
      inline def setTrailer(value: Any): Self = StObject.set(x, "trailer", value.asInstanceOf[js.Any])
      
      inline def setType(value: ResponseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
