package typingsJapgolly.ol.pointerMod

import org.scalajs.dom.raw.PointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerInteraction
  extends typingsJapgolly.ol.interactionInteractionMod.default {
  var handlingDownUpSequence: Boolean = js.native
  var targetPointers: js.Array[PointerEvent] = js.native
  /* protected */ def handleDownEvent(mapBrowserEvent: typingsJapgolly.ol.mapBrowserPointerEventMod.default): Boolean = js.native
  /* protected */ def handleDragEvent(mapBrowserEvent: typingsJapgolly.ol.mapBrowserPointerEventMod.default): Unit = js.native
  /* protected */ def handleMoveEvent(mapBrowserEvent: typingsJapgolly.ol.mapBrowserPointerEventMod.default): Unit = js.native
  /* protected */ def handleUpEvent(mapBrowserEvent: typingsJapgolly.ol.mapBrowserPointerEventMod.default): Boolean = js.native
  def stopDown(handled: Boolean): Boolean = js.native
}

