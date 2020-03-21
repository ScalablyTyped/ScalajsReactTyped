package typingsJapgolly.jestRunner.testWorkerMod

import typingsJapgolly.jestRunner.typesMod.TestRunnerSerializedContext
import typingsJapgolly.jestTypes.configMod.GlobalConfig
import typingsJapgolly.jestTypes.configMod.Path
import typingsJapgolly.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerData extends js.Object {
  var config: ProjectConfig
  var context: js.UndefOr[TestRunnerSerializedContext] = js.undefined
  var globalConfig: GlobalConfig
  var path: Path
}

object WorkerData {
  @scala.inline
  def apply(
    config: ProjectConfig,
    globalConfig: GlobalConfig,
    path: Path,
    context: TestRunnerSerializedContext = null
  ): WorkerData = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], globalConfig = globalConfig.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerData]
  }
}

