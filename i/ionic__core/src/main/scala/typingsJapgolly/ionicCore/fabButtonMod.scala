package typingsJapgolly.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.ionicCore.elementInterfaceMod.AnchorInterface
import typingsJapgolly.ionicCore.elementInterfaceMod.ButtonInterface
import typingsJapgolly.ionicCore.interfaceMod.RouterDirection
import typingsJapgolly.ionicCore.ionicCoreStrings.button
import typingsJapgolly.ionicCore.ionicCoreStrings.reset
import typingsJapgolly.ionicCore.ionicCoreStrings.small
import typingsJapgolly.ionicCore.ionicCoreStrings.submit
import typingsJapgolly.ionicCore.mod.Color
import typingsJapgolly.ionicCore.stencilCoreMod.ComponentInterface
import typingsJapgolly.ionicCore.stencilCoreMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/fab-button/fab-button", JSImport.Namespace)
@js.native
object fabButtonMod extends js.Object {
  @js.native
  class FabButton ()
    extends ComponentInterface
       with AnchorInterface
       with ButtonInterface {
    /**
      * If `true`, the fab button will be show a close icon.
      */
    var activated: Boolean = js.native
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
      * Emitted when the button loses focus.
      */
    var ionBlur: EventEmitter[Unit] = js.native
    /**
      * Emitted when the button has focus.
      */
    var ionFocus: EventEmitter[Unit] = js.native
    var onBlur: js.Any = js.native
    var onFocus: js.Any = js.native
    /**
      * When using a router, it specifies the transition direction when navigating to
      * another page using `href`.
      */
    var routerDirection: RouterDirection = js.native
    /**
      * If `true`, the fab button will show when in a fab-list.
      */
    var show: Boolean = js.native
    /**
      * The size of the button. Set this to `small` in order to have a mini fab.
      */
    var size: js.UndefOr[small] = js.native
    /**
      * If `true`, the fab button will be translucent.
      * Only applies when the mode is `"ios"` and the device supports
      * [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
      */
    var translucent: Boolean = js.native
    /* CompleteClass */
    override var `type`: submit | reset | button = js.native
    @JSName("render")
    def render_MFabButton(): js.Any = js.native
  }
  
}

