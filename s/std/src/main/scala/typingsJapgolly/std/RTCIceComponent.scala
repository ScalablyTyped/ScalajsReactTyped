package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.rtcp
  - typingsJapgolly.std.stdStrings.rtp
*/
trait RTCIceComponent extends js.Object

object RTCIceComponent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def rtcp: typingsJapgolly.std.stdStrings.rtcp = this.cast("rtcp")
  @scala.inline
  def rtp: typingsJapgolly.std.stdStrings.rtp = this.cast("rtp")
}

