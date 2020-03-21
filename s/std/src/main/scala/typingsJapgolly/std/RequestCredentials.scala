package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.include
  - typingsJapgolly.std.stdStrings.omit
  - typingsJapgolly.std.stdStrings.`same-origin`
*/
trait RequestCredentials extends js.Object

object RequestCredentials {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def include: typingsJapgolly.std.stdStrings.include = this.cast("include")
  @scala.inline
  def omit: typingsJapgolly.std.stdStrings.omit = this.cast("omit")
  @scala.inline
  def `same-origin`: typingsJapgolly.std.stdStrings.`same-origin` = this.cast("same-origin")
}

