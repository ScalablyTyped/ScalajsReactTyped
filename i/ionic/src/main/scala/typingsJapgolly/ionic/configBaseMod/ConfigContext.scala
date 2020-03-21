package typingsJapgolly.ionic.configBaseMod

import typingsJapgolly.ionic.definitionsMod.IConfig
import typingsJapgolly.ionic.definitionsMod.IProjectConfig
import typingsJapgolly.ionic.ionicBooleans.`false`
import typingsJapgolly.ionic.ionicBooleans.`true`
import typingsJapgolly.ionicCliFramework.mod.BaseConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ionic.configBaseMod.GlobalConfigContext
  - typingsJapgolly.ionic.configBaseMod.ProjectConfigContext
*/
trait ConfigContext extends js.Object

object ConfigContext {
  @scala.inline
  def GlobalConfigContext(
    config: IConfig,
    force: Boolean,
    global: `true`,
    json: Boolean,
    root: Boolean,
    property: String = null,
    value: js.Any = null
  ): ConfigContext = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigContext]
  }
  @scala.inline
  def ProjectConfigContext(
    config: BaseConfig[IProjectConfig],
    force: Boolean,
    global: `false`,
    json: Boolean,
    root: Boolean,
    property: String = null,
    value: js.Any = null
  ): ConfigContext = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigContext]
  }
}

