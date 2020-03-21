package typingsJapgolly.reactNavigationDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type NavigationDrawerScreenComponent[Params, ScreenProps] = (typingsJapgolly.react.mod.ComponentType[
    typingsJapgolly.reactNavigationDrawer.typesMod.NavigationDrawerScreenProps[Params, ScreenProps]
  ]) with (typingsJapgolly.reactNavigationDrawer.AnonNavigationOptions[Params, ScreenProps])
  type SceneDescriptorMap = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.reactNavigation.mod.NavigationDescriptor[
      typingsJapgolly.reactNavigation.mod.NavigationParams, 
      typingsJapgolly.reactNavigationDrawer.typesMod.NavigationDrawerOptions, 
      typingsJapgolly.reactNavigationDrawer.typesMod.NavigationDrawerProp[
        typingsJapgolly.reactNavigation.mod.NavigationRoute[typingsJapgolly.reactNavigation.mod.NavigationParams], 
        js.Any
      ]
    ]
  ]
  type ThemedColor = java.lang.String | typingsJapgolly.reactNavigationDrawer.AnonDark
}
