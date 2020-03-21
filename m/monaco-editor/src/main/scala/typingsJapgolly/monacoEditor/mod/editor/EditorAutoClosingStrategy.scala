package typingsJapgolly.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.monacoEditor.monacoEditorStrings.always
  - typingsJapgolly.monacoEditor.monacoEditorStrings.languageDefined
  - typingsJapgolly.monacoEditor.monacoEditorStrings.beforeWhitespace
  - typingsJapgolly.monacoEditor.monacoEditorStrings.never
*/
trait EditorAutoClosingStrategy extends js.Object

object EditorAutoClosingStrategy {
  @scala.inline
  def always: typingsJapgolly.monacoEditor.monacoEditorStrings.always = this.cast("always")
  @scala.inline
  def beforeWhitespace: typingsJapgolly.monacoEditor.monacoEditorStrings.beforeWhitespace = this.cast("beforeWhitespace")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def languageDefined: typingsJapgolly.monacoEditor.monacoEditorStrings.languageDefined = this.cast("languageDefined")
  @scala.inline
  def never: typingsJapgolly.monacoEditor.monacoEditorStrings.never = this.cast("never")
}

