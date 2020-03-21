package typingsJapgolly.oracleOraclejet.ojeditablevalueMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.oracleOraclejet.AnonConverterHint
import typingsJapgolly.oracleOraclejet.AnonDefinition
import typingsJapgolly.oracleOraclejet.AnonInstruction
import typingsJapgolly.oracleOraclejet.mod.baseComponent
import typingsJapgolly.oracleOraclejet.ojmessagingMod.^
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.describedBy
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.describedByChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.disabledChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.displayOptions
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.displayOptionsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.help
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.helpChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.helpHints
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.helpHintsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelHint
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelHintChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.messagesCustom
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.messagesCustomChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pending
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.validChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.value
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valueChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait editableValue[V, SP /* <: editableValueSettableProperties[V, SV, RV] */, SV, RV] extends baseComponent[SP] {
  var describedBy: String | Null = js.native
  var disabled: Boolean = js.native
  var displayOptions: AnonConverterHint = js.native
  var help: AnonInstruction = js.native
  var helpHints: AnonDefinition = js.native
  var labelHint: String = js.native
  var messagesCustom: js.Array[^] = js.native
  var onDescribedByChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDisabledChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDisplayOptionsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHelpChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHelpHintsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLabelHintChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMessagesCustomChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjAnimateEnd: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjAnimateStart: (js.Function1[CustomEvent, _]) | Null = js.native
  var onValidChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onValueChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  val valid: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown = js.native
  var value: V = js.native
  def addEventListener(`type`: validChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: validChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_describedByChanged(`type`: describedByChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_describedByChanged(
    `type`: describedByChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disabledChanged(`type`: disabledChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disabledChanged(
    `type`: disabledChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_displayOptionsChanged(`type`: displayOptionsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_displayOptionsChanged(
    `type`: displayOptionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_helpChanged(`type`: helpChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_helpChanged(
    `type`: helpChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_helpHintsChanged(`type`: helpHintsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_helpHintsChanged(
    `type`: helpHintsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelHintChanged(`type`: labelHintChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelHintChanged(
    `type`: labelHintChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messagesCustomChanged(`type`: messagesCustomChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messagesCustomChanged(
    `type`: messagesCustomChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(`type`: ojAnimateEnd, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: ojAnimateEnd,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(`type`: ojAnimateStart, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: ojAnimateStart,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(`type`: valueChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_describedBy(property: describedBy): String | Null = js.native
  @JSName("getProperty")
  def getProperty_disabled(property: disabled): Boolean = js.native
  @JSName("getProperty")
  def getProperty_displayOptions(property: displayOptions): AnonConverterHint = js.native
  @JSName("getProperty")
  def getProperty_help(property: help): AnonInstruction = js.native
  @JSName("getProperty")
  def getProperty_helpHints(property: helpHints): AnonDefinition = js.native
  @JSName("getProperty")
  def getProperty_labelHint(property: labelHint): String = js.native
  @JSName("getProperty")
  def getProperty_messagesCustom(property: messagesCustom): js.Array[^] = js.native
  @JSName("getProperty")
  def getProperty_valid(property: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valid): typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown = js.native
  @JSName("getProperty")
  def getProperty_value(property: value): V = js.native
  def reset(): Unit = js.native
  def setProperties(properties: editableValueSettablePropertiesLenient[V, SV, RV]): Unit = js.native
  def setProperty(property: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valid, value: invalidHidden): Unit = js.native
  def setProperty(property: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valid, value: invalidShown): Unit = js.native
  def setProperty(property: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valid, value: pending): Unit = js.native
  @JSName("setProperty")
  def setProperty_describedBy(property: describedBy): Unit = js.native
  @JSName("setProperty")
  def setProperty_describedBy(property: describedBy, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_disabled(property: disabled, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_displayOptions(property: displayOptions, value: AnonConverterHint): Unit = js.native
  @JSName("setProperty")
  def setProperty_help(property: help, value: AnonInstruction): Unit = js.native
  @JSName("setProperty")
  def setProperty_helpHints(property: helpHints, value: AnonDefinition): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelHint(property: labelHint, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_messagesCustom(property: messagesCustom, value: js.Array[^]): Unit = js.native
  @JSName("setProperty")
  def setProperty_valid(
    property: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valid,
    value: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valid
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: SV): Unit = js.native
  def showMessages(): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojeditablevalue", "editableValue")
@js.native
object editableValue extends js.Object {
  type ojAnimateEnd = CustomEvent
  type ojAnimateStart = CustomEvent
}

