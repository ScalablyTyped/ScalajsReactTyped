package typingsJapgolly.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativePaper.anon.Children
import typingsJapgolly.reactNativePaper.anon.PartialViewPropsRefAttrib
import typingsJapgolly.reactNativePaper.anon.PickPartialViewPropsRefAt
import typingsJapgolly.reactNativePaper.anon.TypeofView
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsAppbarAppbarMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Appbar/Appbar", JSImport.Default)
  @js.native
  val default: ComponentType[PickPartialViewPropsRefAt] & (NonReactStatics[
    ComponentType[PartialViewPropsRefAttrib] & (js.Function1[/* hasChildrenDarkStyleThemeRest */ Props, Element]), 
    js.Object
  ]) = js.native
  
  @JSImport("react-native-paper/lib/typescript/components/Appbar/Appbar", "Appbar")
  @js.native
  val Appbar: ComponentType[PickPartialViewPropsRefAt] & (NonReactStatics[
    ComponentType[PartialViewPropsRefAttrib] & (js.Function1[/* hasChildrenDarkStyleThemeRest */ Props, Element]), 
    js.Object
  ]) = js.native
  
  @JSImport("react-native-paper/lib/typescript/components/Appbar/Appbar", "DEFAULT_APPBAR_HEIGHT")
  @js.native
  val DEFAULT_APPBAR_HEIGHT: /* 56 */ Double = js.native
  
  type Props = Partial[ComponentPropsWithRef[TypeofView]] & Children
  
  type _To = ComponentType[PickPartialViewPropsRefAt] & (NonReactStatics[
    ComponentType[PartialViewPropsRefAttrib] & (js.Function1[/* hasChildrenDarkStyleThemeRest */ Props, Element]), 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsAppbarAppbarMod.foo` */
  override def _to: ComponentType[PickPartialViewPropsRefAt] & (NonReactStatics[
    ComponentType[PartialViewPropsRefAttrib] & (js.Function1[/* hasChildrenDarkStyleThemeRest */ Props, Element]), 
    js.Object
  ]) = default
}
