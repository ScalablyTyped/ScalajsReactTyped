package typingsJapgolly.fullcalendar.eventDraggingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/EventDragging", "Default")
@js.native
class Default_ protected ()
  extends typingsJapgolly.fullcalendar.interactionMod.default {
  def this(component: js.Any, eventPointing: js.Any) = this()
  var dragListener: js.Any = js.native
  var eventPointing: js.Any = js.native
  var isDragging: Boolean = js.native
  def bindToEl(el: js.Any): Unit = js.native
  def buildDragListener(seg: js.Any): js.Any = js.native
  def buildSelectListener(seg: js.Any): js.Any = js.native
  def computeEventDateMutation(startFootprint: js.Any, endFootprint: js.Any): js.Any = js.native
  def computeEventDropMutation(startFootprint: js.Any, endFootprint: js.Any, eventDef: js.Any): typingsJapgolly.fullcalendar.eventDefMutationMod.default = js.native
  def getSelectionDelay(): js.Any = js.native
  def handleMousedown(seg: js.Any, ev: js.Any): Unit = js.native
  def handleTouchStart(seg: js.Any, ev: js.Any): Unit = js.native
  def segDragStart(seg: js.Any, ev: js.Any): Unit = js.native
  def segDragStop(seg: js.Any, ev: js.Any): Unit = js.native
}

