package typingsJapgolly.uirouterCore.urlInterfaceMod

import typingsJapgolly.std.RegExp
import typingsJapgolly.uirouterCore.AnonPriority
import typingsJapgolly.uirouterCore.stateInterfaceMod.TargetStateDef
import typingsJapgolly.uirouterCore.stateMod.TargetState
import typingsJapgolly.uirouterCore.urlMatcherMod.UrlMatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlRulesApi extends js.Object {
  /** See: [[UrlRules.initial]] */ @JSName("initial")
  var initial_Original: js.Function1[/* handler */ String | UrlRuleHandlerFn | TargetState | TargetStateDef, Unit] = js.native
  /** See: [[UrlRules.otherwise]] */ @JSName("otherwise")
  var otherwise_Original: js.Function1[/* handler */ String | UrlRuleHandlerFn | TargetState | TargetStateDef, Unit] = js.native
  /** See: [[UrlRules.removeRule]] */ @JSName("removeRule")
  var removeRule_Original: js.Function1[/* rule */ js.Any, Unit] = js.native
  /** See: [[UrlRules.rule]] */ @JSName("rule")
  var rule_Original: js.Function1[/* rule */ UrlRule, js.Function] = js.native
  /** See: [[UrlRules.rules]] */ @JSName("rules")
  var rules_Original: js.Function0[js.Array[UrlRule]] = js.native
  /** See: [[UrlRules.sort]] */ @JSName("sort")
  var sort_Original: js.Function1[
    /* compareFn */ js.UndefOr[js.Function2[/* a */ UrlRule, /* b */ UrlRule, Double]], 
    Unit
  ] = js.native
  /** See: [[UrlRules.when]] */ @JSName("when")
  var when_Original: js.Function3[
    /* matcher */ js.RegExp | UrlMatcher | String, 
    /* handler */ String | UrlRuleHandlerFn, 
    /* options */ js.UndefOr[AnonPriority], 
    UrlRule
  ] = js.native
  /** See: [[UrlRules.initial]] */ def initial(handler: String): Unit = js.native
  def initial(handler: TargetStateDef): Unit = js.native
  def initial(handler: TargetState): Unit = js.native
  def initial(handler: UrlRuleHandlerFn): Unit = js.native
  /** See: [[UrlRules.otherwise]] */ def otherwise(handler: String): Unit = js.native
  def otherwise(handler: TargetStateDef): Unit = js.native
  def otherwise(handler: TargetState): Unit = js.native
  def otherwise(handler: UrlRuleHandlerFn): Unit = js.native
  /** See: [[UrlRules.removeRule]] */ def removeRule(rule: js.Any): Unit = js.native
  /** See: [[UrlRules.rule]] */ def rule(rule: UrlRule): js.Function = js.native
  /** See: [[UrlRules.rules]] */ def rules(): js.Array[UrlRule] = js.native
  /** See: [[UrlRules.sort]] */ def sort(): Unit = js.native
  def sort(compareFn: js.Function2[/* a */ UrlRule, /* b */ UrlRule, Double]): Unit = js.native
  def when(matcher: String, handler: String): UrlRule = js.native
  def when(matcher: String, handler: String, options: AnonPriority): UrlRule = js.native
  def when(matcher: String, handler: UrlRuleHandlerFn): UrlRule = js.native
  def when(matcher: String, handler: UrlRuleHandlerFn, options: AnonPriority): UrlRule = js.native
  /** See: [[UrlRules.when]] */ def when(matcher: RegExp, handler: String): UrlRule = js.native
  def when(matcher: RegExp, handler: String, options: AnonPriority): UrlRule = js.native
  def when(matcher: RegExp, handler: UrlRuleHandlerFn): UrlRule = js.native
  def when(matcher: RegExp, handler: UrlRuleHandlerFn, options: AnonPriority): UrlRule = js.native
  def when(matcher: UrlMatcher, handler: String): UrlRule = js.native
  def when(matcher: UrlMatcher, handler: String, options: AnonPriority): UrlRule = js.native
  def when(matcher: UrlMatcher, handler: UrlRuleHandlerFn): UrlRule = js.native
  def when(matcher: UrlMatcher, handler: UrlRuleHandlerFn, options: AnonPriority): UrlRule = js.native
}

