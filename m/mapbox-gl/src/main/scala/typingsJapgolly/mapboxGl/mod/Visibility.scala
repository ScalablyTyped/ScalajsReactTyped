package typingsJapgolly.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mapboxGl.mapboxGlStrings.visible
  - typingsJapgolly.mapboxGl.mapboxGlStrings.none
*/
trait Visibility extends js.Object

object Visibility {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsJapgolly.mapboxGl.mapboxGlStrings.none = this.cast("none")
  @scala.inline
  def visible: typingsJapgolly.mapboxGl.mapboxGlStrings.visible = this.cast("visible")
}

