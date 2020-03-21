package typingsJapgolly.angularCompiler.viewCompilerMod

import typingsJapgolly.angularCompiler.apiMod.R3DirectiveDef
import typingsJapgolly.angularCompiler.apiMod.R3DirectiveMetadata
import typingsJapgolly.angularCompiler.bindingParserMod.BindingParser
import typingsJapgolly.angularCompiler.constantPoolMod.ConstantPool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/compiler", "compileDirectiveFromMetadata")
@js.native
object compileDirectiveFromMetadata extends js.Object {
  def apply(meta: R3DirectiveMetadata, constantPool: ConstantPool, bindingParser: BindingParser): R3DirectiveDef = js.native
}

