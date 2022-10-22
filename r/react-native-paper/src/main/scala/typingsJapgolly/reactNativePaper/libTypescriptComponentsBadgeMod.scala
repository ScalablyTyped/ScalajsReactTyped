package typingsJapgolly.reactNativePaper

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.Animated.AnimatedComponent
import typingsJapgolly.reactNative.mod._Text
import typingsJapgolly.reactNativePaper.anon.AnimatedPropsTextPropsRef
import typingsJapgolly.reactNativePaper.anon.PickAnimatedPropsTextProp
import typingsJapgolly.reactNativePaper.anon.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsBadgeMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Badge", JSImport.Default)
  @js.native
  val default: ComponentType[PickAnimatedPropsTextProp] & (NonReactStatics[
    ComponentType[AnimatedPropsTextPropsRef] & (js.Function1[/* hasChildrenSizeStyleThemeVisibleRest */ Props, Element]), 
    js.Object
  ]) = js.native
  
  type Props = ComponentProps[AnimatedComponent[Instantiable0[_Text]]] & Ref
  
  type _To = ComponentType[PickAnimatedPropsTextProp] & (NonReactStatics[
    ComponentType[AnimatedPropsTextPropsRef] & (js.Function1[/* hasChildrenSizeStyleThemeVisibleRest */ Props, Element]), 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsBadgeMod.foo` */
  override def _to: ComponentType[PickAnimatedPropsTextProp] & (NonReactStatics[
    ComponentType[AnimatedPropsTextPropsRef] & (js.Function1[/* hasChildrenSizeStyleThemeVisibleRest */ Props, Element]), 
    js.Object
  ]) = default
}
