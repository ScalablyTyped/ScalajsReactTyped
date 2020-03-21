package typingsJapgolly.enhancedResolve.useFilePluginMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseFilePlugin extends js.Object {
  var filename: String
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typingsJapgolly.enhancedResolve.resolverMod.^): Unit
}

object UseFilePlugin {
  @scala.inline
  def apply(
    apply: typingsJapgolly.enhancedResolve.resolverMod.^ => Callback,
    filename: String,
    source: String,
    target: String
  ): UseFilePlugin = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("apply")(js.Any.fromFunction1((t0: typingsJapgolly.enhancedResolve.resolverMod.^) => apply(t0).runNow()))
    __obj.asInstanceOf[UseFilePlugin]
  }
}

