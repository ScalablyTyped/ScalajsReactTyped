package typingsJapgolly.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.ionicCore.ionicCoreStrings.large
import typingsJapgolly.ionicCore.ionicCoreStrings.small
import typingsJapgolly.ionicCore.mod.Color
import typingsJapgolly.ionicCore.mod.StyleEventDetail
import typingsJapgolly.ionicCore.stencilCoreMod.ComponentInterface
import typingsJapgolly.ionicCore.stencilCoreMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/title/title", JSImport.Namespace)
@js.native
object titleMod extends js.Object {
  @js.native
  class ToolbarTitle () extends ComponentInterface {
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    var el: HTMLElement = js.native
    var emitStyle: js.Any = js.native
    var getMode: js.Any = js.native
    var getSize: js.Any = js.native
    /**
      * Emitted when the styles change.
      * @internal
      */
    var ionStyle: EventEmitter[StyleEventDetail] = js.native
    /**
      * The size of the toolbar title.
      */
    var size: js.UndefOr[large | small] = js.native
    @JSName("connectedCallback")
    def connectedCallback_MToolbarTitle(): Unit = js.native
    @JSName("render")
    def render_MToolbarTitle(): js.Any = js.native
    /* protected */ def sizeChanged(): Unit = js.native
  }
  
}

