package typingsJapgolly.typescriptServices.TypeScript.Services.Formatting

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescriptServices.TypeScript.Services.FormatCodeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RulesProvider extends StObject {
  
  /* private */ var activeRules: Any
  
  /* private */ def createActiveRules(options: Any): Any
  
  def ensureUpToDate(options: FormatCodeOptions): Unit
  
  def getRuleByName(name: String): Rule
  
  def getRuleName(rule: Rule): String
  
  def getRulesMap(): RulesMap
  
  /* private */ var globalRules: Any
  
  /* private */ var logger: Any
  
  /* private */ var options: Any
  
  /* private */ var rulesMap: Any
}
object RulesProvider {
  
  inline def apply(
    activeRules: Any,
    createActiveRules: Any => Any,
    ensureUpToDate: FormatCodeOptions => Callback,
    getRuleByName: String => Rule,
    getRuleName: Rule => String,
    getRulesMap: CallbackTo[RulesMap],
    globalRules: Any,
    logger: Any,
    options: Any,
    rulesMap: Any
  ): RulesProvider = {
    val __obj = js.Dynamic.literal(activeRules = activeRules.asInstanceOf[js.Any], createActiveRules = js.Any.fromFunction1(createActiveRules), ensureUpToDate = js.Any.fromFunction1((t0: FormatCodeOptions) => ensureUpToDate(t0).runNow()), getRuleByName = js.Any.fromFunction1(getRuleByName), getRuleName = js.Any.fromFunction1(getRuleName), getRulesMap = getRulesMap.toJsFn, globalRules = globalRules.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], rulesMap = rulesMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesProvider]
  }
  
  extension [Self <: RulesProvider](x: Self) {
    
    inline def setActiveRules(value: Any): Self = StObject.set(x, "activeRules", value.asInstanceOf[js.Any])
    
    inline def setCreateActiveRules(value: Any => Any): Self = StObject.set(x, "createActiveRules", js.Any.fromFunction1(value))
    
    inline def setEnsureUpToDate(value: FormatCodeOptions => Callback): Self = StObject.set(x, "ensureUpToDate", js.Any.fromFunction1((t0: FormatCodeOptions) => value(t0).runNow()))
    
    inline def setGetRuleByName(value: String => Rule): Self = StObject.set(x, "getRuleByName", js.Any.fromFunction1(value))
    
    inline def setGetRuleName(value: Rule => String): Self = StObject.set(x, "getRuleName", js.Any.fromFunction1(value))
    
    inline def setGetRulesMap(value: CallbackTo[RulesMap]): Self = StObject.set(x, "getRulesMap", value.toJsFn)
    
    inline def setGlobalRules(value: Any): Self = StObject.set(x, "globalRules", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRulesMap(value: Any): Self = StObject.set(x, "rulesMap", value.asInstanceOf[js.Any])
  }
}
