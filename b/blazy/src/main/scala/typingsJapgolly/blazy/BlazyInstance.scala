package typingsJapgolly.blazy

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLCollection
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlazyInstance extends StObject {
  
  /**
    * Unbind events and resets image array.
    */
  def destroy(): Unit = js.native
  
  def load(elements: js.Array[Element | HTMLElement], force: Boolean): Unit = js.native
  /**
    * Forces the given element(s) to load if not collapsed. If you also want to load a collapsed/hidden elements you can add true as the second parameter.
    * You can pass a single element or a list of elements. Tested with getElementById, getElementsByClassName, querySelectorAll, querySelector and jQuery selector.
    */
  def load(elements: Element, force: Boolean): Unit = js.native
  def load(elements: HTMLCollection[Any], force: Boolean): Unit = js.native
  def load(elements: HTMLElement, force: Boolean): Unit = js.native
  def load(elements: NodeList[Node], force: Boolean): Unit = js.native
  
  /**
    * Revalidates document for visible images. Useful if you add images with scripting or ajax.
    */
  def revalidate(): Unit = js.native
}
