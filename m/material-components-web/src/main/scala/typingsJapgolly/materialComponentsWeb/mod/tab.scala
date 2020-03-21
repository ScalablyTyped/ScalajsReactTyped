package typingsJapgolly.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialTab.adapterMod.MDCTabAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "tab")
@js.native
object tab extends js.Object {
  @js.native
  class MDCTab ()
    extends typingsJapgolly.materialTab.mod.MDCTab
  
  @js.native
  class MDCTabFoundation ()
    extends typingsJapgolly.materialTab.mod.MDCTabFoundation
  
  /* static members */
  @js.native
  object MDCTab extends js.Object {
    def attachTo(root: Element): typingsJapgolly.materialTab.mod.MDCTab = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialTab.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabAdapter = js.native
    val strings: typingsJapgolly.materialTab.constantsMod.strings = js.native
  }
  
}

