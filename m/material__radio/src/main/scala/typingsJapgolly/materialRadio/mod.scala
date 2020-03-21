package typingsJapgolly.materialRadio

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialRadio.adapterMod.MDCRadioAdapter
import typingsJapgolly.materialRadio.foundationMod.default
import typingsJapgolly.materialRipple.mod.MDCRipple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/radio", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.materialSelectionControl.mod.MDCSelectionControl because Inheritance from two classes. Inlined ripple */ @js.native
  class MDCRadio ()
    extends typingsJapgolly.materialBase.componentMod.default[MDCRadioAdapter, default] {
    var checked: Boolean = js.native
    var disabled: Boolean = js.native
    val ripple: MDCRipple = js.native
    var value: String = js.native
  }
  
  @js.native
  class MDCRadioFoundation () extends default
  
  /* static members */
  @js.native
  object MDCRadio extends js.Object {
    def attachTo(root: Element): MDCRadio = js.native
  }
  
  /* static members */
  @js.native
  object MDCRadioFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialRadio.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCRadioAdapter = js.native
    val strings: typingsJapgolly.materialRadio.constantsMod.strings = js.native
  }
  
}

