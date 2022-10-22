package typingsJapgolly.sipJs.mod.Core

import typingsJapgolly.sipJs.libCoreTransactionsTransactionUserMod.ClientTransactionUser
import typingsJapgolly.sipJs.libCoreTransportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("sip.js", "Core.ClientTransaction")
@js.native
open class ClientTransaction protected ()
  extends typingsJapgolly.sipJs.libCoreMod.ClientTransaction {
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
  
  @JSImport("sip.js", "Core.ClientTransaction")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sip.js", "Core.ClientTransaction.makeId")
  @js.native
  def makeId: Any = js.native
  inline def makeId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("makeId")(x.asInstanceOf[js.Any])
}
