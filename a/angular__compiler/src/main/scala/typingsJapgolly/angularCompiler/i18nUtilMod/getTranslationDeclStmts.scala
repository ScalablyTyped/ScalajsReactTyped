package typingsJapgolly.angularCompiler.i18nUtilMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularCompiler.outputAstMod.Expression
import typingsJapgolly.angularCompiler.outputAstMod.ReadVarExpr
import typingsJapgolly.angularCompiler.outputAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/i18n/util", "getTranslationDeclStmts")
@js.native
object getTranslationDeclStmts extends js.Object {
  def apply(variable: ReadVarExpr, closureVar: ReadVarExpr, message: String, meta: I18nMeta): js.Array[Statement] = js.native
  def apply(
    variable: ReadVarExpr,
    closureVar: ReadVarExpr,
    message: String,
    meta: I18nMeta,
    params: StringDictionary[Expression]
  ): js.Array[Statement] = js.native
  def apply(
    variable: ReadVarExpr,
    closureVar: ReadVarExpr,
    message: String,
    meta: I18nMeta,
    params: StringDictionary[Expression],
    transformFn: js.Function1[/* raw */ ReadVarExpr, Expression]
  ): js.Array[Statement] = js.native
}

