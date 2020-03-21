package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.activated
  - typingsJapgolly.std.stdStrings.activating
  - typingsJapgolly.std.stdStrings.installed
  - typingsJapgolly.std.stdStrings.installing
  - typingsJapgolly.std.stdStrings.parsed
  - typingsJapgolly.std.stdStrings.redundant
*/
trait ServiceWorkerState extends js.Object

object ServiceWorkerState {
  @scala.inline
  def activated: typingsJapgolly.std.stdStrings.activated = this.cast("activated")
  @scala.inline
  def activating: typingsJapgolly.std.stdStrings.activating = this.cast("activating")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def installed: typingsJapgolly.std.stdStrings.installed = this.cast("installed")
  @scala.inline
  def installing: typingsJapgolly.std.stdStrings.installing = this.cast("installing")
  @scala.inline
  def parsed: typingsJapgolly.std.stdStrings.parsed = this.cast("parsed")
  @scala.inline
  def redundant: typingsJapgolly.std.stdStrings.redundant = this.cast("redundant")
}

