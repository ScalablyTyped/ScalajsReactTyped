package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.officeJsStrings.CommentChanged
import typingsJapgolly.officeJs.officeJsStrings.CommentEdited
import typingsJapgolly.officeJs.officeJsStrings.CommentReopened
import typingsJapgolly.officeJs.officeJsStrings.CommentResolved
import typingsJapgolly.officeJs.officeJsStrings.Local
import typingsJapgolly.officeJs.officeJsStrings.Remote
import typingsJapgolly.officeJs.officeJsStrings.ReplyAdded
import typingsJapgolly.officeJs.officeJsStrings.ReplyDeleted
import typingsJapgolly.officeJs.officeJsStrings.ReplyEdited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Occurs when existing comments are changed.
  *
  * @remarks
  * [Api set: ExcelApi 1.12]
  */
trait CommentChangedEventArgs extends StObject {
  
  /**
    * Gets the change type that represents how the changed event is triggered.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var changeType: CommentChangeType | CommentEdited | CommentResolved | CommentReopened | ReplyAdded | ReplyDeleted | ReplyEdited
  
  /**
    * Get the `CommentDetail` array which contains the comment ID and IDs of its related replies.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var commentDetails: js.Array[CommentDetail]
  
  /**
    * Specifies the source of the event. See `Excel.EventSource` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var source: EventSource | Local | Remote
  
  /**
    * Gets the type of the event. See `Excel.EventType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var `type`: CommentChanged
  
  /**
    * Gets the ID of the worksheet in which the event happened.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var worksheetId: String
}
object CommentChangedEventArgs {
  
  inline def apply(
    changeType: CommentChangeType | CommentEdited | CommentResolved | CommentReopened | ReplyAdded | ReplyDeleted | ReplyEdited,
    commentDetails: js.Array[CommentDetail],
    source: EventSource | Local | Remote,
    worksheetId: String
  ): CommentChangedEventArgs = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], commentDetails = commentDetails.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CommentChanged")
    __obj.asInstanceOf[CommentChangedEventArgs]
  }
  
  extension [Self <: CommentChangedEventArgs](x: Self) {
    
    inline def setChangeType(
      value: CommentChangeType | CommentEdited | CommentResolved | CommentReopened | ReplyAdded | ReplyDeleted | ReplyEdited
    ): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setCommentDetails(value: js.Array[CommentDetail]): Self = StObject.set(x, "commentDetails", value.asInstanceOf[js.Any])
    
    inline def setCommentDetailsVarargs(value: CommentDetail*): Self = StObject.set(x, "commentDetails", js.Array(value*))
    
    inline def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: CommentChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
