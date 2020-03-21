package typingsJapgolly.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.ionicCore.elementInterfaceMod.AnchorInterface
import typingsJapgolly.ionicCore.elementInterfaceMod.ButtonInterface
import typingsJapgolly.ionicCore.interfaceMod.RouterDirection
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
import typingsJapgolly.ionicCore.stencilCoreMod.ComponentInterface
import typingsJapgolly.ionicCore.stencilCoreMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/button/button", JSImport.Namespace)
@js.native
object buttonMod extends js.Object {
  @js.native
  class Button ()
    extends ComponentInterface
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
    /* CompleteClass */
    override var disabled: Boolean = js.native
    var el: HTMLElement = js.native
    /**
      * Set to `"block"` for a full-width button or to `"full"` for a full-width button
      * without left and right borders.
      */
    var expand: js.UndefOr[full | block] = js.native
    /**
      * Set to `"clear"` for a transparent button, to `"outline"` for a transparent
      * button with a border, or to `"solid"`. The default style is `"solid"` except inside of
      * a toolbar, where the default is `"clear"`.
      */
    var fill: js.UndefOr[clear | outline | solid | default] = js.native
    var handleClick: js.Any = js.native
    val hasIconOnly: js.Any = js.native
    var inItem: js.Any = js.native
    var inToolbar: js.Any = js.native
    /**
      * Emitted when the button loses focus.
      */
    var ionBlur: EventEmitter[Unit] = js.native
    /**
      * Emitted when the button has focus.
      */
    var ionFocus: EventEmitter[Unit] = js.native
    var onBlur: js.Any = js.native
    var onFocus: js.Any = js.native
    val rippleType: js.Any = js.native
    /**
      * When using a router, it specifies the transition direction when navigating to
      * another page using `href`.
      */
    var routerDirection: RouterDirection = js.native
    /**
      * The button shape.
      */
    var shape: js.UndefOr[round] = js.native
    /**
      * The button size.
      */
    var size: js.UndefOr[small | default | large] = js.native
    /**
      * If `true`, activates a button with a heavier font weight.
      */
    var strong: Boolean = js.native
    /* CompleteClass */
    override var `type`: submit | reset | button = js.native
    @JSName("componentWillLoad")
    def componentWillLoad_MButton(): Unit = js.native
    @JSName("render")
    def render_MButton(): js.Any = js.native
  }
  
}

