package typingsJapgolly.apolloClient

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.apolloCache.mod.ApolloCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCache[TCacheShape] extends js.Object {
  var cache: ApolloCache[TCacheShape]
  def getCacheKey(obj: AnonId): js.Any
}

object AnonCache {
  @scala.inline
  def apply[TCacheShape](cache: ApolloCache[TCacheShape], getCacheKey: AnonId => CallbackTo[js.Any]): AnonCache[TCacheShape] = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
    __obj.updateDynamic("getCacheKey")(js.Any.fromFunction1((t0: typingsJapgolly.apolloClient.AnonId) => getCacheKey(t0).runNow()))
    __obj.asInstanceOf[AnonCache[TCacheShape]]
  }
}

