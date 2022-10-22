package typingsJapgolly.amcharts

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gaugeAxisMod {
  
  @JSImport("amcharts/GaugeAxis", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with GaugeAxis {
    
    /**
      * Adds event listener to the object.
      */
    /* CompleteClass */
    override def addListener(`type`: String, handler: Any): Unit = js.native
    
    /**
      * Axis opacity.
      * @default 1
      */
    /* CompleteClass */
    var axisAlpha: Double = js.native
    
    /**
      * Axis color.
      * @default #000000
      */
    /* CompleteClass */
    var axisColor: String = js.native
    
    /**
      * Thickness of the axis outline.
      * @default 1
      */
    /* CompleteClass */
    var axisThickness: Double = js.native
    
    /**
      * Opacity of band fills.
      * @default 1
      */
    /* CompleteClass */
    var bandAlpha: Double = js.native
    
    /**
      * Example: [-0.2, 0, -0.2]. Will make bands to be filled with color gradients.
      * Negative value means the color will be darker than the original,
      * and positive number means the color will be lighter.
      * @default []
      */
    /* CompleteClass */
    var bandGradientRatio: js.Array[Double] = js.native
    
    /**
      * Opacity of band outlines.
      * @default 0
      */
    /* CompleteClass */
    var bandOutlineAlpha: Double = js.native
    
    /**
      * Color of band outlines.
      * @default #000000
      */
    /* CompleteClass */
    var bandOutlineColor: String = js.native
    
    /**
      * Thickness of band outlines.
      * @default 0
      */
    /* CompleteClass */
    var bandOutlineThickness: Double = js.native
    
    /**
      * Array of bands - GaugeBand objects. Bands are used to draw color fills between specified values.
      */
    /* CompleteClass */
    var bands: js.Array[typingsJapgolly.amcharts.gaugeBandMod.default] = js.native
    
    /**
      * Text displayed below the axis center.
      */
    /* CompleteClass */
    var bottomText: String = js.native
    
    /**
      * Specifies if text should be bold.
      * @default true
      */
    /* CompleteClass */
    var bottomTextBold: Boolean = js.native
    
    /**
      * Bottom text color.
      */
    /* CompleteClass */
    var bottomTextColor: String = js.native
    
    /**
      * Font size of bottom text.
      */
    /* CompleteClass */
    var bottomTextFontSize: Double = js.native
    
    /**
      * Y offset of bottom text.
      * @default 0
      */
    /* CompleteClass */
    var bottomTextYOffset: Double = js.native
    
    /**
      * X position of the axis, relative to the center of the gauge.
      * @default '0%'
      */
    /* CompleteClass */
    var centerX: Any = js.native
    
    /**
      * Y position of the axis, relative to the center of the gauge.
      * @default '0%'
      */
    /* CompleteClass */
    var centerY: Any = js.native
    
    /**
      * Specifies labels color of the axis.
      */
    /* CompleteClass */
    var color: String = js.native
    
    /**
      * Axis end angle. Valid values are from - 180 to 180.
      * @default 120
      */
    /* CompleteClass */
    var endAngle: Double = js.native
    
    /**
      * Axis end (max) value
      */
    /* CompleteClass */
    var endValue: Double = js.native
    
    /**
      * Font size for axis labels.
      */
    /* CompleteClass */
    var fontSize: Double = js.native
    
    /**
      * Number of grid lines. Note, GaugeAxis doesn't adjust gridCount,
      * so you should check your values and choose a proper gridCount which would result grids at round numbers.
      * @default 5
      */
    /* CompleteClass */
    var gridCount: Double = js.native
    
    /**
      * Specifies if grid should be drawn inside or outside the axis.
      * @default true
      */
    /* CompleteClass */
    var gridInside: Boolean = js.native
    
    /**
      * Unique id of an axis.
      */
    /* CompleteClass */
    var id: Any = js.native
    
    /**
      * Specifies if labels should be placed inside or outside the axis.
      * @default true
      */
    /* CompleteClass */
    var inside: Boolean = js.native
    
    /**
      * Frequency of labels.
      * @default 1
      */
    /* CompleteClass */
    var labelFrequency: Double = js.native
    
    /**
      * You can use this function to format axis labels.
      * This function is called and value is passed as a attribute: labelFunction(value);
      */
    /* CompleteClass */
    override def labelFunction(value: Double): String = js.native
    
    /**
      * Distance from axis to the labels.
      * @default 15
      */
    /* CompleteClass */
    var labelOffset: Double = js.native
    
    /**
      * Specifies if labels on the axis should be shown.
      * @default true
      */
    /* CompleteClass */
    var labelsEnabled: Boolean = js.native
    
    /**
      * You can add listeners of events using this property.
      * Example: listeners = [{"event":"clickBand", "method":handleClick}];
      */
    /* CompleteClass */
    var listeners: js.Array[js.Object] = js.native
    
    /**
      * Interval, at which minor ticks should be placed.
      */
    /* CompleteClass */
    var minorTickInterval: Double = js.native
    
    /**
      * Length of a minor tick.
      * @default 5
      */
    /* CompleteClass */
    var minorTickLength: Double = js.native
    
    /**
      * Axis radius.
      * @default '95%'
      */
    /* CompleteClass */
    var radius: Any = js.native
    
    /**
      * Removes event listener from chart object.
      */
    /* CompleteClass */
    override def removeListener(chart: typingsJapgolly.amcharts.amChartMod.default, `type`: String, handler: Any): Unit = js.native
    
    /**
      * Sets bottom text.
      */
    /* CompleteClass */
    override def setBottomText(text: String): Unit = js.native
    
    /**
      * Sets top text.
      */
    /* CompleteClass */
    override def setTopText(textstring: String): Unit = js.native
    
    /**
      * Specifies if the first label should be shown.
      * @default true
      */
    /* CompleteClass */
    var showFirstLabel: Boolean = js.native
    
    /**
      * Specifies if the last label should be shown.
      * @default true
      */
    /* CompleteClass */
    var showLastLabel: Boolean = js.native
    
    /**
      * Axis start angle. Valid values are from - 180 to 180.
      * @default -120
      */
    /* CompleteClass */
    var startAngle: Double = js.native
    
    /**
      * Axis start (min) value.
      * @default 0
      */
    /* CompleteClass */
    var startValue: Double = js.native
    
    /**
      * Opacity of axis ticks.
      * @default 1
      */
    /* CompleteClass */
    var tickAlpha: Double = js.native
    
    /**
      * Color of axis ticks.
      * @default #555555
      */
    /* CompleteClass */
    var tickColor: String = js.native
    
    /**
      * Length of a major tick.
      * @default 10
      */
    /* CompleteClass */
    var tickLength: Double = js.native
    
    /**
      * Tick thickness.
      * @default 1
      */
    /* CompleteClass */
    var tickThickness: Double = js.native
    
    /**
      * Text displayed above the axis center.
      */
    /* CompleteClass */
    var topText: String = js.native
    
    /**
      * Specifies if text should be bold.
      * @default true
      */
    /* CompleteClass */
    var topTextBold: Boolean = js.native
    
    /**
      * Color of top text.
      */
    /* CompleteClass */
    var topTextColor: String = js.native
    
    /**
      * Font size of top text.
      */
    /* CompleteClass */
    var topTextFontSize: Double = js.native
    
    /**
      * Y offset of top text.
      * @default 0
      */
    /* CompleteClass */
    var topTextYOffset: Double = js.native
    
    /**
      * A string which can be placed next to axis labels.
      */
    /* CompleteClass */
    var unit: String = js.native
    
    /**
      * Position of the unit.
      * @default right
      */
    /* CompleteClass */
    var unitPosition: String = js.native
    
    /**
      * Specifies if small and big numbers should use prefixes to make them more readable.
      * @default false
      */
    /* CompleteClass */
    var usePrefixes: Boolean = js.native
    
    /**
      * Returns angle of the value.
      */
    /* CompleteClass */
    override def value2angle(value: Double): Unit = js.native
    
    /**
      * Interval, at which ticks with values should be placed.
      */
    /* CompleteClass */
    var valueInterval: Double = js.native
  }
  
  trait GaugeAxis extends StObject {
    
    /**
      * Adds event listener to the object.
      */
    def addListener(`type`: String, handler: Any): Unit
    
    /**
      * Axis opacity.
      * @default 1
      */
    var axisAlpha: Double
    
    /**
      * Axis color.
      * @default #000000
      */
    var axisColor: String
    
    /**
      * Thickness of the axis outline.
      * @default 1
      */
    var axisThickness: Double
    
    /**
      * Opacity of band fills.
      * @default 1
      */
    var bandAlpha: Double
    
    /**
      * Example: [-0.2, 0, -0.2]. Will make bands to be filled with color gradients.
      * Negative value means the color will be darker than the original,
      * and positive number means the color will be lighter.
      * @default []
      */
    var bandGradientRatio: js.Array[Double]
    
    /**
      * Opacity of band outlines.
      * @default 0
      */
    var bandOutlineAlpha: Double
    
    /**
      * Color of band outlines.
      * @default #000000
      */
    var bandOutlineColor: String
    
    /**
      * Thickness of band outlines.
      * @default 0
      */
    var bandOutlineThickness: Double
    
    /**
      * Array of bands - GaugeBand objects. Bands are used to draw color fills between specified values.
      */
    var bands: js.Array[typingsJapgolly.amcharts.gaugeBandMod.default]
    
    /**
      * Text displayed below the axis center.
      */
    var bottomText: String
    
    /**
      * Specifies if text should be bold.
      * @default true
      */
    var bottomTextBold: Boolean
    
    /**
      * Bottom text color.
      */
    var bottomTextColor: String
    
    /**
      * Font size of bottom text.
      */
    var bottomTextFontSize: Double
    
    /**
      * Y offset of bottom text.
      * @default 0
      */
    var bottomTextYOffset: Double
    
    /**
      * X position of the axis, relative to the center of the gauge.
      * @default '0%'
      */
    var centerX: Any
    
    /**
      * Y position of the axis, relative to the center of the gauge.
      * @default '0%'
      */
    var centerY: Any
    
    /**
      * Specifies labels color of the axis.
      */
    var color: String
    
    /**
      * Axis end angle. Valid values are from - 180 to 180.
      * @default 120
      */
    var endAngle: Double
    
    /**
      * Axis end (max) value
      */
    var endValue: Double
    
    /**
      * Font size for axis labels.
      */
    var fontSize: Double
    
    /**
      * Number of grid lines. Note, GaugeAxis doesn't adjust gridCount,
      * so you should check your values and choose a proper gridCount which would result grids at round numbers.
      * @default 5
      */
    var gridCount: Double
    
    /**
      * Specifies if grid should be drawn inside or outside the axis.
      * @default true
      */
    var gridInside: Boolean
    
    /**
      * Unique id of an axis.
      */
    var id: Any
    
    /**
      * Specifies if labels should be placed inside or outside the axis.
      * @default true
      */
    var inside: Boolean
    
    /**
      * Frequency of labels.
      * @default 1
      */
    var labelFrequency: Double
    
    /**
      * You can use this function to format axis labels.
      * This function is called and value is passed as a attribute: labelFunction(value);
      */
    def labelFunction(value: Double): String
    
    /**
      * Distance from axis to the labels.
      * @default 15
      */
    var labelOffset: Double
    
    /**
      * Specifies if labels on the axis should be shown.
      * @default true
      */
    var labelsEnabled: Boolean
    
    /**
      * You can add listeners of events using this property.
      * Example: listeners = [{"event":"clickBand", "method":handleClick}];
      */
    var listeners: js.Array[js.Object]
    
    /**
      * Interval, at which minor ticks should be placed.
      */
    var minorTickInterval: Double
    
    /**
      * Length of a minor tick.
      * @default 5
      */
    var minorTickLength: Double
    
    /**
      * Axis radius.
      * @default '95%'
      */
    var radius: Any
    
    /**
      * Removes event listener from chart object.
      */
    def removeListener(chart: typingsJapgolly.amcharts.amChartMod.default, `type`: String, handler: Any): Unit
    
    /**
      * Sets bottom text.
      */
    def setBottomText(text: String): Unit
    
    /**
      * Sets top text.
      */
    def setTopText(textstring: String): Unit
    
    /**
      * Specifies if the first label should be shown.
      * @default true
      */
    var showFirstLabel: Boolean
    
    /**
      * Specifies if the last label should be shown.
      * @default true
      */
    var showLastLabel: Boolean
    
    /**
      * Axis start angle. Valid values are from - 180 to 180.
      * @default -120
      */
    var startAngle: Double
    
    /**
      * Axis start (min) value.
      * @default 0
      */
    var startValue: Double
    
    /**
      * Opacity of axis ticks.
      * @default 1
      */
    var tickAlpha: Double
    
    /**
      * Color of axis ticks.
      * @default #555555
      */
    var tickColor: String
    
    /**
      * Length of a major tick.
      * @default 10
      */
    var tickLength: Double
    
    /**
      * Tick thickness.
      * @default 1
      */
    var tickThickness: Double
    
    /**
      * Text displayed above the axis center.
      */
    var topText: String
    
    /**
      * Specifies if text should be bold.
      * @default true
      */
    var topTextBold: Boolean
    
    /**
      * Color of top text.
      */
    var topTextColor: String
    
    /**
      * Font size of top text.
      */
    var topTextFontSize: Double
    
    /**
      * Y offset of top text.
      * @default 0
      */
    var topTextYOffset: Double
    
    /**
      * A string which can be placed next to axis labels.
      */
    var unit: String
    
    /**
      * Position of the unit.
      * @default right
      */
    var unitPosition: String
    
    /**
      * Specifies if small and big numbers should use prefixes to make them more readable.
      * @default false
      */
    var usePrefixes: Boolean
    
    /**
      * Returns angle of the value.
      */
    def value2angle(value: Double): Unit
    
    /**
      * Interval, at which ticks with values should be placed.
      */
    var valueInterval: Double
  }
  object GaugeAxis {
    
    inline def apply(
      addListener: (String, Any) => Callback,
      axisAlpha: Double,
      axisColor: String,
      axisThickness: Double,
      bandAlpha: Double,
      bandGradientRatio: js.Array[Double],
      bandOutlineAlpha: Double,
      bandOutlineColor: String,
      bandOutlineThickness: Double,
      bands: js.Array[typingsJapgolly.amcharts.gaugeBandMod.default],
      bottomText: String,
      bottomTextBold: Boolean,
      bottomTextColor: String,
      bottomTextFontSize: Double,
      bottomTextYOffset: Double,
      centerX: Any,
      centerY: Any,
      color: String,
      endAngle: Double,
      endValue: Double,
      fontSize: Double,
      gridCount: Double,
      gridInside: Boolean,
      id: Any,
      inside: Boolean,
      labelFrequency: Double,
      labelFunction: Double => String,
      labelOffset: Double,
      labelsEnabled: Boolean,
      listeners: js.Array[js.Object],
      minorTickInterval: Double,
      minorTickLength: Double,
      radius: Any,
      removeListener: (typingsJapgolly.amcharts.amChartMod.default, String, Any) => Callback,
      setBottomText: String => Callback,
      setTopText: String => Callback,
      showFirstLabel: Boolean,
      showLastLabel: Boolean,
      startAngle: Double,
      startValue: Double,
      tickAlpha: Double,
      tickColor: String,
      tickLength: Double,
      tickThickness: Double,
      topText: String,
      topTextBold: Boolean,
      topTextColor: String,
      topTextFontSize: Double,
      topTextYOffset: Double,
      unit: String,
      unitPosition: String,
      usePrefixes: Boolean,
      value2angle: Double => Callback,
      valueInterval: Double
    ): GaugeAxis = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2((t0: String, t1: Any) => (addListener(t0, t1)).runNow()), axisAlpha = axisAlpha.asInstanceOf[js.Any], axisColor = axisColor.asInstanceOf[js.Any], axisThickness = axisThickness.asInstanceOf[js.Any], bandAlpha = bandAlpha.asInstanceOf[js.Any], bandGradientRatio = bandGradientRatio.asInstanceOf[js.Any], bandOutlineAlpha = bandOutlineAlpha.asInstanceOf[js.Any], bandOutlineColor = bandOutlineColor.asInstanceOf[js.Any], bandOutlineThickness = bandOutlineThickness.asInstanceOf[js.Any], bands = bands.asInstanceOf[js.Any], bottomText = bottomText.asInstanceOf[js.Any], bottomTextBold = bottomTextBold.asInstanceOf[js.Any], bottomTextColor = bottomTextColor.asInstanceOf[js.Any], bottomTextFontSize = bottomTextFontSize.asInstanceOf[js.Any], bottomTextYOffset = bottomTextYOffset.asInstanceOf[js.Any], centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], endValue = endValue.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], gridCount = gridCount.asInstanceOf[js.Any], gridInside = gridInside.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inside = inside.asInstanceOf[js.Any], labelFrequency = labelFrequency.asInstanceOf[js.Any], labelFunction = js.Any.fromFunction1(labelFunction), labelOffset = labelOffset.asInstanceOf[js.Any], labelsEnabled = labelsEnabled.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], minorTickInterval = minorTickInterval.asInstanceOf[js.Any], minorTickLength = minorTickLength.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], removeListener = js.Any.fromFunction3((t0: typingsJapgolly.amcharts.amChartMod.default, t1: String, t2: Any) => (removeListener(t0, t1, t2)).runNow()), setBottomText = js.Any.fromFunction1((t0: String) => setBottomText(t0).runNow()), setTopText = js.Any.fromFunction1((t0: String) => setTopText(t0).runNow()), showFirstLabel = showFirstLabel.asInstanceOf[js.Any], showLastLabel = showLastLabel.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], startValue = startValue.asInstanceOf[js.Any], tickAlpha = tickAlpha.asInstanceOf[js.Any], tickColor = tickColor.asInstanceOf[js.Any], tickLength = tickLength.asInstanceOf[js.Any], tickThickness = tickThickness.asInstanceOf[js.Any], topText = topText.asInstanceOf[js.Any], topTextBold = topTextBold.asInstanceOf[js.Any], topTextColor = topTextColor.asInstanceOf[js.Any], topTextFontSize = topTextFontSize.asInstanceOf[js.Any], topTextYOffset = topTextYOffset.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], unitPosition = unitPosition.asInstanceOf[js.Any], usePrefixes = usePrefixes.asInstanceOf[js.Any], value2angle = js.Any.fromFunction1((t0: Double) => value2angle(t0).runNow()), valueInterval = valueInterval.asInstanceOf[js.Any])
      __obj.asInstanceOf[GaugeAxis]
    }
    
    extension [Self <: GaugeAxis](x: Self) {
      
      inline def setAddListener(value: (String, Any) => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setAxisAlpha(value: Double): Self = StObject.set(x, "axisAlpha", value.asInstanceOf[js.Any])
      
      inline def setAxisColor(value: String): Self = StObject.set(x, "axisColor", value.asInstanceOf[js.Any])
      
      inline def setAxisThickness(value: Double): Self = StObject.set(x, "axisThickness", value.asInstanceOf[js.Any])
      
      inline def setBandAlpha(value: Double): Self = StObject.set(x, "bandAlpha", value.asInstanceOf[js.Any])
      
      inline def setBandGradientRatio(value: js.Array[Double]): Self = StObject.set(x, "bandGradientRatio", value.asInstanceOf[js.Any])
      
      inline def setBandGradientRatioVarargs(value: Double*): Self = StObject.set(x, "bandGradientRatio", js.Array(value*))
      
      inline def setBandOutlineAlpha(value: Double): Self = StObject.set(x, "bandOutlineAlpha", value.asInstanceOf[js.Any])
      
      inline def setBandOutlineColor(value: String): Self = StObject.set(x, "bandOutlineColor", value.asInstanceOf[js.Any])
      
      inline def setBandOutlineThickness(value: Double): Self = StObject.set(x, "bandOutlineThickness", value.asInstanceOf[js.Any])
      
      inline def setBands(value: js.Array[typingsJapgolly.amcharts.gaugeBandMod.default]): Self = StObject.set(x, "bands", value.asInstanceOf[js.Any])
      
      inline def setBandsVarargs(value: typingsJapgolly.amcharts.gaugeBandMod.default*): Self = StObject.set(x, "bands", js.Array(value*))
      
      inline def setBottomText(value: String): Self = StObject.set(x, "bottomText", value.asInstanceOf[js.Any])
      
      inline def setBottomTextBold(value: Boolean): Self = StObject.set(x, "bottomTextBold", value.asInstanceOf[js.Any])
      
      inline def setBottomTextColor(value: String): Self = StObject.set(x, "bottomTextColor", value.asInstanceOf[js.Any])
      
      inline def setBottomTextFontSize(value: Double): Self = StObject.set(x, "bottomTextFontSize", value.asInstanceOf[js.Any])
      
      inline def setBottomTextYOffset(value: Double): Self = StObject.set(x, "bottomTextYOffset", value.asInstanceOf[js.Any])
      
      inline def setCenterX(value: Any): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
      
      inline def setCenterY(value: Any): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setEndValue(value: Double): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setGridCount(value: Double): Self = StObject.set(x, "gridCount", value.asInstanceOf[js.Any])
      
      inline def setGridInside(value: Boolean): Self = StObject.set(x, "gridInside", value.asInstanceOf[js.Any])
      
      inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInside(value: Boolean): Self = StObject.set(x, "inside", value.asInstanceOf[js.Any])
      
      inline def setLabelFrequency(value: Double): Self = StObject.set(x, "labelFrequency", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction(value: Double => String): Self = StObject.set(x, "labelFunction", js.Any.fromFunction1(value))
      
      inline def setLabelOffset(value: Double): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
      
      inline def setLabelsEnabled(value: Boolean): Self = StObject.set(x, "labelsEnabled", value.asInstanceOf[js.Any])
      
      inline def setListeners(value: js.Array[js.Object]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      inline def setListenersVarargs(value: js.Object*): Self = StObject.set(x, "listeners", js.Array(value*))
      
      inline def setMinorTickInterval(value: Double): Self = StObject.set(x, "minorTickInterval", value.asInstanceOf[js.Any])
      
      inline def setMinorTickLength(value: Double): Self = StObject.set(x, "minorTickLength", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: Any): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRemoveListener(value: (typingsJapgolly.amcharts.amChartMod.default, String, Any) => Callback): Self = StObject.set(x, "removeListener", js.Any.fromFunction3((t0: typingsJapgolly.amcharts.amChartMod.default, t1: String, t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setSetBottomText(value: String => Callback): Self = StObject.set(x, "setBottomText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetTopText(value: String => Callback): Self = StObject.set(x, "setTopText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setShowFirstLabel(value: Boolean): Self = StObject.set(x, "showFirstLabel", value.asInstanceOf[js.Any])
      
      inline def setShowLastLabel(value: Boolean): Self = StObject.set(x, "showLastLabel", value.asInstanceOf[js.Any])
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setStartValue(value: Double): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
      
      inline def setTickAlpha(value: Double): Self = StObject.set(x, "tickAlpha", value.asInstanceOf[js.Any])
      
      inline def setTickColor(value: String): Self = StObject.set(x, "tickColor", value.asInstanceOf[js.Any])
      
      inline def setTickLength(value: Double): Self = StObject.set(x, "tickLength", value.asInstanceOf[js.Any])
      
      inline def setTickThickness(value: Double): Self = StObject.set(x, "tickThickness", value.asInstanceOf[js.Any])
      
      inline def setTopText(value: String): Self = StObject.set(x, "topText", value.asInstanceOf[js.Any])
      
      inline def setTopTextBold(value: Boolean): Self = StObject.set(x, "topTextBold", value.asInstanceOf[js.Any])
      
      inline def setTopTextColor(value: String): Self = StObject.set(x, "topTextColor", value.asInstanceOf[js.Any])
      
      inline def setTopTextFontSize(value: Double): Self = StObject.set(x, "topTextFontSize", value.asInstanceOf[js.Any])
      
      inline def setTopTextYOffset(value: Double): Self = StObject.set(x, "topTextYOffset", value.asInstanceOf[js.Any])
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitPosition(value: String): Self = StObject.set(x, "unitPosition", value.asInstanceOf[js.Any])
      
      inline def setUsePrefixes(value: Boolean): Self = StObject.set(x, "usePrefixes", value.asInstanceOf[js.Any])
      
      inline def setValue2angle(value: Double => Callback): Self = StObject.set(x, "value2angle", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setValueInterval(value: Double): Self = StObject.set(x, "valueInterval", value.asInstanceOf[js.Any])
    }
  }
}
