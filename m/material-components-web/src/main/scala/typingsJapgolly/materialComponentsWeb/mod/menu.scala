package typingsJapgolly.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialMenu.adapterMod.MDCMenuAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "menu")
@js.native
object menu extends js.Object {
  @js.native
  class MDCMenu ()
    extends typingsJapgolly.materialMenu.mod.MDCMenu
  
  @js.native
  class MDCMenuFoundation ()
    extends typingsJapgolly.materialMenu.mod.MDCMenuFoundation
  
  /* static members */
  @js.native
  object MDCMenu extends js.Object {
    def attachTo(root: Element): typingsJapgolly.materialMenu.mod.MDCMenu = js.native
  }
  
  /* static members */
  @js.native
  object MDCMenuFoundation extends js.Object {
    val Corner: typingsJapgolly.materialMenu.constantsMod.Corner = js.native
    val cssClasses: typingsJapgolly.materialMenu.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCMenuAdapter = js.native
    val numbers: typingsJapgolly.materialMenu.constantsMod.numbers = js.native
    val strings: typingsJapgolly.materialMenu.constantsMod.strings = js.native
  }
  
}

