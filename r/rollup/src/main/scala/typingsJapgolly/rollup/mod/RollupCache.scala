package typingsJapgolly.rollup.mod

import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollupCache extends js.Object {
  var modules: js.Array[ModuleJSON]
  var plugins: js.UndefOr[Record[String, SerializablePluginCache]] = js.undefined
}

object RollupCache {
  @scala.inline
  def apply(modules: js.Array[ModuleJSON], plugins: Record[String, SerializablePluginCache] = null): RollupCache = {
    val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupCache]
  }
}

