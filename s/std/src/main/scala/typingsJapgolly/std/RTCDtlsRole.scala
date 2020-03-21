package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.auto
  - typingsJapgolly.std.stdStrings.client
  - typingsJapgolly.std.stdStrings.server
*/
trait RTCDtlsRole extends js.Object

object RTCDtlsRole {
  @scala.inline
  def auto: typingsJapgolly.std.stdStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def client: typingsJapgolly.std.stdStrings.client = this.cast("client")
  @scala.inline
  def server: typingsJapgolly.std.stdStrings.server = this.cast("server")
}

