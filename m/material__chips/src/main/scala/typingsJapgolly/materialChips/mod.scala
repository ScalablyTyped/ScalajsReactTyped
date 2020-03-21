package typingsJapgolly.materialChips

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialChips.adapterMod.MDCChipSetAdapter
import typingsJapgolly.materialChips.chipAdapterMod.MDCChipAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/chips", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCChip ()
    extends typingsJapgolly.materialChips.chipMod.MDCChip
  
  @js.native
  class MDCChipFoundation ()
    extends typingsJapgolly.materialChips.chipMod.MDCChipFoundation
  
  @js.native
  class MDCChipSet ()
    extends typingsJapgolly.materialChips.chipSetMod.MDCChipSet
  
  @js.native
  class MDCChipSetFoundation ()
    extends typingsJapgolly.materialChips.chipSetMod.MDCChipSetFoundation
  
  /* static members */
  @js.native
  object MDCChip extends js.Object {
    def attachTo(root: Element): typingsJapgolly.materialChips.chipMod.MDCChip = js.native
  }
  
  /* static members */
  @js.native
  object MDCChipFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialChips.chipConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCChipAdapter = js.native
    val strings: typingsJapgolly.materialChips.chipConstantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCChipSet extends js.Object {
    def attachTo(root: js.Any): typingsJapgolly.materialChips.chipSetMod.MDCChipSet = js.native
  }
  
  /* static members */
  @js.native
  object MDCChipSetFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialChips.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCChipSetAdapter = js.native
    val strings: typingsJapgolly.materialChips.constantsMod.strings = js.native
  }
  
}

