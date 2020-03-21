package typingsJapgolly.reactNavigationStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type NavigationStackScreenComponent[Params, ScreenProps] = (typingsJapgolly.react.mod.ComponentType[
    typingsJapgolly.reactNavigationStack.typesMod.NavigationStackScreenProps[Params, ScreenProps]
  ]) with (typingsJapgolly.reactNavigationStack.AnonNavigationOptions[Params, ScreenProps])
  type NavigationStackState = typingsJapgolly.reactNavigation.mod.NavigationState
  type SceneDescriptorMap = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.reactNavigation.mod.NavigationDescriptor[
      typingsJapgolly.reactNavigation.mod.NavigationParams, 
      typingsJapgolly.reactNavigationStack.typesMod.NavigationStackOptions, 
      typingsJapgolly.reactNavigationStack.typesMod.NavigationStackProp[
        typingsJapgolly.reactNavigation.mod.NavigationRoute[typingsJapgolly.reactNavigation.mod.NavigationParams], 
        typingsJapgolly.reactNavigation.mod.NavigationParams
      ]
    ]
  ]
  type SceneInterpolator = js.Function1[
    /* props */ typingsJapgolly.reactNavigationStack.typesMod.SceneInterpolatorProps, 
    js.Any
  ]
}
