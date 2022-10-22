package typingsJapgolly.hellosignSdk.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Blob
import org.scalajs.dom.FormData
import org.scalajs.dom.Headers
import org.scalajs.dom.ReadableStream
import org.scalajs.dom.ResponseType
import typingsJapgolly.hellosignSdk.anon.Eventmetadata
import typingsJapgolly.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<hellosign-sdk.hellosign-sdk.AccountResponse> & std.Partial<hellosign-sdk.hellosign-sdk.SignatureRequestResponse> & std.Partial<hellosign-sdk.hellosign-sdk.TemplateResponse> & hellosign-sdk.hellosign-sdk.Event<hellosign-sdk.hellosign-sdk.GenericObject<{}>> & Response */
trait EventResponse[Response] extends StObject {
  
  var account: js.UndefOr[Account] = js.undefined
  
  /**
    * @deprecated Use `reported_for_account_id` instead
    */
  var account_guid: String
  
  /* standard dom */
  def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer]
  
  /* standard dom */
  def blob(): js.Promise[Blob]
  
  /* standard dom */
  val body: ReadableStream[js.typedarray.Uint8Array] | Null
  
  /* standard dom */
  val bodyUsed: Boolean
  
  /**
    * @deprecated Use `reported_for_app_id` instead
    */
  var client_id: String
  
  var event: Eventmetadata
  
  /* standard dom */
  def formData(): js.Promise[FormData]
  
  /* standard dom */
  val headers: Headers
  
  /* standard dom */
  def json(): js.Promise[Any]
  
  /* standard dom */
  val ok: Boolean
  
  /* standard dom */
  val redirected: Boolean
  
  var resHeaders: js.UndefOr[IncomingHttpHeaders] = js.undefined
  
  var signature_request: js.UndefOr[SignatureRequest[StringDictionary[Any]]] = js.undefined
  
  /* standard dom */
  val status: Double
  
  var statusCode: js.UndefOr[Double] = js.undefined
  
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /* standard dom */
  val statusText: String
  
  var template: js.UndefOr[Template[StringDictionary[Any]]] = js.undefined
  
  /* standard dom */
  def text(): js.Promise[String]
  
  /* standard dom */
  val `type`: ResponseType
  
  /* standard dom */
  val url: String
}
object EventResponse {
  
  inline def apply[Response](
    account_guid: String,
    arrayBuffer: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]],
    blob: CallbackTo[js.Promise[Blob]],
    bodyUsed: Boolean,
    client_id: String,
    event: Eventmetadata,
    formData: CallbackTo[js.Promise[FormData]],
    headers: Headers,
    json: CallbackTo[js.Promise[Any]],
    ok: Boolean,
    redirected: Boolean,
    status: Double,
    statusText: String,
    text: CallbackTo[js.Promise[String]],
    `type`: ResponseType,
    url: String
  ): EventResponse[Response] = {
    val __obj = js.Dynamic.literal(account_guid = account_guid.asInstanceOf[js.Any], arrayBuffer = arrayBuffer.toJsFn, blob = blob.toJsFn, bodyUsed = bodyUsed.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], formData = formData.toJsFn, headers = headers.asInstanceOf[js.Any], json = json.toJsFn, ok = ok.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = text.toJsFn, url = url.asInstanceOf[js.Any], body = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventResponse[Response]]
  }
  
  extension [Self <: EventResponse[?], Response](x: Self & EventResponse[Response]) {
    
    inline def setAccount(value: Account): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setAccount_guid(value: String): Self = StObject.set(x, "account_guid", value.asInstanceOf[js.Any])
    
    inline def setArrayBuffer(value: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]]): Self = StObject.set(x, "arrayBuffer", value.toJsFn)
    
    inline def setBlob(value: CallbackTo[js.Promise[Blob]]): Self = StObject.set(x, "blob", value.toJsFn)
    
    inline def setBody(value: ReadableStream[js.typedarray.Uint8Array]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: Eventmetadata): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setFormData(value: CallbackTo[js.Promise[FormData]]): Self = StObject.set(x, "formData", value.toJsFn)
    
    inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setJson(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "json", value.toJsFn)
    
    inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    inline def setRedirected(value: Boolean): Self = StObject.set(x, "redirected", value.asInstanceOf[js.Any])
    
    inline def setResHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "resHeaders", value.asInstanceOf[js.Any])
    
    inline def setResHeadersUndefined: Self = StObject.set(x, "resHeaders", js.undefined)
    
    inline def setSignature_request(value: SignatureRequest[StringDictionary[Any]]): Self = StObject.set(x, "signature_request", value.asInstanceOf[js.Any])
    
    inline def setSignature_requestUndefined: Self = StObject.set(x, "signature_request", js.undefined)
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: Template[StringDictionary[Any]]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "text", value.toJsFn)
    
    inline def setType(value: ResponseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
