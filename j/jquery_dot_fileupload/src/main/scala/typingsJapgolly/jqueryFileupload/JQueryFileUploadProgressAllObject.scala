package typingsJapgolly.jqueryFileupload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryFileUploadProgressAllObject extends StObject {
  
  var bitrate: js.UndefOr[Double] = js.undefined
  
  var loaded: js.UndefOr[Double] = js.undefined
  
  var total: js.UndefOr[Double] = js.undefined
}
object JQueryFileUploadProgressAllObject {
  
  inline def apply(): JQueryFileUploadProgressAllObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryFileUploadProgressAllObject]
  }
  
  extension [Self <: JQueryFileUploadProgressAllObject](x: Self) {
    
    inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
    
    inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
