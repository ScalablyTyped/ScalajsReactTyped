package typingsJapgolly.cloudinaryUploadwidgetBrowser

import typingsJapgolly.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.`source-changed`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceChangedEvent
  extends StObject
     with CloudinaryEvent {
  
  var event: `source-changed`
  
  var info: typingsJapgolly.cloudinaryUploadwidgetBrowser.anon.Source
}
object SourceChangedEvent {
  
  inline def apply(info: typingsJapgolly.cloudinaryUploadwidgetBrowser.anon.Source): SourceChangedEvent = {
    val __obj = js.Dynamic.literal(event = "source-changed", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceChangedEvent]
  }
  
  extension [Self <: SourceChangedEvent](x: Self) {
    
    inline def setEvent(value: `source-changed`): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: typingsJapgolly.cloudinaryUploadwidgetBrowser.anon.Source): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
