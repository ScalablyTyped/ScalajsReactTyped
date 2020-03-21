package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object websql {
  // util interfaces
  type DOMString = java.lang.String
  //[Callback = FunctionOnly, NoInterfaceObject]
  type DatabaseCallback = js.Function1[/* database */ typingsJapgolly.websql.Database, scala.Unit]
  type ObjectArray = js.Array[js.Any]
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLStatementCallback = js.Function2[
    /* transaction */ typingsJapgolly.websql.SQLTransaction, 
    /* resultSet */ typingsJapgolly.websql.SQLResultSet, 
    scala.Unit
  ]
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLStatementErrorCallback = js.Function2[
    /* transaction */ typingsJapgolly.websql.SQLTransaction, 
    /* error */ typingsJapgolly.websql.SQLError, 
    scala.Boolean
  ]
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLTransactionCallback = js.Function1[/* transaction */ typingsJapgolly.websql.SQLTransaction, scala.Unit]
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLTransactionErrorCallback = js.Function1[/* error */ typingsJapgolly.websql.SQLError, scala.Unit]
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLTransactionSyncCallback = js.Function1[/* transaction */ typingsJapgolly.websql.SQLTransactionSync, scala.Unit]
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLVoidCallback = js.Function0[scala.Unit]
  type WorkerUtils = typingsJapgolly.websql.WorkerUtilsDatabase
}
