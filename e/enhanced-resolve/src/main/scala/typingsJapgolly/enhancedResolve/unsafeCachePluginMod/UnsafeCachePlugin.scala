package typingsJapgolly.enhancedResolve.unsafeCachePluginMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.enhancedResolve.commonTypesMod.ResolverRequest
import typingsJapgolly.enhancedResolve.concordMod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsafeCachePlugin extends js.Object {
  var cache: Dictionary[_]
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typingsJapgolly.enhancedResolve.resolverMod.^): Unit
  def filterPredicate(request: ResolverRequest): Boolean
}

object UnsafeCachePlugin {
  @scala.inline
  def apply(
    apply: typingsJapgolly.enhancedResolve.resolverMod.^ => Callback,
    cache: Dictionary[_],
    filterPredicate: ResolverRequest => CallbackTo[Boolean],
    source: String,
    target: String
  ): UnsafeCachePlugin = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("apply")(js.Any.fromFunction1((t0: typingsJapgolly.enhancedResolve.resolverMod.^) => apply(t0).runNow()))
    __obj.updateDynamic("filterPredicate")(js.Any.fromFunction1((t0: typingsJapgolly.enhancedResolve.commonTypesMod.ResolverRequest) => filterPredicate(t0).runNow()))
    __obj.asInstanceOf[UnsafeCachePlugin]
  }
}

