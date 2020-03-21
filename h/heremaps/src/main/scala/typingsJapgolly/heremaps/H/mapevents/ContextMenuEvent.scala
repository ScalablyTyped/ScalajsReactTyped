package typingsJapgolly.heremaps.H.mapevents

import typingsJapgolly.heremaps.H.Map_
import typingsJapgolly.heremaps.H.map.Object
import typingsJapgolly.heremaps.H.util.ContextItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ContextMenuEvent should be fired, when a user right-clicks or longpresses on a map object.
  * @property viewportX {Array<H.util.ContextItem>} - Contains ContextItems, that will be used to create context menu entries. Should be filled by listeners of the "contextmenu" event
  * @property viewportY {number} - Map viewport y position
  * @property target {(H.map.Object | H.Map)} - Target for the event
  * @property originalEvent {Event} - Original event
  * @property currentTarget {(H.map.Object | H.Map)} - Object which has listener attached
  * @property type {string} - Name of the dispatched event
  * @property defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
  */
@JSGlobal("H.mapevents.ContextMenuEvent")
@js.native
class ContextMenuEvent protected ()
  extends typingsJapgolly.heremaps.H.util.Event {
  /**
    * Constructor
    * @param viewportX {number} - The x coordinate on the viewport
    * @param viewportY {number} - The y coordinate on the viewport
    * @param target {(H.Map | H.map.Object)} - The event's target element
    * @param originalEvent {Event} - target of the event
    */
  def this(viewportX: Double, viewportY: Double, target: Map_, originalEvent: Event) = this()
  def this(viewportX: Double, viewportY: Double, target: Object, originalEvent: Event) = this()
  var originalEvent: Event = js.native
  var viewportX: js.Array[ContextItem] = js.native
  var viewportY: Double = js.native
}

