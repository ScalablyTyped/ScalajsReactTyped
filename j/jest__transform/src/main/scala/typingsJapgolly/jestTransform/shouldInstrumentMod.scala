package typingsJapgolly.jestTransform

import typingsJapgolly.jestTransform.typesMod.ShouldInstrumentOptions
import typingsJapgolly.jestTypes.configMod.Path
import typingsJapgolly.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/transform/build/shouldInstrument", JSImport.Namespace)
@js.native
object shouldInstrumentMod extends js.Object {
  def default(filename: Path, options: ShouldInstrumentOptions, config: ProjectConfig): Boolean = js.native
}

