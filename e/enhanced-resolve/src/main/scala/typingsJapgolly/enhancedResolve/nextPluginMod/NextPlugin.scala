package typingsJapgolly.enhancedResolve.nextPluginMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextPlugin extends js.Object {
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typingsJapgolly.enhancedResolve.resolverMod.^): Unit
}

object NextPlugin {
  @scala.inline
  def apply(apply: typingsJapgolly.enhancedResolve.resolverMod.^ => Callback, source: String, target: String): NextPlugin = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("apply")(js.Any.fromFunction1((t0: typingsJapgolly.enhancedResolve.resolverMod.^) => apply(t0).runNow()))
    __obj.asInstanceOf[NextPlugin]
  }
}

