package typingsJapgolly.oracleOraclejet.ojfilmstripMod

import org.scalajs.dom.raw.CustomEvent
import typingsJapgolly.oracleOraclejet.AnonId
import typingsJapgolly.oracleOraclejet.AnonLabelAccArrowNextPage
import typingsJapgolly.oracleOraclejet.mod.JetElementCustomEvent
import typingsJapgolly.oracleOraclejet.mod.baseComponent
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.adjacent
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.arrowPlacement
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.arrowPlacementChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.arrowVisibility
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.arrowVisibilityChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.currentItem
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.currentItemChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hidden
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hover
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.looping
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.loopingChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.maxItemsPerPage
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.maxItemsPerPageChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.orientation
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.orientationChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.overlay
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.page
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.vertical
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.visible
import typingsJapgolly.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojFilmStrip extends baseComponent[ojFilmStripSettableProperties] {
  var arrowPlacement: adjacent | overlay = js.native
  var arrowVisibility: visible | hidden | hover | auto = js.native
  var currentItem: AnonId = js.native
  var looping: off | page = js.native
  var maxItemsPerPage: Double = js.native
  var onArrowPlacementChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onArrowVisibilityChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onCurrentItemChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLoopingChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMaxItemsPerPageChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOrientationChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var orientation: horizontal | vertical = js.native
  @JSName("translations")
  var translations_ojFilmStrip: AnonLabelAccArrowNextPage = js.native
  def addEventListener(
    `type`: arrowPlacementChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[adjacent | overlay], _]
  ): Unit = js.native
  def addEventListener(
    `type`: arrowPlacementChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[adjacent | overlay], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: arrowVisibilityChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[visible | hidden | hover | auto], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: arrowVisibilityChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[visible | hidden | hover | auto], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: loopingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[off | page], _]
  ): Unit = js.native
  def addEventListener(
    `type`: loopingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[off | page], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[horizontal | vertical], _]
  ): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[horizontal | vertical], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentItemChanged(
    `type`: currentItemChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentItemChanged(
    `type`: currentItemChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxItemsPerPageChanged(
    `type`: maxItemsPerPageChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxItemsPerPageChanged(
    `type`: maxItemsPerPageChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def getItemsPerPage(): Double = js.native
  @JSName("getProperty")
  def getProperty_arrowPlacement(property: arrowPlacement): adjacent | overlay = js.native
  @JSName("getProperty")
  def getProperty_arrowVisibility(property: arrowVisibility): visible | hidden | hover | auto = js.native
  @JSName("getProperty")
  def getProperty_currentItem(property: currentItem): AnonId = js.native
  @JSName("getProperty")
  def getProperty_looping(property: looping): off | page = js.native
  @JSName("getProperty")
  def getProperty_maxItemsPerPage(property: maxItemsPerPage): Double = js.native
  @JSName("getProperty")
  def getProperty_orientation(property: orientation): horizontal | vertical = js.native
  def setProperties(properties: ojFilmStripSettablePropertiesLenient): Unit = js.native
  def setProperty(property: arrowPlacement, value: adjacent): Unit = js.native
  def setProperty(property: arrowPlacement, value: overlay): Unit = js.native
  def setProperty(property: arrowVisibility, value: auto): Unit = js.native
  def setProperty(property: arrowVisibility, value: hidden): Unit = js.native
  def setProperty(property: arrowVisibility, value: hover): Unit = js.native
  def setProperty(property: arrowVisibility, value: visible): Unit = js.native
  def setProperty(property: looping, value: off): Unit = js.native
  def setProperty(property: looping, value: page): Unit = js.native
  def setProperty(property: orientation, value: horizontal): Unit = js.native
  def setProperty(property: orientation, value: vertical): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentItem(property: currentItem, value: AnonId): Unit = js.native
  @JSName("setProperty")
  def setProperty_maxItemsPerPage(property: maxItemsPerPage, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonLabelAccArrowNextPage): Unit = js.native
}

