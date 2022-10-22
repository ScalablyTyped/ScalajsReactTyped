package typingsJapgolly.playcanvas.global.pc

import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Attach a TouchDevice to an element and it will receive and fire events when the element is
  * touched. See also {@link Touch} and {@link TouchEvent}.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.TouchDevice")
@js.native
open class TouchDevice protected ()
  extends typingsJapgolly.playcanvas.mod.TouchDevice {
  /**
    * Create a new touch device and attach it to an element.
    *
    * @param {Element} element - The element to attach listen for events on.
    */
  def this(element: Element) = this()
}
