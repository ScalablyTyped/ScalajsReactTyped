package typingsJapgolly.sipJs.libCoreMod

import typingsJapgolly.sipJs.libCoreTransactionsTransactionUserMod.TransactionUser
import typingsJapgolly.sipJs.libCoreTransportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("sip.js/lib/core", "Transaction")
@js.native
open class Transaction protected ()
  extends typingsJapgolly.sipJs.libCoreTransactionsMod.Transaction {
  /* protected */ def this(
    _transport: Transport,
    _user: TransactionUser,
    _id: String,
    _state: typingsJapgolly.sipJs.libCoreTransactionsTransactionStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}
