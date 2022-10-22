package typingsJapgolly.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativePaper.anon.DURATIONLONG
import typingsJapgolly.reactNativePaper.anon.Duration
import typingsJapgolly.reactNativePaper.anon.PickViewPropsRefAttributeAccessibilityIgnoresInvertColors
import typingsJapgolly.reactNativePaper.anon.PickthemeDeepPartialThemeAction
import typingsJapgolly.reactNativePaper.anon.PickthemeDeepPartialThemeChildren
import typingsJapgolly.reactNativePaper.anon.ViewPropsRefAttributesVieAccessibilityIgnoresInvertColors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsSnackbarMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Snackbar", JSImport.Default)
  @js.native
  val default: (ComponentType[PickthemeDeepPartialThemeAction | PickthemeDeepPartialThemeChildren]) & (NonReactStatics[ComponentType[Props] & DURATIONLONG, js.Object]) = js.native
  
  type Props = (ComponentProps[
    ComponentType[PickViewPropsRefAttributeAccessibilityIgnoresInvertColors] & (NonReactStatics[
      ComponentType[ViewPropsRefAttributesVieAccessibilityIgnoresInvertColors] & (js.Function1[
        /* hasStyleThemeRest */ typingsJapgolly.reactNativePaper.libTypescriptComponentsSurfaceMod.Props, 
        Element
      ]), 
      js.Object
    ])
  ]) & Duration
  
  type _To = (ComponentType[PickthemeDeepPartialThemeAction | PickthemeDeepPartialThemeChildren]) & (NonReactStatics[ComponentType[Props] & DURATIONLONG, js.Object])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsSnackbarMod.foo` */
  override def _to: (ComponentType[PickthemeDeepPartialThemeAction | PickthemeDeepPartialThemeChildren]) & (NonReactStatics[ComponentType[Props] & DURATIONLONG, js.Object]) = default
}
