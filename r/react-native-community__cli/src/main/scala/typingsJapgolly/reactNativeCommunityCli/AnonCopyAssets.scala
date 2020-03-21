package typingsJapgolly.reactNativeCommunityCli

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCopyAssets[ProjectConfig, DependencyConfig] extends js.Object {
  def copyAssets(assets: js.Array[String], projectConfig: ProjectConfig): Unit
  def isInstalled(projectConfig: ProjectConfig, name: String, dependencyConfig: DependencyConfig): Boolean
  def register(
    name: String,
    dependencyConfig: DependencyConfig,
    params: Record[String, String],
    projectConfig: ProjectConfig
  ): Unit
  def unlinkAssets(assets: js.Array[String], projectConfig: ProjectConfig): Unit
  def unregister(
    packageName: String,
    dependencyConfig: DependencyConfig,
    projectConfig: ProjectConfig,
    otherDependencies: js.Array[DependencyConfig]
  ): Unit
}

object AnonCopyAssets {
  @scala.inline
  def apply[ProjectConfig, DependencyConfig](
    copyAssets: (js.Array[String], ProjectConfig) => Callback,
    isInstalled: (ProjectConfig, String, DependencyConfig) => CallbackTo[Boolean],
    register: (String, DependencyConfig, Record[String, String], ProjectConfig) => Callback,
    unlinkAssets: (js.Array[String], ProjectConfig) => Callback,
    unregister: (String, DependencyConfig, ProjectConfig, js.Array[DependencyConfig]) => Callback
  ): AnonCopyAssets[ProjectConfig, DependencyConfig] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("copyAssets")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: ProjectConfig) => copyAssets(t0, t1).runNow()))
    __obj.updateDynamic("isInstalled")(js.Any.fromFunction3((t0: ProjectConfig, t1: java.lang.String, t2: DependencyConfig) => isInstalled(t0, t1, t2).runNow()))
    __obj.updateDynamic("register")(js.Any.fromFunction4((t0: java.lang.String, t1: DependencyConfig, t2: typingsJapgolly.std.Record[java.lang.String, java.lang.String], t3: ProjectConfig) => register(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("unlinkAssets")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: ProjectConfig) => unlinkAssets(t0, t1).runNow()))
    __obj.updateDynamic("unregister")(js.Any.fromFunction4((t0: java.lang.String, t1: DependencyConfig, t2: ProjectConfig, t3: js.Array[DependencyConfig]) => unregister(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[AnonCopyAssets[ProjectConfig, DependencyConfig]]
  }
}

