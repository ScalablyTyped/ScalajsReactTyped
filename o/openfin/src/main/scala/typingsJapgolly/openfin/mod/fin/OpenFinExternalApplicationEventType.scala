package typingsJapgolly.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.openfin.openfinStrings.connected
  - typingsJapgolly.openfin.openfinStrings.disconnected
*/
trait OpenFinExternalApplicationEventType extends js.Object

object OpenFinExternalApplicationEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typingsJapgolly.openfin.openfinStrings.connected = this.cast("connected")
  @scala.inline
  def disconnected: typingsJapgolly.openfin.openfinStrings.disconnected = this.cast("disconnected")
}

