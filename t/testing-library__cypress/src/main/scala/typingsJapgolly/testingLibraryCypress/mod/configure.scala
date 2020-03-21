package typingsJapgolly.testingLibraryCypress.mod

import typingsJapgolly.testingLibraryDom.PartialConfig
import typingsJapgolly.testingLibraryDom.configMod.ConfigFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/cypress", "configure")
@js.native
object configure extends js.Object {
  def apply(configDelta: PartialConfig): Unit = js.native
  def apply(configDelta: ConfigFn): Unit = js.native
}

