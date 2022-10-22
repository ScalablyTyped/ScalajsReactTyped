package typingsJapgolly.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Progress extends StObject {
  
  var progress: Double
  
  var totalBytesExpectedToWrite: Double
  
  var totalBytesWritten: Double
}
object Progress {
  
  inline def apply(progress: Double, totalBytesExpectedToWrite: Double, totalBytesWritten: Double): Progress = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], totalBytesExpectedToWrite = totalBytesExpectedToWrite.asInstanceOf[js.Any], totalBytesWritten = totalBytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
  
  extension [Self <: Progress](x: Self) {
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesExpectedToWrite(value: Double): Self = StObject.set(x, "totalBytesExpectedToWrite", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesWritten(value: Double): Self = StObject.set(x, "totalBytesWritten", value.asInstanceOf[js.Any])
  }
}
