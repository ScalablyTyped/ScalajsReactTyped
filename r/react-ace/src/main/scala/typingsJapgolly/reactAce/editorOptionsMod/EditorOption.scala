package typingsJapgolly.reactAce.editorOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactAce.reactAceStrings.minLines
  - typingsJapgolly.reactAce.reactAceStrings.maxLines
  - typingsJapgolly.reactAce.reactAceStrings.readOnly
  - typingsJapgolly.reactAce.reactAceStrings.highlightActiveLine
  - typingsJapgolly.reactAce.reactAceStrings.tabSize
  - typingsJapgolly.reactAce.reactAceStrings.enableBasicAutocompletion
  - typingsJapgolly.reactAce.reactAceStrings.enableLiveAutocompletion
  - typingsJapgolly.reactAce.reactAceStrings.enableSnippets
*/
trait EditorOption extends js.Object

object EditorOption {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def enableBasicAutocompletion: typingsJapgolly.reactAce.reactAceStrings.enableBasicAutocompletion = this.cast("enableBasicAutocompletion")
  @scala.inline
  def enableLiveAutocompletion: typingsJapgolly.reactAce.reactAceStrings.enableLiveAutocompletion = this.cast("enableLiveAutocompletion")
  @scala.inline
  def enableSnippets: typingsJapgolly.reactAce.reactAceStrings.enableSnippets = this.cast("enableSnippets")
  @scala.inline
  def highlightActiveLine: typingsJapgolly.reactAce.reactAceStrings.highlightActiveLine = this.cast("highlightActiveLine")
  @scala.inline
  def maxLines: typingsJapgolly.reactAce.reactAceStrings.maxLines = this.cast("maxLines")
  @scala.inline
  def minLines: typingsJapgolly.reactAce.reactAceStrings.minLines = this.cast("minLines")
  @scala.inline
  def readOnly: typingsJapgolly.reactAce.reactAceStrings.readOnly = this.cast("readOnly")
  @scala.inline
  def tabSize: typingsJapgolly.reactAce.reactAceStrings.tabSize = this.cast("tabSize")
}

