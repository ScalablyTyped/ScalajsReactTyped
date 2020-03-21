package typingsJapgolly.angularCompiler.publicApiMod

import typingsJapgolly.angularCompiler.astMod.BindingType
import typingsJapgolly.angularCompiler.coreMod.SecurityContext
import typingsJapgolly.angularCompiler.i18nAstMod.Message
import typingsJapgolly.angularCompiler.i18nAstMod.Node
import typingsJapgolly.angularCompiler.r3AstMod.BoundAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "TmplAstBoundAttribute")
@js.native
class TmplAstBoundAttribute protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.TmplAstBoundAttribute {
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typingsJapgolly.angularCompiler.astMod.AST,
    unit: String,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typingsJapgolly.angularCompiler.astMod.AST,
    unit: Null,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typingsJapgolly.angularCompiler.astMod.AST,
    unit: String,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typingsJapgolly.angularCompiler.astMod.AST,
    unit: Null,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typingsJapgolly.angularCompiler.astMod.AST,
    unit: String,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: js.UndefOr[scala.Nothing],
    i18n: Message
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typingsJapgolly.angularCompiler.astMod.AST,
    unit: String,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: js.UndefOr[scala.Nothing],
    i18n: Node
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typingsJapgolly.angularCompiler.astMod.AST,
    unit: String,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typingsJapgolly.angularCompiler.astMod.AST,
    unit: String,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typingsJapgolly.angularCompiler.astMod.AST,
    unit: Null,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: js.UndefOr[scala.Nothing],
    i18n: Message
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typingsJapgolly.angularCompiler.astMod.AST,
    unit: Null,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: js.UndefOr[scala.Nothing],
    i18n: Node
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typingsJapgolly.angularCompiler.astMod.AST,
    unit: Null,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typingsJapgolly.angularCompiler.astMod.AST,
    unit: Null,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
}

/* static members */
@JSImport("@angular/compiler/public_api", "TmplAstBoundAttribute")
@js.native
object TmplAstBoundAttribute extends js.Object {
  def fromBoundElementProperty(prop: typingsJapgolly.angularCompiler.astMod.BoundElementProperty): BoundAttribute = js.native
  def fromBoundElementProperty(
    prop: typingsJapgolly.angularCompiler.astMod.BoundElementProperty,
    i18n: typingsJapgolly.angularCompiler.i18nAstMod.AST
  ): BoundAttribute = js.native
}

