package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadTaskOnProgressUpdateCallbackResult extends StObject {
  
  /** 上传进度百分比 */
  var progress: Double
  
  /** 预期需要上传的数据总长度，单位 Bytes */
  var totalBytesExpectedToSend: Double
  
  /** 已经上传的数据长度，单位 Bytes */
  var totalBytesSent: Double
}
object UploadTaskOnProgressUpdateCallbackResult {
  
  inline def apply(progress: Double, totalBytesExpectedToSend: Double, totalBytesSent: Double): UploadTaskOnProgressUpdateCallbackResult = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], totalBytesExpectedToSend = totalBytesExpectedToSend.asInstanceOf[js.Any], totalBytesSent = totalBytesSent.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadTaskOnProgressUpdateCallbackResult]
  }
  
  extension [Self <: UploadTaskOnProgressUpdateCallbackResult](x: Self) {
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesExpectedToSend(value: Double): Self = StObject.set(x, "totalBytesExpectedToSend", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesSent(value: Double): Self = StObject.set(x, "totalBytesSent", value.asInstanceOf[js.Any])
  }
}
