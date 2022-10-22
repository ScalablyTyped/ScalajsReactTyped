package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenVideoEditorSuccessCallbackResult extends StObject {
  
  /** 剪辑后生成的视频文件的时长，单位毫秒（ms） */
  var duration: Double
  
  var errMsg: String
  
  /** 剪辑后生成的视频文件大小，单位字节数（byte） */
  var size: Double
  
  /** 编辑后生成的视频文件的临时路径 */
  var tempFilePath: String
  
  /** 编辑后生成的缩略图文件的临时路径 */
  var tempThumbPath: String
}
object OpenVideoEditorSuccessCallbackResult {
  
  inline def apply(duration: Double, errMsg: String, size: Double, tempFilePath: String, tempThumbPath: String): OpenVideoEditorSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any], tempThumbPath = tempThumbPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenVideoEditorSuccessCallbackResult]
  }
  
  extension [Self <: OpenVideoEditorSuccessCallbackResult](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
    
    inline def setTempThumbPath(value: String): Self = StObject.set(x, "tempThumbPath", value.asInstanceOf[js.Any])
  }
}
