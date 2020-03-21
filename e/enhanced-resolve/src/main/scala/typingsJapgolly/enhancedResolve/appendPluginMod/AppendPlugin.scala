package typingsJapgolly.enhancedResolve.appendPluginMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendPlugin extends js.Object {
  var appending: String
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typingsJapgolly.enhancedResolve.resolverMod.^): Unit
}

object AppendPlugin {
  @scala.inline
  def apply(
    appending: String,
    apply: typingsJapgolly.enhancedResolve.resolverMod.^ => Callback,
    source: String,
    target: String
  ): AppendPlugin = {
    val __obj = js.Dynamic.literal(appending = appending.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("apply")(js.Any.fromFunction1((t0: typingsJapgolly.enhancedResolve.resolverMod.^) => apply(t0).runNow()))
    __obj.asInstanceOf[AppendPlugin]
  }
}

