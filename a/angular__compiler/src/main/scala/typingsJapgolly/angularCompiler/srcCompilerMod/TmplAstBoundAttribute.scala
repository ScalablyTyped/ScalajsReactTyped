package typingsJapgolly.angularCompiler.srcCompilerMod

import typingsJapgolly.angularCompiler.astMod.BindingType
import typingsJapgolly.angularCompiler.coreMod.SecurityContext
import typingsJapgolly.angularCompiler.i18nAstMod.Message
import typingsJapgolly.angularCompiler.i18nAstMod.Node
import typingsJapgolly.angularCompiler.r3AstMod.BoundAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "TmplAstBoundAttribute")
@js.native
class TmplAstBoundAttribute protected () extends BoundAttribute {
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
@JSImport("@angular/compiler/src/compiler", "TmplAstBoundAttribute")
@js.native
object TmplAstBoundAttribute extends js.Object {
  def fromBoundElementProperty(prop: typingsJapgolly.angularCompiler.astMod.BoundElementProperty): BoundAttribute = js.native
  def fromBoundElementProperty(
    prop: typingsJapgolly.angularCompiler.astMod.BoundElementProperty,
    i18n: typingsJapgolly.angularCompiler.i18nAstMod.AST
  ): BoundAttribute = js.native
}

