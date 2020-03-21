package typingsJapgolly.anyDbTransaction.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.anyDb.mod.Adapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionOptions extends js.Object {
  /**
    * Adapter name e.g. 'mysql'
    */
  var adapter: js.UndefOr[Adapter] = js.undefined
  /**
    * Rollback automatically on error, default true
    */
  var autoRollback: js.UndefOr[Boolean] = js.undefined
  /**
    * SQL statement for beginning a transaction, default 'BEGIN'
    */
  var begin: js.UndefOr[String] = js.undefined
  /**
    * Callback for transaction
    */
  var callback: js.UndefOr[js.Function2[/* error */ js.Error, /* transaction */ Transaction, Unit]] = js.undefined
  /**
    * SQL statement for committing a transaction, default 'COMMIT'
    */
  var commit: js.UndefOr[String] = js.undefined
  /**
    * SQL statement for rolling back a transaction, default 'ROLLBACK'
    */
  var rollback: js.UndefOr[String] = js.undefined
}

object TransactionOptions {
  @scala.inline
  def apply(
    adapter: Adapter = null,
    autoRollback: js.UndefOr[Boolean] = js.undefined,
    begin: String = null,
    callback: (/* error */ js.Error, /* transaction */ Transaction) => Callback = null,
    commit: String = null,
    rollback: String = null
  ): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    if (adapter != null) __obj.updateDynamic("adapter")(adapter.asInstanceOf[js.Any])
    if (!js.isUndefined(autoRollback)) __obj.updateDynamic("autoRollback")(autoRollback.asInstanceOf[js.Any])
    if (begin != null) __obj.updateDynamic("begin")(begin.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2((t0: /* error */ js.Error, t1: /* transaction */ typingsJapgolly.anyDbTransaction.mod.Transaction) => callback(t0, t1).runNow()))
    if (commit != null) __obj.updateDynamic("commit")(commit.asInstanceOf[js.Any])
    if (rollback != null) __obj.updateDynamic("rollback")(rollback.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionOptions]
  }
}

