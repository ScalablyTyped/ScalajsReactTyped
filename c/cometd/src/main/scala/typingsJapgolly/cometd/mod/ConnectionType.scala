package typingsJapgolly.cometd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cometd.cometdStrings.`long-polling`
  - typingsJapgolly.cometd.cometdStrings.`callback-polling`
  - typingsJapgolly.cometd.cometdStrings.iframe
  - typingsJapgolly.cometd.cometdStrings.flash
*/
trait ConnectionType extends js.Object

object ConnectionType {
  @scala.inline
  def `callback-polling`: typingsJapgolly.cometd.cometdStrings.`callback-polling` = this.cast("callback-polling")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def flash: typingsJapgolly.cometd.cometdStrings.flash = this.cast("flash")
  @scala.inline
  def iframe: typingsJapgolly.cometd.cometdStrings.iframe = this.cast("iframe")
  @scala.inline
  def `long-polling`: typingsJapgolly.cometd.cometdStrings.`long-polling` = this.cast("long-polling")
}

