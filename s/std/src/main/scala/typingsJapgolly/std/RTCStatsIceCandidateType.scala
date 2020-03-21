package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.host
  - typingsJapgolly.std.stdStrings.peerreflexive
  - typingsJapgolly.std.stdStrings.relayed
  - typingsJapgolly.std.stdStrings.serverreflexive
*/
trait RTCStatsIceCandidateType extends js.Object

object RTCStatsIceCandidateType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def host: typingsJapgolly.std.stdStrings.host = this.cast("host")
  @scala.inline
  def peerreflexive: typingsJapgolly.std.stdStrings.peerreflexive = this.cast("peerreflexive")
  @scala.inline
  def relayed: typingsJapgolly.std.stdStrings.relayed = this.cast("relayed")
  @scala.inline
  def serverreflexive: typingsJapgolly.std.stdStrings.serverreflexive = this.cast("serverreflexive")
}

