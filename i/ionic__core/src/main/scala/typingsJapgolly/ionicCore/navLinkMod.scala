package typingsJapgolly.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.ionicCore.interfaceMod.RouterDirection
import typingsJapgolly.ionicCore.mod.ComponentProps
import typingsJapgolly.ionicCore.navInterfaceMod.NavComponent
import typingsJapgolly.ionicCore.stencilCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/nav-link/nav-link", JSImport.Namespace)
@js.native
object navLinkMod extends js.Object {
  @js.native
  class NavLink () extends ComponentInterface {
    /**
      * Component to navigate to. Only used if the `routerDirection` is `"forward"` or `"root"`.
      */
    var component: js.UndefOr[NavComponent] = js.native
    /**
      * Data you want to pass to the component as props. Only used if the `"routerDirection"` is `"forward"` or `"root"`.
      */
    var componentProps: js.UndefOr[ComponentProps[Null]] = js.native
    var el: HTMLElement = js.native
    var onClick: js.Any = js.native
    /**
      * The transition direction when navigating to another page.
      */
    var routerDirection: RouterDirection = js.native
    @JSName("render")
    def render_MNavLink(): js.Any = js.native
  }
  
}

