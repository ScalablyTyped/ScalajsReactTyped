package typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The location of requested edges.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.top
  - typingsJapgolly.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.topLine
  - typingsJapgolly.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.bottom
*/
trait EdgeLocation extends js.Object

object EdgeLocation {
  @scala.inline
  def bottom: typingsJapgolly.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def top: typingsJapgolly.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.top = this.cast("top")
  @scala.inline
  def topLine: typingsJapgolly.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.topLine = this.cast("topLine")
}

