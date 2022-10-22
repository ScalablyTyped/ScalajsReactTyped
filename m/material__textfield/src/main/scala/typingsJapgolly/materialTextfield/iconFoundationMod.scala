package typingsJapgolly.materialTextfield

import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typingsJapgolly.materialBase.foundationMod.MDCFoundation
import typingsJapgolly.materialTextfield.anon.PartialMDCTextFieldIconAd
import typingsJapgolly.materialTextfield.iconAdapterMod.MDCTextFieldIconAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconFoundationMod {
  
  @JSImport("@material/textfield/icon/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCTextFieldIconFoundation {
    def this(adapter: PartialMDCTextFieldIconAd) = this()
  }
  
  @JSImport("@material/textfield/icon/foundation", "MDCTextFieldIconFoundation")
  @js.native
  open class MDCTextFieldIconFoundation () extends MDCFoundation[MDCTextFieldIconAdapter] {
    def this(adapter: PartialMDCTextFieldIconAd) = this()
    
    def handleInteraction(evt: KeyboardEvent): Unit = js.native
    def handleInteraction(evt: MouseEvent): Unit = js.native
    
    /* private */ val interactionHandler: Any = js.native
    
    /* private */ var savedTabIndex: Any = js.native
    
    def setAriaLabel(label: String): Unit = js.native
    
    def setContent(content: String): Unit = js.native
    
    def setDisabled(disabled: Boolean): Unit = js.native
  }
}
