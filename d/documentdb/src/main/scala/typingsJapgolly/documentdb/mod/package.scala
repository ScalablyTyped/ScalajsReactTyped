package typingsJapgolly.documentdb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DatabaseMeta = typingsJapgolly.documentdb.mod.AbstractMeta
  type DocumentQuery = typingsJapgolly.documentdb.mod.SqlQuerySpec | java.lang.String
  type PartitionKind = typingsJapgolly.documentdb.documentdbStrings.Hash
  type Procedure = typingsJapgolly.documentdb.mod.UserScriptable
  type RequestCallback[TResult] = js.Function3[
    /* error */ typingsJapgolly.documentdb.mod.QueryError, 
    /* resource */ TResult, 
    /* responseHeaders */ js.Any, 
    scala.Unit
  ]
  type UserDefinedFunctionMeta = typingsJapgolly.documentdb.mod.AbstractMeta
  type UserDefinedFunctionType = typingsJapgolly.documentdb.documentdbStrings.Javascript
  type UserFunction = (js.Function1[/* repeated */ js.Any, scala.Unit]) | java.lang.String
}
