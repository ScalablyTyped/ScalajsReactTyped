package typingsJapgolly.materialChips

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialChips.chipAdapterMod.MDCChipAdapter
import typingsJapgolly.materialChips.chipFoundationMod.default
import typingsJapgolly.materialRipple.mod.MDCRipple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/chips/chip", JSImport.Namespace)
@js.native
object chipMod extends js.Object {
  @js.native
  class MDCChip ()
    extends typingsJapgolly.materialBase.componentMod.default[MDCChipAdapter, default] {
    val foundation: default = js.native
    val ripple: MDCRipple = js.native
    /**
      * Returns true if the chip is selected.
      */
    def isSelected(): Boolean = js.native
    /**
      * Destroys the chip and removes the root element from the DOM.
      */
    def remove(): Unit = js.native
  }
  
  @js.native
  class MDCChipFoundation () extends default
  
  /* static members */
  @js.native
  object MDCChip extends js.Object {
    def attachTo(root: Element): MDCChip = js.native
  }
  
  /* static members */
  @js.native
  object MDCChipFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialChips.chipConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCChipAdapter = js.native
    val strings: typingsJapgolly.materialChips.chipConstantsMod.strings = js.native
  }
  
}

