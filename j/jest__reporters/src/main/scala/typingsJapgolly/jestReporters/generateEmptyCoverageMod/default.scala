package typingsJapgolly.jestReporters.generateEmptyCoverageMod

import typingsJapgolly.jestTypes.configMod.GlobalConfig
import typingsJapgolly.jestTypes.configMod.Path
import typingsJapgolly.jestTypes.configMod.ProjectConfig
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/reporters/build/generateEmptyCoverage", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(source: String, filename: Path, globalConfig: GlobalConfig, config: ProjectConfig): CoverageWorkerResult | Null = js.native
  def apply(
    source: String,
    filename: Path,
    globalConfig: GlobalConfig,
    config: ProjectConfig,
    changedFiles: Set[Path]
  ): CoverageWorkerResult | Null = js.native
}

