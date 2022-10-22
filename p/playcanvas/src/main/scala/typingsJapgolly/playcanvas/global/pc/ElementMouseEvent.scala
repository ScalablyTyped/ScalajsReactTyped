package typingsJapgolly.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Mouse event fired on a {@link ElementComponent}.
  *
  * @augments ElementInputEvent
  */
@JSGlobal("pc.ElementMouseEvent")
@js.native
open class ElementMouseEvent protected ()
  extends typingsJapgolly.playcanvas.mod.ElementMouseEvent {
  /**
    * Create an instance of an ElementMouseEvent.
    *
    * @param {MouseEvent} event - The MouseEvent that was originally raised.
    * @param {ElementComponent} element - The ElementComponent that this event was originally
    * raised on.
    * @param {CameraComponent} camera - The CameraComponent that this event was originally raised
    * via.
    * @param {number} x - The x coordinate.
    * @param {number} y - The y coordinate.
    * @param {number} lastX - The last x coordinate.
    * @param {number} lastY - The last y coordinate.
    */
  def this(
    event: org.scalajs.dom.MouseEvent,
    element: typingsJapgolly.playcanvas.mod.ElementComponent,
    camera: typingsJapgolly.playcanvas.mod.CameraComponent,
    x: Double,
    y: Double,
    lastX: Double,
    lastY: Double
  ) = this()
}
