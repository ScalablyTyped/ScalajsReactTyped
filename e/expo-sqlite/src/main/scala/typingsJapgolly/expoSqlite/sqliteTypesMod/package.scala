package typingsJapgolly.expoSqlite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sqliteTypesMod {
  type DatabaseCallback = js.Function1[/* database */ typingsJapgolly.expoSqlite.sqliteTypesMod.Database, scala.Unit]
  type SQLStatementCallback = js.Function2[
    /* transaction */ typingsJapgolly.expoSqlite.sqliteTypesMod.SQLTransaction, 
    /* resultSet */ typingsJapgolly.expoSqlite.sqliteTypesMod.SQLResultSet, 
    scala.Unit
  ]
  type SQLStatementErrorCallback = js.Function2[
    /* transaction */ typingsJapgolly.expoSqlite.sqliteTypesMod.SQLTransaction, 
    /* error */ typingsJapgolly.expoSqlite.sqliteTypesMod.SQLError, 
    scala.Boolean
  ]
  type SQLTransactionCallback = js.Function1[
    /* transaction */ typingsJapgolly.expoSqlite.sqliteTypesMod.SQLTransaction, 
    scala.Unit
  ]
  type SQLTransactionErrorCallback = js.Function1[/* error */ typingsJapgolly.expoSqlite.sqliteTypesMod.SQLError, scala.Unit]
  type SQLVoidCallback = js.Function0[scala.Unit]
  type SQLiteCallback = js.Function2[
    /* error */ js.UndefOr[js.Error | scala.Null], 
    /* resultSet */ js.UndefOr[
      js.Array[
        typingsJapgolly.expoSqlite.sqliteTypesMod.ResultSetError | typingsJapgolly.expoSqlite.sqliteTypesMod.ResultSet
      ]
    ], 
    scala.Unit
  ]
}
