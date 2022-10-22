package typingsJapgolly.typescriptServices.TypeScript.Services.Formatting

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RulesBucket extends StObject {
  
  def AddRule(
    rule: Rule,
    specificTokens: Boolean,
    constructionState: js.Array[RulesBucketConstructionState],
    rulesBucketIndex: Double
  ): Unit
  
  def Rules(): js.Array[Rule]
  
  /* private */ var rules: Any
}
object RulesBucket {
  
  inline def apply(
    AddRule: (Rule, Boolean, js.Array[RulesBucketConstructionState], Double) => Callback,
    Rules: CallbackTo[js.Array[Rule]],
    rules: Any
  ): RulesBucket = {
    val __obj = js.Dynamic.literal(AddRule = js.Any.fromFunction4((t0: Rule, t1: Boolean, t2: js.Array[RulesBucketConstructionState], t3: Double) => (AddRule(t0, t1, t2, t3)).runNow()), Rules = Rules.toJsFn, rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesBucket]
  }
  
  extension [Self <: RulesBucket](x: Self) {
    
    inline def setAddRule(value: (Rule, Boolean, js.Array[RulesBucketConstructionState], Double) => Callback): Self = StObject.set(x, "AddRule", js.Any.fromFunction4((t0: Rule, t1: Boolean, t2: js.Array[RulesBucketConstructionState], t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setRules(value: CallbackTo[js.Array[Rule]]): Self = StObject.set(x, "Rules", value.toJsFn)
  }
}
