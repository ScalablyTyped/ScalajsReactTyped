package typingsJapgolly.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a comment in the workbook.
  *
  * @remarks
  * [Api set: ExcelApi 1.10]
  */
trait CommentLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the email of the comment's author.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var authorEmail: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the name of the comment's author.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var authorName: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The comment's content. The string is plain text.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var content: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the content type of the comment.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var contentType: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the creation time of the comment. Returns `null` if the comment was converted from a note, since the comment does not have a creation date.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var creationDate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the comment identifier.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the entities (e.g., people) that are mentioned in comments.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  var mentions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The comment thread status. A value of `true` means that the comment thread is resolved.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  var resolved: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the rich comment content (e.g., mentions in comments). This string is not meant to be displayed to end-users. Your add-in should only use this to parse rich comment content.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  var richContent: js.UndefOr[Boolean] = js.undefined
}
object CommentLoadOptions {
  
  inline def apply(): CommentLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentLoadOptions]
  }
  
  extension [Self <: CommentLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setAuthorEmail(value: Boolean): Self = StObject.set(x, "authorEmail", value.asInstanceOf[js.Any])
    
    inline def setAuthorEmailUndefined: Self = StObject.set(x, "authorEmail", js.undefined)
    
    inline def setAuthorName(value: Boolean): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
    
    inline def setAuthorNameUndefined: Self = StObject.set(x, "authorName", js.undefined)
    
    inline def setContent(value: Boolean): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: Boolean): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setCreationDate(value: Boolean): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMentions(value: Boolean): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
    
    inline def setMentionsUndefined: Self = StObject.set(x, "mentions", js.undefined)
    
    inline def setResolved(value: Boolean): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    
    inline def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
    
    inline def setRichContent(value: Boolean): Self = StObject.set(x, "richContent", value.asInstanceOf[js.Any])
    
    inline def setRichContentUndefined: Self = StObject.set(x, "richContent", js.undefined)
  }
}
