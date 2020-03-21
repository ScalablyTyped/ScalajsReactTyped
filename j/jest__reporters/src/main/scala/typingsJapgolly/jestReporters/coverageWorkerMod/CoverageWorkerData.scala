package typingsJapgolly.jestReporters.coverageWorkerMod

import typingsJapgolly.jestReporters.typesMod.CoverageReporterSerializedOptions
import typingsJapgolly.jestTypes.configMod.GlobalConfig
import typingsJapgolly.jestTypes.configMod.Path
import typingsJapgolly.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageWorkerData extends js.Object {
  var config: ProjectConfig
  var globalConfig: GlobalConfig
  var options: js.UndefOr[CoverageReporterSerializedOptions] = js.undefined
  var path: Path
}

object CoverageWorkerData {
  @scala.inline
  def apply(
    config: ProjectConfig,
    globalConfig: GlobalConfig,
    path: Path,
    options: CoverageReporterSerializedOptions = null
  ): CoverageWorkerData = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], globalConfig = globalConfig.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageWorkerData]
  }
}

