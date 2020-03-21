package typingsJapgolly.materialDrawer

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialBase.componentMod.default
import typingsJapgolly.materialDrawer.adapterMod.MDCDrawerAdapter
import typingsJapgolly.materialDrawer.focusTrapMod.FocusTrap
import typingsJapgolly.materialList.mod.MDCList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/drawer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCDismissibleDrawerFoundation protected ()
    extends typingsJapgolly.materialDrawer.foundationMod.MDCDismissibleDrawerFoundation {
    def this(adapter: MDCDrawerAdapter) = this()
  }
  
  @js.native
  class MDCDrawer protected ()
    extends default[
          MDCDrawer, 
          typingsJapgolly.materialDrawer.foundationMod.MDCDismissibleDrawerFoundation | typingsJapgolly.materialDrawer.modalFoundationMod.MDCModalDrawerFoundation
        ] {
    def this(args: js.Any*) = this()
    /**
      * Returns true if drawer is in the open position.
      */
    var open: Boolean = js.native
    def initialize(focusTrapFactory: FocusTrap, listFactory: MDCList): Unit = js.native
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
    def attachTo(root: Element): MDCDrawer = js.native
  }
  
  @js.native
  object util extends js.Object {
    def createFocusTrapInstance(surfaceEl: Element, focusTrapFactory: js.Function0[FocusTrap]): FocusTrap = js.native
  }
  
}

