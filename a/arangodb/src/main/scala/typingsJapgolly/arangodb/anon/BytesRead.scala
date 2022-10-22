package typingsJapgolly.arangodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BytesRead extends StObject {
  
  var bytesRead: Double
  
  var bytesWritten: Double
  
  var count: Double
  
  var filesCombined: Double
  
  var message: String
  
  var time: String
}
object BytesRead {
  
  inline def apply(
    bytesRead: Double,
    bytesWritten: Double,
    count: Double,
    filesCombined: Double,
    message: String,
    time: String
  ): BytesRead = {
    val __obj = js.Dynamic.literal(bytesRead = bytesRead.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], filesCombined = filesCombined.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesRead]
  }
  
  extension [Self <: BytesRead](x: Self) {
    
    inline def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
    
    inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setFilesCombined(value: Double): Self = StObject.set(x, "filesCombined", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
