package typingsJapgolly.cloudinaryUploadwidgetBrowser

import typingsJapgolly.cloudinaryUploadwidgetBrowser.anon.Tags
import typingsJapgolly.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.tags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagsEvent
  extends StObject
     with CloudinaryEvent {
  
  var event: tags
  
  var info: Tags
}
object TagsEvent {
  
  inline def apply(info: Tags): TagsEvent = {
    val __obj = js.Dynamic.literal(event = "tags", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsEvent]
  }
  
  extension [Self <: TagsEvent](x: Self) {
    
    inline def setEvent(value: tags): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: Tags): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
