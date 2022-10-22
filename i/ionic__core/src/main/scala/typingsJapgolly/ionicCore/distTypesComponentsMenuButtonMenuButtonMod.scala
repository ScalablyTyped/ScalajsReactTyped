package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonSegmentElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesUtilsElementInterfaceMod.ButtonInterface
import typingsJapgolly.ionicCore.ionicCoreStrings.button
import typingsJapgolly.ionicCore.ionicCoreStrings.reset
import typingsJapgolly.ionicCore.ionicCoreStrings.submit
import typingsJapgolly.ionicCore.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsMenuButtonMenuButtonMod {
  
  @JSImport("@ionic/core/dist/types/components/menu-button/menu-button", "MenuButton")
  @js.native
  open class MenuButton ()
    extends StObject
       with ComponentInterface
       with ButtonInterface {
    
    /**
      * Automatically hides the menu button when the corresponding menu is not active
      */
    var autoHide: Boolean = js.native
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MMenuButton(): Unit = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MMenuButton(): Unit = js.native
    
    /* CompleteClass */
    var disabled: Boolean = js.native
    
    var el: HTMLIonSegmentElement = js.native
    
    /* private */ var inheritedAttributes: Any = js.native
    
    /**
      * Optional property that maps to a Menu's `menuId` prop. Can also be `start` or `end` for the menu side. This is used to find the correct menu to toggle
      */
    var menu: js.UndefOr[String] = js.native
    
    /* private */ var onClick: Any = js.native
    
    @JSName("render")
    def render_MMenuButton(): Any = js.native
    
    /* CompleteClass */
    var `type`: submit | reset | button = js.native
    
    def visibilityChanged(): js.Promise[Unit] = js.native
    
    var visible: Boolean = js.native
  }
}
