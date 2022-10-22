package typingsJapgolly.maplibreGl.mod

import org.scalajs.dom.Touch
import org.scalajs.dom.TouchEvent
import typingsJapgolly.mapboxPointGeometry.mod.^
import typingsJapgolly.maplibreGl.anon.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "TapZoomHandler")
@js.native
open class TapZoomHandler () extends StObject {
  
  var _active: Boolean = js.native
  
  var _enabled: Boolean = js.native
  
  var _zoomIn: TapRecognizer = js.native
  
  var _zoomOut: TapRecognizer = js.native
  
  def disable(): scala.Unit = js.native
  
  def enable(): scala.Unit = js.native
  
  def isActive(): Boolean = js.native
  
  def isEnabled(): Boolean = js.native
  
  def reset(): scala.Unit = js.native
  
  def touchcancel(): scala.Unit = js.native
  
  def touchend(e: TouchEvent, points: js.Array[^], mapTouches: js.Array[Touch]): `4` = js.native
  
  def touchmove(e: TouchEvent, points: js.Array[^], mapTouches: js.Array[Touch]): scala.Unit = js.native
  
  def touchstart(e: TouchEvent, points: js.Array[^], mapTouches: js.Array[Touch]): scala.Unit = js.native
}
