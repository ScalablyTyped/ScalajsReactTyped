package typingsJapgolly.materialDialog

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/dialog/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  def createFocusTrapInstance(surfaceEl: Element, acceptButtonEl: Element): js.Any = js.native
  def createFocusTrapInstance(surfaceEl: Element, acceptButtonEl: Element, focusTrapFactory: MDCFocusTrapFactory): js.Any = js.native
  type MDCFocusTrapFactory = js.Function2[/* a */ Element, /* b */ AnonClickOutsideDeactivates, js.Any]
}

