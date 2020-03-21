package typingsJapgolly.firebird.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents SQL transaction.
  *
  * @desc
  * To get instance of this object call @see startNewTransactionSync or @see startNewTransaction methods of @see Connection object.
  * Transaction objects may be reused after commit or rollback.
  */
trait Transaction extends js.Object {
  /*
    * A boolean readonly property indicating if this transaction is in started state.
    */
  var inTransaction: Boolean
  /**
    * Asynchronous commit transaction.
    *
    * @desc
    * Read notes in @see commitSync() .
    *
    * @param callback function(err), where err is error object in case of error.
    */
  def commit(callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit
  /**
    * Synchronously commits this transaction.
    *
    * @desc
    * Notes:
    * Transacation is automatically started before any query in context of this object
    * if this object does not have active transaction (check inTransaction property).
    * You also should note that DDL statements (altering database structure) are commited automatically.
    */
  def commitSync(): Unit
  /**
    * Synchronously prepares SQL statement
    *
    * @param sql an SQL query to prepare.
    * @returns object in context of this transaction.
    */
  def prepareSync(sql: String): FBStatement
  /**
    * Asynchronously executes query in context of this transaction.
    *
    * @param sql an SQL query to execute.
    * @param callback err - is error object or null, res - FBResult object.
    */
  def query(sql: String, callback: js.Function2[/* err */ js.Error | Null, /* res */ FBResult, Unit]): Unit
  /**
    * Executes SQL query in context of this transaction. Returns FBResult object in case of success. Raises error otherwise.
    *
    * @param sql an SQL query to execute.
    */
  def querySync(sql: String): Unit
  /**
    * Asynchronously rollbacks transaction.
    *
    * @desc
    * Read notes in @see commitSync() .
    *
    * @param callback function(err), where err is error object in case of error.
    */
  def rollback(callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit
  /**
    * Synchronously rollbacks transaction.
    *
    * @desc
    * Read notes in @see commitSync() .
    */
  def rollbackSync(): Unit
  /**
    * Asynchronously starts new transaction.
    *
    * @desc
    * Read notes in @see commitSync() .
    *
    * @param callback function(err), where err is error object in case of error.
    */
  def start(callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit
  /**
    * Synchronously starts transaction.
    *
    * @desc
    * The transaction should be not in started state before call to this method.
    * Read notes in @see commitSync() .
    * See @see inTransaction property.
    */
  def startSync(): Unit
}

object Transaction {
  @scala.inline
  def apply(
    commit: js.Function1[/* err */ js.Error | Null, Unit] => Callback,
    commitSync: Callback,
    inTransaction: Boolean,
    prepareSync: String => CallbackTo[FBStatement],
    query: (String, js.Function2[/* err */ js.Error | Null, /* res */ FBResult, Unit]) => Callback,
    querySync: String => Callback,
    rollback: js.Function1[/* err */ js.Error | Null, Unit] => Callback,
    rollbackSync: Callback,
    start: js.Function1[/* err */ js.Error | Null, Unit] => Callback,
    startSync: Callback
  ): Transaction = {
    val __obj = js.Dynamic.literal(inTransaction = inTransaction.asInstanceOf[js.Any])
    __obj.updateDynamic("commit")(js.Any.fromFunction1((t0: js.Function1[/* err */ js.Error | scala.Null, scala.Unit]) => commit(t0).runNow()))
    __obj.updateDynamic("commitSync")(commitSync.toJsFn)
    __obj.updateDynamic("prepareSync")(js.Any.fromFunction1((t0: java.lang.String) => prepareSync(t0).runNow()))
    __obj.updateDynamic("query")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[
  /* err */ js.Error | scala.Null, 
  /* res */ typingsJapgolly.firebird.mod.FBResult, 
  scala.Unit]) => query(t0, t1).runNow()))
    __obj.updateDynamic("querySync")(js.Any.fromFunction1((t0: java.lang.String) => querySync(t0).runNow()))
    __obj.updateDynamic("rollback")(js.Any.fromFunction1((t0: js.Function1[/* err */ js.Error | scala.Null, scala.Unit]) => rollback(t0).runNow()))
    __obj.updateDynamic("rollbackSync")(rollbackSync.toJsFn)
    __obj.updateDynamic("start")(js.Any.fromFunction1((t0: js.Function1[/* err */ js.Error | scala.Null, scala.Unit]) => start(t0).runNow()))
    __obj.updateDynamic("startSync")(startSync.toJsFn)
    __obj.asInstanceOf[Transaction]
  }
}

