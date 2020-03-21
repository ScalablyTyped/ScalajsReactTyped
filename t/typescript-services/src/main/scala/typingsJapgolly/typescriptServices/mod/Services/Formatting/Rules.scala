package typingsJapgolly.typescriptServices.mod.Services.Formatting

import typingsJapgolly.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.Rules")
@js.native
class Rules ()
  extends typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rules

/* static members */
@JSImport("typescript-services", "Services.Formatting.Rules")
@js.native
object Rules extends js.Object {
  def IsAfterCodeBlockContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsBeforeBlockContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsBeforeMultilineBlockContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsBinaryOpContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsBlockContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsControlDeclContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsForContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsFunctionCallContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsFunctionCallOrNewContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsFunctionDeclContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsModuleDeclContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsMultilineBlockContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsNewContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsNotBinaryOpContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsNotForContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsNotFormatOnEnter(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsObjectContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsObjectTypeContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsSameLineTokenContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsSameLineTokenOrBeforeMultilineBlockContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsSingleLineBlockContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsTypeArgumentOrParameter(tokenKind: SyntaxKind, parentKind: SyntaxKind): Boolean = js.native
  def IsTypeArgumentOrParameterContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsTypeScriptDeclWithBlockContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsVoidOpContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def NodeIsBlockContext(node: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext): Boolean = js.native
  def NodeIsTypeScriptDeclWithBlockContext(node: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext): Boolean = js.native
}

