package typingsJapgolly.electron.Electron

import japgolly.scalajs.react.Callback
import typingsJapgolly.electron.electronStrings.`round-rect`
import typingsJapgolly.electron.electronStrings.`small-square`
import typingsJapgolly.electron.electronStrings.`textured-rounded`
import typingsJapgolly.electron.electronStrings.`textured-square`
import typingsJapgolly.electron.electronStrings.automatic
import typingsJapgolly.electron.electronStrings.buttons
import typingsJapgolly.electron.electronStrings.capsule
import typingsJapgolly.electron.electronStrings.multiple
import typingsJapgolly.electron.electronStrings.rounded
import typingsJapgolly.electron.electronStrings.separated
import typingsJapgolly.electron.electronStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBarSegmentedControlConstructorOptions extends js.Object {
  /**
    * The selection mode of the control:
    */
  var mode: js.UndefOr[single | multiple | buttons] = js.undefined
  /**
    * Style of the segments:
    */
  var segmentStyle: js.UndefOr[
    automatic | rounded | `textured-rounded` | `round-rect` | `textured-square` | capsule | `small-square` | separated
  ] = js.undefined
  /**
    * An array of segments to place in this control.
    */
  var segments: js.Array[SegmentedControlSegment]
  /**
    * The index of the currently selected segment, will update automatically with user
    * interaction. When the mode is multiple it will be the last selected item.
    */
  var selectedIndex: js.UndefOr[Double] = js.undefined
  /**
    * Called when the user selects a new segment.
    */
  def change(selectedIndex: Double, isSelected: Boolean): Unit
}

object TouchBarSegmentedControlConstructorOptions {
  @scala.inline
  def apply(
    change: (Double, Boolean) => Callback,
    segments: js.Array[SegmentedControlSegment],
    mode: single | multiple | buttons = null,
    segmentStyle: automatic | rounded | `textured-rounded` | `round-rect` | `textured-square` | capsule | `small-square` | separated = null,
    selectedIndex: Int | Double = null
  ): TouchBarSegmentedControlConstructorOptions = {
    val __obj = js.Dynamic.literal(segments = segments.asInstanceOf[js.Any])
    __obj.updateDynamic("change")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Boolean) => change(t0, t1).runNow()))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (segmentStyle != null) __obj.updateDynamic("segmentStyle")(segmentStyle.asInstanceOf[js.Any])
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarSegmentedControlConstructorOptions]
  }
}

