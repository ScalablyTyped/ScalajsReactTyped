package typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNavigation.mod.NavigationDescriptor
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationProp
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import typingsJapgolly.reactNavigation.mod.NavigationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type NavigationStackState = NavigationState

type Route[T /* <: String */] = NavigationRoute[NavigationParams]

type StackCardStyleInterpolator = js.Function1[/* props */ StackCardInterpolationProps, StackCardInterpolatedStyle]

type StackDescriptor = NavigationDescriptor[
NavigationParams, 
StackNavigationOptions, 
StackNavigationProp[NavigationRoute[NavigationParams], NavigationParams]]

type StackDescriptorMap = StringDictionary[StackDescriptor]

type StackHeaderStyleInterpolator = js.Function1[/* props */ StackHeaderInterpolationProps, StackHeaderInterpolatedStyle]

type StackNavigationHelpers = NavigationProp[NavigationStackState]
