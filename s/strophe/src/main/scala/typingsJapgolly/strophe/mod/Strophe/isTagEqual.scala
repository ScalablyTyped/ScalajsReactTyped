package typingsJapgolly.strophe.mod.Strophe

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strophe", "Strophe.isTagEqual")
@js.native
object isTagEqual extends js.Object {
  /** Function: isTagEqual
    *  Compare an element's tag name with a string.
    *
    *  This function is case sensitive.
    *
    *  Parameters:
    *    (XMLElement) el - A DOM element.
    *    (String) name - The element name.
    *
    *  Returns:
    *    true if the element's tag name matches _el_, and false
    *    otherwise.
    */
  def apply(el: Element, name: String): Boolean = js.native
}

