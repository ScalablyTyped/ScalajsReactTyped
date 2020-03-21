package typingsJapgolly.materialCheckbox

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialCheckbox.adapterMod.MDCCheckboxAdapter
import typingsJapgolly.materialCheckbox.foundationMod.default
import typingsJapgolly.materialRipple.mod.MDCRipple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/checkbox", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.materialSelectionControl.mod.MDCSelectionControl because Inheritance from two classes. Inlined ripple */ @js.native
  class MDCCheckbox ()
    extends typingsJapgolly.materialBase.componentMod.default[MDCCheckboxAdapter, default] {
    var checked: Boolean = js.native
    var disabled: Boolean = js.native
    var indeterminate: Boolean = js.native
    val ripple: MDCRipple = js.native
    var value: String = js.native
  }
  
  @js.native
  class MDCCheckboxFoundation () extends default
  
  /* static members */
  @js.native
  object MDCCheckbox extends js.Object {
    def attachTo(root: Element): MDCCheckbox = js.native
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

