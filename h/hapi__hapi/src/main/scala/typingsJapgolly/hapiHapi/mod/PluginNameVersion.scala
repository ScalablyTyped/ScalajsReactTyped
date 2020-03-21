package typingsJapgolly.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginNameVersion extends js.Object {
  /**
    * (required) the plugin name string. The name is used as a unique key. Published plugins (e.g. published in the npm
    * registry) should use the same name as the name field in their 'package.json' file. Names must be
    * unique within each application.
    */
  var name: String
  /**
    * optional plugin version. The version is only used informatively to enable other plugins to find out the versions loaded. The version should be the same as the one specified in the plugin's
    * 'package.json' file.
    */
  var version: js.UndefOr[String] = js.undefined
}

object PluginNameVersion {
  @scala.inline
  def apply(name: String, version: String = null): PluginNameVersion = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginNameVersion]
  }
}

