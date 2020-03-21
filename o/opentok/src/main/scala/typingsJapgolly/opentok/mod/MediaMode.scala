package typingsJapgolly.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.opentok.opentokStrings.relayed
  - typingsJapgolly.opentok.opentokStrings.routed
*/
trait MediaMode extends js.Object

object MediaMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def relayed: typingsJapgolly.opentok.opentokStrings.relayed = this.cast("relayed")
  @scala.inline
  def routed: typingsJapgolly.opentok.opentokStrings.routed = this.cast("routed")
}

