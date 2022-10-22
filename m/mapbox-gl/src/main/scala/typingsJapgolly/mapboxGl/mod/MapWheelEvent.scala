package typingsJapgolly.mapboxGl.mod

import org.scalajs.dom.WheelEvent
import typingsJapgolly.mapboxGl.mapboxGlStrings.wheel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "MapWheelEvent")
@js.native
open class MapWheelEvent () extends MapboxEvent[WheelEvent] {
  
  var defaultPrevented: Boolean = js.native
  
  def preventDefault(): Unit = js.native
  
  @JSName("type")
  var type_MapWheelEvent: wheel = js.native
}
