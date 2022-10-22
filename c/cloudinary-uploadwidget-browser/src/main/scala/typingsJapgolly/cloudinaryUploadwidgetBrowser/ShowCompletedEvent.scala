package typingsJapgolly.cloudinaryUploadwidgetBrowser

import typingsJapgolly.cloudinaryUploadwidgetBrowser.anon.Items
import typingsJapgolly.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.`show-completed`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowCompletedEvent
  extends StObject
     with CloudinaryEvent {
  
  var event: `show-completed`
  
  var info: Items
}
object ShowCompletedEvent {
  
  inline def apply(info: Items): ShowCompletedEvent = {
    val __obj = js.Dynamic.literal(event = "show-completed", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowCompletedEvent]
  }
  
  extension [Self <: ShowCompletedEvent](x: Self) {
    
    inline def setEvent(value: `show-completed`): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: Items): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
