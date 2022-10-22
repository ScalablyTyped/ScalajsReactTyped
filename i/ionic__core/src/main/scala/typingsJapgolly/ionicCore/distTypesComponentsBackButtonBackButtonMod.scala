package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import typingsJapgolly.ionicCore.distTypesUtilsElementInterfaceMod.ButtonInterface
import typingsJapgolly.ionicCore.ionicCoreStrings.bounded
import typingsJapgolly.ionicCore.ionicCoreStrings.button
import typingsJapgolly.ionicCore.ionicCoreStrings.reset
import typingsJapgolly.ionicCore.ionicCoreStrings.submit
import typingsJapgolly.ionicCore.ionicCoreStrings.unbounded
import typingsJapgolly.ionicCore.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsBackButtonBackButtonMod {
  
  @JSImport("@ionic/core/dist/types/components/back-button/back-button", "BackButton")
  @js.native
  open class BackButton ()
    extends StObject
       with ComponentInterface
       with ButtonInterface {
    
    def backButtonIcon: Any = js.native
    
    def backButtonText: Any = js.native
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MBackButton(): Unit = js.native
    
    /**
      * The url to navigate back to by default when there is no history.
      */
    var defaultHref: js.UndefOr[String] = js.native
    
    /* CompleteClass */
    var disabled: Boolean = js.native
    
    var el: HTMLElement = js.native
    
    def hasIconOnly: Any = js.native
    
    /**
      * The built-in named SVG icon name or the exact `src` of an SVG file
      * to use for the back button.
      */
    var icon: js.UndefOr[String | Null] = js.native
    
    /* private */ var inheritedAttributes: Any = js.native
    
    /* private */ var onClick: Any = js.native
    
    @JSName("render")
    def render_MBackButton(): Any = js.native
    
    def rippleType: bounded | unbounded = js.native
    
    /**
      * When using a router, it specifies the transition animation when navigating to
      * another page.
      */
    var routerAnimation: js.UndefOr[AnimationBuilder] = js.native
    
    /**
      * The text to display in the back button.
      */
    var text: js.UndefOr[String | Null] = js.native
    
    /* CompleteClass */
    var `type`: submit | reset | button = js.native
  }
}
