package typingsJapgolly.googleAppsScript.GoogleAppsScript.Document

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.BlobSource
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference to a location in the document, relative to a specific element. The user's cursor is
  * represented as a Position, among other uses. Scripts can only access the cursor of the
  * user who is running the script, and only if the script is bound to the document.
  *
  *     // Insert some text at the cursor position and make it bold.
  *     var cursor = DocumentApp.getActiveDocument().getCursor();
  *     if (cursor) {
  *       // Attempt to insert text at the cursor position. If the insertion returns null, the cursor's
  *       // containing element doesn't allow insertions, so show the user an error message.
  *       var element = cursor.insertText('ಠ‿ಠ');
  *       if (element) {
  *         element.setBold(true);
  *       } else {
  *         DocumentApp.getUi().alert('Cannot insert text here.');
  *       }
  *     } else {
  *       DocumentApp.getUi().alert('Cannot find a cursor.');
  *     }
  */
trait Position extends StObject {
  
  def getElement(): Element
  
  def getOffset(): Integer
  
  def getSurroundingText(): Text
  
  def getSurroundingTextOffset(): Integer
  
  def insertBookmark(): Bookmark
  
  def insertInlineImage(image: BlobSource): InlineImage
  
  def insertText(text: String): Text
}
object Position {
  
  inline def apply(
    getElement: CallbackTo[Element],
    getOffset: CallbackTo[Integer],
    getSurroundingText: CallbackTo[Text],
    getSurroundingTextOffset: CallbackTo[Integer],
    insertBookmark: CallbackTo[Bookmark],
    insertInlineImage: BlobSource => InlineImage,
    insertText: String => Text
  ): Position = {
    val __obj = js.Dynamic.literal(getElement = getElement.toJsFn, getOffset = getOffset.toJsFn, getSurroundingText = getSurroundingText.toJsFn, getSurroundingTextOffset = getSurroundingTextOffset.toJsFn, insertBookmark = insertBookmark.toJsFn, insertInlineImage = js.Any.fromFunction1(insertInlineImage), insertText = js.Any.fromFunction1(insertText))
    __obj.asInstanceOf[Position]
  }
  
  extension [Self <: Position](x: Self) {
    
    inline def setGetElement(value: CallbackTo[Element]): Self = StObject.set(x, "getElement", value.toJsFn)
    
    inline def setGetOffset(value: CallbackTo[Integer]): Self = StObject.set(x, "getOffset", value.toJsFn)
    
    inline def setGetSurroundingText(value: CallbackTo[Text]): Self = StObject.set(x, "getSurroundingText", value.toJsFn)
    
    inline def setGetSurroundingTextOffset(value: CallbackTo[Integer]): Self = StObject.set(x, "getSurroundingTextOffset", value.toJsFn)
    
    inline def setInsertBookmark(value: CallbackTo[Bookmark]): Self = StObject.set(x, "insertBookmark", value.toJsFn)
    
    inline def setInsertInlineImage(value: BlobSource => InlineImage): Self = StObject.set(x, "insertInlineImage", js.Any.fromFunction1(value))
    
    inline def setInsertText(value: String => Text): Self = StObject.set(x, "insertText", js.Any.fromFunction1(value))
  }
}
