package typingsJapgolly.reactDashNavigationDashStack

import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationScreenConfig
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackOptions
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NavigationOptions[Params, ScreenProps] extends js.Object {
  var navigationOptions: js.UndefOr[
    NavigationScreenConfig[
      NavigationStackOptions, 
      NavigationStackProp[NavigationRoute[NavigationParams], Params], 
      ScreenProps
    ]
  ] = js.undefined
}

object Anon_NavigationOptions {
  @scala.inline
  def apply[Params, ScreenProps](
    navigationOptions: NavigationScreenConfig[
      NavigationStackOptions, 
      NavigationStackProp[NavigationRoute[NavigationParams], Params], 
      ScreenProps
    ] = null
  ): Anon_NavigationOptions[Params, ScreenProps] = {
    val __obj = js.Dynamic.literal()
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NavigationOptions[Params, ScreenProps]]
  }
}

