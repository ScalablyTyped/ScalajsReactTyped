package typingsJapgolly.prompts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.prompts.promptsStrings.text
  - typingsJapgolly.prompts.promptsStrings.password
  - typingsJapgolly.prompts.promptsStrings.invisible
  - typingsJapgolly.prompts.promptsStrings.number
  - typingsJapgolly.prompts.promptsStrings.confirm
  - typingsJapgolly.prompts.promptsStrings.list
  - typingsJapgolly.prompts.promptsStrings.toggle
  - typingsJapgolly.prompts.promptsStrings.select
  - typingsJapgolly.prompts.promptsStrings.multiselect
  - typingsJapgolly.prompts.promptsStrings.autocomplete
  - typingsJapgolly.prompts.promptsStrings.date
  - typingsJapgolly.prompts.promptsStrings.autocompleteMultiselect
*/
trait PromptType extends js.Object

object PromptType {
  @scala.inline
  def autocomplete: typingsJapgolly.prompts.promptsStrings.autocomplete = this.cast("autocomplete")
  @scala.inline
  def autocompleteMultiselect: typingsJapgolly.prompts.promptsStrings.autocompleteMultiselect = this.cast("autocompleteMultiselect")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def confirm: typingsJapgolly.prompts.promptsStrings.confirm = this.cast("confirm")
  @scala.inline
  def date: typingsJapgolly.prompts.promptsStrings.date = this.cast("date")
  @scala.inline
  def invisible: typingsJapgolly.prompts.promptsStrings.invisible = this.cast("invisible")
  @scala.inline
  def list: typingsJapgolly.prompts.promptsStrings.list = this.cast("list")
  @scala.inline
  def multiselect: typingsJapgolly.prompts.promptsStrings.multiselect = this.cast("multiselect")
  @scala.inline
  def number: typingsJapgolly.prompts.promptsStrings.number = this.cast("number")
  @scala.inline
  def password: typingsJapgolly.prompts.promptsStrings.password = this.cast("password")
  @scala.inline
  def select: typingsJapgolly.prompts.promptsStrings.select = this.cast("select")
  @scala.inline
  def text: typingsJapgolly.prompts.promptsStrings.text = this.cast("text")
  @scala.inline
  def toggle: typingsJapgolly.prompts.promptsStrings.toggle = this.cast("toggle")
}

