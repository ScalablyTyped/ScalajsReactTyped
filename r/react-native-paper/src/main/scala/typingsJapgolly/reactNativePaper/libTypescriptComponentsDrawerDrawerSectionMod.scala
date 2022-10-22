package typingsJapgolly.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNativePaper.anon.CallHasChildrenTitleThemeStyleRest
import typingsJapgolly.reactNativePaper.anon.PickViewPropsRefAttributeAccessibilityState
import typingsJapgolly.reactNativePaper.anon.Title
import typingsJapgolly.reactNativePaper.anon.TypeofView
import typingsJapgolly.reactNativePaper.anon.ViewPropsRefAttributesVieAccessibilityRole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsDrawerDrawerSectionMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Drawer/DrawerSection", JSImport.Default)
  @js.native
  val default: ComponentType[PickViewPropsRefAttributeAccessibilityState] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityRole] & CallHasChildrenTitleThemeStyleRest, 
    js.Object
  ]) = js.native
  
  type Props = ComponentPropsWithRef[TypeofView] & Title
  
  type _To = ComponentType[PickViewPropsRefAttributeAccessibilityState] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityRole] & CallHasChildrenTitleThemeStyleRest, 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsDrawerDrawerSectionMod.foo` */
  override def _to: ComponentType[PickViewPropsRefAttributeAccessibilityState] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityRole] & CallHasChildrenTitleThemeStyleRest, 
    js.Object
  ]) = default
}
