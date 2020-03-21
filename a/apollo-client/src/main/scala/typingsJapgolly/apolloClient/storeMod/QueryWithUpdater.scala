package typingsJapgolly.apolloClient.storeMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.apolloClient.AnonMutationResult
import typingsJapgolly.apolloClient.queriesMod.QueryStoreValue
import typingsJapgolly.apolloClient.typesMod.MutationQueryReducer
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryWithUpdater extends js.Object {
  var query: QueryStoreValue
  var updater: MutationQueryReducer[js.Object]
}

object QueryWithUpdater {
  @scala.inline
  def apply(
    query: QueryStoreValue,
    updater: (/* previousResult */ Record[String, js.Any], /* options */ AnonMutationResult[js.Object]) => CallbackTo[Record[String, js.Any]]
  ): QueryWithUpdater = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("updater")(js.Any.fromFunction2((t0: /* previousResult */ typingsJapgolly.std.Record[java.lang.String, js.Any], t1: /* options */ typingsJapgolly.apolloClient.AnonMutationResult[js.Object]) => updater(t0, t1).runNow()))
    __obj.asInstanceOf[QueryWithUpdater]
  }
}

