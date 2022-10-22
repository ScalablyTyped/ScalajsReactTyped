package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.libCoreMessagesMod.IncomingRequestMessage
import typingsJapgolly.sipJs.libCoreMessagesMod.OutgoingRequestMessage
import typingsJapgolly.sipJs.libCoreTransactionsTransactionStateMod.TransactionState
import typingsJapgolly.sipJs.libCoreTransactionsTransactionUserMod.ClientTransactionUser
import typingsJapgolly.sipJs.libCoreTransactionsTransactionUserMod.ServerTransactionUser
import typingsJapgolly.sipJs.libCoreTransactionsTransactionUserMod.TransactionUser
import typingsJapgolly.sipJs.libCoreTransportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreTransactionsMod {
  
  /* note: abstract class */ @JSImport("sip.js/lib/core/transactions", "ClientTransaction")
  @js.native
  open class ClientTransaction protected ()
    extends typingsJapgolly.sipJs.libCoreTransactionsClientTransactionMod.ClientTransaction {
    /* protected */ def this(
      _request: OutgoingRequestMessage,
      transport: Transport,
      user: ClientTransactionUser,
      state: TransactionState,
      loggerCategory: String
    ) = this()
  }
  /* static members */
  object ClientTransaction {
    
    @JSImport("sip.js/lib/core/transactions", "ClientTransaction")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sip.js/lib/core/transactions", "ClientTransaction.makeId")
    @js.native
    def makeId: Any = js.native
    inline def makeId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("makeId")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sip.js/lib/core/transactions", "InviteClientTransaction")
  @js.native
  open class InviteClientTransaction protected ()
    extends typingsJapgolly.sipJs.libCoreTransactionsInviteClientTransactionMod.InviteClientTransaction {
    /**
      * Constructor.
      * Upon construction, the outgoing request's Via header is updated by calling `setViaHeader`.
      * Then `toString` is called on the outgoing request and the message is sent via the transport.
      * After construction the transaction will be in the "calling" state and the transaction id
      * will equal the branch parameter set in the Via header of the outgoing request.
      * https://tools.ietf.org/html/rfc3261#section-17.1.1
      * @param request - The outgoing INVITE request.
      * @param transport - The transport.
      * @param user - The transaction user.
      */
    def this(request: OutgoingRequestMessage, transport: Transport, user: ClientTransactionUser) = this()
  }
  
  @JSImport("sip.js/lib/core/transactions", "InviteServerTransaction")
  @js.native
  open class InviteServerTransaction protected ()
    extends typingsJapgolly.sipJs.libCoreTransactionsInviteServerTransactionMod.InviteServerTransaction {
    /**
      * Constructor.
      * Upon construction, a "100 Trying" reply will be immediately sent.
      * After construction the transaction will be in the "proceeding" state and the transaction
      * `id` will equal the branch parameter set in the Via header of the incoming request.
      * https://tools.ietf.org/html/rfc3261#section-17.2.1
      * @param request - Incoming INVITE request from the transport.
      * @param transport - The transport.
      * @param user - The transaction user.
      */
    def this(request: IncomingRequestMessage, transport: Transport, user: ServerTransactionUser) = this()
  }
  
  @JSImport("sip.js/lib/core/transactions", "NonInviteClientTransaction")
  @js.native
  open class NonInviteClientTransaction protected ()
    extends typingsJapgolly.sipJs.libCoreTransactionsNonInviteClientTransactionMod.NonInviteClientTransaction {
    /**
      * Constructor
      * Upon construction, the outgoing request's Via header is updated by calling `setViaHeader`.
      * Then `toString` is called on the outgoing request and the message is sent via the transport.
      * After construction the transaction will be in the "calling" state and the transaction id
      * will equal the branch parameter set in the Via header of the outgoing request.
      * https://tools.ietf.org/html/rfc3261#section-17.1.2
      * @param request - The outgoing Non-INVITE request.
      * @param transport - The transport.
      * @param user - The transaction user.
      */
    def this(request: OutgoingRequestMessage, transport: Transport, user: ClientTransactionUser) = this()
  }
  
  @JSImport("sip.js/lib/core/transactions", "NonInviteServerTransaction")
  @js.native
  open class NonInviteServerTransaction protected ()
    extends typingsJapgolly.sipJs.libCoreTransactionsNonInviteServerTransactionMod.NonInviteServerTransaction {
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
  }
  
  /* note: abstract class */ @JSImport("sip.js/lib/core/transactions", "ServerTransaction")
  @js.native
  open class ServerTransaction protected ()
    extends typingsJapgolly.sipJs.libCoreTransactionsServerTransactionMod.ServerTransaction {
    /* protected */ def this(
      _request: IncomingRequestMessage,
      transport: Transport,
      user: ServerTransactionUser,
      state: TransactionState,
      loggerCategory: String
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("sip.js/lib/core/transactions", "Transaction")
  @js.native
  open class Transaction protected ()
    extends typingsJapgolly.sipJs.libCoreTransactionsTransactionMod.Transaction {
    /* protected */ def this(
      _transport: Transport,
      _user: TransactionUser,
      _id: String,
      _state: TransactionState,
      loggerCategory: String
    ) = this()
  }
  
  @JSImport("sip.js/lib/core/transactions", "TransactionState")
  @js.native
  object TransactionState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.sipJs.libCoreTransactionsTransactionStateMod.TransactionState & String
      ] = js.native
    
    /* "Accepted" */ val Accepted: typingsJapgolly.sipJs.libCoreTransactionsTransactionStateMod.TransactionState.Accepted & String = js.native
    
    /* "Calling" */ val Calling: typingsJapgolly.sipJs.libCoreTransactionsTransactionStateMod.TransactionState.Calling & String = js.native
    
    /* "Completed" */ val Completed: typingsJapgolly.sipJs.libCoreTransactionsTransactionStateMod.TransactionState.Completed & String = js.native
    
    /* "Confirmed" */ val Confirmed: typingsJapgolly.sipJs.libCoreTransactionsTransactionStateMod.TransactionState.Confirmed & String = js.native
    
    /* "Proceeding" */ val Proceeding: typingsJapgolly.sipJs.libCoreTransactionsTransactionStateMod.TransactionState.Proceeding & String = js.native
    
    /* "Terminated" */ val Terminated: typingsJapgolly.sipJs.libCoreTransactionsTransactionStateMod.TransactionState.Terminated & String = js.native
    
    /* "Trying" */ val Trying: typingsJapgolly.sipJs.libCoreTransactionsTransactionStateMod.TransactionState.Trying & String = js.native
  }
}
