package typingsJapgolly.trimblemapsTrimblemapsJs.mod

import org.scalajs.dom.TouchEvent
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.touchcancel
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.touchend
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.touchstart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@trimblemaps/trimblemaps-js", "MapTouchEvent")
@js.native
open class MapTouchEvent () extends MapEvent[TouchEvent] {
  
  var defaultPrevented: Boolean = js.native
  
  var lngLat: LngLat = js.native
  
  var lngLats: js.Array[LngLat] = js.native
  
  var point: Point = js.native
  
  var points: js.Array[Point] = js.native
  
  def preventDefault(): Unit = js.native
  
  @JSName("type")
  var type_MapTouchEvent: touchstart | touchend | touchcancel = js.native
}
