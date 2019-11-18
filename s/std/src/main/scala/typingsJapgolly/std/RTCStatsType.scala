package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.inboundrtp
  - typings.std.stdStrings.outboundrtp
  - typings.std.stdStrings.session
  - typings.std.stdStrings.datachannel
  - typings.std.stdStrings.track
  - typings.std.stdStrings.transport
  - typings.std.stdStrings.candidatepair
  - typings.std.stdStrings.localcandidate
  - typings.std.stdStrings.remotecandidate
*/
trait RTCStatsType extends js.Object

object RTCStatsType {
  @scala.inline
  def candidatepair: typingsJapgolly.std.stdStrings.candidatepair = this.cast("candidatepair")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def datachannel: typingsJapgolly.std.stdStrings.datachannel = this.cast("datachannel")
  @scala.inline
  def inboundrtp: typingsJapgolly.std.stdStrings.inboundrtp = this.cast("inboundrtp")
  @scala.inline
  def localcandidate: typingsJapgolly.std.stdStrings.localcandidate = this.cast("localcandidate")
  @scala.inline
  def outboundrtp: typingsJapgolly.std.stdStrings.outboundrtp = this.cast("outboundrtp")
  @scala.inline
  def remotecandidate: typingsJapgolly.std.stdStrings.remotecandidate = this.cast("remotecandidate")
  @scala.inline
  def session: typingsJapgolly.std.stdStrings.session = this.cast("session")
  @scala.inline
  def track: typingsJapgolly.std.stdStrings.track = this.cast("track")
  @scala.inline
  def transport: typingsJapgolly.std.stdStrings.transport = this.cast("transport")
}

