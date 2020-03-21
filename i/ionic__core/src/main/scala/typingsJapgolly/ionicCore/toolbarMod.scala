package typingsJapgolly.ionicCore

import org.scalajs.dom.raw.CustomEvent
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonToolbarElement
import typingsJapgolly.ionicCore.mod.Color
import typingsJapgolly.ionicCore.stencilCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/toolbar/toolbar", JSImport.Namespace)
@js.native
object toolbarMod extends js.Object {
  @js.native
  class Toolbar () extends ComponentInterface {
    var childrenStyles: js.Any = js.native
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    var el: HTMLIonToolbarElement = js.native
    def childrenStyle(ev: CustomEvent): Unit = js.native
    @JSName("componentWillLoad")
    def componentWillLoad_MToolbar(): Unit = js.native
    @JSName("render")
    def render_MToolbar(): js.Any = js.native
  }
  
}

