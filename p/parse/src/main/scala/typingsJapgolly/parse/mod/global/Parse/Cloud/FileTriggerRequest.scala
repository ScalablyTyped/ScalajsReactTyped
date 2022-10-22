package typingsJapgolly.parse.mod.global.Parse.Cloud

import typingsJapgolly.parse.mod.global.Parse.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileTriggerRequest
  extends StObject
     with TriggerRequest[File] {
  
  var contentLength: Double
  
  var file: File
  
  var fileSize: Double
}
object FileTriggerRequest {
  
  inline def apply(
    contentLength: Double,
    file: File,
    fileSize: Double,
    headers: Any,
    ip: String,
    log: Any,
    `object`: File,
    triggerName: String
  ): FileTriggerRequest = {
    val __obj = js.Dynamic.literal(contentLength = contentLength.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTriggerRequest]
  }
  
  extension [Self <: FileTriggerRequest](x: Self) {
    
    inline def setContentLength(value: Double): Self = StObject.set(x, "contentLength", value.asInstanceOf[js.Any])
    
    inline def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
  }
}
