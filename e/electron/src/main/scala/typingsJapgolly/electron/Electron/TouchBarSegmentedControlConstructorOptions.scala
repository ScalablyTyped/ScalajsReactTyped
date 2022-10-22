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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchBarSegmentedControlConstructorOptions extends StObject {
  
  /**
    * Called when the user selects a new segment.
    */
  var change: js.UndefOr[js.Function2[/* selectedIndex */ Double, /* isSelected */ Boolean, Unit]] = js.undefined
  
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
    * interaction. When the mode is `multiple` it will be the last selected item.
    */
  var selectedIndex: js.UndefOr[Double] = js.undefined
}
object TouchBarSegmentedControlConstructorOptions {
  
  inline def apply(segments: js.Array[SegmentedControlSegment]): TouchBarSegmentedControlConstructorOptions = {
    val __obj = js.Dynamic.literal(segments = segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarSegmentedControlConstructorOptions]
  }
  
  extension [Self <: TouchBarSegmentedControlConstructorOptions](x: Self) {
    
    inline def setChange(value: (/* selectedIndex */ Double, /* isSelected */ Boolean) => Callback): Self = StObject.set(x, "change", js.Any.fromFunction2((t0: /* selectedIndex */ Double, t1: /* isSelected */ Boolean) => (value(t0, t1)).runNow()))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setMode(value: single | multiple | buttons): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setSegmentStyle(
      value: automatic | rounded | `textured-rounded` | `round-rect` | `textured-square` | capsule | `small-square` | separated
    ): Self = StObject.set(x, "segmentStyle", value.asInstanceOf[js.Any])
    
    inline def setSegmentStyleUndefined: Self = StObject.set(x, "segmentStyle", js.undefined)
    
    inline def setSegments(value: js.Array[SegmentedControlSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsVarargs(value: SegmentedControlSegment*): Self = StObject.set(x, "segments", js.Array(value*))
    
    inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
  }
}
