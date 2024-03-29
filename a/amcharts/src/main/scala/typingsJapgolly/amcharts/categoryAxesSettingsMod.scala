package typingsJapgolly.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object categoryAxesSettingsMod {
  
  @JSImport("amcharts/CategoryAxesSettings", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with CategoryAxesSettings {
    
    /**
      * Specifies whether number of gridCount is specified automatically, according to the axis size.
      * @default true
      */
    /* CompleteClass */
    var autoGridCount: Boolean = js.native
    
    /**
      * Axis opacity.
      */
    /* CompleteClass */
    var axisAlpha: Double = js.native
    
    /**
      * Axis color.
      */
    /* CompleteClass */
    var axisColor: String = js.native
    
    /**
      * Height of category axes. Set it to 0 if you set inside property to true.
      * @default 28
      */
    /* CompleteClass */
    var axisHeight: Double = js.native
    
    /**
      * Thickness of the axis.
      */
    /* CompleteClass */
    var axisThickness: Double = js.native
    
    /**
      * Text color.
      */
    /* CompleteClass */
    var color: String = js.native
    
    /**
      * Length of a dash.
      */
    /* CompleteClass */
    var dashLength: Double = js.native
    
    /**
      * Date formats of different periods.
      * Possible period values:
      * fff - milliseconds,
      * ss - seconds,
      * mm - minutes,
      * hh - hours,
      * DD - days,
      * MM - months,
      * WW - weeks,
      * YYYY - years
      * Check this page for date formatting strings.
      */
    /* CompleteClass */
    var dateFormats: js.Array[Any] = js.native
    
    /**
      * If you want data points to be placed at equal intervals (omiting dates with no data),
      * set equalSpacing to true.
      */
    /* CompleteClass */
    var equalSpacing: Boolean = js.native
    
    /**
      * Fill opacity. Every second space between grid lines can be filled with fillColor.
      */
    /* CompleteClass */
    var fillAlpha: Double = js.native
    
    /**
      * Fill color. Every second space between grid lines can be filled with color.
      * Set fillAlpha to a value greater than 0 to see the fills.
      */
    /* CompleteClass */
    var fillColor: String = js.native
    
    /**
      * Text size.
      */
    /* CompleteClass */
    var fontSize: String = js.native
    
    /**
      * Opacity of grid lines.
      */
    /* CompleteClass */
    var gridAlpha: Double = js.native
    
    /**
      * Color of grid lines.
      */
    /* CompleteClass */
    var gridColor: String = js.native
    
    /**
      * Approximate number of grid lines.
      * You should set autoGridCount to false in order this property not to be ignored.
      * @default 10
      */
    /* CompleteClass */
    var gridCount: Double = js.native
    
    /**
      * Thickness of grid lines.
      */
    /* CompleteClass */
    var gridThickness: Double = js.native
    
    /**
      * Periods to which data will be gruoped in case there are more data items in
      * the selected period than specified in maxSeries property.
      * ["ss", "10ss", "30ss", "mm", "10mm", "30mm", "hh", "DD", "WW", "MM", "YYYY"]
      */
    /* CompleteClass */
    var groupToPeriods: js.Array[Any] = js.native
    
    /**
      * Specifies whether values should be placed inside or outside of plot area.
      */
    /* CompleteClass */
    var inside: Boolean = js.native
    
    /**
      * Rotation angle of a label.
      */
    /* CompleteClass */
    var labelRotation: Double = js.native
    
    /**
      * Maximum series shown at a time.
      * In case there are more data points in the selection than maxSeries,
      * the chart will group data to longer periods, for example - you have 250 days in the selection,
      * and maxSeries is 150 - the chart will group data to weeks.
      * @default 150
      */
    /* CompleteClass */
    var maxSeries: Double = js.native
    
    /**
      * Specifies the shortest period of your data.
      * fff - millisecond,
      * ss - second,
      * mm - minute,
      * hh - hour,
      * DD - day,
      * MM - month,
      * YYYY - year
      * @default "DD"
      */
    /* CompleteClass */
    var minPeriod: String = js.native
    
    /**
      * top or "bottom".
      */
    /* CompleteClass */
    var position: String = js.native
    
    /**
      * Specifies whether the graph should start on axis or not.
      * In case you display columns, it is recommended to set this to false.
      * startOnAxis can be set to true only if equalSpacing is set to true.
      */
    /* CompleteClass */
    var startOnAxis: Boolean = js.native
    
    /**
      * Tick length.
      */
    /* CompleteClass */
    var tickLength: Double = js.native
  }
  
  trait CategoryAxesSettings extends StObject {
    
    /**
      * Specifies whether number of gridCount is specified automatically, according to the axis size.
      * @default true
      */
    var autoGridCount: Boolean
    
    /**
      * Axis opacity.
      */
    var axisAlpha: Double
    
    /**
      * Axis color.
      */
    var axisColor: String
    
    /**
      * Height of category axes. Set it to 0 if you set inside property to true.
      * @default 28
      */
    var axisHeight: Double
    
    /**
      * Thickness of the axis.
      */
    var axisThickness: Double
    
    /**
      * Text color.
      */
    var color: String
    
    /**
      * Length of a dash.
      */
    var dashLength: Double
    
    /**
      * Date formats of different periods.
      * Possible period values:
      * fff - milliseconds,
      * ss - seconds,
      * mm - minutes,
      * hh - hours,
      * DD - days,
      * MM - months,
      * WW - weeks,
      * YYYY - years
      * Check this page for date formatting strings.
      */
    var dateFormats: js.Array[Any]
    
    /**
      * If you want data points to be placed at equal intervals (omiting dates with no data),
      * set equalSpacing to true.
      */
    var equalSpacing: Boolean
    
    /**
      * Fill opacity. Every second space between grid lines can be filled with fillColor.
      */
    var fillAlpha: Double
    
    /**
      * Fill color. Every second space between grid lines can be filled with color.
      * Set fillAlpha to a value greater than 0 to see the fills.
      */
    var fillColor: String
    
    /**
      * Text size.
      */
    var fontSize: String
    
    /**
      * Opacity of grid lines.
      */
    var gridAlpha: Double
    
    /**
      * Color of grid lines.
      */
    var gridColor: String
    
    /**
      * Approximate number of grid lines.
      * You should set autoGridCount to false in order this property not to be ignored.
      * @default 10
      */
    var gridCount: Double
    
    /**
      * Thickness of grid lines.
      */
    var gridThickness: Double
    
    /**
      * Periods to which data will be gruoped in case there are more data items in
      * the selected period than specified in maxSeries property.
      * ["ss", "10ss", "30ss", "mm", "10mm", "30mm", "hh", "DD", "WW", "MM", "YYYY"]
      */
    var groupToPeriods: js.Array[Any]
    
    /**
      * Specifies whether values should be placed inside or outside of plot area.
      */
    var inside: Boolean
    
    /**
      * Rotation angle of a label.
      */
    var labelRotation: Double
    
    /**
      * Maximum series shown at a time.
      * In case there are more data points in the selection than maxSeries,
      * the chart will group data to longer periods, for example - you have 250 days in the selection,
      * and maxSeries is 150 - the chart will group data to weeks.
      * @default 150
      */
    var maxSeries: Double
    
    /**
      * Specifies the shortest period of your data.
      * fff - millisecond,
      * ss - second,
      * mm - minute,
      * hh - hour,
      * DD - day,
      * MM - month,
      * YYYY - year
      * @default "DD"
      */
    var minPeriod: String
    
    /**
      * top or "bottom".
      */
    var position: String
    
    /**
      * Specifies whether the graph should start on axis or not.
      * In case you display columns, it is recommended to set this to false.
      * startOnAxis can be set to true only if equalSpacing is set to true.
      */
    var startOnAxis: Boolean
    
    /**
      * Tick length.
      */
    var tickLength: Double
  }
  object CategoryAxesSettings {
    
    inline def apply(
      autoGridCount: Boolean,
      axisAlpha: Double,
      axisColor: String,
      axisHeight: Double,
      axisThickness: Double,
      color: String,
      dashLength: Double,
      dateFormats: js.Array[Any],
      equalSpacing: Boolean,
      fillAlpha: Double,
      fillColor: String,
      fontSize: String,
      gridAlpha: Double,
      gridColor: String,
      gridCount: Double,
      gridThickness: Double,
      groupToPeriods: js.Array[Any],
      inside: Boolean,
      labelRotation: Double,
      maxSeries: Double,
      minPeriod: String,
      position: String,
      startOnAxis: Boolean,
      tickLength: Double
    ): CategoryAxesSettings = {
      val __obj = js.Dynamic.literal(autoGridCount = autoGridCount.asInstanceOf[js.Any], axisAlpha = axisAlpha.asInstanceOf[js.Any], axisColor = axisColor.asInstanceOf[js.Any], axisHeight = axisHeight.asInstanceOf[js.Any], axisThickness = axisThickness.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], dashLength = dashLength.asInstanceOf[js.Any], dateFormats = dateFormats.asInstanceOf[js.Any], equalSpacing = equalSpacing.asInstanceOf[js.Any], fillAlpha = fillAlpha.asInstanceOf[js.Any], fillColor = fillColor.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], gridAlpha = gridAlpha.asInstanceOf[js.Any], gridColor = gridColor.asInstanceOf[js.Any], gridCount = gridCount.asInstanceOf[js.Any], gridThickness = gridThickness.asInstanceOf[js.Any], groupToPeriods = groupToPeriods.asInstanceOf[js.Any], inside = inside.asInstanceOf[js.Any], labelRotation = labelRotation.asInstanceOf[js.Any], maxSeries = maxSeries.asInstanceOf[js.Any], minPeriod = minPeriod.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], startOnAxis = startOnAxis.asInstanceOf[js.Any], tickLength = tickLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[CategoryAxesSettings]
    }
    
    extension [Self <: CategoryAxesSettings](x: Self) {
      
      inline def setAutoGridCount(value: Boolean): Self = StObject.set(x, "autoGridCount", value.asInstanceOf[js.Any])
      
      inline def setAxisAlpha(value: Double): Self = StObject.set(x, "axisAlpha", value.asInstanceOf[js.Any])
      
      inline def setAxisColor(value: String): Self = StObject.set(x, "axisColor", value.asInstanceOf[js.Any])
      
      inline def setAxisHeight(value: Double): Self = StObject.set(x, "axisHeight", value.asInstanceOf[js.Any])
      
      inline def setAxisThickness(value: Double): Self = StObject.set(x, "axisThickness", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setDashLength(value: Double): Self = StObject.set(x, "dashLength", value.asInstanceOf[js.Any])
      
      inline def setDateFormats(value: js.Array[Any]): Self = StObject.set(x, "dateFormats", value.asInstanceOf[js.Any])
      
      inline def setDateFormatsVarargs(value: Any*): Self = StObject.set(x, "dateFormats", js.Array(value*))
      
      inline def setEqualSpacing(value: Boolean): Self = StObject.set(x, "equalSpacing", value.asInstanceOf[js.Any])
      
      inline def setFillAlpha(value: Double): Self = StObject.set(x, "fillAlpha", value.asInstanceOf[js.Any])
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setGridAlpha(value: Double): Self = StObject.set(x, "gridAlpha", value.asInstanceOf[js.Any])
      
      inline def setGridColor(value: String): Self = StObject.set(x, "gridColor", value.asInstanceOf[js.Any])
      
      inline def setGridCount(value: Double): Self = StObject.set(x, "gridCount", value.asInstanceOf[js.Any])
      
      inline def setGridThickness(value: Double): Self = StObject.set(x, "gridThickness", value.asInstanceOf[js.Any])
      
      inline def setGroupToPeriods(value: js.Array[Any]): Self = StObject.set(x, "groupToPeriods", value.asInstanceOf[js.Any])
      
      inline def setGroupToPeriodsVarargs(value: Any*): Self = StObject.set(x, "groupToPeriods", js.Array(value*))
      
      inline def setInside(value: Boolean): Self = StObject.set(x, "inside", value.asInstanceOf[js.Any])
      
      inline def setLabelRotation(value: Double): Self = StObject.set(x, "labelRotation", value.asInstanceOf[js.Any])
      
      inline def setMaxSeries(value: Double): Self = StObject.set(x, "maxSeries", value.asInstanceOf[js.Any])
      
      inline def setMinPeriod(value: String): Self = StObject.set(x, "minPeriod", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setStartOnAxis(value: Boolean): Self = StObject.set(x, "startOnAxis", value.asInstanceOf[js.Any])
      
      inline def setTickLength(value: Double): Self = StObject.set(x, "tickLength", value.asInstanceOf[js.Any])
    }
  }
}
