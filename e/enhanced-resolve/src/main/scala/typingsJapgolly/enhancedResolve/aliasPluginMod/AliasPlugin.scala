package typingsJapgolly.enhancedResolve.aliasPluginMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.enhancedResolve.mod.ResolverFactory.AliasItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasPlugin extends js.Object {
  var alias: String
  var name: String
  var onlyModule: Boolean
  var options: AliasItem
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typingsJapgolly.enhancedResolve.resolverMod.^): Unit
}

object AliasPlugin {
  @scala.inline
  def apply(
    alias: String,
    apply: typingsJapgolly.enhancedResolve.resolverMod.^ => Callback,
    name: String,
    onlyModule: Boolean,
    options: AliasItem,
    source: String,
    target: String
  ): AliasPlugin = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onlyModule = onlyModule.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("apply")(js.Any.fromFunction1((t0: typingsJapgolly.enhancedResolve.resolverMod.^) => apply(t0).runNow()))
    __obj.asInstanceOf[AliasPlugin]
  }
}

