package typingsJapgolly.atAngularCompiler.publicUnderscoreApiMod

import typingsJapgolly.atAngularCompiler.srcRender3ViewApiMod.R3ComponentDef
import typingsJapgolly.atAngularCompiler.srcRender3ViewApiMod.R3ComponentMetadata
import typingsJapgolly.atAngularCompiler.srcTemplateUnderscoreParserBindingUnderscoreParserMod.BindingParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "compileComponentFromMetadata")
@js.native
object compileComponentFromMetadata extends js.Object {
  def apply(
    meta: R3ComponentMetadata,
    constantPool: typingsJapgolly.atAngularCompiler.srcConstantUnderscorePoolMod.ConstantPool,
    bindingParser: BindingParser
  ): R3ComponentDef = js.native
}

