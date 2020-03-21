package typingsJapgolly.knex.mod

import typingsJapgolly.knex.knexBooleans.`false`
import typingsJapgolly.knex.knexStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// commons
@js.native
trait ColumnNameQueryBuilder[TRecord, TResult] extends js.Object {
  // When all columns are known to be keys of original record,
  // we can extend our selection by these columns
  def apply(columnName: Asterisk): QueryBuilder[
    TRecord, 
    js.Array[
      DeferredKeySelection[TRecord, String, `false`, js.Object, `false`, js.Object, scala.Nothing]
    ]
  ] = js.native
  // For non-inferrable column selection, we will allow consumer to
  // specify result type and if not widen the result to entire record type with any omissions permitted
  def apply[TResult2](columnNames: (ColumnDescriptor[TRecord, TResult])*): QueryBuilder[TRecord, TResult2] = js.native
  def apply[TResult2](columnNames: js.Array[ColumnDescriptor[TRecord, TResult]]): QueryBuilder[TRecord, TResult2] = js.native
}

