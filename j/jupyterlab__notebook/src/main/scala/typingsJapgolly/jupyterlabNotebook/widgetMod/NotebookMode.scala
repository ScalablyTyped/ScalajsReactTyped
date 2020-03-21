package typingsJapgolly.jupyterlabNotebook.widgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jupyterlabNotebook.jupyterlabNotebookStrings.command
  - typingsJapgolly.jupyterlabNotebook.jupyterlabNotebookStrings.edit
*/
trait NotebookMode extends js.Object

object NotebookMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def command: typingsJapgolly.jupyterlabNotebook.jupyterlabNotebookStrings.command = this.cast("command")
  @scala.inline
  def edit: typingsJapgolly.jupyterlabNotebook.jupyterlabNotebookStrings.edit = this.cast("edit")
}

