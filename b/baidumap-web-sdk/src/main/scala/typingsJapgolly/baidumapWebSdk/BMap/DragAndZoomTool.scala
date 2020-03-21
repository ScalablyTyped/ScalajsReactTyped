package typingsJapgolly.baidumapWebSdk.BMap

import typingsJapgolly.baidumapWebSdk.AnonBounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.DragAndZoomTool")
@js.native
class DragAndZoomTool protected () extends js.Object {
  def this(map: Map) = this()
  def this(map: Map, opts: DragAndZoomToolOptions) = this()
  def close(): Unit = js.native
  def ondrawend(event: AnonBounds): Unit = js.native
  def open(): Boolean = js.native
}

