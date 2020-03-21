package typingsJapgolly.playcanvas.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Mouse
  * @augments pc.EventHandler
  * @classdesc A Mouse Device, bound to a DOM Element.
  * @description Create a new Mouse device.
  * @param {Element} [element] - The Element that the mouse events are attached to.
  */
@JSImport("playcanvas", "Mouse")
@js.native
class Mouse ()
  extends typingsJapgolly.playcanvas.pc.Mouse {
  def this(element: Element) = this()
}

/* static members */
@JSImport("playcanvas", "Mouse")
@js.native
object Mouse extends js.Object {
  /**
    * @static
    * @function
    * @name pc.Mouse.isPointerLocked
    * @description Check if the mouse pointer has been locked, using {@link pc.Mouse#enabledPointerLock}.
    * @returns {boolean} True if locked.
    */
  def isPointerLocked(): Boolean = js.native
}

