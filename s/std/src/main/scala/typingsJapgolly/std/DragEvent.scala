package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A DOM event that represents a drag and drop interaction. The user initiates a drag by placing a pointer device (such as a mouse) on the touch surface and then dragging the pointer to a new location (such as another DOM element). Applications are free to interpret a drag and drop interaction in an application-specific way. */
@js.native
trait DragEvent extends MouseEvent {
  /**
    * Returns the DataTransfer object for the event.
    */
  val dataTransfer: org.scalajs.dom.raw.DataTransfer | Null = js.native
}

@JSGlobal("DragEvent")
@js.native
object DragEvent
  extends Instantiable1[/* type */ java.lang.String, DragEvent]
     with Instantiable2[/* type */ java.lang.String, /* eventInitDict */ DragEventInit, DragEvent]

