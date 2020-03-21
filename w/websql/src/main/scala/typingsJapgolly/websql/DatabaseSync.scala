package typingsJapgolly.websql

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 4.4 Synchronous database API
  */
trait DatabaseSync extends js.Object {
  /*readonly/const*/ var version: DOMString
  def changeVersion(oldVersion: DOMString, newVersion: DOMString, callback: SQLTransactionSyncCallback): Unit
  def readTransaction(callback: SQLTransactionSyncCallback): Unit
  def transaction(callback: SQLTransactionSyncCallback): Unit
}

object DatabaseSync {
  @scala.inline
  def apply(
    changeVersion: (DOMString, DOMString, SQLTransactionSyncCallback) => Callback,
    readTransaction: SQLTransactionSyncCallback => Callback,
    transaction: SQLTransactionSyncCallback => Callback,
    version: DOMString
  ): DatabaseSync = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("changeVersion")(js.Any.fromFunction3((t0: typingsJapgolly.websql.DOMString, t1: typingsJapgolly.websql.DOMString, t2: typingsJapgolly.websql.SQLTransactionSyncCallback) => changeVersion(t0, t1, t2).runNow()))
    __obj.updateDynamic("readTransaction")(js.Any.fromFunction1((t0: typingsJapgolly.websql.SQLTransactionSyncCallback) => readTransaction(t0).runNow()))
    __obj.updateDynamic("transaction")(js.Any.fromFunction1((t0: typingsJapgolly.websql.SQLTransactionSyncCallback) => transaction(t0).runNow()))
    __obj.asInstanceOf[DatabaseSync]
  }
}

