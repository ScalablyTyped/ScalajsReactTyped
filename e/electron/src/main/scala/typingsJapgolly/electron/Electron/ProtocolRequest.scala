package typingsJapgolly.electron.Electron

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtocolRequest extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/protocol-request
  var headers: Record[String, String]
  
  var method: String
  
  var referrer: String
  
  var uploadData: js.UndefOr[js.Array[UploadData]] = js.undefined
  
  var url: String
}
object ProtocolRequest {
  
  inline def apply(headers: Record[String, String], method: String, referrer: String, url: String): ProtocolRequest = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolRequest]
  }
  
  extension [Self <: ProtocolRequest](x: Self) {
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setUploadData(value: js.Array[UploadData]): Self = StObject.set(x, "uploadData", value.asInstanceOf[js.Any])
    
    inline def setUploadDataUndefined: Self = StObject.set(x, "uploadData", js.undefined)
    
    inline def setUploadDataVarargs(value: UploadData*): Self = StObject.set(x, "uploadData", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
