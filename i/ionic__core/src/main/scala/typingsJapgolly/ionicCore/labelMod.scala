package typingsJapgolly.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.ionicCore.ionicCoreStrings.fixed
import typingsJapgolly.ionicCore.ionicCoreStrings.floating
import typingsJapgolly.ionicCore.ionicCoreStrings.stacked
import typingsJapgolly.ionicCore.mod.Color
import typingsJapgolly.ionicCore.mod.StyleEventDetail
import typingsJapgolly.ionicCore.stencilCoreMod.ComponentInterface
import typingsJapgolly.ionicCore.stencilCoreMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/label/label", JSImport.Namespace)
@js.native
object labelMod extends js.Object {
  @js.native
  class Label () extends ComponentInterface {
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    var el: HTMLElement = js.native
    var emitStyle: js.Any = js.native
    /**
      * Emitted when the styles change.
      * @internal
      */
    var ionStyle: EventEmitter[StyleEventDetail] = js.native
    var noAnimate: Boolean = js.native
    /**
      * The position determines where and how the label behaves inside an item.
      */
    var position: js.UndefOr[fixed | stacked | floating] = js.native
    @JSName("componentDidLoad")
    def componentDidLoad_MLabel(): Unit = js.native
    @JSName("componentWillLoad")
    def componentWillLoad_MLabel(): Unit = js.native
    def positionChanged(): Unit = js.native
    @JSName("render")
    def render_MLabel(): js.Any = js.native
  }
  
}

