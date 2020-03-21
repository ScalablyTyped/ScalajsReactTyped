package typingsJapgolly.ionicCore

import org.scalajs.dom.raw.CustomEvent
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonItemElement
import typingsJapgolly.ionicCore.elementInterfaceMod.AnchorInterface
import typingsJapgolly.ionicCore.elementInterfaceMod.ButtonInterface
import typingsJapgolly.ionicCore.interfaceMod.RouterDirection
import typingsJapgolly.ionicCore.ionicCoreStrings.button
import typingsJapgolly.ionicCore.ionicCoreStrings.full
import typingsJapgolly.ionicCore.ionicCoreStrings.inset
import typingsJapgolly.ionicCore.ionicCoreStrings.none
import typingsJapgolly.ionicCore.ionicCoreStrings.reset
import typingsJapgolly.ionicCore.ionicCoreStrings.submit
import typingsJapgolly.ionicCore.mod.Color
import typingsJapgolly.ionicCore.stencilCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/item/item", JSImport.Namespace)
@js.native
object itemMod extends js.Object {
  @js.native
  class Item ()
    extends ComponentInterface
       with AnchorInterface
       with ButtonInterface {
    /**
      * If `true`, a button tag will be rendered and the item will be tappable.
      */
    var button: Boolean = js.native
    var canActivate: js.Any = js.native
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
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
    override var disabled: Boolean = js.native
    var el: HTMLIonItemElement = js.native
    var hasCover: js.Any = js.native
    var isClickable: js.Any = js.native
    var itemStyles: js.Any = js.native
    /**
      * How the bottom border should be displayed on the item.
      */
    var lines: js.UndefOr[full | inset | none] = js.native
    var multipleInputs: Boolean = js.native
    /**
      * When using a router, it specifies the transition direction when navigating to
      * another page using `href`.
      */
    var routerDirection: RouterDirection = js.native
    /* CompleteClass */
    override var `type`: submit | reset | button = js.native
    @JSName("componentDidLoad")
    def componentDidLoad_MItem(): Unit = js.native
    def itemStyle(ev: CustomEvent): Unit = js.native
    @JSName("render")
    def render_MItem(): js.Any = js.native
  }
  
}

