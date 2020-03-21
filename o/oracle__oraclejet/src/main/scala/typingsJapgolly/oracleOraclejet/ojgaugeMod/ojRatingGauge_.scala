package typingsJapgolly.oracleOraclejet.ojgaugeMod

import org.scalajs.dom.raw.CustomEvent
import typingsJapgolly.oracleOraclejet.Anon9
import typingsJapgolly.oracleOraclejet.AnonSource
import typingsJapgolly.oracleOraclejet.mod.JetElementCustomEvent
import typingsJapgolly.oracleOraclejet.ojgaugeMod.ojRatingGauge.Threshold
import typingsJapgolly.oracleOraclejet.oracleOraclejetNumbers.`0.5`
import typingsJapgolly.oracleOraclejet.oracleOraclejetNumbers.`1`
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.changed
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.changedChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.changedState
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.changedStateChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hoverState
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hoverStateChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.max
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.maxChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.meet
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.min
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.minChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.orientation
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.orientationChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.preserveAspectRatio
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.preserveAspectRatioChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.readonlyChanged_
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.readonly_
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectedState
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectedStateChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.step
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.stepChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.thresholds
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.thresholdsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.tooltip
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.transientValueChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.unselectedState
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.unselectedStateChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.value
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valueChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.vertical
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.visualEffects
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.visualEffectsChanged
import typingsJapgolly.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojRatingGauge_ extends dvtBaseGauge[ojRatingGaugeSettableProperties] {
  var changed: Boolean = js.native
  var changedState: AnonSource = js.native
  var hoverState: AnonSource = js.native
  var max: Double = js.native
  var min: Double = js.native
  var onChangedChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onChangedStateChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHoverStateChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMaxChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMinChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOrientationChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onPreserveAspectRatioChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onReadonlyChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectedStateChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onStepChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onThresholdsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTooltipChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTransientValueChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onUnselectedStateChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onValueChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onVisualEffectsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var orientation: vertical | horizontal = js.native
  var preserveAspectRatio: none | meet = js.native
  var readonly: Boolean = js.native
  var selectedState: AnonSource = js.native
  var step: `0.5` | `1` = js.native
  var thresholds: js.Array[Threshold] = js.native
  var tooltip: Anon9 = js.native
  val transientValue: Double | Null = js.native
  var unselectedState: AnonSource = js.native
  var value: Double | Null = js.native
  var visualEffects: none | auto = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[vertical | horizontal], _]
  ): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[vertical | horizontal], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: preserveAspectRatioChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | meet], _]
  ): Unit = js.native
  def addEventListener(
    `type`: preserveAspectRatioChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | meet], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: stepChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`0.5` | `1`], _]
  ): Unit = js.native
  def addEventListener(
    `type`: stepChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`0.5` | `1`], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: visualEffectsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: visualEffectsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_changedChanged(
    `type`: changedChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_changedChanged(
    `type`: changedChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_changedStateChanged(
    `type`: changedStateChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_changedStateChanged(
    `type`: changedStateChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hoverStateChanged(
    `type`: hoverStateChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hoverStateChanged(
    `type`: hoverStateChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(
    `type`: maxChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(
    `type`: maxChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(
    `type`: minChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(
    `type`: minChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(
    `type`: readonlyChanged_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(
    `type`: readonlyChanged_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedStateChanged(
    `type`: selectedStateChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedStateChanged(
    `type`: selectedStateChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_thresholdsChanged(
    `type`: thresholdsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_thresholdsChanged(
    `type`: thresholdsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transientValueChanged(
    `type`: transientValueChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transientValueChanged(
    `type`: transientValueChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unselectedStateChanged(
    `type`: unselectedStateChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unselectedStateChanged(
    `type`: unselectedStateChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_changed(property: changed): Boolean = js.native
  @JSName("getProperty")
  def getProperty_changedState(property: changedState): AnonSource = js.native
  @JSName("getProperty")
  def getProperty_hoverState(property: hoverState): AnonSource = js.native
  @JSName("getProperty")
  def getProperty_max(property: max): Double = js.native
  @JSName("getProperty")
  def getProperty_min(property: min): Double = js.native
  @JSName("getProperty")
  def getProperty_orientation(property: orientation): vertical | horizontal = js.native
  @JSName("getProperty")
  def getProperty_preserveAspectRatio(property: preserveAspectRatio): none | meet = js.native
  @JSName("getProperty")
  def getProperty_readonly(property: readonly_): Boolean = js.native
  @JSName("getProperty")
  def getProperty_selectedState(property: selectedState): AnonSource = js.native
  @JSName("getProperty")
  def getProperty_step(property: step): `0.5` | `1` = js.native
  @JSName("getProperty")
  def getProperty_thresholds(property: thresholds): js.Array[Threshold] = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): Anon9 = js.native
  @JSName("getProperty")
  def getProperty_transientValue(property: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.transientValue): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_unselectedState(property: unselectedState): AnonSource = js.native
  @JSName("getProperty")
  def getProperty_value(property: value): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_visualEffects(property: visualEffects): none | auto = js.native
  def setProperties(properties: ojRatingGaugeSettablePropertiesLenient): Unit = js.native
  def setProperty(property: orientation, value: horizontal): Unit = js.native
  def setProperty(property: orientation, value: vertical): Unit = js.native
  def setProperty(property: preserveAspectRatio, value: meet): Unit = js.native
  def setProperty(property: preserveAspectRatio, value: none): Unit = js.native
  def setProperty(property: step, value: `0.5`): Unit = js.native
  def setProperty(property: step, value: `1`): Unit = js.native
  def setProperty(property: visualEffects, value: auto): Unit = js.native
  def setProperty(property: visualEffects, value: none): Unit = js.native
  @JSName("setProperty")
  def setProperty_changed(property: changed, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_changedState(property: changedState, value: AnonSource): Unit = js.native
  @JSName("setProperty")
  def setProperty_hoverState(property: hoverState, value: AnonSource): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_readonly(property: readonly_, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectedState(property: selectedState, value: AnonSource): Unit = js.native
  @JSName("setProperty")
  def setProperty_thresholds(property: thresholds, value: js.Array[Threshold]): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: Anon9): Unit = js.native
  @JSName("setProperty")
  def setProperty_transientValue(property: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.transientValue): Unit = js.native
  @JSName("setProperty")
  def setProperty_transientValue(property: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.transientValue, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_unselectedState(property: unselectedState, value: AnonSource): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: Double): Unit = js.native
}

