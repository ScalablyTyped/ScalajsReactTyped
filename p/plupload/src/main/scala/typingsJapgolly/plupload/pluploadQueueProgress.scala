package typingsJapgolly.plupload

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait pluploadQueueProgress extends StObject {
  
  var bytesPerSec: Double
  
  var failed: Double
  
  var loaded: Double
  
  var percent: Double
  
  var queued: Double
  
  def reset(): Unit
  
  var size: Double
  
  var uploaded: Double
}
object pluploadQueueProgress {
  
  inline def apply(
    bytesPerSec: Double,
    failed: Double,
    loaded: Double,
    percent: Double,
    queued: Double,
    reset: Callback,
    size: Double,
    uploaded: Double
  ): pluploadQueueProgress = {
    val __obj = js.Dynamic.literal(bytesPerSec = bytesPerSec.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], reset = reset.toJsFn, size = size.asInstanceOf[js.Any], uploaded = uploaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[pluploadQueueProgress]
  }
  
  extension [Self <: pluploadQueueProgress](x: Self) {
    
    inline def setBytesPerSec(value: Double): Self = StObject.set(x, "bytesPerSec", value.asInstanceOf[js.Any])
    
    inline def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setQueued(value: Double): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setUploaded(value: Double): Self = StObject.set(x, "uploaded", value.asInstanceOf[js.Any])
  }
}
