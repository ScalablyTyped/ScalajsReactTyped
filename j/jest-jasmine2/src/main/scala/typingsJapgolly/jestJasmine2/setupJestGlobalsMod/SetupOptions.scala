package typingsJapgolly.jestJasmine2.setupJestGlobalsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestTypes.configMod.GlobalConfig
import typingsJapgolly.jestTypes.configMod.Path
import typingsJapgolly.jestTypes.configMod.ProjectConfig
import typingsJapgolly.prettyFormat.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetupOptions extends js.Object {
  var config: ProjectConfig
  var globalConfig: GlobalConfig
  var testPath: Path
  def localRequire(moduleName: String): Plugin
}

object SetupOptions {
  @scala.inline
  def apply(
    config: ProjectConfig,
    globalConfig: GlobalConfig,
    localRequire: String => CallbackTo[Plugin],
    testPath: Path
  ): SetupOptions = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], globalConfig = globalConfig.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
    __obj.updateDynamic("localRequire")(js.Any.fromFunction1((t0: java.lang.String) => localRequire(t0).runNow()))
    __obj.asInstanceOf[SetupOptions]
  }
}

