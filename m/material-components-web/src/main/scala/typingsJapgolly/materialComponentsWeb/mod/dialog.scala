package typingsJapgolly.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialDialog.adapterMod.MDCDialogAdapter
import typingsJapgolly.materialDialog.utilMod.MDCFocusTrapFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "dialog")
@js.native
object dialog extends js.Object {
  @js.native
  class MDCDialog ()
    extends typingsJapgolly.materialDialog.mod.MDCDialog
  
  @js.native
  class MDCDialogFoundation ()
    extends typingsJapgolly.materialDialog.mod.MDCDialogFoundation
  
  /* static members */
  @js.native
  object MDCDialog extends js.Object {
    def attachTo(root: Element): typingsJapgolly.materialDialog.mod.MDCDialog = js.native
  }
  
  /* static members */
  @js.native
  object MDCDialogFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialDialog.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCDialogAdapter = js.native
    val strings: typingsJapgolly.materialDialog.constantsMod.strings = js.native
  }
  
  @js.native
  object util extends js.Object {
    def createFocusTrapInstance(surfaceEl: Element, acceptButtonEl: Element): js.Any = js.native
    def createFocusTrapInstance(surfaceEl: Element, acceptButtonEl: Element, focusTrapFactory: MDCFocusTrapFactory): js.Any = js.native
  }
  
}

