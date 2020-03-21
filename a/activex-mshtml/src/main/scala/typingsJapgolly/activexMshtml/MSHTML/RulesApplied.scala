package typingsJapgolly.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.RulesApplied")
@js.native
class RulesApplied protected () extends js.Object {
  @JSName("MSHTML.RulesApplied_typekey")
  var MSHTMLDotRulesApplied_typekey: RulesApplied = js.native
  @JSName("appliedRules")
  val appliedRules_Original: IHTMLStyleSheetRulesAppliedCollection = js.native
  val element: IHTMLElement = js.native
  val inlineStyles: IHTMLStyle = js.native
  def appliedRules(index: Double): IHTMLStyleSheetRule = js.native
  def hasInheritableProperty(): Boolean = js.native
  def propertyIsInheritable(name: String): Boolean = js.native
  def propertyIsInline(name: String): Boolean = js.native
}

