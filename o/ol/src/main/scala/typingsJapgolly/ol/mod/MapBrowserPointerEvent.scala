package typingsJapgolly.ol.mod

import org.scalajs.dom.raw.PointerEvent
import typingsJapgolly.ol.mapBrowserPointerEventMod.default
import typingsJapgolly.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "MapBrowserPointerEvent")
@js.native
class MapBrowserPointerEvent protected () extends default {
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

