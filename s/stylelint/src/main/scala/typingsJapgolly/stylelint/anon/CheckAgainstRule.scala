package typingsJapgolly.stylelint.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.postcss.mod.Warning
import typingsJapgolly.stylelint.mod.PostcssResult
import typingsJapgolly.stylelint.mod.Problem
import typingsJapgolly.stylelint.mod.RuleMessages
import typingsJapgolly.stylelint.mod.RuleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckAgainstRule extends StObject {
  
  /**
  				 * Useful for third-party code (e.g. plugins) to run a PostCSS Root
  				 * against a specific rule and do something with the warnings
  				 */
  def checkAgainstRule[T, O /* <: js.Object */](options: Root[T, O], callback: js.Function1[/* warning */ Warning, Unit]): Unit
  
  /**
  				 * Report a problem.
  				 *
  				 * This function accounts for `disabledRanges` attached to the result.
  				 * That is, if the reported problem is within a disabledRange,
  				 * it is ignored. Otherwise, it is attached to the result as a
  				 * postcss warning.
  				 *
  				 * It also accounts for the rule's severity.
  				 *
  				 * You *must* pass *either* a node or a line number.
  				 */
  def report(problem: Problem): Unit
  
  /**
  				 * Given an object of problem messages, return another
  				 * that provides the same messages postfixed with the rule
  				 * that has been violated.
  				 */
  def ruleMessages[T /* <: RuleMessages */, R /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K]} */ js.Any */](ruleName: String, messages: T): R
  
  /**
  				 * Validate a rule's options.
  				 *
  				 * See existing rules for examples.
  				 */
  def validateOptions(result: PostcssResult, ruleName: String, optionDescriptions: RuleOptions*): Boolean
}
object CheckAgainstRule {
  
  inline def apply(
    checkAgainstRule: (Root[Any, Any], js.Function1[/* warning */ Warning, Unit]) => Callback,
    report: Problem => Callback,
    ruleMessages: (String, Any) => Any,
    validateOptions: (PostcssResult, String, /* repeated */ RuleOptions) => Boolean
  ): CheckAgainstRule = {
    val __obj = js.Dynamic.literal(checkAgainstRule = js.Any.fromFunction2((t0: Root[Any, Any], t1: js.Function1[/* warning */ Warning, Unit]) => (checkAgainstRule(t0, t1)).runNow()), report = js.Any.fromFunction1((t0: Problem) => report(t0).runNow()), ruleMessages = js.Any.fromFunction2(ruleMessages), validateOptions = js.Any.fromFunction3(validateOptions))
    __obj.asInstanceOf[CheckAgainstRule]
  }
  
  extension [Self <: CheckAgainstRule](x: Self) {
    
    inline def setCheckAgainstRule(value: (Root[Any, Any], js.Function1[/* warning */ Warning, Unit]) => Callback): Self = StObject.set(x, "checkAgainstRule", js.Any.fromFunction2((t0: Root[Any, Any], t1: js.Function1[/* warning */ Warning, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setReport(value: Problem => Callback): Self = StObject.set(x, "report", js.Any.fromFunction1((t0: Problem) => value(t0).runNow()))
    
    inline def setRuleMessages(value: (String, Any) => Any): Self = StObject.set(x, "ruleMessages", js.Any.fromFunction2(value))
    
    inline def setValidateOptions(value: (PostcssResult, String, /* repeated */ RuleOptions) => Boolean): Self = StObject.set(x, "validateOptions", js.Any.fromFunction3(value))
  }
}
