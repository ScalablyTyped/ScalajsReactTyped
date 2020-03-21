package typingsJapgolly.angularCompiler.templateMod

import typingsJapgolly.angularCompiler.coreMod.SecurityContext
import typingsJapgolly.angularCompiler.outputAstMod.ExternalExpr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/template", "resolveSanitizationFn")
@js.native
object resolveSanitizationFn extends js.Object {
  def apply(context: SecurityContext): ExternalExpr | Null = js.native
  def apply(context: SecurityContext, isAttribute: Boolean): ExternalExpr | Null = js.native
}

