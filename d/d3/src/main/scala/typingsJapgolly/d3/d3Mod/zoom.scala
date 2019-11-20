package typingsJapgolly.d3.d3Mod

import typingsJapgolly.d3DashZoom.d3DashZoomMod.ZoomBehavior
import typingsJapgolly.d3DashZoom.d3DashZoomMod.ZoomedElementBaseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "zoom")
@js.native
object zoom extends js.Object {
  def apply[ZoomRefElement /* <: ZoomedElementBaseType */, Datum](): ZoomBehavior[ZoomRefElement, Datum] = js.native
}

