package typingsJapgolly.sipJs.mod.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.TransactionState")
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

