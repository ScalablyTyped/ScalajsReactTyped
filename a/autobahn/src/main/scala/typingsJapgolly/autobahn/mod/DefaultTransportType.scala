package typingsJapgolly.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.autobahn.autobahnStrings.websocket
  - typingsJapgolly.autobahn.autobahnStrings.longpoll
  - typingsJapgolly.autobahn.autobahnStrings.rawsocket
*/
trait DefaultTransportType extends js.Object

object DefaultTransportType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def longpoll: typingsJapgolly.autobahn.autobahnStrings.longpoll = this.cast("longpoll")
  @scala.inline
  def rawsocket: typingsJapgolly.autobahn.autobahnStrings.rawsocket = this.cast("rawsocket")
  @scala.inline
  def websocket: typingsJapgolly.autobahn.autobahnStrings.websocket = this.cast("websocket")
}

