package typingsJapgolly.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait With[TRecord, TResult]
  extends WithRaw[TRecord, TResult]
     with WithWrapped[TRecord, TResult] {
  /* InferMemberOverrides */
  override def apply(alias: String, raw: QueryBuilder[_, js.Array[SafePartial[_]]]): QueryBuilder[TRecord, TResult] = js.native
}

