package typingsJapgolly.wixUiCore

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.std.ChildNode
import typingsJapgolly.wixUiCore.distEsSrcComponentsInputInputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsInputInputDotprivateDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/input/Input.private.driver", "InputDriver")
  @js.native
  open class InputDriver protected () extends StObject {
    def this(root: HTMLElement, instance: Input) = this()
    
    def getAttribute(attr: String): String = js.native
    
    def input: HTMLInputElement = js.native
    
    var instance: Input = js.native
    
    def prefix: ChildNode = js.native
    
    var root: HTMLElement = js.native
    
    def suffix: ChildNode = js.native
  }
}
