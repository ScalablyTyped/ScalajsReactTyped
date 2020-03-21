package typingsJapgolly.sipJs.coreMod

import typingsJapgolly.sipJs.coreTransportMod.Transport
import typingsJapgolly.sipJs.transactionUserMod.ClientTransactionUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "ClientTransaction")
@js.native
abstract class ClientTransaction protected ()
  extends typingsJapgolly.sipJs.transactionsMod.ClientTransaction {
  protected def this(
    _request: typingsJapgolly.sipJs.messagesMod.OutgoingRequestMessage,
    transport: Transport,
    user: ClientTransactionUser,
    state: typingsJapgolly.sipJs.transactionStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}

/* static members */
@JSImport("sip.js/lib/core", "ClientTransaction")
@js.native
object ClientTransaction extends js.Object {
  var makeId: js.Any = js.native
}

