package typingsJapgolly.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNativePaper.anon.CallHasChildrenTitleTitleStyleStyleRest
import typingsJapgolly.reactNativePaper.anon.PickViewPropsRefAttributeAccessibilityValue
import typingsJapgolly.reactNativePaper.anon.TitleStyle
import typingsJapgolly.reactNativePaper.anon.TypeofView
import typingsJapgolly.reactNativePaper.anon.ViewPropsRefAttributesVieAccessibilityState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsListListSectionMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/List/ListSection", JSImport.Default)
  @js.native
  val default: ComponentType[PickViewPropsRefAttributeAccessibilityValue] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityState] & CallHasChildrenTitleTitleStyleStyleRest, 
    js.Object
  ]) = js.native
  
  type Props = ComponentPropsWithRef[TypeofView] & TitleStyle
  
  type _To = ComponentType[PickViewPropsRefAttributeAccessibilityValue] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityState] & CallHasChildrenTitleTitleStyleStyleRest, 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsListListSectionMod.foo` */
  override def _to: ComponentType[PickViewPropsRefAttributeAccessibilityValue] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityState] & CallHasChildrenTitleTitleStyleStyleRest, 
    js.Object
  ]) = default
}
