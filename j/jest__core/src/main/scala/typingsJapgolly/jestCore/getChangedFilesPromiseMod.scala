package typingsJapgolly.jestCore

import typingsJapgolly.jestChangedFiles.typesMod.ChangedFiles
import typingsJapgolly.jestTypes.configMod.GlobalConfig
import typingsJapgolly.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/getChangedFilesPromise", JSImport.Namespace)
@js.native
object getChangedFilesPromiseMod extends js.Object {
  def default(globalConfig: GlobalConfig, configs: js.Array[ProjectConfig]): js.UndefOr[js.Promise[ChangedFiles]] = js.native
}

