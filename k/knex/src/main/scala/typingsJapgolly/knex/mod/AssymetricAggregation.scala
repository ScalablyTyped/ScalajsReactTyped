package typingsJapgolly.knex.mod

import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Note: Attempting to unify AssymetricAggregation & TypePreservingAggregation
// by extracting out a common base interface will not work because order of overloads
// is significant.
@js.native
trait AssymetricAggregation[TRecord, TResult, TValue] extends js.Object {
  def apply[TResult2](columnNames: (Raw[_] | (Record[String, String | js.Array[String] | Raw[_]]) | String)*): QueryBuilder[TRecord, TResult2] = js.native
  def apply[TAliases /* <: js.Object */, TResult2](aliases: TAliases): QueryBuilder[TRecord, TResult2] = js.native
}

