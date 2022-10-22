package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import typingsJapgolly.ionicCore.ionicCoreStrings.large
import typingsJapgolly.ionicCore.ionicCoreStrings.small
import typingsJapgolly.ionicCore.mod.Color
import typingsJapgolly.ionicCore.mod.StyleEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsTitleTitleMod {
  
  @JSImport("@ionic/core/dist/types/components/title/title", "ToolbarTitle")
  @js.native
  open class ToolbarTitle ()
    extends StObject
       with ComponentInterface {
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MToolbarTitle(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    /* private */ var emitStyle: Any = js.native
    
    /* private */ var getSize: Any = js.native
    
    /**
      * Emitted when the styles change.
      * @internal
      */
    var ionStyle: EventEmitter[StyleEventDetail] = js.native
    
    @JSName("render")
    def render_MToolbarTitle(): Any = js.native
    
    /**
      * The size of the toolbar title.
      */
    var size: js.UndefOr[large | small] = js.native
    
    /* protected */ def sizeChanged(): Unit = js.native
  }
}
