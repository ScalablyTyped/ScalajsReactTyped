package typingsJapgolly.jestRunner

import typingsJapgolly.jestResolve.mod.^
import typingsJapgolly.jestRunner.typesMod.TestRunnerContext
import typingsJapgolly.jestTestResult.typesMod.TestResult
import typingsJapgolly.jestTypes.configMod.GlobalConfig
import typingsJapgolly.jestTypes.configMod.Path
import typingsJapgolly.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-runner/build/runTest", JSImport.Namespace)
@js.native
object runTestMod extends js.Object {
  def default(path: Path, globalConfig: GlobalConfig, config: ProjectConfig, resolver: ^): js.Promise[TestResult] = js.native
  def default(
    path: Path,
    globalConfig: GlobalConfig,
    config: ProjectConfig,
    resolver: ^,
    context: TestRunnerContext
  ): js.Promise[TestResult] = js.native
}

