package typingsJapgolly.ol.mod

import typingsJapgolly.ol.mapBrowserEventMod.default
import typingsJapgolly.ol.pluggableMapMod.FrameState
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "MapBrowserEvent")
@js.native
class MapBrowserEvent protected () extends default {
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

