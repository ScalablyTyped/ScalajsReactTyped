package typingsJapgolly.reactDndTouchBackend

import typingsJapgolly.dndCore.interfacesMod.XYCoord
import typingsJapgolly.std.MouseEvent
import typingsJapgolly.std.Touch
import typingsJapgolly.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd-touch-backend/lib/utils/offsets", JSImport.Namespace)
@js.native
object offsetsMod extends js.Object {
  def getEventClientOffset(e: MouseEvent): js.UndefOr[XYCoord] = js.native
  def getEventClientOffset(e: Touch): js.UndefOr[XYCoord] = js.native
  def getEventClientOffset(e: TouchEvent): js.UndefOr[XYCoord] = js.native
  def getEventClientTouchOffset(e: org.scalajs.dom.raw.TouchEvent): js.UndefOr[XYCoord] = js.native
  def getNodeClientOffset(node: js.Any): js.UndefOr[XYCoord] = js.native
}

