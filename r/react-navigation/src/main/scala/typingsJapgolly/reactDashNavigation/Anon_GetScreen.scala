package typingsJapgolly.reactDashNavigation

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationScreenComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetScreen[Options, NavigationScreenPropType] extends js.Object {
  def getScreen(): NavigationScreenComponent[Options, NavigationScreenPropType]
}

object Anon_GetScreen {
  @scala.inline
  def apply[Options, NavigationScreenPropType](getScreen: CallbackTo[NavigationScreenComponent[Options, NavigationScreenPropType]]): Anon_GetScreen[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getScreen")(getScreen.toJsFn)
    __obj.asInstanceOf[Anon_GetScreen[Options, NavigationScreenPropType]]
  }
}

