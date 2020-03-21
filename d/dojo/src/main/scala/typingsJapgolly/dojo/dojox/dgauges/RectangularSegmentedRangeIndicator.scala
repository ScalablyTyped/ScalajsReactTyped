package typingsJapgolly.dojo.dojox.dgauges

import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dojoStrings.endThickness
import typingsJapgolly.dojo.dojoStrings.fill
import typingsJapgolly.dojo.dojoStrings.paddingBottom
import typingsJapgolly.dojo.dojoStrings.paddingLeft
import typingsJapgolly.dojo.dojoStrings.paddingRight
import typingsJapgolly.dojo.dojoStrings.paddingTop
import typingsJapgolly.dojo.dojoStrings.ranges
import typingsJapgolly.dojo.dojoStrings.rounded
import typingsJapgolly.dojo.dojoStrings.segmentSpacing
import typingsJapgolly.dojo.dojoStrings.segments
import typingsJapgolly.dojo.dojoStrings.start
import typingsJapgolly.dojo.dojoStrings.startThickness
import typingsJapgolly.dojo.dojoStrings.stroke
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dgauges/RectangularSegmentedRangeIndicator.html
  *
  * A segmented-style range indicator for rectangular gauges.
  * This class will be replaced by a cleaner implementation in a future version.
  *
  */
@JSGlobal("dojox.dgauges.RectangularSegmentedRangeIndicator")
@js.native
class RectangularSegmentedRangeIndicator () extends IndicatorBase {
  /**
    *
    */
  var endThickness: Double = js.native
  /**
    *
    */
  var fill: js.Object = js.native
  /**
    *
    */
  var paddingBottom: Double = js.native
  /**
    *
    */
  var paddingLeft: Double = js.native
  /**
    *
    */
  var paddingRight: Double = js.native
  /**
    *
    */
  var paddingTop: Double = js.native
  /**
    * An array containing objects to define color ranges. Example [{color:"#FF0000", size:20}, {color:"#FF8800", size:50}].
    *
    */
  var ranges: js.Array[_] = js.native
  /**
    * Indicates if the extremity segments are rounded.
    * Default is true.
    *
    */
  var rounded: Boolean = js.native
  /**
    * The blank space between two segments. The default value is 2
    *
    */
  var segmentSpacing: Double = js.native
  /**
    * The number of segments making the indicator.
    * By default it is 10.
    *
    */
  var segments: Double = js.native
  /**
    *
    */
  var start: Double = js.native
  /**
    *
    */
  var startThickness: Double = js.native
  /**
    *
    */
  var stroke: js.Object = js.native
  @JSName("get")
  def get_endThickness(property: endThickness): Double = js.native
  @JSName("get")
  def get_fill(property: fill): js.Object = js.native
  @JSName("get")
  def get_paddingBottom(property: paddingBottom): Double = js.native
  @JSName("get")
  def get_paddingLeft(property: paddingLeft): Double = js.native
  @JSName("get")
  def get_paddingRight(property: paddingRight): Double = js.native
  @JSName("get")
  def get_paddingTop(property: paddingTop): Double = js.native
  @JSName("get")
  def get_ranges(property: ranges): js.Array[_] = js.native
  @JSName("get")
  def get_rounded(property: rounded): Boolean = js.native
  @JSName("get")
  def get_segmentSpacing(property: segmentSpacing): Double = js.native
  @JSName("get")
  def get_segments(property: segments): Double = js.native
  @JSName("get")
  def get_start(property: start): Double = js.native
  @JSName("get")
  def get_startThickness(property: startThickness): Double = js.native
  @JSName("get")
  def get_stroke(property: stroke): js.Object = js.native
  @JSName("set")
  def set_endThickness(property: endThickness, value: Double): Unit = js.native
  @JSName("set")
  def set_fill(property: fill, value: js.Object): Unit = js.native
  @JSName("set")
  def set_paddingBottom(property: paddingBottom, value: Double): Unit = js.native
  @JSName("set")
  def set_paddingLeft(property: paddingLeft, value: Double): Unit = js.native
  @JSName("set")
  def set_paddingRight(property: paddingRight, value: Double): Unit = js.native
  @JSName("set")
  def set_paddingTop(property: paddingTop, value: Double): Unit = js.native
  @JSName("set")
  def set_ranges(property: ranges, value: js.Array[_]): Unit = js.native
  @JSName("set")
  def set_rounded(property: rounded, value: Boolean): Unit = js.native
  @JSName("set")
  def set_segmentSpacing(property: segmentSpacing, value: Double): Unit = js.native
  @JSName("set")
  def set_segments(property: segments, value: Double): Unit = js.native
  @JSName("set")
  def set_start(property: start, value: Double): Unit = js.native
  @JSName("set")
  def set_startThickness(property: startThickness, value: Double): Unit = js.native
  @JSName("set")
  def set_stroke(property: stroke, value: js.Object): Unit = js.native
  @JSName("watch")
  def watch_endThickness(
    property: endThickness,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_fill(
    property: fill,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_paddingBottom(
    property: paddingBottom,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_paddingLeft(
    property: paddingLeft,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_paddingRight(
    property: paddingRight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_paddingTop(
    property: paddingTop,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_ranges(
    property: ranges,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Array[_]], 
      /* newValue */ js.UndefOr[js.Array[_]], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_rounded(
    property: rounded,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_segmentSpacing(
    property: segmentSpacing,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_segments(
    property: segments,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_start(
    property: start,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_startThickness(
    property: startThickness,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_stroke(
    property: stroke,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

