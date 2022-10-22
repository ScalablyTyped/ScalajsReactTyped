package typingsJapgolly.websql

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 4.4 Synchronous database API
  */
trait DatabaseSync extends StObject {
  
  def changeVersion(oldVersion: DOMString, newVersion: DOMString, callback: SQLTransactionSyncCallback): Unit
  
  def readTransaction(callback: SQLTransactionSyncCallback): Unit
  
  def transaction(callback: SQLTransactionSyncCallback): Unit
  
  /*readonly/const*/ var version: DOMString
}
object DatabaseSync {
  
  inline def apply(
    changeVersion: (DOMString, DOMString, SQLTransactionSyncCallback) => Callback,
    readTransaction: SQLTransactionSyncCallback => Callback,
    transaction: SQLTransactionSyncCallback => Callback,
    version: DOMString
  ): DatabaseSync = {
    val __obj = js.Dynamic.literal(changeVersion = js.Any.fromFunction3((t0: DOMString, t1: DOMString, t2: SQLTransactionSyncCallback) => (changeVersion(t0, t1, t2)).runNow()), readTransaction = js.Any.fromFunction1((t0: SQLTransactionSyncCallback) => readTransaction(t0).runNow()), transaction = js.Any.fromFunction1((t0: SQLTransactionSyncCallback) => transaction(t0).runNow()), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseSync]
  }
  
  extension [Self <: DatabaseSync](x: Self) {
    
    inline def setChangeVersion(value: (DOMString, DOMString, SQLTransactionSyncCallback) => Callback): Self = StObject.set(x, "changeVersion", js.Any.fromFunction3((t0: DOMString, t1: DOMString, t2: SQLTransactionSyncCallback) => (value(t0, t1, t2)).runNow()))
    
    inline def setReadTransaction(value: SQLTransactionSyncCallback => Callback): Self = StObject.set(x, "readTransaction", js.Any.fromFunction1((t0: SQLTransactionSyncCallback) => value(t0).runNow()))
    
    inline def setTransaction(value: SQLTransactionSyncCallback => Callback): Self = StObject.set(x, "transaction", js.Any.fromFunction1((t0: SQLTransactionSyncCallback) => value(t0).runNow()))
    
    inline def setVersion(value: DOMString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
