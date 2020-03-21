package typingsJapgolly.phosphorDomutils.elementMod.ElementExt

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/domutils/lib/element", "ElementExt.hitTest")
@js.native
object hitTest extends js.Object {
  /**
    * Test whether a client position lies within an element.
    *
    * @param element - The DOM element of interest.
    *
    * @param clientX - The client X coordinate of interest.
    *
    * @param clientY - The client Y coordinate of interest.
    *
    * @returns Whether the point is within the given element.
    */
  def apply(element: Element, clientX: Double, clientY: Double): Boolean = js.native
}

