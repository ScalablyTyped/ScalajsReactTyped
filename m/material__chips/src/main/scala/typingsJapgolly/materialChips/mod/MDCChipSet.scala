package typingsJapgolly.materialChips.mod

import typingsJapgolly.materialBase.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/chips", "MDCChipSet")
@js.native
open class MDCChipSet protected ()
  extends typingsJapgolly.materialChips.chipSetMod.MDCChipSet {
  def this(root: Element, foundation: Unit, args: Any*) = this()
  def this(
    root: Element,
    foundation: typingsJapgolly.materialChips.chipSetFoundationMod.MDCChipSetFoundation,
    args: Any*
  ) = this()
}
/* static members */
object MDCChipSet {
  
  @JSImport("@material/chips", "MDCChipSet")
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachTo(root: org.scalajs.dom.Element): typingsJapgolly.materialChips.chipSetComponentMod.MDCChipSet = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialChips.chipSetComponentMod.MDCChipSet]
}
