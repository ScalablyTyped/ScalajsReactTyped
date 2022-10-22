package typingsJapgolly.sipJs.mod.Core

import typingsJapgolly.sipJs.libCoreTransactionsTransactionUserMod.ServerTransactionUser
import typingsJapgolly.sipJs.libCoreTransportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.NonInviteServerTransaction")
@js.native
open class NonInviteServerTransaction protected ()
  extends typingsJapgolly.sipJs.libCoreMod.NonInviteServerTransaction {
  /**
    * Constructor.
    * After construction the transaction will be in the "trying": state and the transaction
    * `id` will equal the branch parameter set in the Via header of the incoming request.
    * https://tools.ietf.org/html/rfc3261#section-17.2.2
    * @param request - Incoming Non-INVITE request from the transport.
    * @param transport - The transport.
    * @param user - The transaction user.
    */
  def this(
    request: typingsJapgolly.sipJs.libCoreMessagesMod.IncomingRequestMessage,
    transport: Transport,
    user: ServerTransactionUser
  ) = this()
}
