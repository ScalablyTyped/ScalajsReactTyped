package typingsJapgolly.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativePaper.anon.CallProps
import typingsJapgolly.reactNativePaper.anon.Dark
import typingsJapgolly.reactNativePaper.anon.PartialViewPropsRefAttrib
import typingsJapgolly.reactNativePaper.anon.PickPartialViewPropsRefAt
import typingsJapgolly.reactNativePaper.anon.PickthemeDeepPartialTheme
import typingsJapgolly.reactNativePaper.anon.PickthemeDeepPartialThemeAccessibilityActions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsAppbarAppbarHeaderMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Appbar/AppbarHeader", JSImport.Default)
  @js.native
  val default: (ComponentType[PickthemeDeepPartialTheme | PickthemeDeepPartialThemeAccessibilityActions]) & (NonReactStatics[ComponentType[Props] & CallProps, js.Object]) = js.native
  
  @JSImport("react-native-paper/lib/typescript/components/Appbar/AppbarHeader", "AppbarHeader")
  @js.native
  val AppbarHeader: (ComponentType[PickthemeDeepPartialTheme | PickthemeDeepPartialThemeAccessibilityActions]) & (NonReactStatics[ComponentType[Props] & CallProps, js.Object]) = js.native
  
  type Props = (ComponentProps[
    ComponentType[PickPartialViewPropsRefAt] & (NonReactStatics[
      ComponentType[PartialViewPropsRefAttrib] & (js.Function1[
        /* hasChildrenDarkStyleThemeRest */ typingsJapgolly.reactNativePaper.libTypescriptComponentsAppbarAppbarMod.Props, 
        Element
      ]), 
      js.Object
    ])
  ]) & Dark
  
  type _To = (ComponentType[PickthemeDeepPartialTheme | PickthemeDeepPartialThemeAccessibilityActions]) & (NonReactStatics[ComponentType[Props] & CallProps, js.Object])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsAppbarAppbarHeaderMod.foo` */
  override def _to: (ComponentType[PickthemeDeepPartialTheme | PickthemeDeepPartialThemeAccessibilityActions]) & (NonReactStatics[ComponentType[Props] & CallProps, js.Object]) = default
}
