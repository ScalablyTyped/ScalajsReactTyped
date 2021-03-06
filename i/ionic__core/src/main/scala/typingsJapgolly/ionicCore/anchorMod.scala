package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.interfaceMod.RouterDirection
import typingsJapgolly.ionicCore.mod.Color
import typingsJapgolly.ionicCore.stencilCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/anchor/anchor", JSImport.Namespace)
@js.native
object anchorMod extends js.Object {
  @js.native
  class Anchor () extends ComponentInterface {
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    /**
      * Contains a URL or a URL fragment that the hyperlink points to.
      * If this property is set, an anchor tag will be rendered.
      */
    var href: js.UndefOr[String] = js.native
    var onClick: js.Any = js.native
    /**
      * Specifies the relationship of the target object to the link object.
      * The value is a space-separated list of [link types](https://developer.mozilla.org/en-US/docs/Web/HTML/Link_types).
      */
    var rel: js.UndefOr[String] = js.native
    /**
      * When using a router, it specifies the transition direction when navigating to
      * another page using `href`.
      */
    var routerDirection: RouterDirection = js.native
    @JSName("componentDidLoad")
    def componentDidLoad_MAnchor(): Unit = js.native
    @JSName("render")
    def render_MAnchor(): js.Any = js.native
  }
  
}

