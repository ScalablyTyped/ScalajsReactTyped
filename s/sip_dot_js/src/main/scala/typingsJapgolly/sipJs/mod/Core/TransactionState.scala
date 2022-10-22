package typingsJapgolly.sipJs.mod.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.TransactionState")
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
