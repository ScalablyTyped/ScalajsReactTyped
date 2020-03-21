package typingsJapgolly.amcharts

import typingsJapgolly.amcharts.axisBaseMod.AxisBase
import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/ValueAxis", JSImport.Namespace)
@js.native
object valueAxisMod extends js.Object {
  @js.native
  trait ValueAxis extends AxisBase {
    /**
      * Radar chart only. Specifies distance from axis to the axis title (category)  10
      */
    var axisTitleOffset: Double = js.native
    /**
      * Read-only. Coordinate of the base value.
      */
    var baseCoord: Double = js.native
    /**
      * Specifies base value of the axis.
      */
    var baseValue: Double = js.native
    /**
      * If your values represents time units, and you want value axis labels to be formatted as duration,
      * you have to set the duration unit. Possible values are: "ss", "mm", "hh" and "DD".
      */
    var duration: String = js.native
    /**
      * If duration property is set, you can specify what string should be displayed next to day,
      * hour, minute and second.
      * {DD:"d. ", hh:":", mm:":",ss:""}
      */
    var durationUnits: AnonDD = js.native
    /**
      * Radar chart only. Possible values are: "polygons" and "circles". Set "circles" for polar charts.
      * @default "polygons"
      */
    var gridType: String = js.native
    /**
      * Unique id of value axis. It is not required to set it, unless you need to tell the graph which exact
      * value axis it should use.
      */
    var id: String = js.native
    /**
      * Specifies whether guide values should be included when calculating min and max of the axis.
      */
    var includeGuidesInMinMax: Boolean = js.native
    /**
      * If true, the axis will include hidden graphs when calculating min and max values.
      */
    var includeHidden: Boolean = js.native
    /**
      * Specifies whether values on axis can only be integers or both integers and doubles.
      */
    var integersOnly: Boolean = js.native
    /**
      * Specifies if this value axis' scale should be logarithmic.
      */
    var logarithmic: Boolean = js.native
    /**
      * Read-only. Maximum value of the axis.
      */
    var max: Double = js.native
    /**
      * If you don't want max value to be calculated by the chart, set it using this property.
      * This value might still be adjusted so that it would be possible to draw grid at rounded intervals.
      */
    var maximum: Double = js.native
    /**
      * If your value axis is date-based, you can specify maximum date of the axis.
      * Can be set as date object, timestamp number or string if dataDateFormat is set.
      */
    var maximumData: js.Date = js.native
    /**
      * Read-only. Minimum value of the axis.
      */
    var min: Double = js.native
    /**
      * If set value axis scale (min and max numbers) will be multiplied by it.
      * I.e. if set to 1.2 the scope of values will increase by 20%.
      */
    var minMaxMultiplier: Double = js.native
    /**
      * If you don't want min value to be calculated by the chart, set it using this property.
      * This value might still be adjusted so that it would be possible to draw grid at rounded intervals.
      */
    var minimum: Double = js.native
    /**
      * If your value axis is date-based, you can specify minimum date of the axis.
      * Can be set as date object, timestamp number or string if dataDateFormat is set.
      */
    var minimumDate: js.Date = js.native
    /**
      * Works with radar charts only.
      * If you set it to “middle”, labels and data points will be placed in the middle between axes.
      */
    var pointPosition: String = js.native
    /**
      * Precision (number of decimals) of values.
      */
    var precision: Double = js.native
    /**
      * Radar chart only. Specifies if categories (axes' titles) should be displayed near axes)
      * @default true
      */
    var radarCategoriesEnabled: Boolean = js.native
    /**
      * pecifies if graphs's values should be recalculated to percents.
      */
    var recalculateToPercents: Boolean = js.native
    /**
      * Specifies if value axis should be reversed (smaller values on top).
      */
    var reversed: Boolean = js.native
    /**
      * Stacking mode of the axis.
      * Possible values are: "none", "regular", "100%", "3d".
      * Note, only graphs of one type will be stacked.
      * @default "none"
      */
    var stackType: String = js.native
    /**
      * Read-only. Value difference between two grid lines.
      */
    var step: Double = js.native
    /**
      * If you set minimum and maximum for your axis, chart adjusts them so that grid would start and end on the
      * beginning and end of plot area and grid would be at equal intervals.
      * If you set strictMinMax to true, the chart will not adjust minimum and maximum of value axis.
      */
    var strictMinMax: Boolean = js.native
    /**
      * In case you synchronize one value axis with another, you need to set the synchronization multiplier.
      * Use synchronizeWithAxis method to set with which axis it should be synced.
      */
    var synchronizationMultiplier: Double = js.native
    /**
      * One value axis can be synchronized with another value axis.
      * You can use both reference to your axis or id of the axis here.
      * You should set synchronizationMultiplyer in order for this to work.
      */
    var synchronizeWith: ValueAxis = js.native
    /**
      * If this value axis is stacked and has columns, setting valueAxis.totalText = "[[total]]" will make it
      * to display total value above the most-top column.
      */
    var totalText: String = js.native
    /**
      * Color of total text.
      */
    var totalTextColor: String = js.native
    /**
      * Distance from data point to total text.
      */
    var totalTextOffset: Double = js.native
    /**
      * This allows you to have logarithmic value axis and have zero values in the data.
      * You must set it to >0 value in order to work.
      */
    var treatZeroAs: Double = js.native
    /**
      * Type of value axis.
      * If your values in data provider are dates and you want this axis to show dates instead of numbers,
      * set it to "date".
      */
    var `type`: String = js.native
    /**
      * Unit which will be added to the value label.
      */
    var unit: String = js.native
    /**
      * Position of the unit. Possible values are "left" and "right". right
      */
    var unitPosition: String = js.native
    /**
      * If true, prefixes will be used for big and small numbers.
      * You can set arrays of prefixes directly to the chart object
      * via prefixesOfSmallNumbers and prefixesOfBigNumbers.
      */
    var usePrefixes: Boolean = js.native
    /**
      * If true, values will always be formatted using scientific notation (5e+8, 5e-8...)
      * Otherwise only values bigger then 1e+21 and smaller then 1e-7 will be displayed in scientific notation.
      */
    var useScientificNotation: Boolean = js.native
    /**
      * Adds event listener.
      * @param type One of "axisChanged", "axisZoomed", "logarithmicAxisFailed".
      * @param handler The event handler.
      */
    def addListener(`type`: String, handler: js.Function1[/* e */ AnonEndValue, Unit]): Unit = js.native
    /**
      * Number, - value of coordinate. Returns value of the coordinate.  coordinate - y or x coordinate, in pixels.
      */
    def coordinateToValue(coordinate: Double): Unit = js.native
    /**
      * Number - coordinate Returns coordinate of the value in pixels. value - Number
      */
    def getCoordinate(value: Double): Unit = js.native
    def labelFunction(valueText: String, data: Date, valueAxis: ValueAxis): String = js.native
    /**
      * You can use this function to format Value axis labels.
      * This function is called and these parameters are passed: labelFunction(value, valueText, valueAxis);
      * Where value is numeric value, valueText is formatted string and valueAxis is a reference to valueAxis object.
      * If axis type is "date", labelFunction will pass different arguments:
      * labelFunction(valueText, date, valueAxis)
      * Your function should return string.
      */
    def labelFunction(value: Double, valueText: String, valueAxis: ValueAxis): String = js.native
    /**
      * Removes event listener from chart object.
      */
    def removeListener(chart: typingsJapgolly.amcharts.amChartMod.default, `type`: String, handler: js.Any): Unit = js.native
    /**
      * One value axis can be synchronized with another value axis.
      * You should set synchronizationMultiplyer in order for this to work.
      */
    def synchronizeWithAxis(axis: ValueAxis): Unit = js.native
    /**
      * XY Chart only. Zooms-in the axis to the provided values.
      */
    def zoomToValues(startValue: Double, endValue: Double): Unit = js.native
  }
  
  @js.native
  class default () extends ValueAxis {
    /**
      * Specifies whether number of gridCount is specified automatically, acoarding to the axis size.
      * @default true
      */
    /* CompleteClass */
    override var autoGridCount: Boolean = js.native
    /**
      * Axis opacity. Value range is 0 - 1.
      * @default 1
      */
    /* CompleteClass */
    override var axisAlpha: Double = js.native
    /**
      * Axis color.  #000000
      */
    /* CompleteClass */
    override var axisColor: String = js.native
    /**
      * Thickness of the axis.
      * @default 1
      */
    /* CompleteClass */
    override var axisThickness: Double = js.native
    /**
      * Color of axis value labels. Will use chart's color if not set.
      */
    /* CompleteClass */
    override var color: String = js.native
    /**
      * Length of a dash. 0 means line is not dashed.
      */
    /* CompleteClass */
    override var dashLength: Double = js.native
    /**
      * Fill opacity. Every second space between grid lines can be filled with color.
      * Set fillAlpha to a value greater than 0 to see the fills.
      */
    /* CompleteClass */
    override var fillAlpha: Double = js.native
    /**
      * Fill color. Every second space between grid lines can be filled with color.
      * Set fillAlpha to a value greater than 0 to see the fills.
      * @default "#FFFFFF"
      */
    /* CompleteClass */
    override var fillColor: String = js.native
    /**
      * Size of value labels text. Will use chart's fontSize if not set.
      */
    /* CompleteClass */
    override var fontSize: String = js.native
    /**
      * Opacity of grid lines. 0.2
      */
    /* CompleteClass */
    override var gridAlpha: Double = js.native
    /**
      * Color of grid lines. #000000
      */
    /* CompleteClass */
    override var gridColor: String = js.native
    /**
      * Number of grid lines. In case this is value axis, or your categoryAxis parses dates,
      * the number is approximate. The default value is 5. If you set autoGridCount to true,
      * this property is ignored.
      * @default 5
      */
    /* CompleteClass */
    override var gridCount: Double = js.native
    /**
      * Thickness of grid lines.
      * @default 1
      */
    /* CompleteClass */
    override var gridThickness: Double = js.native
    /**
      * The array of guides belonging to this axis.
      */
    /* CompleteClass */
    override var guides: js.Array[_] = js.native
    /**
      * If autoMargins of a chart is set to true, but you want this axis not to be measured when calculating margin,
      * set ignoreAxisWidth to true.
      */
    /* CompleteClass */
    override var ignoreAxisWidth: Boolean = js.native
    /**
      * Specifies whether values should be placed inside or outside plot area.
      */
    /* CompleteClass */
    override var inside: Boolean = js.native
    /**
      * Frequency at which labels should be placed. Doesn't work for CategoryAxis if parseDates is set to true.
      * @default 1
      */
    /* CompleteClass */
    override var labelFrequency: Double = js.native
    /**
      * Rotation angle of a label. Only horizontal axis' values can be rotated.
      * If you set this for vertical axis, the setting will be ignored.
      */
    /* CompleteClass */
    override var labelRotation: Double = js.native
    /**
      * Specifies whether axis displays category axis' labels and value axis' values.
      * @default true
      */
    /* CompleteClass */
    override var labelsEnabled: Boolean = js.native
    /**
      * The distance of the axis to the plot area, in pixels. Negative values can also be used.
      */
    /* CompleteClass */
    override var offset: Double = js.native
    /**
      * Possible values are: "top", "bottom", "left", "right".
      * If axis is vertical, default position is "left".
      * If axis is horizontal, default position is "bottom".
      */
    /* CompleteClass */
    override var position: String = js.native
    /**
      * Whether to show first axis label or not.
      * @default true
      */
    /* CompleteClass */
    override var showFirstLabel: Boolean = js.native
    /**
      * Whether to show last axis label or not.
      * @default true
      */
    /* CompleteClass */
    override var showLastLabel: Boolean = js.native
    /**
      * Length of the tick marks.
      * @default 5
      */
    /* CompleteClass */
    override var tickLength: Double = js.native
    /**
      * Title of the axis.
      */
    /* CompleteClass */
    override var title: String = js.native
    /**
      * Specifies if title should be bold or not.
      * @default true
      */
    /* CompleteClass */
    override var titleBold: Boolean = js.native
    /**
      * Color of axis title. Will use text color of chart if not set any.
      */
    /* CompleteClass */
    override var titleColor: String = js.native
    /**
      * Font size of axis title. Will use font size of chart plus two pixels if not set any.
      */
    /* CompleteClass */
    override var titlefontSize: String = js.native
    /**
      * Adds guide to the axis.
      */
    /* CompleteClass */
    override def addGuide(guide: typingsJapgolly.amcharts.guideMod.default): Unit = js.native
    /**
      * Removes guide from the axis.
      */
    /* CompleteClass */
    override def removeGuide(guide: typingsJapgolly.amcharts.guideMod.default): Unit = js.native
  }
  
}

