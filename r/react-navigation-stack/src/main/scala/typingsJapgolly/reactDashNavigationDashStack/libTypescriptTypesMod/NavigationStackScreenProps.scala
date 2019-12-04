package typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod

import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.SupportedThemes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationStackScreenProps[Params, ScreenProps] extends js.Object {
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], Params]
  var screenProps: ScreenProps
  var theme: SupportedThemes
}

object NavigationStackScreenProps {
  @scala.inline
  def apply[Params, ScreenProps](
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], Params],
    screenProps: ScreenProps,
    theme: SupportedThemes
  ): NavigationStackScreenProps[Params, ScreenProps] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NavigationStackScreenProps[Params, ScreenProps]]
  }
}

