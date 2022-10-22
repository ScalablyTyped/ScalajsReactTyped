package typingsJapgolly.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativePaper.anon.Accessible
import typingsJapgolly.reactNativePaper.anon.Content
import typingsJapgolly.reactNativePaper.anon.PickViewPropsRefAttributeAccessibilityIgnoresInvertColors
import typingsJapgolly.reactNativePaper.anon.PickthemeDeepPartialThemeAccessibilityLiveRegion
import typingsJapgolly.reactNativePaper.anon.PickthemeDeepPartialThemeAccessibilityRole
import typingsJapgolly.reactNativePaper.anon.PickthemeDeepPartialThemeAccessibilityState
import typingsJapgolly.reactNativePaper.anon.PickthemeDeepPartialThemeAccessibilityValue
import typingsJapgolly.reactNativePaper.anon.ViewPropsRefAttributesVieAccessibilityIgnoresInvertColors
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.elevated
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.outlined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsCardCardMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Card/Card", JSImport.Default)
  @js.native
  val default: (ComponentType[
    PickthemeDeepPartialThemeAccessibilityLiveRegion | PickthemeDeepPartialThemeAccessibilityRole | PickthemeDeepPartialThemeAccessibilityState | PickthemeDeepPartialThemeAccessibilityValue
  ]) & (NonReactStatics[
    (ComponentType[(OutlinedCardProps & Props) | (ElevatedCardProps & Props)]) & Content, 
    js.Object
  ]) = js.native
  
  trait ElevatedCardProps extends StObject {
    
    var elevation: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[elevated] = js.undefined
  }
  object ElevatedCardProps {
    
    inline def apply(): ElevatedCardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElevatedCardProps]
    }
    
    extension [Self <: ElevatedCardProps](x: Self) {
      
      inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      inline def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
      
      inline def setMode(value: elevated): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  trait OutlinedCardProps extends StObject {
    
    var elevation: js.UndefOr[scala.Nothing] = js.undefined
    
    var mode: outlined
  }
  object OutlinedCardProps {
    
    inline def apply(): OutlinedCardProps = {
      val __obj = js.Dynamic.literal(mode = "outlined")
      __obj.asInstanceOf[OutlinedCardProps]
    }
    
    extension [Self <: OutlinedCardProps](x: Self) {
      
      inline def setMode(value: outlined): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
  
  type Props = (ComponentProps[
    ComponentType[PickViewPropsRefAttributeAccessibilityIgnoresInvertColors] & (NonReactStatics[
      ComponentType[ViewPropsRefAttributesVieAccessibilityIgnoresInvertColors] & (js.Function1[
        /* hasStyleThemeRest */ typingsJapgolly.reactNativePaper.libTypescriptComponentsSurfaceMod.Props, 
        Element
      ]), 
      js.Object
    ])
  ]) & Accessible
  
  type _To = (ComponentType[
    PickthemeDeepPartialThemeAccessibilityLiveRegion | PickthemeDeepPartialThemeAccessibilityRole | PickthemeDeepPartialThemeAccessibilityState | PickthemeDeepPartialThemeAccessibilityValue
  ]) & (NonReactStatics[
    (ComponentType[(OutlinedCardProps & Props) | (ElevatedCardProps & Props)]) & Content, 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsCardCardMod.foo` */
  override def _to: (ComponentType[
    PickthemeDeepPartialThemeAccessibilityLiveRegion | PickthemeDeepPartialThemeAccessibilityRole | PickthemeDeepPartialThemeAccessibilityState | PickthemeDeepPartialThemeAccessibilityValue
  ]) & (NonReactStatics[
    (ComponentType[(OutlinedCardProps & Props) | (ElevatedCardProps & Props)]) & Content, 
    js.Object
  ]) = default
}
