package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.back_forward
  - typingsJapgolly.std.stdStrings.navigate
  - typingsJapgolly.std.stdStrings.prerender
  - typingsJapgolly.std.stdStrings.reload
*/
trait NavigationType extends js.Object

object NavigationType {
  @scala.inline
  def back_forward: typingsJapgolly.std.stdStrings.back_forward = this.cast("back_forward")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def navigate: typingsJapgolly.std.stdStrings.navigate = this.cast("navigate")
  @scala.inline
  def prerender: typingsJapgolly.std.stdStrings.prerender = this.cast("prerender")
  @scala.inline
  def reload: typingsJapgolly.std.stdStrings.reload = this.cast("reload")
}

