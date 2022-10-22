package typingsJapgolly.materialChips.mod

import typingsJapgolly.materialBase.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/chips", "MDCChipAction")
@js.native
open class MDCChipAction protected ()
  extends typingsJapgolly.materialChips.actionMod.MDCChipAction {
  def this(root: Element, foundation: Unit, args: Any*) = this()
  def this(
    root: Element,
    foundation: typingsJapgolly.materialChips.actionFoundationMod.MDCChipActionFoundation,
    args: Any*
  ) = this()
}
/* static members */
object MDCChipAction {
  
  @JSImport("@material/chips", "MDCChipAction")
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachTo(root: org.scalajs.dom.Element): typingsJapgolly.materialChips.actionComponentMod.MDCChipAction = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialChips.actionComponentMod.MDCChipAction]
}
