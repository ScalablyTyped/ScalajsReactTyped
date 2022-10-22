package typingsJapgolly.reactNativePaper

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.Animated.AnimatedComponent
import typingsJapgolly.reactNative.mod._Text
import typingsJapgolly.reactNativePaper.anon.AnimatedPropsTextPropsRefAccessibilityActions
import typingsJapgolly.reactNativePaper.anon.PickAnimatedPropsTextPropAccessibilityActions
import typingsJapgolly.reactNativePaper.anon.StyleThemeTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsTypographyAnimatedTextMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Typography/AnimatedText", JSImport.Default)
  @js.native
  val default: ComponentType[PickAnimatedPropsTextPropAccessibilityActions] & (NonReactStatics[
    ComponentType[AnimatedPropsTextPropsRefAccessibilityActions] & (js.Function1[/* hasStyleThemeRest */ Props, Element]), 
    js.Object
  ]) = js.native
  
  type Props = ComponentPropsWithRef[AnimatedComponent[Instantiable0[_Text]]] & StyleThemeTheme
  
  type _To = ComponentType[PickAnimatedPropsTextPropAccessibilityActions] & (NonReactStatics[
    ComponentType[AnimatedPropsTextPropsRefAccessibilityActions] & (js.Function1[/* hasStyleThemeRest */ Props, Element]), 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsTypographyAnimatedTextMod.foo` */
  override def _to: ComponentType[PickAnimatedPropsTextPropAccessibilityActions] & (NonReactStatics[
    ComponentType[AnimatedPropsTextPropsRefAccessibilityActions] & (js.Function1[/* hasStyleThemeRest */ Props, Element]), 
    js.Object
  ]) = default
}
