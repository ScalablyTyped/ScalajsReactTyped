package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsAppAppMod {
  
  @JSImport("@ionic/core/dist/types/components/app/app", "App")
  @js.native
  open class App ()
    extends StObject
       with ComponentInterface {
    
    @JSName("componentDidLoad")
    def componentDidLoad_MApp(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    /* private */ var focusVisible: Any = js.native
    
    @JSName("render")
    def render_MApp(): Any = js.native
    
    /**
      * @internal
      * Used to set focus on an element that uses `ion-focusable`.
      * Do not use this if focusing the element as a result of a keyboard
      * event as the focus utility should handle this for us. This method
      * should be used when we want to programmatically focus an element as
      * a result of another user action. (Ex: We focus the first element
      * inside of a popover when the user presents it, but the popover is not always
      * presented as a result of keyboard action.)
      */
    def setFocus(elements: js.Array[HTMLElement]): js.Promise[Unit] = js.native
  }
}
