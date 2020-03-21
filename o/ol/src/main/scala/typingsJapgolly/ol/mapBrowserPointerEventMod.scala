package typingsJapgolly.ol

import org.scalajs.dom.raw.PointerEvent
import typingsJapgolly.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/MapBrowserPointerEvent", JSImport.Namespace)
@js.native
object mapBrowserPointerEventMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsJapgolly.ol.mapBrowserEventMod.default {
    def this(`type`: String, map: typingsJapgolly.ol.pluggableMapMod.default, pointerEvent: PointerEvent) = this()
    def this(
      `type`: String,
      map: typingsJapgolly.ol.pluggableMapMod.default,
      pointerEvent: PointerEvent,
      opt_dragging: Boolean
    ) = this()
    def this(
      `type`: String,
      map: typingsJapgolly.ol.pluggableMapMod.default,
      pointerEvent: PointerEvent,
      opt_dragging: Boolean,
      opt_frameState: FrameState
    ) = this()
  }
  
  type MapBrowserPointerEvent = typingsJapgolly.ol.mapBrowserEventMod.default
}

