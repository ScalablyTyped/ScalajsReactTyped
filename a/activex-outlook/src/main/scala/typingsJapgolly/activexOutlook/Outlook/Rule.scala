package typingsJapgolly.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Rule")
@js.native
class Rule protected () extends js.Object {
  val Actions: RuleActions = js.native
  val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Conditions: RuleConditions = js.native
  var Enabled: Boolean = js.native
  val Exceptions: RuleConditions = js.native
  var ExecutionOrder: Double = js.native
  val IsLocalRule: Boolean = js.native
  var Name: String = js.native
  @JSName("Outlook.Rule_typekey")
  var OutlookDotRule_typekey: Rule = js.native
  val Parent: js.Any = js.native
  val RuleType: OlRuleType = js.native
  val Session: NameSpace = js.native
  def Execute(): Unit = js.native
  def Execute(ShowProgress: js.Any): Unit = js.native
  def Execute(ShowProgress: js.Any, Folder: js.Any): Unit = js.native
  def Execute(ShowProgress: js.Any, Folder: js.Any, IncludeSubfolders: js.Any): Unit = js.native
  def Execute(ShowProgress: js.Any, Folder: js.Any, IncludeSubfolders: js.Any, RuleExecuteOption: js.Any): Unit = js.native
}

