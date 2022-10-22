package typingsJapgolly.officeJsPreview.Word

import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.CommentAdded
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.CommentChanged
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.CommentDeleted
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.CommentDeselected
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.CommentSelected
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ContentControlAdded
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ContentControlDataChanged
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ContentControlDeleted
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ContentControlSelectionChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the content control that raised an event.
  *
  * @remarks
  * [Api set: WordApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait ContentControlEventArgs extends StObject {
  
  /**
    * The object that raised the event. Load this object to get its properties.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var contentControl: ContentControl
  
  /**
    * The event type. See Word.EventType for details.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var eventType: EventType | ContentControlDeleted | ContentControlSelectionChanged | ContentControlDataChanged | ContentControlAdded | CommentDeleted | CommentSelected | CommentDeselected | CommentChanged | CommentAdded
}
object ContentControlEventArgs {
  
  inline def apply(
    contentControl: ContentControl,
    eventType: EventType | ContentControlDeleted | ContentControlSelectionChanged | ContentControlDataChanged | ContentControlAdded | CommentDeleted | CommentSelected | CommentDeselected | CommentChanged | CommentAdded
  ): ContentControlEventArgs = {
    val __obj = js.Dynamic.literal(contentControl = contentControl.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentControlEventArgs]
  }
  
  extension [Self <: ContentControlEventArgs](x: Self) {
    
    inline def setContentControl(value: ContentControl): Self = StObject.set(x, "contentControl", value.asInstanceOf[js.Any])
    
    inline def setEventType(
      value: EventType | ContentControlDeleted | ContentControlSelectionChanged | ContentControlDataChanged | ContentControlAdded | CommentDeleted | CommentSelected | CommentDeselected | CommentChanged | CommentAdded
    ): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
  }
}
