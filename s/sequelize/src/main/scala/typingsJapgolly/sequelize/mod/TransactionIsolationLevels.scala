package typingsJapgolly.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Isolations levels can be set per-transaction by passing `options.isolationLevel` to `sequelize.transaction`.
  * Default to `REPEATABLE_READ` but you can override the default isolation level by passing
  * `options.isolationLevel` in `new Sequelize`.
  */
trait TransactionIsolationLevels extends js.Object {
   // 'READ UNCOMMITTED'
  var READ_COMMITTED: TransactionIsolationLevelReadCommitted
  var READ_UNCOMMITTED: TransactionIsolationLevelReadUncommitted
   // 'READ COMMITTED'
  var REPEATABLE_READ: TransactionIsolationLevelRepeatableRead
   // 'REPEATABLE READ'
  var SERIALIZABLE: TransactionIsolationLevelSerializable
}

object TransactionIsolationLevels {
  @scala.inline
  def apply(
    READ_COMMITTED: TransactionIsolationLevelReadCommitted,
    READ_UNCOMMITTED: TransactionIsolationLevelReadUncommitted,
    REPEATABLE_READ: TransactionIsolationLevelRepeatableRead,
    SERIALIZABLE: TransactionIsolationLevelSerializable
  ): TransactionIsolationLevels = {
    val __obj = js.Dynamic.literal(READ_COMMITTED = READ_COMMITTED.asInstanceOf[js.Any], READ_UNCOMMITTED = READ_UNCOMMITTED.asInstanceOf[js.Any], REPEATABLE_READ = REPEATABLE_READ.asInstanceOf[js.Any], SERIALIZABLE = SERIALIZABLE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransactionIsolationLevels]
  }
}

