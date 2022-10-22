package typingsJapgolly.materialChips

import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typingsJapgolly.materialBase.foundationMod.MDCFoundation
import typingsJapgolly.materialChips.anon.PartialMDCChipTrailingAct
import typingsJapgolly.materialChips.deprecatedTrailingactionAdapterMod.MDCChipTrailingActionAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecatedTrailingactionFoundationMod {
  
  @JSImport("@material/chips/deprecated/trailingaction/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCChipTrailingActionFoundation {
    def this(adapter: PartialMDCChipTrailingAct) = this()
  }
  
  @JSImport("@material/chips/deprecated/trailingaction/foundation", "MDCChipTrailingActionFoundation")
  @js.native
  open class MDCChipTrailingActionFoundation () extends MDCFoundation[MDCChipTrailingActionAdapter] {
    def this(adapter: PartialMDCChipTrailingAct) = this()
    
    def focus(): Unit = js.native
    
    /* private */ var getTriggerFromKey: Any = js.native
    
    def handleClick(evt: MouseEvent): Unit = js.native
    
    def handleKeydown(evt: KeyboardEvent): Unit = js.native
    
    def isNavigable(): Boolean = js.native
    
    def removeFocus(): Unit = js.native
    
    /* private */ var shouldNotifyInteractionFromKey: Any = js.native
  }
}
