package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.libCoreMessagesMod.IncomingRequestMessage
import typingsJapgolly.sipJs.libCoreTransactionsServerTransactionMod.ServerTransaction
import typingsJapgolly.sipJs.libCoreTransactionsTransactionUserMod.ServerTransactionUser
import typingsJapgolly.sipJs.libCoreTransportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreTransactionsNonInviteServerTransactionMod {
  
  @JSImport("sip.js/lib/core/transactions/non-invite-server-transaction", "NonInviteServerTransaction")
  @js.native
  open class NonInviteServerTransaction protected () extends ServerTransaction {
    /**
      * Constructor.
      * After construction the transaction will be in the "trying": state and the transaction
      * `id` will equal the branch parameter set in the Via header of the incoming request.
      * https://tools.ietf.org/html/rfc3261#section-17.2.2
      * @param request - Incoming Non-INVITE request from the transport.
      * @param transport - The transport.
      * @param user - The transaction user.
      */
    def this(request: IncomingRequestMessage, transport: Transport, user: ServerTransactionUser) = this()
    
    /* private */ var J: Any = js.native
    
    /* private */ var lastResponse: Any = js.native
    
    /**
      * First, the procedures in [4] are followed, which attempt to deliver the response to a backup.
      * If those should all fail, based on the definition of failure in [4], the server transaction SHOULD
      * inform the TU that a failure has occurred, and SHOULD transition to the terminated state.
      * https://tools.ietf.org/html/rfc3261#section-17.2.4
      */
    /* protected */ def onTransportError(error: js.Error): Unit = js.native
    
    /* private */ var stateTransition: Any = js.native
    
    /**
      * The server transaction remains in this state until Timer J fires,
      * at which point it MUST transition to the "Terminated" state.
      * https://tools.ietf.org/html/rfc3261#section-17.2.2
      */
    /* private */ var timerJ: Any = js.native
  }
}
