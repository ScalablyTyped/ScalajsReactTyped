package typingsJapgolly.fullcalendar.eventResizingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/EventResizing", "Default")
@js.native
class Default_ protected ()
  extends typingsJapgolly.fullcalendar.interactionMod.default {
  def this(component: js.Any, eventPointing: js.Any) = this()
  var dragListener: js.Any = js.native
  var eventPointing: js.Any = js.native
  var isResizing: Boolean = js.native
  def bindToEl(el: js.Any): Unit = js.native
  def buildDragListener(seg: js.Any, isStart: js.Any): typingsJapgolly.fullcalendar.hitDragListenerMod.default = js.native
  def computeEventEndResizeMutation(startFootprint: js.Any, endFootprint: js.Any, origEventFootprint: js.Any): js.Any = js.native
  def computeEventStartResizeMutation(startFootprint: js.Any, endFootprint: js.Any, origEventFootprint: js.Any): js.Any = js.native
  def handleMouseDown(seg: js.Any, ev: js.Any): Unit = js.native
  def handleTouchStart(seg: js.Any, ev: js.Any): Unit = js.native
  def segResizeStart(seg: js.Any, ev: js.Any): Unit = js.native
  def segResizeStop(seg: js.Any, ev: js.Any): Unit = js.native
}

