package typingsJapgolly.eslint.mod.Rule

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.eslint.mod.Linter.ParserOptions
import typingsJapgolly.eslint.mod.Scope.Scope
import typingsJapgolly.eslint.mod.Scope.Variable
import typingsJapgolly.eslint.mod.SourceCode
import typingsJapgolly.eslint.mod.SourceCode.ParserServices
import typingsJapgolly.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleContext extends js.Object {
  var id: String
  var options: js.Array[_]
  var parserOptions: ParserOptions
  var parserPath: String
  var parserServices: ParserServices
  var settings: StringDictionary[js.Any]
  def getAncestors(): js.Array[Node]
  def getDeclaredVariables(node: Node): js.Array[Variable]
  def getFilename(): String
  def getScope(): Scope
  def getSourceCode(): SourceCode
  def markVariableAsUsed(name: String): Boolean
  def report(descriptor: ReportDescriptor): Unit
}

object RuleContext {
  @scala.inline
  def apply(
    getAncestors: CallbackTo[js.Array[Node]],
    getDeclaredVariables: Node => CallbackTo[js.Array[Variable]],
    getFilename: CallbackTo[String],
    getScope: CallbackTo[Scope],
    getSourceCode: CallbackTo[SourceCode],
    id: String,
    markVariableAsUsed: String => CallbackTo[Boolean],
    options: js.Array[_],
    parserOptions: ParserOptions,
    parserPath: String,
    parserServices: ParserServices,
    report: ReportDescriptor => Callback,
    settings: StringDictionary[js.Any]
  ): RuleContext = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], parserOptions = parserOptions.asInstanceOf[js.Any], parserPath = parserPath.asInstanceOf[js.Any], parserServices = parserServices.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.updateDynamic("getAncestors")(getAncestors.toJsFn)
    __obj.updateDynamic("getDeclaredVariables")(js.Any.fromFunction1((t0: typingsJapgolly.estree.mod.Node) => getDeclaredVariables(t0).runNow()))
    __obj.updateDynamic("getFilename")(getFilename.toJsFn)
    __obj.updateDynamic("getScope")(getScope.toJsFn)
    __obj.updateDynamic("getSourceCode")(getSourceCode.toJsFn)
    __obj.updateDynamic("markVariableAsUsed")(js.Any.fromFunction1((t0: java.lang.String) => markVariableAsUsed(t0).runNow()))
    __obj.updateDynamic("report")(js.Any.fromFunction1((t0: typingsJapgolly.eslint.mod.Rule.ReportDescriptor) => report(t0).runNow()))
    __obj.asInstanceOf[RuleContext]
  }
}

