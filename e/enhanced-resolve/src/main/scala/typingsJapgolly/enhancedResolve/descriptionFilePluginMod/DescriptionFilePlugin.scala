package typingsJapgolly.enhancedResolve.descriptionFilePluginMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptionFilePlugin extends js.Object {
  var filenames: js.Array[String]
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typingsJapgolly.enhancedResolve.resolverMod.^): Unit
}

object DescriptionFilePlugin {
  @scala.inline
  def apply(
    apply: typingsJapgolly.enhancedResolve.resolverMod.^ => Callback,
    filenames: js.Array[String],
    source: String,
    target: String
  ): DescriptionFilePlugin = {
    val __obj = js.Dynamic.literal(filenames = filenames.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("apply")(js.Any.fromFunction1((t0: typingsJapgolly.enhancedResolve.resolverMod.^) => apply(t0).runNow()))
    __obj.asInstanceOf[DescriptionFilePlugin]
  }
}

