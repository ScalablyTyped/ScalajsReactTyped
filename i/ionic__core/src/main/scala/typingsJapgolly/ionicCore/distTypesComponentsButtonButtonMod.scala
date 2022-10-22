package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLFormElement
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import typingsJapgolly.ionicCore.distTypesUtilsElementInterfaceMod.AnchorInterface
import typingsJapgolly.ionicCore.distTypesUtilsElementInterfaceMod.ButtonInterface
import typingsJapgolly.ionicCore.ionicCoreStrings.block
import typingsJapgolly.ionicCore.ionicCoreStrings.button
import typingsJapgolly.ionicCore.ionicCoreStrings.clear
import typingsJapgolly.ionicCore.ionicCoreStrings.default
import typingsJapgolly.ionicCore.ionicCoreStrings.full
import typingsJapgolly.ionicCore.ionicCoreStrings.large
import typingsJapgolly.ionicCore.ionicCoreStrings.outline
import typingsJapgolly.ionicCore.ionicCoreStrings.reset
import typingsJapgolly.ionicCore.ionicCoreStrings.round
import typingsJapgolly.ionicCore.ionicCoreStrings.small
import typingsJapgolly.ionicCore.ionicCoreStrings.solid
import typingsJapgolly.ionicCore.ionicCoreStrings.submit
import typingsJapgolly.ionicCore.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsButtonButtonMod {
  
  @JSImport("@ionic/core/dist/types/components/button/button", "Button")
  @js.native
  open class Button ()
    extends StObject
       with ComponentInterface
       with AnchorInterface
       with ButtonInterface {
    
    /**
      * The type of button.
      */
    var buttonType: String = js.native
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MButton(): Unit = js.native
    
    /* CompleteClass */
    var disabled: Boolean = js.native
    
    var el: HTMLElement = js.native
    
    /**
      * Set to `"block"` for a full-width button or to `"full"` for a full-width button
      * with square corners and no left or right borders.
      */
    var expand: js.UndefOr[full | block] = js.native
    
    /**
      * Set to `"clear"` for a transparent button that resembles a flat button, to `"outline"`
      * for a transparent button with a border, or to `"solid"` for a button with a filled background.
      * The default fill is `"solid"` except inside of a toolbar, where the default is `"clear"`.
      */
    var fill: js.UndefOr[clear | outline | solid | default] = js.native
    
    /**
      * Finds the form element based on the provided `form` selector
      * or element reference provided.
      */
    /* private */ var findForm: Any = js.native
    
    /**
      * The HTML form element or form element id. Used to submit a form when the button is not a child of the form.
      */
    var form: js.UndefOr[String | HTMLFormElement] = js.native
    
    /* private */ var handleClick: Any = js.native
    
    /* private */ def hasIconOnly: Any = js.native
    
    /* private */ var inItem: Any = js.native
    
    /* private */ var inListHeader: Any = js.native
    
    /* private */ var inToolbar: Any = js.native
    
    /* private */ var inheritedAttributes: Any = js.native
    
    /**
      * Emitted when the button loses focus.
      */
    var ionBlur: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the button has focus.
      */
    var ionFocus: EventEmitter[Unit] = js.native
    
    /* private */ var onBlur: Any = js.native
    
    /* private */ var onFocus: Any = js.native
    
    @JSName("render")
    def render_MButton(): Any = js.native
    
    /* private */ def rippleType: Any = js.native
    
    /**
      * When using a router, it specifies the transition animation when navigating to
      * another page using `href`.
      */
    var routerAnimation: js.UndefOr[AnimationBuilder] = js.native
    
    /**
      * When using a router, it specifies the transition direction when navigating to
      * another page using `href`.
      */
    var routerDirection: RouterDirection = js.native
    
    /**
      * Set to `"round"` for a button with more rounded corners.
      */
    var shape: js.UndefOr[round] = js.native
    
    /**
      * Set to `"small"` for a button with less height and padding, to `"default"`
      * for a button with the default height and padding, or to `"large"` for a button
      * with more height and padding. By default the size is unset, unless the button
      * is inside of an item, where the size is `"small"` by default. Set the size to
      * `"default"` inside of an item to make it a standard size button.
      */
    var size: js.UndefOr[small | default | large] = js.native
    
    /**
      * If `true`, activates a button with a heavier font weight.
      */
    var strong: Boolean = js.native
    
    /* CompleteClass */
    var `type`: submit | reset | button = js.native
  }
}
