package typingsJapgolly.cordovaSqliteStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SQLitePlugin_ {
  type DatabaseSuccessCallback = js.Function1[/* db */ typingsJapgolly.cordovaSqliteStorage.SQLitePlugin_.Database, scala.Unit]
  type ErrorCallback = js.Function1[/* err */ js.Error, scala.Unit]
  type StatementSuccessCallback = js.Function1[
    /* results */ typingsJapgolly.cordovaSqliteStorage.SQLitePlugin_.Results, 
    scala.Unit
  ]
  type SuccessCallback = js.Function0[scala.Unit]
  type TransactionFunction = js.Function1[
    /* tx */ typingsJapgolly.cordovaSqliteStorage.SQLitePlugin_.Transaction, 
    scala.Unit
  ]
  type TransactionStatementErrorCallback = js.Function2[
    /* tx */ typingsJapgolly.cordovaSqliteStorage.SQLitePlugin_.Transaction, 
    /* err */ js.Error, 
    scala.Boolean | scala.Unit
  ]
  type TransactionStatementSuccessCallback = js.Function2[
    /* tx */ typingsJapgolly.cordovaSqliteStorage.SQLitePlugin_.Transaction, 
    /* results */ typingsJapgolly.cordovaSqliteStorage.SQLitePlugin_.Results, 
    scala.Unit
  ]
}
