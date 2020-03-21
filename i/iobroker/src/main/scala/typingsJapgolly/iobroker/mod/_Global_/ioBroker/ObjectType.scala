package typingsJapgolly.iobroker.mod._Global_.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.iobroker.iobrokerStrings.state
  - typingsJapgolly.iobroker.iobrokerStrings.channel
  - typingsJapgolly.iobroker.iobrokerStrings.device
*/
trait ObjectType extends js.Object

object ObjectType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def channel: typingsJapgolly.iobroker.iobrokerStrings.channel = this.cast("channel")
  @scala.inline
  def device: typingsJapgolly.iobroker.iobrokerStrings.device = this.cast("device")
  @scala.inline
  def state: typingsJapgolly.iobroker.iobrokerStrings.state = this.cast("state")
}

