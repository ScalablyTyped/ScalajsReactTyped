package typingsJapgolly.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativePaper.anon.Animating
import typingsJapgolly.reactNativePaper.anon.PickViewPropsRefAttribute
import typingsJapgolly.reactNativePaper.anon.TypeofView
import typingsJapgolly.reactNativePaper.anon.ViewPropsRefAttributesVie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsActivityIndicatorMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/ActivityIndicator", JSImport.Default)
  @js.native
  val default: ComponentType[PickViewPropsRefAttribute] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVie] & (js.Function1[
      /* hasAnimatingIndicatorColorHidesWhenStoppedIndicatorSizeStyleThemeRest */ Props, 
      Element
    ]), 
    js.Object
  ]) = js.native
  
  type Props = ComponentPropsWithRef[TypeofView] & Animating
  
  type _To = ComponentType[PickViewPropsRefAttribute] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVie] & (js.Function1[
      /* hasAnimatingIndicatorColorHidesWhenStoppedIndicatorSizeStyleThemeRest */ Props, 
      Element
    ]), 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsActivityIndicatorMod.foo` */
  override def _to: ComponentType[PickViewPropsRefAttribute] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVie] & (js.Function1[
      /* hasAnimatingIndicatorColorHidesWhenStoppedIndicatorSizeStyleThemeRest */ Props, 
      Element
    ]), 
    js.Object
  ]) = default
}
