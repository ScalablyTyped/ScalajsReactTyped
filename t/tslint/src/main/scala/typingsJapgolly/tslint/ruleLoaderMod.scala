package typingsJapgolly.tslint

import typingsJapgolly.tslint.ruleMod.IOptions
import typingsJapgolly.tslint.ruleMod.IRule
import typingsJapgolly.tslint.ruleMod.RuleConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/ruleLoader", JSImport.Namespace)
@js.native
object ruleLoaderMod extends js.Object {
  def findRule(name: String): js.UndefOr[RuleConstructor] = js.native
  def findRule(name: String, rulesDirectories: String): js.UndefOr[RuleConstructor] = js.native
  def findRule(name: String, rulesDirectories: js.Array[String]): js.UndefOr[RuleConstructor] = js.native
  def loadRules(ruleOptionsList: js.Array[IOptions]): js.Array[IRule] = js.native
  def loadRules(ruleOptionsList: js.Array[IOptions], rulesDirectories: String): js.Array[IRule] = js.native
  def loadRules(ruleOptionsList: js.Array[IOptions], rulesDirectories: String, isJs: Boolean): js.Array[IRule] = js.native
  def loadRules(ruleOptionsList: js.Array[IOptions], rulesDirectories: js.Array[String]): js.Array[IRule] = js.native
  def loadRules(ruleOptionsList: js.Array[IOptions], rulesDirectories: js.Array[String], isJs: Boolean): js.Array[IRule] = js.native
}

