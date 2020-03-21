package typingsJapgolly.waypoints

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WaypointContext")
@js.native
class WaypointContext () extends js.Object {
  var adapter: WaypointAdapter = js.native
  var element: HTMLElement | Window_ = js.native
  var waypoints: AnonHorizontal = js.native
   // http://imakewebthings.com/waypoints/api/context/#waypoints-property
  def destroy(): Waypoint = js.native
  def refresh(): Waypoint = js.native
}

