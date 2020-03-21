package typingsJapgolly.hapiBell.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.hapiBell.hapiBellStrings.plain
  - typingsJapgolly.hapiBell.hapiBellStrings.S256
*/
trait PkceSetting extends js.Object

object PkceSetting {
  @scala.inline
  def S256: typingsJapgolly.hapiBell.hapiBellStrings.S256 = this.cast("S256")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def plain: typingsJapgolly.hapiBell.hapiBellStrings.plain = this.cast("plain")
}

