package typingsJapgolly.reactNativeFetchBlob.mod

import typingsJapgolly.reactNativeFetchBlob.reactNativeFetchBlobStrings._empty
import typingsJapgolly.reactNativeFetchBlob.reactNativeFetchBlobStrings.ascii
import typingsJapgolly.reactNativeFetchBlob.reactNativeFetchBlobStrings.base64
import typingsJapgolly.reactNativeFetchBlob.reactNativeFetchBlobStrings.blob
import typingsJapgolly.reactNativeFetchBlob.reactNativeFetchBlobStrings.json
import typingsJapgolly.reactNativeFetchBlob.reactNativeFetchBlobStrings.path
import typingsJapgolly.reactNativeFetchBlob.reactNativeFetchBlobStrings.text
import typingsJapgolly.reactNativeFetchBlob.reactNativeFetchBlobStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RNFetchBlobResponseInfo extends StObject {
  
  var headers: Any
  
  var respType: text | blob | _empty | json
  
  var rnfbEncode: path | base64 | ascii | utf8
  
  var state: Double
  
  var status: Double
  
  var taskId: String
}
object RNFetchBlobResponseInfo {
  
  inline def apply(
    headers: Any,
    respType: text | blob | _empty | json,
    rnfbEncode: path | base64 | ascii | utf8,
    state: Double,
    status: Double,
    taskId: String
  ): RNFetchBlobResponseInfo = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], respType = respType.asInstanceOf[js.Any], rnfbEncode = rnfbEncode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RNFetchBlobResponseInfo]
  }
  
  extension [Self <: RNFetchBlobResponseInfo](x: Self) {
    
    inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setRespType(value: text | blob | _empty | json): Self = StObject.set(x, "respType", value.asInstanceOf[js.Any])
    
    inline def setRnfbEncode(value: path | base64 | ascii | utf8): Self = StObject.set(x, "rnfbEncode", value.asInstanceOf[js.Any])
    
    inline def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
