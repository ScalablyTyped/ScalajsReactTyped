package typingsJapgolly.oracleOraclejet.ojswitchMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.oracleOraclejet.ojeditablevalueMod.editableValue
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.readonlyChanged_
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.readonly_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojSwitch extends editableValue[Boolean, ojSwitchSettableProperties, Boolean, Boolean] {
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojSwitch: (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojSwitch: (js.Function1[CustomEvent, _]) | Null = js.native
  var onReadonlyChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var readonly: Boolean = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(`type`: readonlyChanged_, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(
    `type`: readonlyChanged_,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_readonly(property: readonly_): Boolean = js.native
  def setProperties(properties: ojSwitchSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_readonly(property: readonly_, value: Boolean): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojswitch", "ojSwitch")
@js.native
object ojSwitch extends js.Object {
  type ojAnimateEnd = CustomEvent
  type ojAnimateStart = CustomEvent
}

