package typingsJapgolly.reactNavigation

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNavigation.mod.NavigationScreenComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetScreen[Options, NavigationScreenPropType] extends js.Object {
  def getScreen(): NavigationScreenComponent[Options, NavigationScreenPropType]
}

object AnonGetScreen {
  @scala.inline
  def apply[Options, NavigationScreenPropType](getScreen: CallbackTo[NavigationScreenComponent[Options, NavigationScreenPropType]]): AnonGetScreen[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getScreen")(getScreen.toJsFn)
    __obj.asInstanceOf[AnonGetScreen[Options, NavigationScreenPropType]]
  }
}

