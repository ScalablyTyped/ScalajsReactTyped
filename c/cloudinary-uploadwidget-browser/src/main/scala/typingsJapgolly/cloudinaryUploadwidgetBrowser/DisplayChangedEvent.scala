package typingsJapgolly.cloudinaryUploadwidgetBrowser

import typingsJapgolly.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.`display-changed`
import typingsJapgolly.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.expanded
import typingsJapgolly.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.hidden
import typingsJapgolly.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.minimized
import typingsJapgolly.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.shown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayChangedEvent
  extends StObject
     with CloudinaryEvent {
  
  var event: `display-changed`
  
  var info: shown | hidden | minimized | expanded
}
object DisplayChangedEvent {
  
  inline def apply(info: shown | hidden | minimized | expanded): DisplayChangedEvent = {
    val __obj = js.Dynamic.literal(event = "display-changed", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayChangedEvent]
  }
  
  extension [Self <: DisplayChangedEvent](x: Self) {
    
    inline def setEvent(value: `display-changed`): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: shown | hidden | minimized | expanded): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
