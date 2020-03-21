package typingsJapgolly.ol

import typingsJapgolly.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/MapEvent", JSImport.Namespace)
@js.native
object mapEventMod extends js.Object {
  @js.native
  trait MapEvent
    extends typingsJapgolly.ol.eventMod.default {
    var frameState: FrameState = js.native
    var map: typingsJapgolly.ol.pluggableMapMod.default = js.native
  }
  
  @js.native
  class default protected () extends MapEvent {
    def this(`type`: String, map: typingsJapgolly.ol.pluggableMapMod.default) = this()
    def this(`type`: String, map: typingsJapgolly.ol.pluggableMapMod.default, opt_frameState: FrameState) = this()
  }
  
}

