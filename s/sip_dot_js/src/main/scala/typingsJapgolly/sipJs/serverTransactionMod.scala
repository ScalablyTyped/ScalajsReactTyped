package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.coreTransportMod.Transport
import typingsJapgolly.sipJs.messagesMod.IncomingRequestMessage
import typingsJapgolly.sipJs.transactionMod.Transaction
import typingsJapgolly.sipJs.transactionStateMod.TransactionState
import typingsJapgolly.sipJs.transactionUserMod.ServerTransactionUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/transactions/server-transaction", JSImport.Namespace)
@js.native
object serverTransactionMod extends js.Object {
  @js.native
  abstract class ServerTransaction protected () extends Transaction {
    protected def this(
      _request: IncomingRequestMessage,
      transport: Transport,
      user: ServerTransactionUser,
      state: TransactionState,
      loggerCategory: String
    ) = this()
    var _request: js.Any = js.native
    /** The incoming request the transaction handling. */
    val request: IncomingRequestMessage = js.native
    var user: ServerTransactionUser = js.native
    /**
      * Receive incoming requests from the transport which match this transaction.
      * @param request - The incoming request.
      */
    def receiveRequest(request: IncomingRequestMessage): Unit = js.native
    /**
      * Receive outgoing responses to this request from the transaction user.
      * Responses will be delivered to the transport as necessary.
      * @param statusCode - Response status code.
      * @param response - Response.
      */
    def receiveResponse(statusCode: Double, response: String): Unit = js.native
  }
  
}

