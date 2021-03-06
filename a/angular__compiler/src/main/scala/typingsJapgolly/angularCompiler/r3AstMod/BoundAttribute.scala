package typingsJapgolly.angularCompiler.r3AstMod

import typingsJapgolly.angularCompiler.astMod.AST
import typingsJapgolly.angularCompiler.astMod.BindingType
import typingsJapgolly.angularCompiler.astMod.BoundElementProperty
import typingsJapgolly.angularCompiler.coreMod.SecurityContext
import typingsJapgolly.angularCompiler.i18nAstMod.Message
import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_ast", "BoundAttribute")
@js.native
class BoundAttribute protected () extends Node {
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
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: AST,
    unit: String,
    sourceSpan: ParseSourceSpan,
    valueSpan: js.UndefOr[scala.Nothing],
    i18n: Message
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: AST,
    unit: String,
    sourceSpan: ParseSourceSpan,
    valueSpan: js.UndefOr[scala.Nothing],
    i18n: typingsJapgolly.angularCompiler.i18nAstMod.Node
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: AST,
    unit: String,
    sourceSpan: ParseSourceSpan,
    valueSpan: ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: AST,
    unit: String,
    sourceSpan: ParseSourceSpan,
    valueSpan: ParseSourceSpan,
    i18n: typingsJapgolly.angularCompiler.i18nAstMod.Node
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: AST,
    unit: Null,
    sourceSpan: ParseSourceSpan,
    valueSpan: js.UndefOr[scala.Nothing],
    i18n: Message
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: AST,
    unit: Null,
    sourceSpan: ParseSourceSpan,
    valueSpan: js.UndefOr[scala.Nothing],
    i18n: typingsJapgolly.angularCompiler.i18nAstMod.Node
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: AST,
    unit: Null,
    sourceSpan: ParseSourceSpan,
    valueSpan: ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: AST,
    unit: Null,
    sourceSpan: ParseSourceSpan,
    valueSpan: ParseSourceSpan,
    i18n: typingsJapgolly.angularCompiler.i18nAstMod.Node
  ) = this()
  var i18n: js.UndefOr[Message | typingsJapgolly.angularCompiler.i18nAstMod.Node] = js.native
  var name: String = js.native
  var securityContext: SecurityContext = js.native
  /* CompleteClass */
  override var sourceSpan: ParseSourceSpan = js.native
  var `type`: BindingType = js.native
  var unit: String | Null = js.native
  var value: AST = js.native
  var valueSpan: js.UndefOr[ParseSourceSpan] = js.native
  /* CompleteClass */
  override def visit[Result](visitor: Visitor[Result]): Result = js.native
}

/* static members */
@JSImport("@angular/compiler/src/render3/r3_ast", "BoundAttribute")
@js.native
object BoundAttribute extends js.Object {
  def fromBoundElementProperty(prop: BoundElementProperty): BoundAttribute = js.native
  def fromBoundElementProperty(prop: BoundElementProperty, i18n: typingsJapgolly.angularCompiler.i18nAstMod.AST): BoundAttribute = js.native
}

