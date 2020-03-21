package typingsJapgolly.ol.mod

import typingsJapgolly.ol.mapEventMod.default
import typingsJapgolly.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "MapEvent")
@js.native
class MapEvent protected () extends default {
  def this(`type`: String, map: typingsJapgolly.ol.pluggableMapMod.default) = this()
  def this(`type`: String, map: typingsJapgolly.ol.pluggableMapMod.default, opt_frameState: FrameState) = this()
}

