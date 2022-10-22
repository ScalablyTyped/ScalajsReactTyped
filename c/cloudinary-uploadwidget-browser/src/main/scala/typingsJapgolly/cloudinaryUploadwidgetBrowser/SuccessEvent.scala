package typingsJapgolly.cloudinaryUploadwidgetBrowser

import typingsJapgolly.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuccessEvent
  extends StObject
     with CloudinaryEvent {
  
  var event: success
  
  var info: Any
}
object SuccessEvent {
  
  inline def apply(info: Any): SuccessEvent = {
    val __obj = js.Dynamic.literal(event = "success", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessEvent]
  }
  
  extension [Self <: SuccessEvent](x: Self) {
    
    inline def setEvent(value: success): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: Any): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
