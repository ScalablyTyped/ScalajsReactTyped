package typingsJapgolly.sequelize.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Transaction extends StObject {
  
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
  
  inline def apply(
    LOCK: TransactionLock,
    commit: CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]],
    rollback: CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]]
  ): Transaction = {
    val __obj = js.Dynamic.literal(LOCK = LOCK.asInstanceOf[js.Any], commit = commit.toJsFn, rollback = rollback.toJsFn)
    __obj.asInstanceOf[Transaction]
  }
  
  extension [Self <: Transaction](x: Self) {
    
    inline def setCommit(value: CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]]): Self = StObject.set(x, "commit", value.toJsFn)
    
    inline def setLOCK(value: TransactionLock): Self = StObject.set(x, "LOCK", value.asInstanceOf[js.Any])
    
    inline def setRollback(value: CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]]): Self = StObject.set(x, "rollback", value.toJsFn)
  }
}
