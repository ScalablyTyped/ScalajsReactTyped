package typingsJapgolly.reactNativeSqliteStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type StatementCallback = js.Function2[
    /* transaction */ typingsJapgolly.reactNativeSqliteStorage.mod.Transaction, 
    /* resultSet */ typingsJapgolly.reactNativeSqliteStorage.mod.ResultSet, 
    scala.Unit
  ]
  type StatementErrorCallback = js.Function2[
    /* transaction */ typingsJapgolly.reactNativeSqliteStorage.mod.Transaction, 
    /* error */ typingsJapgolly.reactNativeSqliteStorage.mod.SQLError, 
    scala.Unit
  ]
  type TransactionCallback = js.Function1[
    /* transaction */ typingsJapgolly.reactNativeSqliteStorage.mod.Transaction, 
    scala.Unit
  ]
  type TransactionErrorCallback = js.Function1[/* error */ typingsJapgolly.reactNativeSqliteStorage.mod.SQLError, scala.Unit]
}
