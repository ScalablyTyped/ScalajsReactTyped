package typingsJapgolly.appBuilderLib.updateInfoBuilderMod

import typingsJapgolly.appBuilderLib.packagerMod.Packager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/publish/updateInfoBuilder", "writeUpdateInfoFiles")
@js.native
object writeUpdateInfoFiles extends js.Object {
  def apply(updateInfoFileTasks: js.Array[UpdateInfoFileTask], packager: Packager): js.Promise[Unit] = js.native
}

