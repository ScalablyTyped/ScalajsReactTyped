package typingsJapgolly.desmos.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.File
import typingsJapgolly.desmos.desmosStrings.NONE
import typingsJapgolly.desmos.desmosStrings.POSITIVE
import typingsJapgolly.desmos.desmosStrings.administerSecretFolders
import typingsJapgolly.desmos.desmosStrings.autosize
import typingsJapgolly.desmos.desmosStrings.border
import typingsJapgolly.desmos.desmosStrings.brailleControls
import typingsJapgolly.desmos.desmosStrings.brailleMode
import typingsJapgolly.desmos.desmosStrings.capExpressionSize
import typingsJapgolly.desmos.desmosStrings.clearIntoDegreeMode
import typingsJapgolly.desmos.desmosStrings.colors
import typingsJapgolly.desmos.desmosStrings.decimalToFraction
import typingsJapgolly.desmos.desmosStrings.degreeMode
import typingsJapgolly.desmos.desmosStrings.distributions
import typingsJapgolly.desmos.desmosStrings.expressions
import typingsJapgolly.desmos.desmosStrings.expressionsCollapsed
import typingsJapgolly.desmos.desmosStrings.expressionsTopbar
import typingsJapgolly.desmos.desmosStrings.folders
import typingsJapgolly.desmos.desmosStrings.fontSize
import typingsJapgolly.desmos.desmosStrings.forceEnableGeometryFunctions
import typingsJapgolly.desmos.desmosStrings.forceLogModeRegressions
import typingsJapgolly.desmos.desmosStrings.graphpaper
import typingsJapgolly.desmos.desmosStrings.imageUploadCallback
import typingsJapgolly.desmos.desmosStrings.images
import typingsJapgolly.desmos.desmosStrings.invertedColors
import typingsJapgolly.desmos.desmosStrings.keypad
import typingsJapgolly.desmos.desmosStrings.language
import typingsJapgolly.desmos.desmosStrings.links
import typingsJapgolly.desmos.desmosStrings.lockViewport
import typingsJapgolly.desmos.desmosStrings.nemeth
import typingsJapgolly.desmos.desmosStrings.none_
import typingsJapgolly.desmos.desmosStrings.notes
import typingsJapgolly.desmos.desmosStrings.pasteGraphLink
import typingsJapgolly.desmos.desmosStrings.pasteTableData
import typingsJapgolly.desmos.desmosStrings.plotImplicits
import typingsJapgolly.desmos.desmosStrings.plotInequalities
import typingsJapgolly.desmos.desmosStrings.plotSingleVariableImplicitEquations
import typingsJapgolly.desmos.desmosStrings.pointsOfInterest
import typingsJapgolly.desmos.desmosStrings.polarMode
import typingsJapgolly.desmos.desmosStrings.polarNumbers
import typingsJapgolly.desmos.desmosStrings.projectorMode
import typingsJapgolly.desmos.desmosStrings.qwertyKeyboard
import typingsJapgolly.desmos.desmosStrings.randomSeed
import typingsJapgolly.desmos.desmosStrings.restrictedFunctions
import typingsJapgolly.desmos.desmosStrings.settingsMenu
import typingsJapgolly.desmos.desmosStrings.showGrid
import typingsJapgolly.desmos.desmosStrings.showResetButtonOnGraphpaper
import typingsJapgolly.desmos.desmosStrings.showXAxis
import typingsJapgolly.desmos.desmosStrings.showYAxis
import typingsJapgolly.desmos.desmosStrings.sixKeyInput
import typingsJapgolly.desmos.desmosStrings.sliders
import typingsJapgolly.desmos.desmosStrings.trace
import typingsJapgolly.desmos.desmosStrings.ueb
import typingsJapgolly.desmos.desmosStrings.xAxisArrowMode
import typingsJapgolly.desmos.desmosStrings.xAxisLabel
import typingsJapgolly.desmos.desmosStrings.xAxisMinorSubdivisions
import typingsJapgolly.desmos.desmosStrings.xAxisNumbers
import typingsJapgolly.desmos.desmosStrings.xAxisStep
import typingsJapgolly.desmos.desmosStrings.yAxisArrowMode
import typingsJapgolly.desmos.desmosStrings.yAxisLabel
import typingsJapgolly.desmos.desmosStrings.yAxisMinorSubdivisions
import typingsJapgolly.desmos.desmosStrings.yAxisNumbers
import typingsJapgolly.desmos.desmosStrings.yAxisStep
import typingsJapgolly.desmos.desmosStrings.zoomButtons
import typingsJapgolly.desmos.desmosStrings.zoomFit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined desmos.Desmos.GraphConfiguration & desmos.Desmos.GraphSettings & {observe (eventName : keyof desmos.Desmos.GraphConfiguration | keyof desmos.Desmos.GraphSettings | string, callback : (): void): void, unobserve (eventName : keyof desmos.Desmos.GraphConfiguration | keyof desmos.Desmos.GraphSettings | string): void} */
@js.native
trait GraphConfigurationGraphSe extends StObject {
  
  /**
    * Allow creating secret folders
    * @default false
    */
  var administerSecretFolders: js.UndefOr[Boolean] = js.native
  
  /**
    * Determine whether the calculator should automatically resize whenever there are changes to element's dimensions. If set to false you will need to
    * explicitly call .resize() in certain situations. See .resize().
    * @default true
    */
  var autosize: js.UndefOr[Boolean] = js.native
  
  /**
    * Add a subtle 1px gray border around the entire calculator
    * @default true
    */
  var border: js.UndefOr[Boolean] = js.native
  
  /**
    * Show Braille controls in the settings menu and enable shortcut keys for switching between Braille modes.
    * @default true
    */
  var brailleControls: js.UndefOr[Boolean] = js.native
  
  /**
    * none'   Set the input and output Braille code for persons using refreshable Braille displays. Valid options are 'nemeth', 'ueb', or 'none'.
    * @default "none"
    */
  var brailleMode: js.UndefOr[nemeth | ueb | none_] = js.native
  
  /**
    * Limit the size of an expression to 100 characters
    * @default false
    */
  var capExpressionSize: js.UndefOr[Boolean] = js.native
  
  /**
    * When true, clearing the graph through the UI or calling setBlank() will leave the calculator in degreeMode. Note that, if a default state is set,
    * resetting the graph through the UI will result in the calculator's degreeMode matching the mode of that state, regardless of this option.
    * @default false
    */
  var clearIntoDegreeMode: js.UndefOr[Boolean] = js.native
  
  /**
    * The color palette that the calculator will cycle through. See the Colors section.
    */
  var colors: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * When true, users are able to toggle between decimal and fraction output in evaluations if Desmos detects a good rational approximation.
    * @default true
    */
  var decimalToFraction: js.UndefOr[Boolean] = js.native
  
  /**
    * When true, trig functions assume arguments are in degrees. Otherwise, arguments are assumed to be in radians.
    * @default false
    */
  var degreeMode: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable/disable functions related to univariate data visualizations, statistical distributions, and hypothesis testing
    * @default true
    */
  var distributions: js.UndefOr[Boolean] = js.native
  
  /**
    * Show the expressions list
    * @default true
    */
  var expressions: js.UndefOr[Boolean] = js.native
  
  /**
    * Collapse the expressions list
    * @default false
    */
  var expressionsCollapsed: js.UndefOr[Boolean] = js.native
  
  /**
    * Show the bar on top of the expressions list
    * @default true
    */
  var expressionsTopbar: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow the creation of folders in the expressions list
    * @default true
    */
  var folders: js.UndefOr[Boolean] = js.native
  
  /**
    * Base font size.
    * @default 16
    */
  var fontSize: js.UndefOr[Double] = js.native
  
  /**
    * Force distance and midpoint functions to be enabled, even if restrictedFunctions is set to true. In that case the geometry functions will also be added to the the "Misc" keypad
    * @default false
    */
  var forceEnableGeometryFunctions: js.UndefOr[Boolean] = js.native
  
  /**
    * When true, all linearizable regression models will have log mode enabled by default, and the checkbox used to toggle log mode will be hidden from the expression interface.
    * @default false
    */
  var forceLogModeRegressions: js.UndefOr[Boolean] = js.native
  
  /**
    * Show the graphpaper
    * @default true
    */
  var graphpaper: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify custom processing for user-uploaded images. See Image Uploads for more details.
    * @param file comment for stuff
    */
  var imageUploadCallback: js.UndefOr[
    js.Function2[
      /* file */ File, 
      /* cb */ js.Function2[/* err */ js.Error, /* url */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * Allow adding images
    * @default true
    */
  var images: js.UndefOr[Boolean] = js.native
  
  /**
    * Display the calculator with an inverted color scheme.
    * @default false
    */
  var invertedColors: js.UndefOr[Boolean] = js.native
  
  /**
    * Show the onscreen keypad.
    * @default true
    */
  var keypad: js.UndefOr[Boolean] = js.native
  
  /**
    * Language. See the https://www.desmos.com/api/v1.6/docs/index.html#document-languages for more information.
    * @default "en"
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Allow hyperlinks in notes/folders, and links to help documentation in the expressions list (e.g. regressions with negative R2 values or plots with unresolved detail)
    * @default true
    */
  var links: js.UndefOr[Boolean] = js.native
  
  /**
    * Disable user panning and zooming graphpaper
    * @default false
    */
  var lockViewport: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow the creation of text notes in the expressions list
    * @default true
    */
  var notes: js.UndefOr[Boolean] = js.native
  
  def observe(
    eventName: administerSecretFolders | autosize | border | brailleControls | brailleMode | capExpressionSize | clearIntoDegreeMode | colors | decimalToFraction | degreeMode | distributions | expressions | expressionsCollapsed | expressionsTopbar | folders | fontSize | forceEnableGeometryFunctions | forceLogModeRegressions | graphpaper | imageUploadCallback | images | invertedColors | keypad | language | links | lockViewport | notes | pasteGraphLink | pasteTableData | plotImplicits | plotInequalities | plotSingleVariableImplicitEquations | pointsOfInterest | polarMode | polarNumbers | projectorMode | qwertyKeyboard | randomSeed | restrictedFunctions | settingsMenu | showGrid | showResetButtonOnGraphpaper | showXAxis | showYAxis | sixKeyInput | sliders | trace | xAxisArrowMode | xAxisLabel | xAxisMinorSubdivisions | xAxisNumbers | xAxisStep | yAxisArrowMode | yAxisLabel | yAxisMinorSubdivisions | yAxisNumbers | yAxisStep | zoomButtons | zoomFit,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def observe(eventName: String, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Paste a valid desmos graph URL to import that graph
    * @default false
    */
  var pasteGraphLink: js.UndefOr[Boolean] = js.native
  
  /**
    * Paste validly formatted table data to create a table up to 50 rows
    * @default true
    */
  var pasteTableData: js.UndefOr[Boolean] = js.native
  
  /**
    * Determine whether the calculator should plot implicit equations and inequalities
    * @default true
    */
  var plotImplicits: js.UndefOr[Boolean] = js.native
  
  /**
    * Determine whether the calculator should plot inequalities
    * @default true
    */
  var plotInequalities: js.UndefOr[Boolean] = js.native
  
  /**
    * Determine whether the calculator should plot single-variable implicit equations
    * @default true
    */
  var plotSingleVariableImplicitEquations: js.UndefOr[Boolean] = js.native
  
  /**
    * Show Points of Interest (POIs) as gray dots that can be clicked on
    * @default true
    */
  var pointsOfInterest: js.UndefOr[Boolean] = js.native
  
  /**
    * When true, use a polar grid. Otherwise, use cartesian grid.
    * @default false
    */
  var polarMode: js.UndefOr[Boolean] = js.native
  
  /**
    * Show or hide numeric tick labels at successive angles. Only relevant when polarMode is true.
    * @default true
    */
  var polarNumbers: js.UndefOr[Boolean] = js.native
  
  /**
    * When true, fonts and line thicknesses are increased to aid legibility.
    * @default false
    */
  var projectorMode: js.UndefOr[Boolean] = js.native
  
  /**
    * Display the keypad in QWERTY layout (false shows an alphabetical layout)
    * @default true
    */
  var qwertyKeyboard: js.UndefOr[Boolean] = js.native
  
  /**
    * Global random seed used for generating values from the calculator's built-in random() function. See the section on random seeds below.
    * @default ""
    */
  var randomSeed: js.UndefOr[String] = js.native
  
  /**
    * Show a restricted menu of available functions
    * @default false
    */
  var restrictedFunctions: js.UndefOr[Boolean] = js.native
  
  /**
    * Show the settings wrench, for changing graph display
    * @default true
    */
  var settingsMenu: js.UndefOr[Boolean] = js.native
  
  /**
    * Show or hide grid lines on the graph paper.
    * @default true
    */
  var showGrid: js.UndefOr[Boolean] = js.native
  
  /**
    * If a default state is set, show an onscreen reset button
    * @default false
    */
  var showResetButtonOnGraphpaper: js.UndefOr[Boolean] = js.native
  
  /**
    * Show or hide the x axis.
    * @default true
    */
  var showXAxis: js.UndefOr[Boolean] = js.native
  
  /**
    * Show or hide the y axis.
    * @default true
    */
  var showYAxis: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow users to write six-dot Braille characters using the Home Row keys (S, D, F, J, K, and L). Requires that brailleMode be 'nemeth' or 'ueb'.
    * @default false
    */
  var sixKeyInput: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow the creation of sliders in the expressions list
    * @default true
    */
  var sliders: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow tracing curves to inspect coordinates, and showing point coordinates when clicked
    * @default true
    */
  var trace: js.UndefOr[Boolean] = js.native
  
  def unobserve(
    eventName: administerSecretFolders | autosize | border | brailleControls | brailleMode | capExpressionSize | clearIntoDegreeMode | colors | decimalToFraction | degreeMode | distributions | expressions | expressionsCollapsed | expressionsTopbar | folders | fontSize | forceEnableGeometryFunctions | forceLogModeRegressions | graphpaper | imageUploadCallback | images | invertedColors | keypad | language | links | lockViewport | notes | pasteGraphLink | pasteTableData | plotImplicits | plotInequalities | plotSingleVariableImplicitEquations | pointsOfInterest | polarMode | polarNumbers | projectorMode | qwertyKeyboard | randomSeed | restrictedFunctions | settingsMenu | showGrid | showResetButtonOnGraphpaper | showXAxis | showYAxis | sixKeyInput | sliders | trace | xAxisArrowMode | xAxisLabel | xAxisMinorSubdivisions | xAxisNumbers | xAxisStep | yAxisArrowMode | yAxisLabel | yAxisMinorSubdivisions | yAxisNumbers | yAxisStep | zoomButtons | zoomFit
  ): Unit = js.native
  def unobserve(eventName: String): Unit = js.native
  
  /**
    * Determines whether to place arrows at one or both ends of the x axis. See Axis Arrow Modes.
    * @default "NONE"
    */
  var xAxisArrowMode: js.UndefOr[NONE | POSITIVE | typingsJapgolly.desmos.desmosStrings.BOTH] = js.native
  
  /**
    * Label placed below the x axis.
    * @default ""
    */
  var xAxisLabel: js.UndefOr[String] = js.native
  
  /**
    * Subdivisions between ticks on the x axis. Must be an integer between 0 and 5. 1 means that only the major grid lines will be shown. When set to 0, subdivisions are chosen automatically.
    * @default 0
    */
  var xAxisMinorSubdivisions: js.UndefOr[Double] = js.native
  
  /**
    * Show or hide numeric tick labels on the x axis.
    * @default true
    */
  var xAxisNumbers: js.UndefOr[Boolean] = js.native
  
  /**
    * Spacing between numeric ticks on the x axis. Will be ignored if set too small to display. When set to 0, tick spacing is chosen automatically.
    * @default 0
    */
  var xAxisStep: js.UndefOr[Double] = js.native
  
  /**
    * Determines whether to place arrows at one or both ends of the y axis. See Axis Arrow Modes.
    * @default "NONE"
    */
  var yAxisArrowMode: js.UndefOr[NONE | POSITIVE | typingsJapgolly.desmos.desmosStrings.BOTH] = js.native
  
  /**
    * Label placed beside the y axis.
    * @default ""
    */
  var yAxisLabel: js.UndefOr[String] = js.native
  
  /**
    * Subdivisions between ticks on the y axis. Must be an integer between 0 and 5. 1 means that only the major grid lines will be shown. When set to 0, subdivisions are chosen automatically.
    * @default 0
    */
  var yAxisMinorSubdivisions: js.UndefOr[Double] = js.native
  
  /**
    * Show or hide numeric tick labels on the y axis.
    * @default true
    */
  var yAxisNumbers: js.UndefOr[Boolean] = js.native
  
  /**
    * Spacing between numeric ticks on the y axis. Will be ignored if set too small to display. When set to 0, tick spacing is chosen automatically.
    * @default 0
    */
  var yAxisStep: js.UndefOr[Double] = js.native
  
  /**
    * Show onscreen zoom buttons
    * @default true
    */
  var zoomButtons: js.UndefOr[Boolean] = js.native
  
  /**
    * When true, tables and distributions will display an icon that allows the user to automatically snap the viewport to appropriate bounds for viewing that expression.
    * @default true
    */
  var zoomFit: js.UndefOr[Boolean] = js.native
}
