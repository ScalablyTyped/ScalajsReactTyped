package typingsJapgolly.cloudinaryUploadwidgetBrowser

import typingsJapgolly.cloudinaryUploadwidgetBrowser.anon.All
import typingsJapgolly.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.abort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbortEvent
  extends StObject
     with CloudinaryEvent {
  
  var event: abort
  
  var info: All
}
object AbortEvent {
  
  inline def apply(info: All): AbortEvent = {
    val __obj = js.Dynamic.literal(event = "abort", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortEvent]
  }
  
  extension [Self <: AbortEvent](x: Self) {
    
    inline def setEvent(value: abort): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: All): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
