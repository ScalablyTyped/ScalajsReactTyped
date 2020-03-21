package typingsJapgolly.uifabricUtilities

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/dom/findElementRecursive", JSImport.Namespace)
@js.native
object findElementRecursiveMod extends js.Object {
  def findElementRecursive(element: Null, matchFunction: js.Function1[/* element */ HTMLElement, Boolean]): HTMLElement | Null = js.native
  def findElementRecursive(
    element: typingsJapgolly.std.HTMLElement,
    matchFunction: js.Function1[/* element */ HTMLElement, Boolean]
  ): HTMLElement | Null = js.native
}

