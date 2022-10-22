package typingsJapgolly.sipJs.mod.Core

import typingsJapgolly.sipJs.libCoreTransactionsTransactionUserMod.ClientTransactionUser
import typingsJapgolly.sipJs.libCoreTransportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.InviteClientTransaction")
@js.native
open class InviteClientTransaction protected ()
  extends typingsJapgolly.sipJs.libCoreMod.InviteClientTransaction {
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
  def this(
    request: typingsJapgolly.sipJs.libCoreMessagesMod.OutgoingRequestMessage,
    transport: Transport,
    user: ClientTransactionUser
  ) = this()
}
