package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.anon.BatchIdMutations
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLocalIndexeddbSchemaLegacyMod.DbRemoteDocument
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLocalPersistencePromiseMod.PersistencePromise
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLocalSimpleDbMod.SimpleDbTransaction
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcModelDocumentKeyMod.DocumentKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcLocalIndexeddbMutationBatchImplMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/local/indexeddb_mutation_batch_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dbDocumentSize(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dbDocumentSize")().asInstanceOf[Double]
  inline def dbDocumentSize(doc: DbRemoteDocument): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dbDocumentSize")(doc.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def dbDocumentSize(
    doc: typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLocalIndexeddbSchemaMod.DbRemoteDocument
  ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dbDocumentSize")(doc.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def removeMutationBatch(txn: SimpleDbTransaction, userId: String, batch: BatchIdMutations): PersistencePromise[js.Array[DocumentKey]] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeMutationBatch")(txn.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[PersistencePromise[js.Array[DocumentKey]]]
}
