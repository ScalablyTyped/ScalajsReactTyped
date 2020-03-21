package typingsJapgolly.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialCheckbox.adapterMod.MDCCheckboxAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "checkbox")
@js.native
object checkbox extends js.Object {
  @js.native
  class MDCCheckbox ()
    extends typingsJapgolly.materialCheckbox.mod.MDCCheckbox
  
  @js.native
  class MDCCheckboxFoundation ()
    extends typingsJapgolly.materialCheckbox.mod.MDCCheckboxFoundation
  
  /* static members */
  @js.native
  object MDCCheckbox extends js.Object {
    def attachTo(root: Element): typingsJapgolly.materialCheckbox.mod.MDCCheckbox = js.native
  }
  
  /* static members */
  @js.native
  object MDCCheckboxFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialCheckbox.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCCheckboxAdapter = js.native
    val numbers: typingsJapgolly.materialCheckbox.constantsMod.numbers = js.native
    val strings: typingsJapgolly.materialCheckbox.constantsMod.strings = js.native
  }
  
}

