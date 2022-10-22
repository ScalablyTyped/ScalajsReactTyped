package typingsJapgolly.plottable.mod

import typingsJapgolly.plottable.buildSrcAxesTimeAxisMod.TimeAxisOrientation
import typingsJapgolly.plottable.plottableStrings.between
import typingsJapgolly.plottable.plottableStrings.bottom
import typingsJapgolly.plottable.plottableStrings.center
import typingsJapgolly.plottable.plottableStrings.day
import typingsJapgolly.plottable.plottableStrings.hour
import typingsJapgolly.plottable.plottableStrings.minute
import typingsJapgolly.plottable.plottableStrings.month
import typingsJapgolly.plottable.plottableStrings.second
import typingsJapgolly.plottable.plottableStrings.top
import typingsJapgolly.plottable.plottableStrings.week
import typingsJapgolly.plottable.plottableStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Axes {
  
  @JSImport("plottable", "Axes.Category")
  @js.native
  open class Category protected ()
    extends typingsJapgolly.plottable.buildSrcAxesMod.Category {
    /**
      * Constructs a Category Axis.
      *
      * A Category Axis is a visual representation of a Category Scale.
      *
      * @constructor
      * @param {Scales.Category} scale
      * @param {AxisOrientation} [orientation="bottom"] Orientation of this Category Axis.
      */
    def this(scale: typingsJapgolly.plottable.buildSrcScalesMod.Category) = this()
    def this(
      scale: typingsJapgolly.plottable.buildSrcScalesMod.Category,
      orientation: typingsJapgolly.plottable.buildSrcAxesAxisMod.AxisOrientation
    ) = this()
  }
  /* static members */
  object Category {
    
    @JSImport("plottable", "Axes.Category")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * How many pixels to give labels at minimum before downsampling takes effect.
      */
    @JSImport("plottable", "Axes.Category._MINIMUM_WIDTH_PER_LABEL_PX")
    @js.native
    def _MINIMUM_WIDTH_PER_LABEL_PX: Any = js.native
    inline def _MINIMUM_WIDTH_PER_LABEL_PX_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MINIMUM_WIDTH_PER_LABEL_PX")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable", "Axes.Numeric")
  @js.native
  open class Numeric protected ()
    extends typingsJapgolly.plottable.buildSrcAxesMod.Numeric {
    /**
      * Constructs a Numeric Axis.
      *
      * A Numeric Axis is a visual representation of a QuantitativeScale.
      *
      * @constructor
      * @param {QuantitativeScale} scale
      * @param {AxisOrientation} orientation Orientation of this Numeric Axis.
      */
    def this(
      scale: typingsJapgolly.plottable.buildSrcScalesQuantitativeScaleMod.QuantitativeScale[Double],
      orientation: typingsJapgolly.plottable.buildSrcAxesAxisMod.AxisOrientation
    ) = this()
  }
  
  object TierLabelPosition {
    
    @JSImport("plottable", "Axes.TierLabelPosition")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Axes.TierLabelPosition.between")
    @js.native
    def between: typingsJapgolly.plottable.plottableStrings.between = js.native
    inline def between_=(x: between): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("between")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Axes.TierLabelPosition.center")
    @js.native
    def center: typingsJapgolly.plottable.plottableStrings.center = js.native
    inline def center_=(x: center): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("center")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable", "Axes.Time")
  @js.native
  open class Time protected ()
    extends typingsJapgolly.plottable.buildSrcAxesMod.Time {
    /**
      * Constructs a Time Axis.
      *
      * A Time Axis is a visual representation of a Time Scale.
      *
      * @constructor
      * @param {Scales.Time} scale
      * @param {AxisOrientation} orientation Orientation of this Time Axis. Time Axes can only have "top" or "bottom"
      * @param {boolean} useUTC Displays date object in UTC if true, local time if false. Defaults to false.
      * orientations.
      */
    def this(scale: typingsJapgolly.plottable.buildSrcScalesMod.Time, orientation: TimeAxisOrientation) = this()
    def this(
      scale: typingsJapgolly.plottable.buildSrcScalesMod.Time,
      orientation: TimeAxisOrientation,
      useUTC: Boolean
    ) = this()
  }
  /* static members */
  object Time {
    
    @JSImport("plottable", "Axes.Time")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The CSS class applied to each Time Axis tier
      */
    @JSImport("plottable", "Axes.Time.TIME_AXIS_TIER_CLASS")
    @js.native
    def TIME_AXIS_TIER_CLASS: String = js.native
    inline def TIME_AXIS_TIER_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIME_AXIS_TIER_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Axes.Time._DEFAULT_TIME_AXIS_CONFIGURATIONS")
    @js.native
    def _DEFAULT_TIME_AXIS_CONFIGURATIONS: Any = js.native
    inline def _DEFAULT_TIME_AXIS_CONFIGURATIONS_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_TIME_AXIS_CONFIGURATIONS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Axes.Time._LONG_DATE")
    @js.native
    def _LONG_DATE: Any = js.native
    inline def _LONG_DATE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LONG_DATE")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Axes.Time._SORTED_TIME_INTERVAL_INDEX")
    @js.native
    def _SORTED_TIME_INTERVAL_INDEX: Any = js.native
    inline def _SORTED_TIME_INTERVAL_INDEX_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SORTED_TIME_INTERVAL_INDEX")(x.asInstanceOf[js.Any])
  }
  
  object TimeAxisOrientation {
    
    @JSImport("plottable", "Axes.TimeAxisOrientation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Axes.TimeAxisOrientation.bottom")
    @js.native
    def bottom: typingsJapgolly.plottable.plottableStrings.bottom = js.native
    inline def bottom_=(x: bottom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottom")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Axes.TimeAxisOrientation.top")
    @js.native
    def top: typingsJapgolly.plottable.plottableStrings.top = js.native
    inline def top_=(x: top): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("top")(x.asInstanceOf[js.Any])
  }
  
  object TimeInterval {
    
    @JSImport("plottable", "Axes.TimeInterval")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Axes.TimeInterval.day")
    @js.native
    def day: typingsJapgolly.plottable.plottableStrings.day = js.native
    inline def day_=(x: day): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("day")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Axes.TimeInterval.hour")
    @js.native
    def hour: typingsJapgolly.plottable.plottableStrings.hour = js.native
    inline def hour_=(x: hour): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hour")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Axes.TimeInterval.minute")
    @js.native
    def minute: typingsJapgolly.plottable.plottableStrings.minute = js.native
    inline def minute_=(x: minute): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minute")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Axes.TimeInterval.month")
    @js.native
    def month: typingsJapgolly.plottable.plottableStrings.month = js.native
    inline def month_=(x: month): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("month")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Axes.TimeInterval.second")
    @js.native
    def second: typingsJapgolly.plottable.plottableStrings.second = js.native
    inline def second_=(x: second): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("second")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Axes.TimeInterval.week")
    @js.native
    def week: typingsJapgolly.plottable.plottableStrings.week = js.native
    inline def week_=(x: week): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("week")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Axes.TimeInterval.year")
    @js.native
    def year: typingsJapgolly.plottable.plottableStrings.year = js.native
    inline def year_=(x: year): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("year")(x.asInstanceOf[js.Any])
  }
}
