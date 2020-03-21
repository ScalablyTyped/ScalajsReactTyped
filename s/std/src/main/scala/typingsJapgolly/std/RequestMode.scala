package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.cors
  - typingsJapgolly.std.stdStrings.navigate
  - typingsJapgolly.std.stdStrings.`no-cors`
  - typingsJapgolly.std.stdStrings.`same-origin`
*/
trait RequestMode extends js.Object

object RequestMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cors: typingsJapgolly.std.stdStrings.cors = this.cast("cors")
  @scala.inline
  def navigate: typingsJapgolly.std.stdStrings.navigate = this.cast("navigate")
  @scala.inline
  def `no-cors`: typingsJapgolly.std.stdStrings.`no-cors` = this.cast("no-cors")
  @scala.inline
  def `same-origin`: typingsJapgolly.std.stdStrings.`same-origin` = this.cast("same-origin")
}

