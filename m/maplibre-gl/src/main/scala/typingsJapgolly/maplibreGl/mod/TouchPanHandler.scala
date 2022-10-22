package typingsJapgolly.maplibreGl.mod

import org.scalajs.dom.Touch
import org.scalajs.dom.TouchEvent
import typingsJapgolly.mapboxPointGeometry.mod.^
import typingsJapgolly.maplibreGl.anon.Around
import typingsJapgolly.maplibreGl.anon.CooperativeGestures
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "TouchPanHandler")
@js.native
open class TouchPanHandler protected () extends StObject {
  def this(options: CooperativeGestures, map: Map) = this()
  
  var _active: Boolean = js.native
  
  def _calculateTransform(e: TouchEvent, points: js.Array[^], mapTouches: js.Array[Touch]): Around = js.native
  
  var _cancelCooperativeMessage: Boolean = js.native
  
  var _clickTolerance: Double = js.native
  
  var _enabled: Boolean = js.native
  
  var _map: Map = js.native
  
  var _minTouches: Double = js.native
  
  var _sum: ^ = js.native
  
  var _touches: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in string | number ]: @mapbox/point-geometry.@mapbox/point-geometry.^} */ js.Any = js.native
  
  def disable(): scala.Unit = js.native
  
  def enable(): scala.Unit = js.native
  
  def isActive(): Boolean = js.native
  
  def isEnabled(): Boolean = js.native
  
  def reset(): scala.Unit = js.native
  
  def touchcancel(): scala.Unit = js.native
  
  def touchend(e: TouchEvent, points: js.Array[^], mapTouches: js.Array[Touch]): scala.Unit = js.native
  
  def touchmove(e: TouchEvent, points: js.Array[^], mapTouches: js.Array[Touch]): Around = js.native
  
  def touchstart(e: TouchEvent, points: js.Array[^], mapTouches: js.Array[Touch]): Around = js.native
}
