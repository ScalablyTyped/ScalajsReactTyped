package typingsJapgolly.sipJs.libCoreMod

import typingsJapgolly.sipJs.libCoreTransactionsTransactionUserMod.ClientTransactionUser
import typingsJapgolly.sipJs.libCoreTransportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("sip.js/lib/core", "ClientTransaction")
@js.native
open class ClientTransaction protected ()
  extends typingsJapgolly.sipJs.libCoreTransactionsMod.ClientTransaction {
  /* protected */ def this(
    _request: typingsJapgolly.sipJs.libCoreMessagesMod.OutgoingRequestMessage,
    transport: Transport,
    user: ClientTransactionUser,
    state: typingsJapgolly.sipJs.libCoreTransactionsTransactionStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}
/* static members */
object ClientTransaction {
  
  @JSImport("sip.js/lib/core", "ClientTransaction")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sip.js/lib/core", "ClientTransaction.makeId")
  @js.native
  def makeId: Any = js.native
  inline def makeId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("makeId")(x.asInstanceOf[js.Any])
}
