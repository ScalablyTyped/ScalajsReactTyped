package typingsJapgolly.tslint.mod

import typingsJapgolly.tslint.ruleMod.IOptions
import typingsJapgolly.tslint.ruleMod.IRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "loadRules")
@js.native
object loadRules extends js.Object {
  def apply(ruleOptionsList: js.Array[IOptions]): js.Array[IRule] = js.native
  def apply(ruleOptionsList: js.Array[IOptions], rulesDirectories: String): js.Array[IRule] = js.native
  def apply(ruleOptionsList: js.Array[IOptions], rulesDirectories: String, isJs: Boolean): js.Array[IRule] = js.native
  def apply(ruleOptionsList: js.Array[IOptions], rulesDirectories: js.Array[String]): js.Array[IRule] = js.native
  def apply(ruleOptionsList: js.Array[IOptions], rulesDirectories: js.Array[String], isJs: Boolean): js.Array[IRule] = js.native
}

