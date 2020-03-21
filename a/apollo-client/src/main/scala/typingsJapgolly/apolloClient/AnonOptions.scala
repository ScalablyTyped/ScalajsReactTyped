package typingsJapgolly.apolloClient

import typingsJapgolly.apolloClient.queryManagerMod.QueryManager
import typingsJapgolly.apolloClient.watchQueryOptionsMod.WatchQueryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptions[TVariables] extends js.Object {
  var options: WatchQueryOptions[TVariables]
  var queryManager: QueryManager[_]
  var shouldSubscribe: js.UndefOr[Boolean] = js.undefined
}

object AnonOptions {
  @scala.inline
  def apply[TVariables](
    options: WatchQueryOptions[TVariables],
    queryManager: QueryManager[_],
    shouldSubscribe: js.UndefOr[Boolean] = js.undefined
  ): AnonOptions[TVariables] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], queryManager = queryManager.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldSubscribe)) __obj.updateDynamic("shouldSubscribe")(shouldSubscribe.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptions[TVariables]]
  }
}

