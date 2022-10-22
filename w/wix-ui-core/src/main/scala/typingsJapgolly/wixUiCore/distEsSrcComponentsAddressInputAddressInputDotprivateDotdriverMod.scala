package typingsJapgolly.wixUiCore

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsAddressInputAddressInputDotprivateDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/address-input/AddressInput.private.driver", "AddressInputPrivateDriver")
  @js.native
  open class AddressInputPrivateDriver protected () extends StObject {
    def this(root: HTMLElement) = this()
    
    var root: HTMLElement = js.native
    
    def selectOption(index: Any): Unit = js.native
    
    def `type`(value: Any): Unit = js.native
    
    def value: String = js.native
    
    def waitForContentElement(): Any = js.native
    
    def waitForValue(value: Any): Any = js.native
  }
}
