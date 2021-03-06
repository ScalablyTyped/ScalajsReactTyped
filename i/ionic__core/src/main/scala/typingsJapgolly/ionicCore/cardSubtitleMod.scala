package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.mod.Color
import typingsJapgolly.ionicCore.stencilCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/card-subtitle/card-subtitle", JSImport.Namespace)
@js.native
object cardSubtitleMod extends js.Object {
  @js.native
  class CardSubtitle () extends ComponentInterface {
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    @JSName("render")
    def render_MCardSubtitle(): js.Any = js.native
  }
  
}

