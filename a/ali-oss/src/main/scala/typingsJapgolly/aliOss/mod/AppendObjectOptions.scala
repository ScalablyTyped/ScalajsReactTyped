package typingsJapgolly.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppendObjectOptions extends StObject {
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var meta: js.UndefOr[UserMeta] = js.undefined
  
  /** custom mime, will send with Content-Type entity header */
  var mime: js.UndefOr[String] = js.undefined
  
  /** specify the position which is the content length of the latest object */
  var position: js.UndefOr[String] = js.undefined
  
  /** the operation timeout */
  var timeout: js.UndefOr[Double] = js.undefined
}
object AppendObjectOptions {
  
  inline def apply(): AppendObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppendObjectOptions]
  }
  
  extension [Self <: AppendObjectOptions](x: Self) {
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMeta(value: UserMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    
    inline def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
