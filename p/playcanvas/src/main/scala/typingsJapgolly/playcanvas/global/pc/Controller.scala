package typingsJapgolly.playcanvas.global.pc

import org.scalajs.dom.Element
import typingsJapgolly.playcanvas.anon.Gamepads
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./game-pads.js').GamePads} GamePads */
/**
  * A general input handler which handles both mouse and keyboard input assigned to named actions.
  * This allows you to define input handlers separately to defining keyboard/mouse configurations.
  */
@JSGlobal("pc.Controller")
@js.native
/**
  * Create a new instance of a Controller.
  *
  * @param {Element} [element] - Element to attach Controller to.
  * @param {object} [options] - Optional arguments.
  * @param {Keyboard} [options.keyboard] - A Keyboard object to use.
  * @param {Mouse} [options.mouse] - A Mouse object to use.
  * @param {GamePads} [options.gamepads] - A Gamepads object to use.
  * @example
  * var c = new pc.Controller(document);
  *
  * // Register the "fire" action and assign it to both the Enter key and the Spacebar.
  * c.registerKeys("fire", [pc.KEY_ENTER, pc.KEY_SPACE]);
  */
open class Controller ()
  extends typingsJapgolly.playcanvas.mod.Controller {
  def this(element: Element) = this()
  def this(element: Element, options: Gamepads) = this()
  def this(element: Unit, options: Gamepads) = this()
}
