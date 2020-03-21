package typingsJapgolly.enhancedResolve.logInfoPluginMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogInfoPlugin extends js.Object {
  var source: String
  @JSName("apply")
  def apply(resolver: typingsJapgolly.enhancedResolve.resolverMod.^): Unit
}

object LogInfoPlugin {
  @scala.inline
  def apply(apply: typingsJapgolly.enhancedResolve.resolverMod.^ => Callback, source: String): LogInfoPlugin = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("apply")(js.Any.fromFunction1((t0: typingsJapgolly.enhancedResolve.resolverMod.^) => apply(t0).runNow()))
    __obj.asInstanceOf[LogInfoPlugin]
  }
}

