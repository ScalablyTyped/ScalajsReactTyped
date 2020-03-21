package typingsJapgolly.reactNavigation

import typingsJapgolly.reactNavigation.mod.NavigationRouter
import typingsJapgolly.reactNavigation.mod.NavigationScreenConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRouter[Options, NavigationPropType] extends js.Object {
  var navigationOptions: js.UndefOr[NavigationScreenConfig[Options, NavigationPropType, _]] = js.undefined
  var router: NavigationRouter[Options, js.Object]
}

object AnonRouter {
  @scala.inline
  def apply[Options, NavigationPropType](
    router: NavigationRouter[Options, js.Object],
    navigationOptions: NavigationScreenConfig[Options, NavigationPropType, _] = null
  ): AnonRouter[Options, NavigationPropType] = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRouter[Options, NavigationPropType]]
  }
}

