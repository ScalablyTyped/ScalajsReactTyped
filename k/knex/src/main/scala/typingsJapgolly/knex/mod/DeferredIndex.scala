package typingsJapgolly.knex.mod

import typingsJapgolly.knex.knexBooleans.`true`
import typingsJapgolly.knex.mod.DeferredKeySelection.AddKey
import typingsJapgolly.knex.mod.DeferredKeySelection.SetBase
import typingsJapgolly.knex.mod.DeferredKeySelection.SetSingle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knex", "DeferredIndex")
@js.native
object DeferredIndex extends js.Object {
  type Augment[T, TBase, TKey /* <: String */, TAliasMapping] = SetSingle[AddKey[SetBase[T, TBase], TKey], `true`]
}

