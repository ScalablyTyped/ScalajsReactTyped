package typingsJapgolly.angularCompiler.templateMod

import typingsJapgolly.angularCompiler.bindingParserMod.BindingParser
import typingsJapgolly.angularCompiler.interpolationConfigMod.InterpolationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/template", "makeBindingParser")
@js.native
object makeBindingParser extends js.Object {
  def apply(): BindingParser = js.native
  def apply(interpolationConfig: InterpolationConfig): BindingParser = js.native
}

