package typingsJapgolly.draftJs.mod.Draft.Model.Constants

import typingsJapgolly.draftJs.draftJsStrings.bold_
import typingsJapgolly.draftJs.draftJsStrings.code_
import typingsJapgolly.draftJs.draftJsStrings.italic_
import typingsJapgolly.draftJs.draftJsStrings.strikethrough_
import typingsJapgolly.draftJs.draftJsStrings.underline_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of editor commands that may be invoked by keyboard commands or UI
  * controls. These commands should map to operations that modify content or
  * selection state and update the editor state accordingly.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.draftJs.draftJsStrings.undo
  - typingsJapgolly.draftJs.draftJsStrings.redo
  - typingsJapgolly.draftJs.draftJsStrings.delete
  - typingsJapgolly.draftJs.draftJsStrings.`delete-word`
  - typingsJapgolly.draftJs.draftJsStrings.backspace
  - typingsJapgolly.draftJs.draftJsStrings.`backspace-word`
  - typingsJapgolly.draftJs.draftJsStrings.`backspace-to-start-of-line`
  - typingsJapgolly.draftJs.draftJsStrings.bold_
  - typingsJapgolly.draftJs.draftJsStrings.code_
  - typingsJapgolly.draftJs.draftJsStrings.italic_
  - typingsJapgolly.draftJs.draftJsStrings.strikethrough_
  - typingsJapgolly.draftJs.draftJsStrings.underline_
  - typingsJapgolly.draftJs.draftJsStrings.`split-block`
  - typingsJapgolly.draftJs.draftJsStrings.`transpose-characters`
  - typingsJapgolly.draftJs.draftJsStrings.`move-selection-to-start-of-block`
  - typingsJapgolly.draftJs.draftJsStrings.`move-selection-to-end-of-block`
  - typingsJapgolly.draftJs.draftJsStrings.`secondary-cut`
  - typingsJapgolly.draftJs.draftJsStrings.`secondary-paste`
*/
trait DraftEditorCommand extends js.Object

object DraftEditorCommand {
  @scala.inline
  def backspace: typingsJapgolly.draftJs.draftJsStrings.backspace = this.cast("backspace")
  @scala.inline
  def `backspace-to-start-of-line`: typingsJapgolly.draftJs.draftJsStrings.`backspace-to-start-of-line` = this.cast("backspace-to-start-of-line")
  @scala.inline
  def `backspace-word`: typingsJapgolly.draftJs.draftJsStrings.`backspace-word` = this.cast("backspace-word")
  @scala.inline
  def bold: bold_ = this.cast("bold")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def code: code_ = this.cast("code")
  @scala.inline
  def delete: typingsJapgolly.draftJs.draftJsStrings.delete = this.cast("delete")
  @scala.inline
  def `delete-word`: typingsJapgolly.draftJs.draftJsStrings.`delete-word` = this.cast("delete-word")
  @scala.inline
  def italic: italic_ = this.cast("italic")
  @scala.inline
  def `move-selection-to-end-of-block`: typingsJapgolly.draftJs.draftJsStrings.`move-selection-to-end-of-block` = this.cast("move-selection-to-end-of-block")
  @scala.inline
  def `move-selection-to-start-of-block`: typingsJapgolly.draftJs.draftJsStrings.`move-selection-to-start-of-block` = this.cast("move-selection-to-start-of-block")
  @scala.inline
  def redo: typingsJapgolly.draftJs.draftJsStrings.redo = this.cast("redo")
  @scala.inline
  def `secondary-cut`: typingsJapgolly.draftJs.draftJsStrings.`secondary-cut` = this.cast("secondary-cut")
  @scala.inline
  def `secondary-paste`: typingsJapgolly.draftJs.draftJsStrings.`secondary-paste` = this.cast("secondary-paste")
  @scala.inline
  def `split-block`: typingsJapgolly.draftJs.draftJsStrings.`split-block` = this.cast("split-block")
  @scala.inline
  def strikethrough: strikethrough_ = this.cast("strikethrough")
  @scala.inline
  def `transpose-characters`: typingsJapgolly.draftJs.draftJsStrings.`transpose-characters` = this.cast("transpose-characters")
  @scala.inline
  def underline: underline_ = this.cast("underline")
  @scala.inline
  def undo: typingsJapgolly.draftJs.draftJsStrings.undo = this.cast("undo")
}

