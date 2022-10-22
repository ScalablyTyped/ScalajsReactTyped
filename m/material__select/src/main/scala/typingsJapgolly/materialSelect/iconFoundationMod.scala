package typingsJapgolly.materialSelect

import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typingsJapgolly.materialBase.foundationMod.MDCFoundation
import typingsJapgolly.materialSelect.anon.PartialMDCSelectIconAdapt
import typingsJapgolly.materialSelect.iconAdapterMod.MDCSelectIconAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconFoundationMod {
  
  @JSImport("@material/select/icon/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCSelectIconFoundation {
    def this(adapter: PartialMDCSelectIconAdapt) = this()
  }
  
  @JSImport("@material/select/icon/foundation", "MDCSelectIconFoundation")
  @js.native
  open class MDCSelectIconFoundation () extends MDCFoundation[MDCSelectIconAdapter] {
    def this(adapter: PartialMDCSelectIconAdapt) = this()
    
    def handleInteraction(evt: KeyboardEvent): Unit = js.native
    def handleInteraction(evt: MouseEvent): Unit = js.native
    
    /* private */ val interactionHandler: Any = js.native
    
    /* private */ var savedTabIndex: Any = js.native
    
    def setAriaLabel(label: String): Unit = js.native
    
    def setContent(content: String): Unit = js.native
    
    def setDisabled(disabled: Boolean): Unit = js.native
  }
}
