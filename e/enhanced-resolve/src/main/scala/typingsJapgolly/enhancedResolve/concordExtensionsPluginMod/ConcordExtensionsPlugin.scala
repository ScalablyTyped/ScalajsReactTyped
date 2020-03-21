package typingsJapgolly.enhancedResolve.concordExtensionsPluginMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.enhancedResolve.concordMod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcordExtensionsPlugin extends js.Object {
  var options: Dictionary[_]
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typingsJapgolly.enhancedResolve.resolverMod.^): Unit
}

object ConcordExtensionsPlugin {
  @scala.inline
  def apply(
    apply: typingsJapgolly.enhancedResolve.resolverMod.^ => Callback,
    options: Dictionary[_],
    source: String,
    target: String
  ): ConcordExtensionsPlugin = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("apply")(js.Any.fromFunction1((t0: typingsJapgolly.enhancedResolve.resolverMod.^) => apply(t0).runNow()))
    __obj.asInstanceOf[ConcordExtensionsPlugin]
  }
}

