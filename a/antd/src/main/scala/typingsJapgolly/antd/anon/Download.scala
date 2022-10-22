package typingsJapgolly.antd.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Download extends StObject {
  
  def download(): Unit
  
  def preview(): Unit
  
  def remove(): Unit
}
object Download {
  
  inline def apply(download: Callback, preview: Callback, remove: Callback): Download = {
    val __obj = js.Dynamic.literal(download = download.toJsFn, preview = preview.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[Download]
  }
  
  extension [Self <: Download](x: Self) {
    
    inline def setDownload(value: Callback): Self = StObject.set(x, "download", value.toJsFn)
    
    inline def setPreview(value: Callback): Self = StObject.set(x, "preview", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
