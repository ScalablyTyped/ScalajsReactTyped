package typingsJapgolly.plottable.mod

import typingsJapgolly.plottable.buildSrcPlotsBarPlotMod.BarOrientation
import typingsJapgolly.plottable.plottableStrings.basis
import typingsJapgolly.plottable.plottableStrings.basisClosed
import typingsJapgolly.plottable.plottableStrings.basisOpen
import typingsJapgolly.plottable.plottableStrings.bundle
import typingsJapgolly.plottable.plottableStrings.cardinal
import typingsJapgolly.plottable.plottableStrings.cardinalClosed
import typingsJapgolly.plottable.plottableStrings.cardinalOpen
import typingsJapgolly.plottable.plottableStrings.end
import typingsJapgolly.plottable.plottableStrings.horizontal
import typingsJapgolly.plottable.plottableStrings.linear
import typingsJapgolly.plottable.plottableStrings.linearClosed
import typingsJapgolly.plottable.plottableStrings.middle
import typingsJapgolly.plottable.plottableStrings.monotone
import typingsJapgolly.plottable.plottableStrings.outside
import typingsJapgolly.plottable.plottableStrings.start
import typingsJapgolly.plottable.plottableStrings.step
import typingsJapgolly.plottable.plottableStrings.stepAfter
import typingsJapgolly.plottable.plottableStrings.stepBefore
import typingsJapgolly.plottable.plottableStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Plots {
  
  object Animator {
    
    @JSImport("plottable", "Plots.Animator")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Plots.Animator.MAIN")
    @js.native
    def MAIN: String = js.native
    inline def MAIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAIN")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.Animator.RESET")
    @js.native
    def RESET: String = js.native
    inline def RESET_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESET")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable", "Plots.Area")
  @js.native
  /**
    * An Area Plot draws a filled region (area) between Y and Y0.
    *
    * @constructor
    */
  open class Area[X] ()
    extends typingsJapgolly.plottable.buildSrcPlotsMod.Area[X]
  /* static members */
  object Area {
    
    @JSImport("plottable", "Plots.Area")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Plots.Area._Y0_KEY")
    @js.native
    def _Y0_KEY: Any = js.native
    inline def _Y0_KEY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Y0_KEY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable", "Plots.Bar")
  @js.native
  /**
    * A Bar Plot draws bars growing out from a baseline to some value
    *
    * @constructor
    * @param {string} [orientation="vertical"] One of "vertical"/"horizontal".
    */
  open class Bar[X, Y] ()
    extends typingsJapgolly.plottable.buildSrcPlotsMod.Bar[X, Y] {
    def this(orientation: BarOrientation) = this()
  }
  /* static members */
  object Bar {
    
    @JSImport("plottable", "Plots.Bar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Plots.Bar._BAR_AREA_CLASS")
    @js.native
    def _BAR_AREA_CLASS: Any = js.native
    inline def _BAR_AREA_CLASS_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BAR_AREA_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.Bar._BAR_END_KEY")
    @js.native
    def _BAR_END_KEY: Any = js.native
    inline def _BAR_END_KEY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BAR_END_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.Bar._BAR_GAPLESS_THRESHOLD_PX")
    @js.native
    def _BAR_GAPLESS_THRESHOLD_PX: Double = js.native
    inline def _BAR_GAPLESS_THRESHOLD_PX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BAR_GAPLESS_THRESHOLD_PX")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.Bar._BAR_THICKNESS_KEY")
    @js.native
    def _BAR_THICKNESS_KEY: String = js.native
    inline def _BAR_THICKNESS_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BAR_THICKNESS_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.Bar._BAR_THICKNESS_RATIO")
    @js.native
    def _BAR_THICKNESS_RATIO: Double = js.native
    inline def _BAR_THICKNESS_RATIO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BAR_THICKNESS_RATIO")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.Bar._LABEL_AREA_CLASS")
    @js.native
    def _LABEL_AREA_CLASS: String = js.native
    inline def _LABEL_AREA_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LABEL_AREA_CLASS")(x.asInstanceOf[js.Any])
    
    /**
      * In the case of "start" or "end" LabelPositions, put the label this many px away
      * from the bar's length distance edge
      */
    @JSImport("plottable", "Plots.Bar._LABEL_MARGIN_INSIDE_BAR")
    @js.native
    def _LABEL_MARGIN_INSIDE_BAR: Double = js.native
    inline def _LABEL_MARGIN_INSIDE_BAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LABEL_MARGIN_INSIDE_BAR")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.Bar._SINGLE_BAR_DIMENSION_RATIO")
    @js.native
    def _SINGLE_BAR_DIMENSION_RATIO: Double = js.native
    inline def _SINGLE_BAR_DIMENSION_RATIO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SINGLE_BAR_DIMENSION_RATIO")(x.asInstanceOf[js.Any])
  }
  
  object BarAlignment {
    
    @JSImport("plottable", "Plots.BarAlignment")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Plots.BarAlignment.end")
    @js.native
    def end: typingsJapgolly.plottable.plottableStrings.end = js.native
    inline def end_=(x: end): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("end")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.BarAlignment.middle")
    @js.native
    def middle: typingsJapgolly.plottable.plottableStrings.middle = js.native
    inline def middle_=(x: middle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("middle")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.BarAlignment.start")
    @js.native
    def start: typingsJapgolly.plottable.plottableStrings.start = js.native
    inline def start_=(x: start): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("start")(x.asInstanceOf[js.Any])
  }
  
  object BarOrientation {
    
    @JSImport("plottable", "Plots.BarOrientation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Plots.BarOrientation.horizontal")
    @js.native
    def horizontal: typingsJapgolly.plottable.plottableStrings.horizontal = js.native
    inline def horizontal_=(x: horizontal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.BarOrientation.vertical")
    @js.native
    def vertical: typingsJapgolly.plottable.plottableStrings.vertical = js.native
    inline def vertical_=(x: vertical): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertical")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable", "Plots.ClusteredBar")
  @js.native
  /**
    * A ClusteredBar Plot groups bars across Datasets based on the primary value of the bars.
    *   On a vertical ClusteredBar Plot, the bars with the same X value are grouped.
    *   On a horizontal ClusteredBar Plot, the bars with the same Y value are grouped.
    *
    * @constructor
    * @param {string} [orientation="vertical"] One of "vertical"/"horizontal".
    */
  open class ClusteredBar[X, Y] ()
    extends typingsJapgolly.plottable.buildSrcPlotsMod.ClusteredBar[X, Y] {
    def this(orientation: BarOrientation) = this()
  }
  
  object CurveName {
    
    @JSImport("plottable", "Plots.CurveName")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Plots.CurveName.basis")
    @js.native
    def basis: typingsJapgolly.plottable.plottableStrings.basis = js.native
    
    @JSImport("plottable", "Plots.CurveName.basisClosed")
    @js.native
    def basisClosed: typingsJapgolly.plottable.plottableStrings.basisClosed = js.native
    inline def basisClosed_=(x: basisClosed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("basisClosed")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.CurveName.basisOpen")
    @js.native
    def basisOpen: typingsJapgolly.plottable.plottableStrings.basisOpen = js.native
    inline def basisOpen_=(x: basisOpen): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("basisOpen")(x.asInstanceOf[js.Any])
    
    inline def basis_=(x: basis): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("basis")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.CurveName.bundle")
    @js.native
    def bundle: typingsJapgolly.plottable.plottableStrings.bundle = js.native
    inline def bundle_=(x: bundle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bundle")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.CurveName.cardinal")
    @js.native
    def cardinal: typingsJapgolly.plottable.plottableStrings.cardinal = js.native
    
    @JSImport("plottable", "Plots.CurveName.cardinalClosed")
    @js.native
    def cardinalClosed: typingsJapgolly.plottable.plottableStrings.cardinalClosed = js.native
    inline def cardinalClosed_=(x: cardinalClosed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinalClosed")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.CurveName.cardinalOpen")
    @js.native
    def cardinalOpen: typingsJapgolly.plottable.plottableStrings.cardinalOpen = js.native
    inline def cardinalOpen_=(x: cardinalOpen): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinalOpen")(x.asInstanceOf[js.Any])
    
    inline def cardinal_=(x: cardinal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.CurveName.linear")
    @js.native
    def linear: typingsJapgolly.plottable.plottableStrings.linear = js.native
    
    @JSImport("plottable", "Plots.CurveName.linearClosed")
    @js.native
    def linearClosed: typingsJapgolly.plottable.plottableStrings.linearClosed = js.native
    inline def linearClosed_=(x: linearClosed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linearClosed")(x.asInstanceOf[js.Any])
    
    inline def linear_=(x: linear): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linear")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.CurveName.monotone")
    @js.native
    def monotone: typingsJapgolly.plottable.plottableStrings.monotone = js.native
    inline def monotone_=(x: monotone): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monotone")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.CurveName.step")
    @js.native
    def step: typingsJapgolly.plottable.plottableStrings.step = js.native
    
    @JSImport("plottable", "Plots.CurveName.stepAfter")
    @js.native
    def stepAfter: typingsJapgolly.plottable.plottableStrings.stepAfter = js.native
    inline def stepAfter_=(x: stepAfter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stepAfter")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.CurveName.stepBefore")
    @js.native
    def stepBefore: typingsJapgolly.plottable.plottableStrings.stepBefore = js.native
    inline def stepBefore_=(x: stepBefore): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stepBefore")(x.asInstanceOf[js.Any])
    
    inline def step_=(x: step): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("step")(x.asInstanceOf[js.Any])
  }
  
  object LabelsPosition {
    
    @JSImport("plottable", "Plots.LabelsPosition")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Plots.LabelsPosition.end")
    @js.native
    def end: typingsJapgolly.plottable.plottableStrings.end = js.native
    inline def end_=(x: end): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("end")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.LabelsPosition.middle")
    @js.native
    def middle: typingsJapgolly.plottable.plottableStrings.middle = js.native
    inline def middle_=(x: middle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("middle")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.LabelsPosition.outside")
    @js.native
    def outside: typingsJapgolly.plottable.plottableStrings.outside = js.native
    inline def outside_=(x: outside): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outside")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.LabelsPosition.start")
    @js.native
    def start: typingsJapgolly.plottable.plottableStrings.start = js.native
    inline def start_=(x: start): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("start")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable", "Plots.Line")
  @js.native
  /**
    * A Line Plot draws line segments starting from the first data point to the next.
    *
    * @constructor
    */
  open class Line[X] ()
    extends typingsJapgolly.plottable.buildSrcPlotsMod.Line[X]
  
  @JSImport("plottable", "Plots.Pie")
  @js.native
  /**
    * @constructor
    */
  open class Pie ()
    extends typingsJapgolly.plottable.buildSrcPlotsMod.Pie
  /* static members */
  object Pie {
    
    @JSImport("plottable", "Plots.Pie")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Plots.Pie._INNER_RADIUS_KEY")
    @js.native
    def _INNER_RADIUS_KEY: Any = js.native
    inline def _INNER_RADIUS_KEY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_INNER_RADIUS_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.Pie._OUTER_RADIUS_KEY")
    @js.native
    def _OUTER_RADIUS_KEY: Any = js.native
    inline def _OUTER_RADIUS_KEY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_OUTER_RADIUS_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.Pie._SECTOR_VALUE_KEY")
    @js.native
    def _SECTOR_VALUE_KEY: Any = js.native
    inline def _SECTOR_VALUE_KEY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SECTOR_VALUE_KEY")(x.asInstanceOf[js.Any])
    
    inline def _isValidData(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isValidData")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("plottable", "Plots.Rectangle")
  @js.native
  /**
    * A Rectangle Plot displays rectangles based on the data.
    * The left and right edges of each rectangle can be set with x() and x2().
    *   If only x() is set the Rectangle Plot will attempt to compute the correct left and right edge positions.
    * The top and bottom edges of each rectangle can be set with y() and y2().
    *   If only y() is set the Rectangle Plot will attempt to compute the correct top and bottom edge positions.
    *
    * @constructor
    * @param {Scale.Scale} xScale
    * @param {Scale.Scale} yScale
    */
  open class Rectangle[X, Y] ()
    extends typingsJapgolly.plottable.buildSrcPlotsMod.Rectangle[X, Y]
  /* static members */
  object Rectangle {
    
    @JSImport("plottable", "Plots.Rectangle")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Plots.Rectangle._X2_KEY")
    @js.native
    def _X2_KEY: Any = js.native
    inline def _X2_KEY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_X2_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.Rectangle._Y2_KEY")
    @js.native
    def _Y2_KEY: Any = js.native
    inline def _Y2_KEY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Y2_KEY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable", "Plots.Scatter")
  @js.native
  /**
    * A Scatter Plot draws a symbol at each data point.
    *
    * @constructor
    */
  open class Scatter[X, Y] ()
    extends typingsJapgolly.plottable.buildSrcPlotsMod.Scatter[X, Y]
  /* static members */
  object Scatter {
    
    @JSImport("plottable", "Plots.Scatter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Plots.Scatter._LABEL_AREA_CLASS")
    @js.native
    def _LABEL_AREA_CLASS: String = js.native
    inline def _LABEL_AREA_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LABEL_AREA_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.Scatter._LABEL_MARGIN_FROM_BUBBLE")
    @js.native
    def _LABEL_MARGIN_FROM_BUBBLE: Double = js.native
    inline def _LABEL_MARGIN_FROM_BUBBLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LABEL_MARGIN_FROM_BUBBLE")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.Scatter._SIZE_KEY")
    @js.native
    def _SIZE_KEY: Any = js.native
    inline def _SIZE_KEY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SIZE_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.Scatter._SYMBOL_KEY")
    @js.native
    def _SYMBOL_KEY: Any = js.native
    inline def _SYMBOL_KEY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SYMBOL_KEY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable", "Plots.Segment")
  @js.native
  /**
    * A Segment Plot displays line segments based on the data.
    *
    * @constructor
    */
  open class Segment[X, Y] ()
    extends typingsJapgolly.plottable.buildSrcPlotsMod.Segment[X, Y]
  /* static members */
  object Segment {
    
    @JSImport("plottable", "Plots.Segment")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Plots.Segment._X2_KEY")
    @js.native
    def _X2_KEY: Any = js.native
    inline def _X2_KEY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_X2_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.Segment._Y2_KEY")
    @js.native
    def _Y2_KEY: Any = js.native
    inline def _Y2_KEY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Y2_KEY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable", "Plots.StackedArea")
  @js.native
  /**
    * @constructor
    */
  open class StackedArea[X] ()
    extends typingsJapgolly.plottable.buildSrcPlotsMod.StackedArea[X]
  /* static members */
  object StackedArea {
    
    @JSImport("plottable", "Plots.StackedArea")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Given an array of Datasets and the accessor function for the key, computes the
      * set reunion (no duplicates) of the domain of each Dataset. The keys are stringified
      * before being returned.
      *
      * @param {Dataset[]} datasets The Datasets for which we extract the domain keys
      * @param {Accessor<any>} keyAccessor The accessor for the key of the data
      * @return {string[]} An array of stringified keys
      */
    @JSImport("plottable", "Plots.StackedArea._domainKeys")
    @js.native
    def _domainKeys: Any = js.native
    inline def _domainKeys_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_domainKeys")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable", "Plots.StackedBar")
  @js.native
  /**
    * A StackedBar Plot stacks bars across Datasets based on the primary value of the bars.
    *   On a vertical StackedBar Plot, the bars with the same X value are stacked.
    *   On a horizontal StackedBar Plot, the bars with the same Y value are stacked.
    *
    * @constructor
    * @param {Scale} xScale
    * @param {Scale} yScale
    * @param {string} [orientation="vertical"] One of "vertical"/"horizontal".
    */
  open class StackedBar[X, Y] ()
    extends typingsJapgolly.plottable.buildSrcPlotsMod.StackedBar[X, Y] {
    def this(orientation: BarOrientation) = this()
  }
  /* static members */
  object StackedBar {
    
    @JSImport("plottable", "Plots.StackedBar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Plots.StackedBar._EXTREMA_LABEL_MARGIN_FROM_BAR")
    @js.native
    def _EXTREMA_LABEL_MARGIN_FROM_BAR: Double = js.native
    inline def _EXTREMA_LABEL_MARGIN_FROM_BAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_EXTREMA_LABEL_MARGIN_FROM_BAR")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable", "Plots.Waterfall")
  @js.native
  open class Waterfall[X, Y] ()
    extends typingsJapgolly.plottable.buildSrcPlotsMod.Waterfall[X, Y]
  /* static members */
  object Waterfall {
    
    @JSImport("plottable", "Plots.Waterfall")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Plots.Waterfall._BAR_DECLINE_CLASS")
    @js.native
    def _BAR_DECLINE_CLASS: Any = js.native
    inline def _BAR_DECLINE_CLASS_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BAR_DECLINE_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.Waterfall._BAR_GROWTH_CLASS")
    @js.native
    def _BAR_GROWTH_CLASS: Any = js.native
    inline def _BAR_GROWTH_CLASS_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BAR_GROWTH_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.Waterfall._BAR_TOTAL_CLASS")
    @js.native
    def _BAR_TOTAL_CLASS: Any = js.native
    inline def _BAR_TOTAL_CLASS_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BAR_TOTAL_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.Waterfall._CONNECTOR_AREA_CLASS")
    @js.native
    def _CONNECTOR_AREA_CLASS: Any = js.native
    inline def _CONNECTOR_AREA_CLASS_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CONNECTOR_AREA_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.Waterfall._CONNECTOR_CLASS")
    @js.native
    def _CONNECTOR_CLASS: Any = js.native
    inline def _CONNECTOR_CLASS_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CONNECTOR_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Plots.Waterfall._TOTAL_KEY")
    @js.native
    def _TOTAL_KEY: Any = js.native
    inline def _TOTAL_KEY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TOTAL_KEY")(x.asInstanceOf[js.Any])
  }
}
