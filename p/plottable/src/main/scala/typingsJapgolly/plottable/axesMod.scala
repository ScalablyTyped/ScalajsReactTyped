package typingsJapgolly.plottable

import typingsJapgolly.plottable.axisMod.AxisOrientation
import typingsJapgolly.plottable.quantitativeScaleMod.QuantitativeScale
import typingsJapgolly.plottable.timeAxisMod.TimeAxisOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/axes", JSImport.Namespace)
@js.native
object axesMod extends js.Object {
  @js.native
  class Category protected ()
    extends typingsJapgolly.plottable.categoryAxisMod.Category {
    /**
      * Constructs a Category Axis.
      *
      * A Category Axis is a visual representation of a Category Scale.
      *
      * @constructor
      * @param {Scales.Category} scale
      * @param {AxisOrientation} [orientation="bottom"] Orientation of this Category Axis.
      */
    def this(scale: typingsJapgolly.plottable.scalesMod.Category) = this()
    def this(scale: typingsJapgolly.plottable.scalesMod.Category, orientation: AxisOrientation) = this()
  }
  
  @js.native
  class Numeric protected ()
    extends typingsJapgolly.plottable.numericAxisMod.Numeric {
    /**
      * Constructs a Numeric Axis.
      *
      * A Numeric Axis is a visual representation of a QuantitativeScale.
      *
      * @constructor
      * @param {QuantitativeScale} scale
      * @param {AxisOrientation} orientation Orientation of this Numeric Axis.
      */
    def this(scale: QuantitativeScale[Double], orientation: AxisOrientation) = this()
  }
  
  @js.native
  class Time protected ()
    extends typingsJapgolly.plottable.timeAxisMod.Time {
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
    def this(scale: typingsJapgolly.plottable.scalesMod.Time, orientation: TimeAxisOrientation) = this()
    def this(scale: typingsJapgolly.plottable.scalesMod.Time, orientation: TimeAxisOrientation, useUTC: Boolean) = this()
  }
  
  /* static members */
  @js.native
  object Category extends js.Object {
    /**
      * How many pixels to give labels at minimum before downsampling takes effect.
      */
    var _MINIMUM_WIDTH_PER_LABEL_PX: js.Any = js.native
  }
  
  @js.native
  object TierLabelPosition extends js.Object {
    var between: typingsJapgolly.plottable.plottableStrings.between = js.native
    var center: typingsJapgolly.plottable.plottableStrings.center = js.native
  }
  
  /* static members */
  @js.native
  object Time extends js.Object {
    /**
      * The CSS class applied to each Time Axis tier
      */
    var TIME_AXIS_TIER_CLASS: String = js.native
    var _DEFAULT_TIME_AXIS_CONFIGURATIONS: js.Any = js.native
    var _LONG_DATE: js.Any = js.native
    var _SORTED_TIME_INTERVAL_INDEX: js.Any = js.native
  }
  
  @js.native
  object TimeAxisOrientation extends js.Object {
    var bottom: typingsJapgolly.plottable.plottableStrings.bottom = js.native
    var top: typingsJapgolly.plottable.plottableStrings.top = js.native
  }
  
  @js.native
  object TimeInterval extends js.Object {
    var day: typingsJapgolly.plottable.plottableStrings.day = js.native
    var hour: typingsJapgolly.plottable.plottableStrings.hour = js.native
    var minute: typingsJapgolly.plottable.plottableStrings.minute = js.native
    var month: typingsJapgolly.plottable.plottableStrings.month = js.native
    var second: typingsJapgolly.plottable.plottableStrings.second = js.native
    var week: typingsJapgolly.plottable.plottableStrings.week = js.native
    var year: typingsJapgolly.plottable.plottableStrings.year = js.native
  }
  
}

