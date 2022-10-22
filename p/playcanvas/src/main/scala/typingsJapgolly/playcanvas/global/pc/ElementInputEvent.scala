package typingsJapgolly.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an input event fired on a {@link ElementComponent}. When an event is raised on an
  * ElementComponent it bubbles up to its parent ElementComponents unless we call stopPropagation().
  */
@JSGlobal("pc.ElementInputEvent")
@js.native
open class ElementInputEvent protected ()
  extends typingsJapgolly.playcanvas.mod.ElementInputEvent {
  /**
    * Create a new ElementInputEvent instance.
    *
    * @param {MouseEvent|TouchEvent} event - The MouseEvent or TouchEvent that was originally
    * raised.
    * @param {ElementComponent} element - The ElementComponent that this event was originally
    * raised on.
    * @param {CameraComponent} camera - The CameraComponent that this event was originally raised
    * via.
    */
  def this(
    event: org.scalajs.dom.MouseEvent,
    element: typingsJapgolly.playcanvas.mod.ElementComponent,
    camera: typingsJapgolly.playcanvas.mod.CameraComponent
  ) = this()
  def this(
    event: org.scalajs.dom.TouchEvent,
    element: typingsJapgolly.playcanvas.mod.ElementComponent,
    camera: typingsJapgolly.playcanvas.mod.CameraComponent
  ) = this()
}
