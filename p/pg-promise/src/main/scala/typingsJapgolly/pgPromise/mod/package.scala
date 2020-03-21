package typingsJapgolly.pgPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pgPromise.mod.Column
    - typingsJapgolly.pgPromise.mod.ColumnSet
    - js.Array[
  java.lang.String | typingsJapgolly.pgPromise.mod.IColumnConfig | typingsJapgolly.pgPromise.mod.Column]
  */
  type QueryColumns = typingsJapgolly.pgPromise.mod._QueryColumns | (js.Array[
    java.lang.String | typingsJapgolly.pgPromise.mod.IColumnConfig | typingsJapgolly.pgPromise.mod.Column
  ])
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.pgPromise.mod.QueryFile
    - typingsJapgolly.pgPromise.mod.IPreparedStatement
    - typingsJapgolly.pgPromise.mod.IParameterizedQuery
    - typingsJapgolly.pgPromise.mod.PreparedStatement
    - typingsJapgolly.pgPromise.mod.ParameterizedQuery
    - js.Function1[
  / * values * / js.UndefOr[js.Any], 
  / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias pg-promise.pg-promise.QueryParam * / js.Object]
  */
  type QueryParam = typingsJapgolly.pgPromise.mod._QueryParam | (js.Function1[
    /* values */ js.UndefOr[js.Any], 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias pg-promise.pg-promise.QueryParam */ js.Object
  ]) | java.lang.String
  type ValidSchema = java.lang.String | js.Array[java.lang.String] | scala.Null | scala.Unit
  type XPromise[T] = js.Promise[T]
}
