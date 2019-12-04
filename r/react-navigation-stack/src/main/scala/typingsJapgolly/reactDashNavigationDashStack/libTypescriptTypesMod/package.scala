package typingsJapgolly.reactDashNavigationDashStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypescriptTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsJapgolly.react.reactMod.ComponentType
  import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationDescriptor
  import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationParams
  import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationRoute
  import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationState
  import typingsJapgolly.reactDashNavigationDashStack.Anon_NavigationOptions

  type NavigationStackScreenComponent[Params, ScreenProps] = (ComponentType[NavigationStackScreenProps[Params, ScreenProps]]) with (Anon_NavigationOptions[Params, ScreenProps])
  type NavigationStackState = NavigationState
  type SceneDescriptorMap = StringDictionary[
    NavigationDescriptor[
      NavigationParams, 
      NavigationStackOptions, 
      NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]
    ]
  ]
  type SceneInterpolator = js.Function1[/* props */ SceneInterpolatorProps, js.Any]
}
