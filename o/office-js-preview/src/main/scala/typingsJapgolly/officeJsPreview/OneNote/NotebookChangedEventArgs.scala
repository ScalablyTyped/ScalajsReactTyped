package typingsJapgolly.officeJsPreview.OneNote

import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.NotebookChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the binding that raised the DataChanged event
  *
  * [Api set: OneNoteApi 1.1]
  */
trait NotebookChangedEventArgs extends js.Object {
  /**
    *
    * Notebook id before change
    *
    * [Api set: OneNoteApi 1.3]
    */
  var oldId: String
  /**
    *
    * Gets the type of the event. See EventType for details.
    *
    * [Api set: OneNoteApi 1.3]
    */
  var `type`: NotebookChanged
}

object NotebookChangedEventArgs {
  @scala.inline
  def apply(oldId: String, `type`: NotebookChanged): NotebookChangedEventArgs = {
    val __obj = js.Dynamic.literal(oldId = oldId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookChangedEventArgs]
  }
}

