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
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Local
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Remote
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.edited
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.none_
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.reopened
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.replyAdded_
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.replyDeleted_
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.replyEdited_
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.resolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the comments that raised the comment event.
  *
  * @remarks
  * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
  * @beta
  */
trait CommentEventArgs extends StObject {
  
  /**
    * Represents how the comment changed event is triggered.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  var changeType: CommentChangeType | none_ | edited | resolved | reopened | replyAdded_ | replyDeleted_ | replyEdited_
  
  /**
    * Gets the CommentDetail array which contains the IDs and reply IDs of the involved comments.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  var commentDetails: js.Array[CommentDetail]
  
  /**
    * The source of the event. It can be local or remote (through coauthoring).
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  var source: EventSource | Local | Remote
  
  /**
    * The event type. See Word.EventType for details.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: EventType | ContentControlDeleted | ContentControlSelectionChanged | ContentControlDataChanged | ContentControlAdded | CommentDeleted | CommentSelected | CommentDeselected | CommentChanged | CommentAdded
}
object CommentEventArgs {
  
  inline def apply(
    changeType: CommentChangeType | none_ | edited | resolved | reopened | replyAdded_ | replyDeleted_ | replyEdited_,
    commentDetails: js.Array[CommentDetail],
    source: EventSource | Local | Remote,
    `type`: EventType | ContentControlDeleted | ContentControlSelectionChanged | ContentControlDataChanged | ContentControlAdded | CommentDeleted | CommentSelected | CommentDeselected | CommentChanged | CommentAdded
  ): CommentEventArgs = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], commentDetails = commentDetails.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentEventArgs]
  }
  
  extension [Self <: CommentEventArgs](x: Self) {
    
    inline def setChangeType(
      value: CommentChangeType | none_ | edited | resolved | reopened | replyAdded_ | replyDeleted_ | replyEdited_
    ): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setCommentDetails(value: js.Array[CommentDetail]): Self = StObject.set(x, "commentDetails", value.asInstanceOf[js.Any])
    
    inline def setCommentDetailsVarargs(value: CommentDetail*): Self = StObject.set(x, "commentDetails", js.Array(value*))
    
    inline def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(
      value: EventType | ContentControlDeleted | ContentControlSelectionChanged | ContentControlDataChanged | ContentControlAdded | CommentDeleted | CommentSelected | CommentDeselected | CommentChanged | CommentAdded
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
