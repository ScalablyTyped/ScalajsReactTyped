package typingsJapgolly.atvlegacycontentkit

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of methods that process transactions, unlock purchased functionality, and continue promoted in-app purchases.
  *
  * See https://developer.apple.com/documentation/storekit/skpaymenttransactionobserver for more information.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait SKPaymentTransactionObserver extends StObject {
  
  /**
    * Tells an observer that one or more transactions have been removed from the queue.
    */
  var removedTransactions: js.UndefOr[js.Function1[/* transactions */ js.Array[SKPaymentTransaction], Unit]] = js.undefined
  
  /**
    * Tells an observer that one or more transactions have been removed from the queue.
    */
  var restoreCompletedTransactionsFailedWithError: js.UndefOr[js.Function1[/* error */ SKError, Unit]] = js.undefined
  
  /**
    * Tells the observer that the payment queue has finished sending restored transactions.
    */
  var restoreCompletedTransactionsFinished: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Tells an observer that one or more transactions have been updated.
    */
  def updatedTransactions(transactions: js.Array[SKPaymentTransaction]): Unit
}
object SKPaymentTransactionObserver {
  
  inline def apply(updatedTransactions: js.Array[SKPaymentTransaction] => Callback): SKPaymentTransactionObserver = {
    val __obj = js.Dynamic.literal(updatedTransactions = js.Any.fromFunction1((t0: js.Array[SKPaymentTransaction]) => updatedTransactions(t0).runNow()))
    __obj.asInstanceOf[SKPaymentTransactionObserver]
  }
  
  extension [Self <: SKPaymentTransactionObserver](x: Self) {
    
    inline def setRemovedTransactions(value: /* transactions */ js.Array[SKPaymentTransaction] => Callback): Self = StObject.set(x, "removedTransactions", js.Any.fromFunction1((t0: /* transactions */ js.Array[SKPaymentTransaction]) => value(t0).runNow()))
    
    inline def setRemovedTransactionsUndefined: Self = StObject.set(x, "removedTransactions", js.undefined)
    
    inline def setRestoreCompletedTransactionsFailedWithError(value: /* error */ SKError => Callback): Self = StObject.set(x, "restoreCompletedTransactionsFailedWithError", js.Any.fromFunction1((t0: /* error */ SKError) => value(t0).runNow()))
    
    inline def setRestoreCompletedTransactionsFailedWithErrorUndefined: Self = StObject.set(x, "restoreCompletedTransactionsFailedWithError", js.undefined)
    
    inline def setRestoreCompletedTransactionsFinished(value: Callback): Self = StObject.set(x, "restoreCompletedTransactionsFinished", value.toJsFn)
    
    inline def setRestoreCompletedTransactionsFinishedUndefined: Self = StObject.set(x, "restoreCompletedTransactionsFinished", js.undefined)
    
    inline def setUpdatedTransactions(value: js.Array[SKPaymentTransaction] => Callback): Self = StObject.set(x, "updatedTransactions", js.Any.fromFunction1((t0: js.Array[SKPaymentTransaction]) => value(t0).runNow()))
  }
}
