package typingsJapgolly.wechatMiniprogram.ICloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTempFileURLResultItem extends StObject {
  
  var errMsg: String
  
  var fileID: String
  
  var maxAge: Double
  
  var status: Double
  
  var tempFileURL: String
}
object GetTempFileURLResultItem {
  
  inline def apply(errMsg: String, fileID: String, maxAge: Double, status: Double, tempFileURL: String): GetTempFileURLResultItem = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileID = fileID.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tempFileURL = tempFileURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTempFileURLResultItem]
  }
  
  extension [Self <: GetTempFileURLResultItem](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setFileID(value: String): Self = StObject.set(x, "fileID", value.asInstanceOf[js.Any])
    
    inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTempFileURL(value: String): Self = StObject.set(x, "tempFileURL", value.asInstanceOf[js.Any])
  }
}
