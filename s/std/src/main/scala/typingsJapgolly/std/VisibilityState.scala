package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.hidden
  - typings.std.stdStrings.visible
  - typings.std.stdStrings.prerender
*/
trait VisibilityState extends js.Object

object VisibilityState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hidden: typingsJapgolly.std.stdStrings.hidden = this.cast("hidden")
  @scala.inline
  def prerender: typingsJapgolly.std.stdStrings.prerender = this.cast("prerender")
  @scala.inline
  def visible: typingsJapgolly.std.stdStrings.visible = this.cast("visible")
}

