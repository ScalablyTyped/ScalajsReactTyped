package typingsJapgolly.googleAppsScript.GoogleAppsScript.Document

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.BlobSource
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Position extends js.Object {
  def getElement(): Element
  def getOffset(): Integer
  def getSurroundingText(): Text
  def getSurroundingTextOffset(): Integer
  def insertBookmark(): Bookmark
  def insertInlineImage(image: BlobSource): InlineImage
  def insertText(text: String): Text
}

object Position {
  @scala.inline
  def apply(
    getElement: CallbackTo[Element],
    getOffset: CallbackTo[Integer],
    getSurroundingText: CallbackTo[Text],
    getSurroundingTextOffset: CallbackTo[Integer],
    insertBookmark: CallbackTo[Bookmark],
    insertInlineImage: BlobSource => CallbackTo[InlineImage],
    insertText: String => CallbackTo[Text]
  ): Position = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getElement")(getElement.toJsFn)
    __obj.updateDynamic("getOffset")(getOffset.toJsFn)
    __obj.updateDynamic("getSurroundingText")(getSurroundingText.toJsFn)
    __obj.updateDynamic("getSurroundingTextOffset")(getSurroundingTextOffset.toJsFn)
    __obj.updateDynamic("insertBookmark")(insertBookmark.toJsFn)
    __obj.updateDynamic("insertInlineImage")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.BlobSource) => insertInlineImage(t0).runNow()))
    __obj.updateDynamic("insertText")(js.Any.fromFunction1((t0: java.lang.String) => insertText(t0).runNow()))
    __obj.asInstanceOf[Position]
  }
}

