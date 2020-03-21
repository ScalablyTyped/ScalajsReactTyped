package typingsJapgolly.devextreme.mod.default.viz

import typingsJapgolly.devextreme.AnonBackgroundColor
import typingsJapgolly.devextreme.AnonBaseColorSet
import typingsJapgolly.devextreme.AnonFileName
import typingsJapgolly.devextreme.devextremeStrings.Bright
import typingsJapgolly.devextreme.devextremeStrings.Carmine
import typingsJapgolly.devextreme.devextremeStrings.Default
import typingsJapgolly.devextreme.devextremeStrings.Material
import typingsJapgolly.devextreme.devextremeStrings.Ocean
import typingsJapgolly.devextreme.devextremeStrings.Office
import typingsJapgolly.devextreme.devextremeStrings.Pastel
import typingsJapgolly.devextreme.devextremeStrings.Soft
import typingsJapgolly.devextreme.devextremeStrings.Vintage
import typingsJapgolly.devextreme.devextremeStrings.Violet
import typingsJapgolly.devextreme.devextremeStrings.`Dark Moon`
import typingsJapgolly.devextreme.devextremeStrings.`Dark Violet`
import typingsJapgolly.devextreme.devextremeStrings.`Green Mist`
import typingsJapgolly.devextreme.devextremeStrings.`Harmony Light`
import typingsJapgolly.devextreme.devextremeStrings.`Soft Blue`
import typingsJapgolly.devextreme.devextremeStrings.`Soft Pastel`
import typingsJapgolly.devextreme.mod.DevExpress.DOMComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "viz")
@js.native
object ^ extends js.Object {
  /** Gets the current palette's name. */
  def currentPalette(): String = js.native
  /** Changes the current palette for all data visualization widgets on the page. */
  def currentPalette(paletteName: String): Unit = js.native
  /** Gets the current theme's name. */
  def currentTheme(): String = js.native
  /** Changes the current theme for all data visualization widgets on the page. The color scheme is defined separately. */
  def currentTheme(platform: String, colorScheme: String): Unit = js.native
  /** Changes the current theme for all data visualization widgets on the page. */
  def currentTheme(theme: String): Unit = js.native
  /** Allows you to export widgets using their SVG markup. */
  def exportFromMarkup(markup: String, options: AnonBackgroundColor): Unit = js.native
  /** Exports one or several widgets to PNG. */
  def exportWidgets(widgetInstances: js.Array[js.Array[DOMComponent]]): Unit = js.native
  /** Exports one or several widgets. */
  def exportWidgets(widgetInstances: js.Array[js.Array[DOMComponent]], options: AnonFileName): Unit = js.native
  /** Returns a subset of palette colors. */
  def generateColors(
    palette: Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office | js.Array[String],
    count: Double,
    options: AnonBaseColorSet
  ): js.Array[String] = js.native
  /** Gets the SVG markup of specific widgets for their subsequent export. */
  def getMarkup(widgetInstances: js.Array[DOMComponent]): String = js.native
  /** Gets the color sets of a predefined or registered palette. */
  def getPalette(paletteName: String): js.Any = js.native
  /** Gets a predefined or registered theme's settings. */
  def getTheme(theme: String): js.Any = js.native
  /** The method to be called every time the active entry in the browser history is modified without reloading the current page. */
  def refreshPaths(): Unit = js.native
  /** Refreshes the current theme and palette in all data visualization widgets on the page. */
  def refreshTheme(): Unit = js.native
  /** Registers a new palette. */
  def registerPalette(paletteName: String, palette: js.Any): Unit = js.native
  /** Registers a new theme based on the existing one. */
  def registerTheme(customTheme: js.Any, baseTheme: String): Unit = js.native
}

