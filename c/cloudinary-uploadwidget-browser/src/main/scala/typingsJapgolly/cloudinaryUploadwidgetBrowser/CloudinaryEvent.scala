package typingsJapgolly.cloudinaryUploadwidgetBrowser

import typingsJapgolly.cloudinaryUploadwidgetBrowser.anon.All
import typingsJapgolly.cloudinaryUploadwidgetBrowser.anon.File
import typingsJapgolly.cloudinaryUploadwidgetBrowser.anon.Id
import typingsJapgolly.cloudinaryUploadwidgetBrowser.anon.Items
import typingsJapgolly.cloudinaryUploadwidgetBrowser.anon.Reason
import typingsJapgolly.cloudinaryUploadwidgetBrowser.anon.Tags
import typingsJapgolly.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.expanded
import typingsJapgolly.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.hidden
import typingsJapgolly.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.minimized
import typingsJapgolly.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.shown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cloudinaryUploadwidgetBrowser.AbortEvent
  - typingsJapgolly.cloudinaryUploadwidgetBrowser.BatchCancelledEvent
  - typingsJapgolly.cloudinaryUploadwidgetBrowser.CloseEvent
  - typingsJapgolly.cloudinaryUploadwidgetBrowser.DisplayChangedEvent
  - typingsJapgolly.cloudinaryUploadwidgetBrowser.PublicIdEvent
  - typingsJapgolly.cloudinaryUploadwidgetBrowser.QueuesEndEvent
  - typingsJapgolly.cloudinaryUploadwidgetBrowser.QueuesStartEvent
  - typingsJapgolly.cloudinaryUploadwidgetBrowser.RetryEvent
  - typingsJapgolly.cloudinaryUploadwidgetBrowser.ShowCompletedEvent
  - typingsJapgolly.cloudinaryUploadwidgetBrowser.SourceChangedEvent
  - typingsJapgolly.cloudinaryUploadwidgetBrowser.SuccessEvent
  - typingsJapgolly.cloudinaryUploadwidgetBrowser.TagsEvent
  - typingsJapgolly.cloudinaryUploadwidgetBrowser.UploadAddedEvent
*/
trait CloudinaryEvent extends StObject
object CloudinaryEvent {
  
  inline def AbortEvent(info: All): typingsJapgolly.cloudinaryUploadwidgetBrowser.AbortEvent = {
    val __obj = js.Dynamic.literal(event = "abort", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.cloudinaryUploadwidgetBrowser.AbortEvent]
  }
  
  inline def BatchCancelledEvent(info: Reason): typingsJapgolly.cloudinaryUploadwidgetBrowser.BatchCancelledEvent = {
    val __obj = js.Dynamic.literal(event = "batch-cancelled", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.cloudinaryUploadwidgetBrowser.BatchCancelledEvent]
  }
  
  inline def CloseEvent(): typingsJapgolly.cloudinaryUploadwidgetBrowser.CloseEvent = {
    val __obj = js.Dynamic.literal(event = "close")
    __obj.asInstanceOf[typingsJapgolly.cloudinaryUploadwidgetBrowser.CloseEvent]
  }
  
  inline def DisplayChangedEvent(info: shown | hidden | minimized | expanded): typingsJapgolly.cloudinaryUploadwidgetBrowser.DisplayChangedEvent = {
    val __obj = js.Dynamic.literal(event = "display-changed", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.cloudinaryUploadwidgetBrowser.DisplayChangedEvent]
  }
  
  inline def PublicIdEvent(info: Id): typingsJapgolly.cloudinaryUploadwidgetBrowser.PublicIdEvent = {
    val __obj = js.Dynamic.literal(event = "publicid", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.cloudinaryUploadwidgetBrowser.PublicIdEvent]
  }
  
  inline def QueuesEndEvent(info: Any): typingsJapgolly.cloudinaryUploadwidgetBrowser.QueuesEndEvent = {
    val __obj = js.Dynamic.literal(event = "queues-end", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.cloudinaryUploadwidgetBrowser.QueuesEndEvent]
  }
  
  inline def QueuesStartEvent(): typingsJapgolly.cloudinaryUploadwidgetBrowser.QueuesStartEvent = {
    val __obj = js.Dynamic.literal(event = "queues-start")
    __obj.asInstanceOf[typingsJapgolly.cloudinaryUploadwidgetBrowser.QueuesStartEvent]
  }
  
  inline def RetryEvent(info: All): typingsJapgolly.cloudinaryUploadwidgetBrowser.RetryEvent = {
    val __obj = js.Dynamic.literal(event = "retry", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.cloudinaryUploadwidgetBrowser.RetryEvent]
  }
  
  inline def ShowCompletedEvent(info: Items): typingsJapgolly.cloudinaryUploadwidgetBrowser.ShowCompletedEvent = {
    val __obj = js.Dynamic.literal(event = "show-completed", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.cloudinaryUploadwidgetBrowser.ShowCompletedEvent]
  }
  
  inline def SourceChangedEvent(info: typingsJapgolly.cloudinaryUploadwidgetBrowser.anon.Source): typingsJapgolly.cloudinaryUploadwidgetBrowser.SourceChangedEvent = {
    val __obj = js.Dynamic.literal(event = "source-changed", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.cloudinaryUploadwidgetBrowser.SourceChangedEvent]
  }
  
  inline def SuccessEvent(info: Any): typingsJapgolly.cloudinaryUploadwidgetBrowser.SuccessEvent = {
    val __obj = js.Dynamic.literal(event = "success", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.cloudinaryUploadwidgetBrowser.SuccessEvent]
  }
  
  inline def TagsEvent(info: Tags): typingsJapgolly.cloudinaryUploadwidgetBrowser.TagsEvent = {
    val __obj = js.Dynamic.literal(event = "tags", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.cloudinaryUploadwidgetBrowser.TagsEvent]
  }
  
  inline def UploadAddedEvent(info: File): typingsJapgolly.cloudinaryUploadwidgetBrowser.UploadAddedEvent = {
    val __obj = js.Dynamic.literal(event = "upload-added", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.cloudinaryUploadwidgetBrowser.UploadAddedEvent]
  }
}
