package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.anon.BatchId
import typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalIndexeddbSchemaLegacyMod.DbRemoteDocument
import typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalPersistencePromiseMod.PersistencePromise
import typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalSimpleDbMod.SimpleDbTransaction
import typingsJapgolly.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcLocalIndexeddbMutationBatchImplMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/local/indexeddb_mutation_batch_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dbDocumentSize(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dbDocumentSize")().asInstanceOf[Double]
  inline def dbDocumentSize(doc: DbRemoteDocument): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dbDocumentSize")(doc.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def dbDocumentSize(doc: typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalIndexeddbSchemaMod.DbRemoteDocument): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dbDocumentSize")(doc.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def removeMutationBatch(txn: SimpleDbTransaction, userId: String, batch: BatchId): PersistencePromise[js.Array[DocumentKey]] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeMutationBatch")(txn.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[PersistencePromise[js.Array[DocumentKey]]]
}
