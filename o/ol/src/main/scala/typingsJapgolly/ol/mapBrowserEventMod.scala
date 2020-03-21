package typingsJapgolly.ol

import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.pixelMod.Pixel
import typingsJapgolly.ol.pluggableMapMod.FrameState
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/MapBrowserEvent", JSImport.Namespace)
@js.native
object mapBrowserEventMod extends js.Object {
  @js.native
  trait MapBrowserEvent
    extends typingsJapgolly.ol.mapEventMod.default {
    var coordinate: Coordinate = js.native
    var dragging: Boolean = js.native
    var originalEvent: Event_ = js.native
    var pixel: Pixel = js.native
  }
  
  @js.native
  class default protected () extends MapBrowserEvent {
    def this(`type`: String, map: typingsJapgolly.ol.pluggableMapMod.default, browserEvent: Event_) = this()
    def this(
      `type`: String,
      map: typingsJapgolly.ol.pluggableMapMod.default,
      browserEvent: Event_,
      opt_dragging: Boolean
    ) = this()
    def this(
      `type`: String,
      map: typingsJapgolly.ol.pluggableMapMod.default,
      browserEvent: Event_,
      opt_dragging: Boolean,
      opt_frameState: FrameState
    ) = this()
  }
  
}

