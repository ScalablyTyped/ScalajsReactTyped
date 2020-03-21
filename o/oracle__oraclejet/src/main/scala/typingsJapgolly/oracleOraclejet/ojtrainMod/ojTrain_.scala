package typingsJapgolly.oracleOraclejet.ojtrainMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.oracleOraclejet.AnonMessageType
import typingsJapgolly.oracleOraclejet.mod.baseComponent
import typingsJapgolly.oracleOraclejet.ojtrainMod.ojTrain.Step
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeDeselect
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeSelect
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojDeselect
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojSelect
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectedStep
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectedStepChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.steps
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.stepsChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojTrain_ extends baseComponent[ojTrainSettableProperties] {
  var onOjBeforeDeselect: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeSelect: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjDeselect: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjSelect: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectedStepChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onStepsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var selectedStep: String = js.native
  var steps: js.Array[Step] = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeDeselect(`type`: ojBeforeDeselect, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeDeselect(
    `type`: ojBeforeDeselect,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeSelect(`type`: ojBeforeSelect, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeSelect(
    `type`: ojBeforeSelect,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDeselect(`type`: ojDeselect, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDeselect(
    `type`: ojDeselect,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSelect(`type`: ojSelect, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSelect(
    `type`: ojSelect,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedStepChanged(`type`: selectedStepChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedStepChanged(
    `type`: selectedStepChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stepsChanged(`type`: stepsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stepsChanged(
    `type`: stepsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def getNextSelectableStep(): String | Null = js.native
  def getPreviousSelectableStep(): String | Null = js.native
  @JSName("getProperty")
  def getProperty_selectedStep(property: selectedStep): String = js.native
  @JSName("getProperty")
  def getProperty_steps(property: steps): js.Array[Step] = js.native
  def getStep(id: String): Step | Null = js.native
  def setProperties(properties: ojTrainSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectedStep(property: selectedStep, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_steps(property: steps, value: js.Array[Step]): Unit = js.native
  def updateStep(id: String, stepProperties: AnonMessageType): Unit = js.native
}

