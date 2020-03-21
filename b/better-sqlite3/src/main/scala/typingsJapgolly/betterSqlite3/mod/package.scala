package typingsJapgolly.betterSqlite3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ArgumentTypes[F /* <: typingsJapgolly.betterSqlite3.mod.VariableArgFunction */] = js.Any
  type ColumnDefinition = typingsJapgolly.betterSqlite3.mod.BetterSqlite3.ColumnDefinition
  type Database = typingsJapgolly.betterSqlite3.mod.BetterSqlite3.Database
  type Integer = (js.Function1[
    /* val */ typingsJapgolly.integer.mod.IntLike, 
    typingsJapgolly.integer.mod.IntClass
  ]) with typingsJapgolly.betterSqlite3.TypeofInteger
  type SqliteError = org.scalablytyped.runtime.Instantiable2[
    /* message */ java.lang.String, 
    /* code */ java.lang.String, 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias better-sqlite3.better-sqlite3.SqliteError */ js.Object
  ]
  type Statement[BindParameters /* <: js.Array[_] | js.Object */] = typingsJapgolly.betterSqlite3.mod.BetterSqlite3.Statement[js.Array[BindParameters] | BindParameters]
  type Transaction = typingsJapgolly.betterSqlite3.mod.BetterSqlite3.Transaction[typingsJapgolly.betterSqlite3.mod.VariableArgFunction]
  type VariableArgFunction = js.Function1[/* repeated */ js.Any, js.Any]
}
