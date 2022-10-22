package typingsJapgolly.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a TouchEvent fired on a {@link ElementComponent}.
  *
  * @augments ElementInputEvent
  */
@JSGlobal("pc.ElementTouchEvent")
@js.native
open class ElementTouchEvent protected ()
  extends typingsJapgolly.playcanvas.mod.ElementTouchEvent {
  /**
    * Create an instance of an ElementTouchEvent.
    *
    * @param {TouchEvent} event - The TouchEvent that was originally raised.
    * @param {ElementComponent} element - The ElementComponent that this event was originally
    * raised on.
    * @param {CameraComponent} camera - The CameraComponent that this event was originally raised
    * via.
    * @param {number} x - The x coordinate of the touch that triggered the event.
    * @param {number} y - The y coordinate of the touch that triggered the event.
    * @param {Touch} touch - The touch object that triggered the event.
    */
  def this(
    event: org.scalajs.dom.TouchEvent,
    element: typingsJapgolly.playcanvas.mod.ElementComponent,
    camera: typingsJapgolly.playcanvas.mod.CameraComponent,
    x: Double,
    y: Double,
    touch: org.scalajs.dom.Touch
  ) = this()
}
