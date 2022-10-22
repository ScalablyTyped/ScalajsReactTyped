package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcApiDatabaseMod.Firestore
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiTransactionOptionsMod.TransactionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcApiTransactionMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/api/transaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/api/transaction", "Transaction")
  @js.native
  open class Transaction protected ()
    extends typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiTransactionMod.Transaction {
    /** @hideconstructor */
    def this(
      _firestore: Firestore,
      _transaction: typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreTransactionMod.Transaction
    ) = this()
  }
  
  inline def runTransaction[T](firestore: Firestore, updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[T]]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def runTransaction[T](
    firestore: Firestore,
    updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[T]],
    options: TransactionOptions
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
