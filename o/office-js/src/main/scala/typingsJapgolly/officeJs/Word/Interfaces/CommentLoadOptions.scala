package typingsJapgolly.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a comment in the document.
  *
  * @remarks
  * [Api set: WordApi 1.4]
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
    * [Api set: WordApi 1.4]
    */
  var authorEmail: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the name of the comment's author.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var authorName: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the comment's content as plain text.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var content: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the comment's content range.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var contentRange: js.UndefOr[CommentContentRangeLoadOptions] = js.undefined
  
  /**
    * Gets the creation date of the comment.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var creationDate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the ID of the comment.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the comment thread's status. Setting to true resolves the comment thread. Getting a value of true means that the comment thread is resolved.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var resolved: js.UndefOr[Boolean] = js.undefined
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
    
    inline def setContentRange(value: CommentContentRangeLoadOptions): Self = StObject.set(x, "contentRange", value.asInstanceOf[js.Any])
    
    inline def setContentRangeUndefined: Self = StObject.set(x, "contentRange", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setCreationDate(value: Boolean): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setResolved(value: Boolean): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    
    inline def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
  }
}
