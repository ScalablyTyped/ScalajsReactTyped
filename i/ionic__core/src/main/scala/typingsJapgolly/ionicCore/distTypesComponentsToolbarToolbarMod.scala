package typingsJapgolly.ionicCore

import org.scalajs.dom.CustomEvent
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonToolbarElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsToolbarToolbarMod {
  
  @JSImport("@ionic/core/dist/types/components/toolbar/toolbar", "Toolbar")
  @js.native
  open class Toolbar ()
    extends StObject
       with ComponentInterface {
    
    def childrenStyle(ev: CustomEvent): Unit = js.native
    
    /* private */ var childrenStyles: Any = js.native
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MToolbar(): Unit = js.native
    
    var el: HTMLIonToolbarElement = js.native
    
    @JSName("render")
    def render_MToolbar(): Any = js.native
  }
}
