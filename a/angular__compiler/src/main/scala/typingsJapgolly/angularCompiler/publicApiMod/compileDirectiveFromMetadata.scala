package typingsJapgolly.angularCompiler.publicApiMod

import typingsJapgolly.angularCompiler.apiMod.R3DirectiveDef
import typingsJapgolly.angularCompiler.apiMod.R3DirectiveMetadata
import typingsJapgolly.angularCompiler.bindingParserMod.BindingParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "compileDirectiveFromMetadata")
@js.native
object compileDirectiveFromMetadata extends js.Object {
  def apply(
    meta: R3DirectiveMetadata,
    constantPool: typingsJapgolly.angularCompiler.constantPoolMod.ConstantPool,
    bindingParser: BindingParser
  ): R3DirectiveDef = js.native
}

