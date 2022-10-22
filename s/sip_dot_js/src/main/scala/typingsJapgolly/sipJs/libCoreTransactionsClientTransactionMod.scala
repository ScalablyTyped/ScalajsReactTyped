package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.libCoreMessagesMod.IncomingResponseMessage
import typingsJapgolly.sipJs.libCoreMessagesMod.OutgoingRequestMessage
import typingsJapgolly.sipJs.libCoreTransactionsTransactionMod.Transaction
import typingsJapgolly.sipJs.libCoreTransactionsTransactionStateMod.TransactionState
import typingsJapgolly.sipJs.libCoreTransactionsTransactionUserMod.ClientTransactionUser
import typingsJapgolly.sipJs.libCoreTransportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreTransactionsClientTransactionMod {
  
  /* note: abstract class */ @JSImport("sip.js/lib/core/transactions/client-transaction", "ClientTransaction")
  @js.native
  open class ClientTransaction protected () extends Transaction {
    /* protected */ def this(
      _request: OutgoingRequestMessage,
      transport: Transport,
      user: ClientTransactionUser,
      state: TransactionState,
      loggerCategory: String
    ) = this()
    
    /* private */ var _request: Any = js.native
    
    /**
      * A 408 to non-INVITE will always arrive too late to be useful ([3]),
      * The client already has full knowledge of the timeout. The only
      * information this message would convey is whether or not the server
      * believed the transaction timed out. However, with the current design
      * of the NIT, a client cannot do anything with this knowledge. Thus,
      * the 408 is simply wasting network resources and contributes to the
      * response bombardment illustrated in [3].
      * https://tools.ietf.org/html/rfc4320#section-4.1
      */
    /* protected */ def onRequestTimeout(): Unit = js.native
    
    /**
      * Receive incoming responses from the transport which match this transaction.
      * Responses will be delivered to the transaction user as necessary.
      * @param response - The incoming response.
      */
    def receiveResponse(response: IncomingResponseMessage): Unit = js.native
    
    /** The outgoing request the transaction handling. */
    def request: OutgoingRequestMessage = js.native
    
    /* protected */ var user: ClientTransactionUser = js.native
  }
  /* static members */
  object ClientTransaction {
    
    @JSImport("sip.js/lib/core/transactions/client-transaction", "ClientTransaction")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sip.js/lib/core/transactions/client-transaction", "ClientTransaction.makeId")
    @js.native
    def makeId: Any = js.native
    inline def makeId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("makeId")(x.asInstanceOf[js.Any])
  }
}
