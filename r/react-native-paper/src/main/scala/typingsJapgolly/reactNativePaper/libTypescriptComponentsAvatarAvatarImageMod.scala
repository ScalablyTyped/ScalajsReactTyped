package typingsJapgolly.reactNativePaper

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNative.mod.ImageSourcePropType
import typingsJapgolly.reactNativePaper.anon.CallHasSizeSourceStyleOnErrorOnLayoutOnLoadOnLoadEndOnLoadStartOnProgressThemeRest
import typingsJapgolly.reactNativePaper.anon.OnError
import typingsJapgolly.reactNativePaper.anon.PickViewPropsRefAttributeAccessibilityElementsHidden
import typingsJapgolly.reactNativePaper.anon.SizeNumber
import typingsJapgolly.reactNativePaper.anon.TypeofView
import typingsJapgolly.reactNativePaper.anon.ViewPropsRefAttributesVieAccessibilityElementsHidden
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsAvatarAvatarImageMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Avatar/AvatarImage", JSImport.Default)
  @js.native
  val default: ComponentType[PickViewPropsRefAttributeAccessibilityElementsHidden] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityElementsHidden] & CallHasSizeSourceStyleOnErrorOnLayoutOnLoadOnLoadEndOnLoadStartOnProgressThemeRest, 
    js.Object
  ]) = js.native
  
  type AvatarImageSource = ImageSourcePropType | (js.Function1[/* props */ SizeNumber, Node])
  
  type Props = ComponentPropsWithRef[TypeofView] & OnError
  
  type _To = ComponentType[PickViewPropsRefAttributeAccessibilityElementsHidden] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityElementsHidden] & CallHasSizeSourceStyleOnErrorOnLayoutOnLoadOnLoadEndOnLoadStartOnProgressThemeRest, 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsAvatarAvatarImageMod.foo` */
  override def _to: ComponentType[PickViewPropsRefAttributeAccessibilityElementsHidden] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityElementsHidden] & CallHasSizeSourceStyleOnErrorOnLayoutOnLoadOnLoadEndOnLoadStartOnProgressThemeRest, 
    js.Object
  ]) = default
}
