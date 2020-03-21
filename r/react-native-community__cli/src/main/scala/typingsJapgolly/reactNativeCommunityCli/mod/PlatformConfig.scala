package typingsJapgolly.reactNativeCommunityCli.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNativeCommunityCli.AnonCopyAssets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformConfig[ProjectParams, DependencyParams, ProjectConfig, DependencyConfig] extends js.Object {
  def dependencyConfig(dependency: String, params: DependencyParams): DependencyConfig
  def linkConfig(): AnonCopyAssets[ProjectConfig, DependencyConfig]
  def projectConfig(projectRoot: String, projectParams: ProjectParams): ProjectConfig
}

object PlatformConfig {
  @scala.inline
  def apply[ProjectParams, DependencyParams, ProjectConfig, DependencyConfig](
    dependencyConfig: (String, DependencyParams) => CallbackTo[DependencyConfig],
    linkConfig: CallbackTo[AnonCopyAssets[ProjectConfig, DependencyConfig]],
    projectConfig: (String, ProjectParams) => CallbackTo[ProjectConfig]
  ): PlatformConfig[ProjectParams, DependencyParams, ProjectConfig, DependencyConfig] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dependencyConfig")(js.Any.fromFunction2((t0: java.lang.String, t1: DependencyParams) => dependencyConfig(t0, t1).runNow()))
    __obj.updateDynamic("linkConfig")(linkConfig.toJsFn)
    __obj.updateDynamic("projectConfig")(js.Any.fromFunction2((t0: java.lang.String, t1: ProjectParams) => projectConfig(t0, t1).runNow()))
    __obj.asInstanceOf[PlatformConfig[ProjectParams, DependencyParams, ProjectConfig, DependencyConfig]]
  }
}

