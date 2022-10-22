package typingsJapgolly.ionicCore

import org.scalajs.dom.CustomEvent
import typingsJapgolly.ionicCore.distTypesComponentsItemItemInterfaceMod.CounterFormatter
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonItemElement
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import typingsJapgolly.ionicCore.distTypesUtilsElementInterfaceMod.AnchorInterface
import typingsJapgolly.ionicCore.distTypesUtilsElementInterfaceMod.ButtonInterface
import typingsJapgolly.ionicCore.ionicCoreStrings.button
import typingsJapgolly.ionicCore.ionicCoreStrings.full
import typingsJapgolly.ionicCore.ionicCoreStrings.inset
import typingsJapgolly.ionicCore.ionicCoreStrings.none
import typingsJapgolly.ionicCore.ionicCoreStrings.outline
import typingsJapgolly.ionicCore.ionicCoreStrings.reset
import typingsJapgolly.ionicCore.ionicCoreStrings.round
import typingsJapgolly.ionicCore.ionicCoreStrings.solid
import typingsJapgolly.ionicCore.ionicCoreStrings.submit
import typingsJapgolly.ionicCore.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsItemItemMod {
  
  @JSImport("@ionic/core/dist/types/components/item/item", "Item")
  @js.native
  open class Item ()
    extends StObject
       with ComponentInterface
       with AnchorInterface
       with ButtonInterface {
    
    /**
      * If `true`, a button tag will be rendered and the item will be tappable.
      */
    var button: Boolean = js.native
    
    /* private */ var canActivate: Any = js.native
    
    /* private */ var clickListener: Any = js.native
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MItem(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MItem(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MItem(): Unit = js.native
    
    /**
      * If `true`, a character counter will display the ratio of characters used and the total character limit. Only applies when the `maxlength` property is set on the inner `ion-input` or `ion-textarea`.
      */
    var counter: Boolean = js.native
    
    /**
      * A callback used to format the counter text.
      * By default the counter text is set to "itemLength / maxLength".
      */
    var counterFormatter: js.UndefOr[CounterFormatter] = js.native
    
    def counterFormatterChanged(): Unit = js.native
    
    var counterString: js.UndefOr[String | Null] = js.native
    
    /* private */ var defaultCounterFormatter: Any = js.native
    
    /* private */ var delegateFocus: Any = js.native
    
    /**
      * If `true`, a detail arrow will appear on the item. Defaults to `false` unless the `mode`
      * is `ios` and an `href` or `button` property is present.
      */
    var detail: js.UndefOr[Boolean] = js.native
    
    /**
      * The icon to use when `detail` is set to `true`.
      */
    var detailIcon: String = js.native
    
    /* CompleteClass */
    var disabled: Boolean = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MItem(): Unit = js.native
    
    var el: HTMLIonItemElement = js.native
    
    /**
      * The fill for the item. If `'solid'` the item will have a background. If
      * `'outline'` the item will be transparent with a border. Only available in `md` mode.
      */
    var fill: js.UndefOr[outline | solid] = js.native
    
    var focusable: Boolean = js.native
    
    /* private */ var getFirstInput: Any = js.native
    
    def handleIonChange(ev: CustomEvent): Unit = js.native
    
    /* private */ var hasCover: Any = js.native
    
    /* private */ var hasStartEl: Any = js.native
    
    /* private */ var inheritedAriaAttributes: Any = js.native
    
    /* private */ var isClickable: Any = js.native
    
    /* private */ var isFocusable: Any = js.native
    
    def itemStyle(ev: CustomEvent): Unit = js.native
    
    /* private */ var itemStyles: Any = js.native
    
    def labelColorChanged(ev: CustomEvent): Unit = js.native
    
    /* private */ var labelColorStyles: Any = js.native
    
    /**
      * How the bottom border should be displayed on the item.
      */
    var lines: js.UndefOr[full | inset | none] = js.native
    
    var multipleInputs: Boolean = js.native
    
    @JSName("render")
    def render_MItem(): Any = js.native
    
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
    
    /* private */ var setMultipleInputs: Any = js.native
    
    /**
      * The shape of the item. If "round" it will have increased
      * border radius.
      */
    var shape: js.UndefOr[round] = js.native
    
    /* CompleteClass */
    var `type`: submit | reset | button = js.native
    
    /* private */ var updateCounterOutput: Any = js.native
  }
}
