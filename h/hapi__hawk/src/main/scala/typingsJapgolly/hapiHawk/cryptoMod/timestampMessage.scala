package typingsJapgolly.hapiHawk.cryptoMod

import typingsJapgolly.hapiHawk.clientMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hawk/lib/crypto", "timestampMessage")
@js.native
object timestampMessage extends js.Object {
  def apply(credentials: Credentials, localtimeOffsetMsec: Double): TimestampMessage_ = js.native
}

