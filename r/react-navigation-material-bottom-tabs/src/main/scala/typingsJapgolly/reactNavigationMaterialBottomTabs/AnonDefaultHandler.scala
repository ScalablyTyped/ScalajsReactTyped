package typingsJapgolly.reactNavigationMaterialBottomTabs

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import typingsJapgolly.reactNavigationMaterialBottomTabs.typesMod.NavigationTabProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultHandler extends js.Object {
  var navigation: NavigationTabProp[NavigationRoute[NavigationParams], NavigationParams]
  def defaultHandler(): Unit
}

object AnonDefaultHandler {
  @scala.inline
  def apply(
    defaultHandler: Callback,
    navigation: NavigationTabProp[NavigationRoute[NavigationParams], NavigationParams]
  ): AnonDefaultHandler = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any])
    __obj.updateDynamic("defaultHandler")(defaultHandler.toJsFn)
    __obj.asInstanceOf[AnonDefaultHandler]
  }
}

