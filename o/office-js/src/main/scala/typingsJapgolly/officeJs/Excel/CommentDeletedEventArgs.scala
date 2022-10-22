package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.officeJsStrings.CommentDeleted
import typingsJapgolly.officeJs.officeJsStrings.Local
import typingsJapgolly.officeJs.officeJsStrings.Remote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the comments that raised the comment deleted event.
  *
  * @remarks
  * [Api set: ExcelApi 1.12]
  */
trait CommentDeletedEventArgs extends StObject {
  
  /**
    * Gets the `CommentDetail` array that contains the comment ID and IDs of its related replies.
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
  var `type`: CommentDeleted
  
  /**
    * Gets the ID of the worksheet in which the event happened.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var worksheetId: String
}
object CommentDeletedEventArgs {
  
  inline def apply(commentDetails: js.Array[CommentDetail], source: EventSource | Local | Remote, worksheetId: String): CommentDeletedEventArgs = {
    val __obj = js.Dynamic.literal(commentDetails = commentDetails.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CommentDeleted")
    __obj.asInstanceOf[CommentDeletedEventArgs]
  }
  
  extension [Self <: CommentDeletedEventArgs](x: Self) {
    
    inline def setCommentDetails(value: js.Array[CommentDetail]): Self = StObject.set(x, "commentDetails", value.asInstanceOf[js.Any])
    
    inline def setCommentDetailsVarargs(value: CommentDetail*): Self = StObject.set(x, "commentDetails", js.Array(value*))
    
    inline def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: CommentDeleted): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
