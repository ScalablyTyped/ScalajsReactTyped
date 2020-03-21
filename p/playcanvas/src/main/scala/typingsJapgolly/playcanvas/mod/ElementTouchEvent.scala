package typingsJapgolly.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.ElementTouchEvent
  * @augments pc.ElementInputEvent
  * @classdesc Represents a TouchEvent fired on a {@link pc.ElementComponent}.
  * @description Create an instance of a pc.ElementTouchEvent.
  * @param {TouchEvent} event - The TouchEvent that was originally raised.
  * @param {pc.ElementComponent} element - The ElementComponent that this event was originally raised on.
  * @param {pc.CameraComponent} camera - The CameraComponent that this event was originally raised via.
  * @param {number} x - The x coordinate of the touch that triggered the event.
  * @param {number} y - The y coordinate of the touch that triggered the event.
  * @param {Touch} touch - The touch object that triggered the event.
  * @property {Touch[]} touches The Touch objects representing all current points of contact with the surface, regardless of target or changed status.
  * @property {Touch[]} changedTouches The Touch objects representing individual points of contact whose states changed between the previous touch event and this one.
  * @property {Touch} touch The touch object that triggered the event.
  */
@JSImport("playcanvas", "ElementTouchEvent")
@js.native
class ElementTouchEvent protected ()
  extends typingsJapgolly.playcanvas.pc.ElementTouchEvent {
  def this(
    event: typingsJapgolly.playcanvas.pc.TouchEvent,
    element: typingsJapgolly.playcanvas.pc.ElementComponent,
    camera: typingsJapgolly.playcanvas.pc.CameraComponent,
    x: Double,
    y: Double,
    touch: typingsJapgolly.playcanvas.pc.Touch
  ) = this()
}

