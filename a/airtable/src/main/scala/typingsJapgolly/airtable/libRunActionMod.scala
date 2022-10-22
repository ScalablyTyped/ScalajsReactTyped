package typingsJapgolly.airtable

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Blob
import org.scalajs.dom.FormData
import org.scalajs.dom.Headers
import org.scalajs.dom.ReadableStream
import org.scalajs.dom.Response
import org.scalajs.dom.ResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRunActionMod {
  
  inline def apply(
    base: typingsJapgolly.airtable.libBaseMod.^,
    method: String,
    path: String,
    queryParams: ActionParams,
    bodyData: ActionBody,
    callback: ActionCallback,
    numAttempts: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(base.asInstanceOf[js.Any], method.asInstanceOf[js.Any], path.asInstanceOf[js.Any], queryParams.asInstanceOf[js.Any], bodyData.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], numAttempts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("airtable/lib/run_action", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type ActionBody = Any
  
  type ActionCallback = js.Function3[
    /* error */ ActionError, 
    /* response */ js.UndefOr[ActionResponse], 
    /* body */ js.UndefOr[ActionBody], 
    Unit
  ]
  
  type ActionError = Any
  
  type ActionParams = StringDictionary[ActionBody]
  
  /* Inlined {-readonly [ key in keyof std.Response ]: std.Response[key]} & {  statusCode :number} */
  trait ActionResponse extends StObject {
    
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer]
    @JSName("arrayBuffer")
    var arrayBuffer_Original: js.Function0[js.Promise[js.typedarray.ArrayBuffer]]
    
    def blob(): js.Promise[Blob]
    @JSName("blob")
    var blob_Original: js.Function0[js.Promise[Blob]]
    
    var body: js.UndefOr[ReadableStream[js.typedarray.Uint8Array] | Null] = js.undefined
    
    var bodyUsed: Boolean
    
    @JSName("clone")
    var clone_Original: js.Function0[Response]
    
    def formData(): js.Promise[FormData]
    @JSName("formData")
    var formData_Original: js.Function0[js.Promise[FormData]]
    
    var headers: Headers
    
    def json(): js.Promise[Any]
    @JSName("json")
    var json_Original: js.Function0[js.Promise[Any]]
    
    var ok: Boolean
    
    var redirected: Boolean
    
    var status: Double
    
    var statusCode: Double
    
    var statusText: String
    
    def text(): js.Promise[String]
    @JSName("text")
    var text_Original: js.Function0[js.Promise[String]]
    
    var `type`: ResponseType
    
    var url: String
  }
  object ActionResponse {
    
    inline def apply(
      arrayBuffer: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]],
      blob: CallbackTo[js.Promise[Blob]],
      bodyUsed: Boolean,
      clone_ : CallbackTo[Response],
      formData: CallbackTo[js.Promise[FormData]],
      headers: Headers,
      json: CallbackTo[js.Promise[Any]],
      ok: Boolean,
      redirected: Boolean,
      status: Double,
      statusCode: Double,
      statusText: String,
      text: CallbackTo[js.Promise[String]],
      `type`: ResponseType,
      url: String
    ): ActionResponse = {
      val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer.toJsFn, blob = blob.toJsFn, bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = formData.toJsFn, headers = headers.asInstanceOf[js.Any], json = json.toJsFn, ok = ok.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = text.toJsFn, url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("clone")(clone_.toJsFn)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionResponse]
    }
    
    extension [Self <: ActionResponse](x: Self) {
      
      inline def setArrayBuffer(value: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]]): Self = StObject.set(x, "arrayBuffer", value.toJsFn)
      
      inline def setBlob(value: CallbackTo[js.Promise[Blob]]): Self = StObject.set(x, "blob", value.toJsFn)
      
      inline def setBody(value: ReadableStream[js.typedarray.Uint8Array]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
      
      inline def setClone_(value: CallbackTo[Response]): Self = StObject.set(x, "clone", value.toJsFn)
      
      inline def setFormData(value: CallbackTo[js.Promise[FormData]]): Self = StObject.set(x, "formData", value.toJsFn)
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setJson(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "json", value.toJsFn)
      
      inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setRedirected(value: Boolean): Self = StObject.set(x, "redirected", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "text", value.toJsFn)
      
      inline def setType(value: ResponseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type Body = ActionBody
  
  type Callback = ActionCallback
  
  type Params = ActionParams
}
