package typingsJapgolly.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialDrawer.adapterMod.MDCDrawerAdapter
import typingsJapgolly.materialDrawer.focusTrapMod.FocusTrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "drawer")
@js.native
object drawer extends js.Object {
  @js.native
  class MDCDismissibleDrawerFoundation protected ()
    extends typingsJapgolly.materialDrawer.mod.MDCDismissibleDrawerFoundation {
    def this(adapter: MDCDrawerAdapter) = this()
  }
  
  @js.native
  class MDCDrawer protected ()
    extends typingsJapgolly.materialDrawer.mod.MDCDrawer {
    def this(args: js.Any*) = this()
  }
  
  @js.native
  class MDCModalDrawerFoundation ()
    extends typingsJapgolly.materialDrawer.modalFoundationMod.MDCModalDrawerFoundation
  
  /* static members */
  @js.native
  object MDCDismissibleDrawerFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialDrawer.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCDrawerAdapter = js.native
    val strings: typingsJapgolly.materialDrawer.constantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCDrawer extends js.Object {
    def attachTo(root: Element): typingsJapgolly.materialDrawer.mod.MDCDrawer = js.native
  }
  
  @js.native
  object util extends js.Object {
    def createFocusTrapInstance(surfaceEl: Element, focusTrapFactory: js.Function0[FocusTrap]): FocusTrap = js.native
  }
  
}

