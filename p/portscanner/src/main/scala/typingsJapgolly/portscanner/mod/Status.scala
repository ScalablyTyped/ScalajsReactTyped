package typingsJapgolly.portscanner.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.portscanner.portscannerStrings.open
  - typingsJapgolly.portscanner.portscannerStrings.closed
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typingsJapgolly.portscanner.portscannerStrings.closed = this.cast("closed")
  @scala.inline
  def open: typingsJapgolly.portscanner.portscannerStrings.open = this.cast("open")
}

