package typingsJapgolly.reactSketchapp.propsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactSketchapp.reactSketchappStrings.normal
  - typingsJapgolly.reactSketchapp.reactSketchappStrings.italic
  - typingsJapgolly.reactSketchapp.reactSketchappStrings.oblique
*/
trait FontStyle extends js.Object

object FontStyle {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def italic: typingsJapgolly.reactSketchapp.reactSketchappStrings.italic = this.cast("italic")
  @scala.inline
  def normal: typingsJapgolly.reactSketchapp.reactSketchappStrings.normal = this.cast("normal")
  @scala.inline
  def oblique: typingsJapgolly.reactSketchapp.reactSketchappStrings.oblique = this.cast("oblique")
}

