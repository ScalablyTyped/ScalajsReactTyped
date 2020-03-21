package typingsJapgolly.googleCloudDatastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transactionMod {
  type RollbackCallback = js.Function2[/* err */ js.Error, /* rollbackResponse */ js.Object, scala.Unit]
  type RollbackResult = js.Array[js.Object]
  type TransactionCallback = js.Function3[
    /* err */ js.Error, 
    /* tx */ typingsJapgolly.googleCloudDatastore.transactionMod.DatastoreTransaction, 
    /* beginTxResponse */ typingsJapgolly.googleCloudDatastore.transactionMod.BeginTransactionResponse, 
    scala.Unit
  ]
  type TransactionResult = js.Tuple2[
    typingsJapgolly.googleCloudDatastore.transactionMod.DatastoreTransaction, 
    typingsJapgolly.googleCloudDatastore.transactionMod.BeginTransactionResponse
  ]
}
