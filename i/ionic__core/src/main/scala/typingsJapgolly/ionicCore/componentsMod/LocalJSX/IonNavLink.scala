package typingsJapgolly.ionicCore.componentsMod.LocalJSX

import typingsJapgolly.ionicCore.interfaceMod.RouterDirection
import typingsJapgolly.ionicCore.mod.ComponentProps
import typingsJapgolly.ionicCore.navInterfaceMod.NavComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonNavLink extends js.Object {
  /**
    * Component to navigate to. Only used if the `routerDirection` is `"forward"` or `"root"`.
    */
  var component: js.UndefOr[NavComponent] = js.undefined
  /**
    * Data you want to pass to the component as props. Only used if the `"routerDirection"` is `"forward"` or `"root"`.
    */
  var componentProps: js.UndefOr[ComponentProps[Null]] = js.undefined
  /**
    * The transition direction when navigating to another page.
    */
  var routerDirection: js.UndefOr[RouterDirection] = js.undefined
}

object IonNavLink {
  @scala.inline
  def apply(
    component: NavComponent = null,
    componentProps: ComponentProps[Null] = null,
    routerDirection: RouterDirection = null
  ): IonNavLink = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (componentProps != null) __obj.updateDynamic("componentProps")(componentProps.asInstanceOf[js.Any])
    if (routerDirection != null) __obj.updateDynamic("routerDirection")(routerDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonNavLink]
  }
}

