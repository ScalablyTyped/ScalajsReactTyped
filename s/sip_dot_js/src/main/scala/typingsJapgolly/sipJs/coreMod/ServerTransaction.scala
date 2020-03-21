package typingsJapgolly.sipJs.coreMod

import typingsJapgolly.sipJs.coreTransportMod.Transport
import typingsJapgolly.sipJs.transactionUserMod.ServerTransactionUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "ServerTransaction")
@js.native
abstract class ServerTransaction protected ()
  extends typingsJapgolly.sipJs.transactionsMod.ServerTransaction {
  protected def this(
    _request: typingsJapgolly.sipJs.messagesMod.IncomingRequestMessage,
    transport: Transport,
    user: ServerTransactionUser,
    state: typingsJapgolly.sipJs.transactionStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}

