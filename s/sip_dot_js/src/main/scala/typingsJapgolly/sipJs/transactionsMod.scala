package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.coreTransportMod.Transport
import typingsJapgolly.sipJs.messagesMod.IncomingRequestMessage
import typingsJapgolly.sipJs.messagesMod.OutgoingRequestMessage
import typingsJapgolly.sipJs.transactionStateMod.TransactionState
import typingsJapgolly.sipJs.transactionUserMod.ClientTransactionUser
import typingsJapgolly.sipJs.transactionUserMod.ServerTransactionUser
import typingsJapgolly.sipJs.transactionUserMod.TransactionUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/transactions", JSImport.Namespace)
@js.native
object transactionsMod extends js.Object {
  @js.native
  abstract class ClientTransaction protected ()
    extends typingsJapgolly.sipJs.clientTransactionMod.ClientTransaction {
    protected def this(
      _request: OutgoingRequestMessage,
      transport: Transport,
      user: ClientTransactionUser,
      state: TransactionState,
      loggerCategory: String
    ) = this()
  }
  
  @js.native
  class InviteClientTransaction protected ()
    extends typingsJapgolly.sipJs.inviteClientTransactionMod.InviteClientTransaction {
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
  
  @js.native
  class InviteServerTransaction protected ()
    extends typingsJapgolly.sipJs.inviteServerTransactionMod.InviteServerTransaction {
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
  
  @js.native
  class NonInviteClientTransaction protected ()
    extends typingsJapgolly.sipJs.nonInviteClientTransactionMod.NonInviteClientTransaction {
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
  
  @js.native
  class NonInviteServerTransaction protected ()
    extends typingsJapgolly.sipJs.nonInviteServerTransactionMod.NonInviteServerTransaction {
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
  
  @js.native
  abstract class ServerTransaction protected ()
    extends typingsJapgolly.sipJs.serverTransactionMod.ServerTransaction {
    protected def this(
      _request: IncomingRequestMessage,
      transport: Transport,
      user: ServerTransactionUser,
      state: TransactionState,
      loggerCategory: String
    ) = this()
  }
  
  @js.native
  abstract class Transaction protected ()
    extends typingsJapgolly.sipJs.transactionMod.Transaction {
    protected def this(
      _transport: Transport,
      _user: TransactionUser,
      _id: String,
      _state: TransactionState,
      loggerCategory: String
    ) = this()
  }
  
  /* static members */
  @js.native
  object ClientTransaction extends js.Object {
    var makeId: js.Any = js.native
  }
  
  @js.native
  object TransactionState extends js.Object {
    /* "Accepted" */ val Accepted: typingsJapgolly.sipJs.transactionStateMod.TransactionState.Accepted with String = js.native
    /* "Calling" */ val Calling: typingsJapgolly.sipJs.transactionStateMod.TransactionState.Calling with String = js.native
    /* "Completed" */ val Completed: typingsJapgolly.sipJs.transactionStateMod.TransactionState.Completed with String = js.native
    /* "Confirmed" */ val Confirmed: typingsJapgolly.sipJs.transactionStateMod.TransactionState.Confirmed with String = js.native
    /* "Proceeding" */ val Proceeding: typingsJapgolly.sipJs.transactionStateMod.TransactionState.Proceeding with String = js.native
    /* "Terminated" */ val Terminated: typingsJapgolly.sipJs.transactionStateMod.TransactionState.Terminated with String = js.native
    /* "Trying" */ val Trying: typingsJapgolly.sipJs.transactionStateMod.TransactionState.Trying with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.sipJs.transactionStateMod.TransactionState with String] = js.native
  }
  
}

