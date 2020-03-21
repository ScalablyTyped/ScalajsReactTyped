package typingsJapgolly.sipJs.coreMod

import typingsJapgolly.sipJs.coreTransportMod.Transport
import typingsJapgolly.sipJs.transactionUserMod.TransactionUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "Transaction")
@js.native
abstract class Transaction protected ()
  extends typingsJapgolly.sipJs.transactionsMod.Transaction {
  protected def this(
    _transport: Transport,
    _user: TransactionUser,
    _id: String,
    _state: typingsJapgolly.sipJs.transactionStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}

