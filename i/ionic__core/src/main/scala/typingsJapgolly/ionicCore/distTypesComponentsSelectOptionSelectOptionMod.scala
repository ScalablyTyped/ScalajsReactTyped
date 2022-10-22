package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsSelectOptionSelectOptionMod {
  
  @JSImport("@ionic/core/dist/types/components/select-option/select-option", "SelectOption")
  @js.native
  open class SelectOption ()
    extends StObject
       with ComponentInterface {
    
    /**
      * If `true`, the user cannot interact with the select option. This property does not apply when `interface="action-sheet"` as `ion-action-sheet` does not allow for disabled buttons.
      */
    var disabled: Boolean = js.native
    
    var el: HTMLElement = js.native
    
    /* private */ var inputId: Any = js.native
    
    @JSName("render")
    def render_MSelectOption(): Any = js.native
    
    /**
      * The text value of the option.
      */
    var value: js.UndefOr[Any | Null] = js.native
  }
}
