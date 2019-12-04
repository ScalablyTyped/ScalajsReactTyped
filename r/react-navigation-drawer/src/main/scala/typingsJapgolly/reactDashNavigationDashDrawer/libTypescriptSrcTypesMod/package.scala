package typingsJapgolly.reactDashNavigationDashDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypescriptSrcTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsJapgolly.react.reactMod.ComponentType
  import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationDescriptor
  import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationParams
  import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationRoute
  import typingsJapgolly.reactDashNavigationDashDrawer.Anon_Dark
  import typingsJapgolly.reactDashNavigationDashDrawer.Anon_NavigationOptions

  type NavigationDrawerScreenComponent[Params, ScreenProps] = (ComponentType[NavigationDrawerScreenProps[Params, ScreenProps]]) with (Anon_NavigationOptions[Params, ScreenProps])
  type SceneDescriptorMap = StringDictionary[
    NavigationDescriptor[
      NavigationParams, 
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], js.Any]
    ]
  ]
  type ThemedColor = String | Anon_Dark
}
