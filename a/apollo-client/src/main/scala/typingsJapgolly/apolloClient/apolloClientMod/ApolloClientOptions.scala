package typingsJapgolly.apolloClient.apolloClientMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.apolloCache.mod.ApolloCache
import typingsJapgolly.apolloClient.localStateMod.FragmentMatcher
import typingsJapgolly.apolloClient.typesMod.Resolvers
import typingsJapgolly.apolloLink.mod.ApolloLink
import typingsJapgolly.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloClientOptions[TCacheShape] extends js.Object {
  var assumeImmutableResults: js.UndefOr[Boolean] = js.undefined
  var cache: ApolloCache[TCacheShape]
  var connectToDevTools: js.UndefOr[Boolean] = js.undefined
  var defaultOptions: js.UndefOr[DefaultOptions] = js.undefined
  var fragmentMatcher: js.UndefOr[FragmentMatcher] = js.undefined
  var link: js.UndefOr[ApolloLink] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var queryDeduplication: js.UndefOr[Boolean] = js.undefined
  var resolvers: js.UndefOr[Resolvers | js.Array[Resolvers]] = js.undefined
  var ssrForceFetchDelay: js.UndefOr[Double] = js.undefined
  var ssrMode: js.UndefOr[Boolean] = js.undefined
  var typeDefs: js.UndefOr[String | (js.Array[DocumentNode | String]) | DocumentNode] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object ApolloClientOptions {
  @scala.inline
  def apply[TCacheShape](
    cache: ApolloCache[TCacheShape],
    assumeImmutableResults: js.UndefOr[Boolean] = js.undefined,
    connectToDevTools: js.UndefOr[Boolean] = js.undefined,
    defaultOptions: DefaultOptions = null,
    fragmentMatcher: (/* rootValue */ js.Any, /* typeCondition */ String, /* context */ js.Any) => CallbackTo[Boolean] = null,
    link: ApolloLink = null,
    name: String = null,
    queryDeduplication: js.UndefOr[Boolean] = js.undefined,
    resolvers: Resolvers | js.Array[Resolvers] = null,
    ssrForceFetchDelay: Int | Double = null,
    ssrMode: js.UndefOr[Boolean] = js.undefined,
    typeDefs: String | (js.Array[DocumentNode | String]) | DocumentNode = null,
    version: String = null
  ): ApolloClientOptions[TCacheShape] = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
    if (!js.isUndefined(assumeImmutableResults)) __obj.updateDynamic("assumeImmutableResults")(assumeImmutableResults.asInstanceOf[js.Any])
    if (!js.isUndefined(connectToDevTools)) __obj.updateDynamic("connectToDevTools")(connectToDevTools.asInstanceOf[js.Any])
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions.asInstanceOf[js.Any])
    if (fragmentMatcher != null) __obj.updateDynamic("fragmentMatcher")(js.Any.fromFunction3((t0: /* rootValue */ js.Any, t1: /* typeCondition */ java.lang.String, t2: /* context */ js.Any) => fragmentMatcher(t0, t1, t2).runNow()))
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(queryDeduplication)) __obj.updateDynamic("queryDeduplication")(queryDeduplication.asInstanceOf[js.Any])
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers.asInstanceOf[js.Any])
    if (ssrForceFetchDelay != null) __obj.updateDynamic("ssrForceFetchDelay")(ssrForceFetchDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(ssrMode)) __obj.updateDynamic("ssrMode")(ssrMode.asInstanceOf[js.Any])
    if (typeDefs != null) __obj.updateDynamic("typeDefs")(typeDefs.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApolloClientOptions[TCacheShape]]
  }
}

