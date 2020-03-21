package typingsJapgolly.jestConfig.mod

import typingsJapgolly.jestConfig.AnonConfigs
import typingsJapgolly.jestTypes.configMod.Argv
import typingsJapgolly.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-config", "readConfigs")
@js.native
object readConfigs extends js.Object {
  def apply(argv: Argv, projectPaths: js.Array[Path]): AnonConfigs = js.native
}

