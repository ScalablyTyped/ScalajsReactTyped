package typingsJapgolly.apolloClient.observableQueryMod

import typingsJapgolly.apolloClient.queriesMod.QueryStoreValue
import typingsJapgolly.apolloClient.watchQueryOptionsMod.ErrorPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/core/ObservableQuery", "hasError")
@js.native
object hasError extends js.Object {
  def apply(storeValue: QueryStoreValue): Boolean | js.Error = js.native
  def apply(storeValue: QueryStoreValue, policy: ErrorPolicy): Boolean | js.Error = js.native
}

