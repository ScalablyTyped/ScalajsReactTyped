package typingsJapgolly.objection.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.knex.mod.AliasDict
import typingsJapgolly.knex.mod.TableDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryContext
  extends /* key */ StringDictionary[js.Any] {
  @JSName("transaction")
  var transaction_Original: Transaction_ = js.native
  def transaction[TRecord2, TResult2](): typingsJapgolly.knex.mod.QueryBuilder[TRecord2, TResult2] = js.native
  def transaction[TRecord2, TResult2](tableName: AliasDict): typingsJapgolly.knex.mod.QueryBuilder[TRecord2, TResult2] = js.native
  def transaction[TRecord2, TResult2](tableName: TableDescriptor): typingsJapgolly.knex.mod.QueryBuilder[TRecord2, TResult2] = js.native
}

