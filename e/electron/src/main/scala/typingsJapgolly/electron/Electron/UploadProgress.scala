package typingsJapgolly.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadProgress extends StObject {
  
  /**
    * Whether the request is currently active. If this is false no other properties
    * will be set
    */
  var active: Boolean
  
  /**
    * The number of bytes that have been uploaded so far
    */
  var current: Double
  
  /**
    * Whether the upload has started. If this is false both `current` and `total` will
    * be set to 0.
    */
  var started: Boolean
  
  /**
    * The number of bytes that will be uploaded this request
    */
  var total: Double
}
object UploadProgress {
  
  inline def apply(active: Boolean, current: Double, started: Boolean, total: Double): UploadProgress = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadProgress]
  }
  
  extension [Self <: UploadProgress](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setStarted(value: Boolean): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
