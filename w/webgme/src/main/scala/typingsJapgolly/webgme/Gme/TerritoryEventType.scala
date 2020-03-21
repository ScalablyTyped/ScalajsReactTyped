package typingsJapgolly.webgme.Gme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webgme.webgmeStrings.load
  - typingsJapgolly.webgme.webgmeStrings.unload
  - typingsJapgolly.webgme.webgmeStrings.update
  - typingsJapgolly.webgme.webgmeStrings.complete
  - typingsJapgolly.webgme.webgmeStrings.incomplete
*/
trait TerritoryEventType extends js.Object

object TerritoryEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsJapgolly.webgme.webgmeStrings.complete = this.cast("complete")
  @scala.inline
  def incomplete: typingsJapgolly.webgme.webgmeStrings.incomplete = this.cast("incomplete")
  @scala.inline
  def load: typingsJapgolly.webgme.webgmeStrings.load = this.cast("load")
  @scala.inline
  def unload: typingsJapgolly.webgme.webgmeStrings.unload = this.cast("unload")
  @scala.inline
  def update: typingsJapgolly.webgme.webgmeStrings.update = this.cast("update")
}

