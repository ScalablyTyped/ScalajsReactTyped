package typingsJapgolly.materialChips

import typingsJapgolly.materialChips.chipAdapterMod.MDCChipAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/chips/chip/foundation", JSImport.Namespace)
@js.native
object chipFoundationMod extends js.Object {
  @js.native
  trait MDCChipFoundation
    extends typingsJapgolly.materialBase.foundationMod.default[MDCChipAdapter] {
    def isSelected(): Boolean = js.native
    def setSelected(selected: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCChipFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typingsJapgolly.materialChips.chipConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCChipAdapter = js.native
    val strings: typingsJapgolly.materialChips.chipConstantsMod.strings = js.native
  }
  
}

