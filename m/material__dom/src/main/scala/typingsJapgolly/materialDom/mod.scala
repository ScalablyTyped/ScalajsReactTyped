package typingsJapgolly.materialDom

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/dom", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object ponyfill extends js.Object {
    def closest(element: Element, selector: String): Element = js.native
    def matches(element: Element, selector: String): Boolean = js.native
  }
  
}

