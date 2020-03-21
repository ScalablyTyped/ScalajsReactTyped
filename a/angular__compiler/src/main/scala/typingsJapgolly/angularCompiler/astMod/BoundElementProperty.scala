package typingsJapgolly.angularCompiler.astMod

import typingsJapgolly.angularCompiler.coreMod.SecurityContext
import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "BoundElementProperty")
@js.native
class BoundElementProperty protected () extends js.Object {
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: AST,
    unit: String,
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: AST,
    unit: Null,
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: AST,
    unit: String,
    sourceSpan: ParseSourceSpan,
    valueSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: AST,
    unit: Null,
    sourceSpan: ParseSourceSpan,
    valueSpan: ParseSourceSpan
  ) = this()
  var name: String = js.native
  var securityContext: SecurityContext = js.native
  var sourceSpan: ParseSourceSpan = js.native
  var `type`: BindingType = js.native
  var unit: String | Null = js.native
  var value: AST = js.native
  var valueSpan: js.UndefOr[ParseSourceSpan] = js.native
}

