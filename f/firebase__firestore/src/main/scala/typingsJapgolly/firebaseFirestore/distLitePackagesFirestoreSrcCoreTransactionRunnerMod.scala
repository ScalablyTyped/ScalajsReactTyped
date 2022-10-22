package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreTransactionMod.Transaction
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreTransactionOptionsMod.TransactionOptions
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcRemoteDatastoreMod.Datastore
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilAsyncQueueMod.AsyncQueue
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilPromiseMod.Deferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcCoreTransactionRunnerMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/core/transaction_runner", "TransactionRunner")
  @js.native
  open class TransactionRunner[T] protected () extends StObject {
    def this(
      asyncQueue: AsyncQueue,
      datastore: Datastore,
      options: TransactionOptions,
      updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[T]],
      deferred: Deferred[T]
    ) = this()
    
    /* private */ val asyncQueue: Any = js.native
    
    /* private */ var attemptsRemaining: Any = js.native
    
    /* private */ var backoff: Any = js.native
    
    /* private */ val datastore: Any = js.native
    
    /* private */ val deferred: Any = js.native
    
    /* private */ var handleTransactionError: Any = js.native
    
    /* private */ var isRetryableTransactionError: Any = js.native
    
    /* private */ val options: Any = js.native
    
    /** Runs the transaction and sets the result on deferred. */
    def run(): Unit = js.native
    
    /* private */ var runWithBackOff: Any = js.native
    
    /* private */ var tryRunUpdateFunction: Any = js.native
    
    /* private */ val updateFunction: Any = js.native
  }
}
