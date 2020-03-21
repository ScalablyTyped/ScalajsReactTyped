package typingsJapgolly.materialDrawer

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialDrawer.focusTrapMod.FocusTrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/drawer/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  def createFocusTrapInstance(surfaceEl: Element, focusTrapFactory: js.Function0[FocusTrap]): FocusTrap = js.native
}

