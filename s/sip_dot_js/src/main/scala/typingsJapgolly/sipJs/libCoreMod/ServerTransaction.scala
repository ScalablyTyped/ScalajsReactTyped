package typingsJapgolly.sipJs.libCoreMod

import typingsJapgolly.sipJs.libCoreTransactionsTransactionUserMod.ServerTransactionUser
import typingsJapgolly.sipJs.libCoreTransportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("sip.js/lib/core", "ServerTransaction")
@js.native
open class ServerTransaction protected ()
  extends typingsJapgolly.sipJs.libCoreTransactionsMod.ServerTransaction {
  /* protected */ def this(
    _request: typingsJapgolly.sipJs.libCoreMessagesMod.IncomingRequestMessage,
    transport: Transport,
    user: ServerTransactionUser,
    state: typingsJapgolly.sipJs.libCoreTransactionsTransactionStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}
