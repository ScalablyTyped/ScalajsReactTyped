package typingsJapgolly.angularCompiler.mod

import typingsJapgolly.angularCompiler.apiMod.R3ComponentDef
import typingsJapgolly.angularCompiler.apiMod.R3ComponentMetadata
import typingsJapgolly.angularCompiler.bindingParserMod.BindingParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "compileComponentFromMetadata")
@js.native
object compileComponentFromMetadata extends js.Object {
  def apply(
    meta: R3ComponentMetadata,
    constantPool: typingsJapgolly.angularCompiler.constantPoolMod.ConstantPool,
    bindingParser: BindingParser
  ): R3ComponentDef = js.native
}

