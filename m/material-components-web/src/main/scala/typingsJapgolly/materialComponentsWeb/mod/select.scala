package typingsJapgolly.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialSelect.adapterMod.MDCSelectAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "select")
@js.native
object select extends js.Object {
  @js.native
  class MDCSelect ()
    extends typingsJapgolly.materialSelect.mod.MDCSelect
  
  @js.native
  class MDCSelectFoundation ()
    extends typingsJapgolly.materialSelect.mod.MDCSelectFoundation
  
  /* static members */
  @js.native
  object MDCSelect extends js.Object {
    def attachTo(root: Element): typingsJapgolly.materialSelect.mod.MDCSelect = js.native
  }
  
  /* static members */
  @js.native
  object MDCSelectFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialSelect.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCSelectAdapter = js.native
    val strings: typingsJapgolly.materialSelect.constantsMod.strings = js.native
  }
  
}

