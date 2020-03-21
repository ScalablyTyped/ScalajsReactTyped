package typingsJapgolly.oracleOraclejet.ojcolorpaletteMod

import org.scalajs.dom.raw.CustomEvent
import typingsJapgolly.oracleOraclejet.AnonLabel
import typingsJapgolly.oracleOraclejet.AnonLabelNone
import typingsJapgolly.oracleOraclejet.mod.JetElementCustomEvent
import typingsJapgolly.oracleOraclejet.ojcolorMod.^
import typingsJapgolly.oracleOraclejet.ojeditablevalueMod.editableValue
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.grid
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelDisplay
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelDisplayChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelledBy
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelledByChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.layout
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.layoutChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.lg
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.list
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.palette
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.paletteChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.sm
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.swatchSize
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.swatchSizeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.xs
import typingsJapgolly.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojColorPalette extends editableValue[^, ojColorPaletteSettableProperties, ^, ^] {
  var labelDisplay: auto | off = js.native
  var labelledBy: String | Null = js.native
  var layout: grid | list = js.native
  var onLabelDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLabelledByChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLayoutChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojColorPalette: (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojColorPalette: (js.Function1[CustomEvent, _]) | Null = js.native
  var onPaletteChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSwatchSizeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var palette: js.Array[AnonLabel] = js.native
  var swatchSize: xs | sm | lg = js.native
  @JSName("translations")
  var translations_ojColorPalette: AnonLabelNone = js.native
  def addEventListener(
    `type`: labelDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | off], _]
  ): Unit = js.native
  def addEventListener(
    `type`: labelDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | off], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: layoutChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[grid | list], _]
  ): Unit = js.native
  def addEventListener(
    `type`: layoutChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[grid | list], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: swatchSizeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[xs | sm | lg], _]
  ): Unit = js.native
  def addEventListener(
    `type`: swatchSizeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[xs | sm | lg], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelledByChanged(
    `type`: labelledByChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelledByChanged(
    `type`: labelledByChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paletteChanged(
    `type`: paletteChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paletteChanged(
    `type`: paletteChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_labelDisplay(property: labelDisplay): auto | off = js.native
  @JSName("getProperty")
  def getProperty_labelledBy(property: labelledBy): String | Null = js.native
  @JSName("getProperty")
  def getProperty_layout(property: layout): grid | list = js.native
  @JSName("getProperty")
  def getProperty_palette(property: palette): js.Array[AnonLabel] = js.native
  @JSName("getProperty")
  def getProperty_swatchSize(property: swatchSize): xs | sm | lg = js.native
  def setProperties(properties: ojColorPaletteSettablePropertiesLenient): Unit = js.native
  def setProperty(property: labelDisplay, value: auto): Unit = js.native
  def setProperty(property: labelDisplay, value: off): Unit = js.native
  def setProperty(property: layout, value: grid): Unit = js.native
  def setProperty(property: layout, value: list): Unit = js.native
  def setProperty(property: swatchSize, value: lg): Unit = js.native
  def setProperty(property: swatchSize, value: sm): Unit = js.native
  def setProperty(property: swatchSize, value: xs): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelledBy(property: labelledBy): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelledBy(property: labelledBy, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_palette(property: palette, value: js.Array[AnonLabel]): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonLabelNone): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojcolorpalette", "ojColorPalette")
@js.native
object ojColorPalette extends js.Object {
  type ojAnimateEnd = CustomEvent
  type ojAnimateStart = CustomEvent
}

