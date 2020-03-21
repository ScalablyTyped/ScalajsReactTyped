package typingsJapgolly.angularCompiler.mod

import typingsJapgolly.angularCompiler.coreMod.SecurityContext
import typingsJapgolly.angularCompiler.templateAstMod.PropertyBindingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "BoundElementPropertyAst")
@js.native
class BoundElementPropertyAst protected ()
  extends typingsJapgolly.angularCompiler.publicApiMod.BoundElementPropertyAst {
  def this(
    name: String,
    `type`: PropertyBindingType,
    securityContext: SecurityContext,
    value: typingsJapgolly.angularCompiler.astMod.AST,
    unit: String,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: PropertyBindingType,
    securityContext: SecurityContext,
    value: typingsJapgolly.angularCompiler.astMod.AST,
    unit: Null,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

/* static members */
@JSImport("@angular/compiler", "BoundElementPropertyAst")
@js.native
object BoundElementPropertyAst extends js.Object {
  def fromBoundProperty(prop: typingsJapgolly.angularCompiler.astMod.BoundElementProperty): typingsJapgolly.angularCompiler.templateAstMod.BoundElementPropertyAst = js.native
}

