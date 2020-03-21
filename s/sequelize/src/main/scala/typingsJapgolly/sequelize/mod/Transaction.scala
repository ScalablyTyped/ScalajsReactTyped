package typingsJapgolly.sequelize.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
//  Transaction
// ~~~~~~~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/transaction.js
//
/**
  * The transaction object is used to identify a running transaction. It is created by calling
  * `Sequelize.transaction()`.
  *
  * To run a query under a transaction, you should pass the transaction in the options object.
  */
trait Transaction extends js.Object {
  /**
    * Possible options for row locking. Used in conjuction with `find` calls:
    *
    * @see TransactionStatic
    */
  var LOCK: TransactionLock
  /**
    * Commit the transaction
    */
  def commit(): typingsJapgolly.bluebird.mod.^[Unit]
  /**
    * Rollback (abort) the transaction
    */
  def rollback(): typingsJapgolly.bluebird.mod.^[Unit]
}

object Transaction {
  @scala.inline
  def apply(
    LOCK: TransactionLock,
    commit: CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]],
    rollback: CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]]
  ): Transaction = {
    val __obj = js.Dynamic.literal(LOCK = LOCK.asInstanceOf[js.Any])
    __obj.updateDynamic("commit")(commit.toJsFn)
    __obj.updateDynamic("rollback")(rollback.toJsFn)
    __obj.asInstanceOf[Transaction]
  }
}

