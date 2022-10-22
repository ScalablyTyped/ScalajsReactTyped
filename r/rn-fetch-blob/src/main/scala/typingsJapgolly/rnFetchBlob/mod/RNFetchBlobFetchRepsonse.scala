package typingsJapgolly.rnFetchBlob.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RNFetchBlobFetchRepsonse extends StObject {
  
  def arrayBuffer(): js.Promise[js.Array[Any]]
  
  def blob(): js.Promise[PolyfillBlob]
  
  var bodyUsed: Boolean
  
  var headers: Any
  
  def json(): js.Promise[Any]
  
  var ok: Boolean
  
  def rawResp(): js.Promise[FetchBlobResponse]
  
  var resp: FetchBlobResponse
  
  var rnfbResp: FetchBlobResponse
  
  var rnfbRespInfo: RNFetchBlobResponseInfo
  
  var status: Double
  
  def text(): js.Promise[String]
  
  var `type`: String
}
object RNFetchBlobFetchRepsonse {
  
  inline def apply(
    arrayBuffer: CallbackTo[js.Promise[js.Array[Any]]],
    blob: CallbackTo[js.Promise[PolyfillBlob]],
    bodyUsed: Boolean,
    headers: Any,
    json: CallbackTo[js.Promise[Any]],
    ok: Boolean,
    rawResp: CallbackTo[js.Promise[FetchBlobResponse]],
    resp: FetchBlobResponse,
    rnfbResp: FetchBlobResponse,
    rnfbRespInfo: RNFetchBlobResponseInfo,
    status: Double,
    text: CallbackTo[js.Promise[String]],
    `type`: String
  ): RNFetchBlobFetchRepsonse = {
    val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer.toJsFn, blob = blob.toJsFn, bodyUsed = bodyUsed.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], json = json.toJsFn, ok = ok.asInstanceOf[js.Any], rawResp = rawResp.toJsFn, resp = resp.asInstanceOf[js.Any], rnfbResp = rnfbResp.asInstanceOf[js.Any], rnfbRespInfo = rnfbRespInfo.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RNFetchBlobFetchRepsonse]
  }
  
  extension [Self <: RNFetchBlobFetchRepsonse](x: Self) {
    
    inline def setArrayBuffer(value: CallbackTo[js.Promise[js.Array[Any]]]): Self = StObject.set(x, "arrayBuffer", value.toJsFn)
    
    inline def setBlob(value: CallbackTo[js.Promise[PolyfillBlob]]): Self = StObject.set(x, "blob", value.toJsFn)
    
    inline def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setJson(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "json", value.toJsFn)
    
    inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    inline def setRawResp(value: CallbackTo[js.Promise[FetchBlobResponse]]): Self = StObject.set(x, "rawResp", value.toJsFn)
    
    inline def setResp(value: FetchBlobResponse): Self = StObject.set(x, "resp", value.asInstanceOf[js.Any])
    
    inline def setRnfbResp(value: FetchBlobResponse): Self = StObject.set(x, "rnfbResp", value.asInstanceOf[js.Any])
    
    inline def setRnfbRespInfo(value: RNFetchBlobResponseInfo): Self = StObject.set(x, "rnfbRespInfo", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "text", value.toJsFn)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
