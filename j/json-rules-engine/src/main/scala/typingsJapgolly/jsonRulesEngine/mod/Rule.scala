package typingsJapgolly.jsonRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-rules-engine", "Rule")
@js.native
class Rule protected () extends RuleProperties {
  def this(ruleProps: String) = this()
  def this(ruleProps: RuleProperties) = this()
  /* CompleteClass */
  override var conditions: TopLevelCondition = js.native
  /* CompleteClass */
  override var event: Event = js.native
  @JSName("name")
  var name_Rule: String = js.native
  @JSName("priority")
  var priority_Rule: Double = js.native
  def setConditions(conditions: TopLevelCondition): this.type = js.native
  def setEvent(event: Event): this.type = js.native
  def setPriority(priority: Double): this.type = js.native
  def toJSON(): String = js.native
  def toJSON[T /* <: Boolean */](stringify: T): RuleSerializable | String = js.native
}

