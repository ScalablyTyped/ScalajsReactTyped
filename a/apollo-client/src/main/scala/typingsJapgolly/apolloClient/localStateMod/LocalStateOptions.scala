package typingsJapgolly.apolloClient.localStateMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.apolloCache.mod.ApolloCache
import typingsJapgolly.apolloClient.apolloClientMod.default
import typingsJapgolly.apolloClient.typesMod.Resolvers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalStateOptions[TCacheShape] extends js.Object {
  var cache: ApolloCache[TCacheShape]
  var client: js.UndefOr[default[TCacheShape]] = js.undefined
  var fragmentMatcher: js.UndefOr[FragmentMatcher] = js.undefined
  var resolvers: js.UndefOr[Resolvers | js.Array[Resolvers]] = js.undefined
}

object LocalStateOptions {
  @scala.inline
  def apply[TCacheShape](
    cache: ApolloCache[TCacheShape],
    client: default[TCacheShape] = null,
    fragmentMatcher: (/* rootValue */ js.Any, /* typeCondition */ String, /* context */ js.Any) => CallbackTo[Boolean] = null,
    resolvers: Resolvers | js.Array[Resolvers] = null
  ): LocalStateOptions[TCacheShape] = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (fragmentMatcher != null) __obj.updateDynamic("fragmentMatcher")(js.Any.fromFunction3((t0: /* rootValue */ js.Any, t1: /* typeCondition */ java.lang.String, t2: /* context */ js.Any) => fragmentMatcher(t0, t1, t2).runNow()))
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalStateOptions[TCacheShape]]
  }
}

