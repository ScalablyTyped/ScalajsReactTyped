package typingsJapgolly.enhancedResolve.modulesInHierachicDirectoriesPluginMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModulesInHierachicDirectoriesPlugin extends js.Object {
  var directories: js.Array[String]
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typingsJapgolly.enhancedResolve.resolverMod.^): Unit
}

object ModulesInHierachicDirectoriesPlugin {
  @scala.inline
  def apply(
    apply: typingsJapgolly.enhancedResolve.resolverMod.^ => Callback,
    directories: js.Array[String],
    source: String,
    target: String
  ): ModulesInHierachicDirectoriesPlugin = {
    val __obj = js.Dynamic.literal(directories = directories.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("apply")(js.Any.fromFunction1((t0: typingsJapgolly.enhancedResolve.resolverMod.^) => apply(t0).runNow()))
    __obj.asInstanceOf[ModulesInHierachicDirectoriesPlugin]
  }
}

