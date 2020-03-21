package typingsJapgolly.sarif.mod.Suppression

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sarif.sarifStrings.inSource
  - typingsJapgolly.sarif.sarifStrings.external
*/
trait kind extends js.Object

object kind {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def external: typingsJapgolly.sarif.sarifStrings.external = this.cast("external")
  @scala.inline
  def inSource: typingsJapgolly.sarif.sarifStrings.inSource = this.cast("inSource")
}

