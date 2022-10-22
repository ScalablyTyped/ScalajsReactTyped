package typingsJapgolly.materialChips.mod

import typingsJapgolly.materialBase.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/chips", "MDCChip")
@js.native
open class MDCChip protected ()
  extends typingsJapgolly.materialChips.chipMod.MDCChip {
  def this(root: Element, foundation: Unit, args: Any*) = this()
  def this(
    root: Element,
    foundation: typingsJapgolly.materialChips.chipFoundationMod.MDCChipFoundation,
    args: Any*
  ) = this()
}
/* static members */
object MDCChip {
  
  @JSImport("@material/chips", "MDCChip")
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachTo(root: org.scalajs.dom.Element): typingsJapgolly.materialChips.chipComponentMod.MDCChip = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialChips.chipComponentMod.MDCChip]
}
