package typingsJapgolly.eslint.mod.Linter

import typingsJapgolly.eslint.mod.AST.Program
import typingsJapgolly.eslint.mod.Scope.ScopeManager
import typingsJapgolly.eslint.mod.SourceCode.ParserServices
import typingsJapgolly.eslint.mod.SourceCode.VisitorKeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ESLintParseResult extends js.Object {
  var ast: Program
  var parserServices: js.UndefOr[ParserServices] = js.undefined
  var scopeManager: js.UndefOr[ScopeManager] = js.undefined
  var visitorKeys: js.UndefOr[VisitorKeys] = js.undefined
}

object ESLintParseResult {
  @scala.inline
  def apply(
    ast: Program,
    parserServices: ParserServices = null,
    scopeManager: ScopeManager = null,
    visitorKeys: VisitorKeys = null
  ): ESLintParseResult = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any])
    if (parserServices != null) __obj.updateDynamic("parserServices")(parserServices.asInstanceOf[js.Any])
    if (scopeManager != null) __obj.updateDynamic("scopeManager")(scopeManager.asInstanceOf[js.Any])
    if (visitorKeys != null) __obj.updateDynamic("visitorKeys")(visitorKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ESLintParseResult]
  }
}

