package typingsJapgolly.maplibreGl.mod

import org.scalajs.dom.MouseEvent
import typingsJapgolly.mapboxPointGeometry.mod.^
import typingsJapgolly.maplibreGl.maplibreGlStrings.click
import typingsJapgolly.maplibreGl.maplibreGlStrings.contextmenu
import typingsJapgolly.maplibreGl.maplibreGlStrings.dblclick
import typingsJapgolly.maplibreGl.maplibreGlStrings.mousedown
import typingsJapgolly.maplibreGl.maplibreGlStrings.mouseenter
import typingsJapgolly.maplibreGl.maplibreGlStrings.mouseleave
import typingsJapgolly.maplibreGl.maplibreGlStrings.mousemove
import typingsJapgolly.maplibreGl.maplibreGlStrings.mouseout
import typingsJapgolly.maplibreGl.maplibreGlStrings.mouseover
import typingsJapgolly.maplibreGl.maplibreGlStrings.mouseup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.maplibreGl.mod.MapLibreEvent because var conflicts: `type`. Inlined target, originalEvent */ @JSImport("maplibre-gl", "MapMouseEvent")
@js.native
open class MapMouseEvent protected () extends Event {
  /**
  	 * @private
  	 */
  def this(`type`: String, map: Map, originalEvent: MouseEvent) = this()
  def this(`type`: String, map: Map, originalEvent: MouseEvent, data: Any) = this()
  
  var _defaultPrevented: Boolean = js.native
  
  /**
  	 * `true` if `preventDefault` has been called.
  	 * @private
  	 */
  def defaultPrevented: Boolean = js.native
  
  /**
  	 * The geographic location on the map of the mouse cursor.
  	 */
  var lngLat: LngLat = js.native
  
  /**
  	 * The DOM event which caused the map event.
  	 */
  var originalEvent: MouseEvent = js.native
  
  /**
  	 * The pixel coordinates of the mouse cursor, relative to the map and measured from the top left corner.
  	 */
  var point: ^ = js.native
  
  /**
  	 * Prevents subsequent default processing of the event by the map.
  	 *
  	 * Calling this method will prevent the following default map behaviors:
  	 *
  	 *   * On `mousedown` events, the behavior of {@link DragPanHandler}
  	 *   * On `mousedown` events, the behavior of {@link DragRotateHandler}
  	 *   * On `mousedown` events, the behavior of {@link BoxZoomHandler}
  	 *   * On `dblclick` events, the behavior of {@link DoubleClickZoomHandler}
  	 *
  	 */
  def preventDefault(): scala.Unit = js.native
  
  /**
  	 * The `Map` object that fired the event.
  	 */
  var target: Map = js.native
  
  /**
  	 * The event type (one of {@link Map.event:mousedown},
  	 * {@link Map.event:mouseup},
  	 * {@link Map.event:click},
  	 * {@link Map.event:dblclick},
  	 * {@link Map.event:mousemove},
  	 * {@link Map.event:mouseover},
  	 * {@link Map.event:mouseenter},
  	 * {@link Map.event:mouseleave},
  	 * {@link Map.event:mouseout},
  	 * {@link Map.event:contextmenu}).
  	 */
  @JSName("type")
  var type_MapMouseEvent: mousedown | mouseup | click | dblclick | mousemove | mouseover | mouseenter | mouseleave | mouseout | contextmenu = js.native
}
