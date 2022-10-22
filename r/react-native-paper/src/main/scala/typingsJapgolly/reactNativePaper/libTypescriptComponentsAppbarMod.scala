package typingsJapgolly.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativePaper.anon.Action
import typingsJapgolly.reactNativePaper.anon.PartialViewPropsRefAttrib
import typingsJapgolly.reactNativePaper.anon.PickPartialViewPropsRefAt
import typingsJapgolly.reactNativePaper.libTypescriptComponentsAppbarAppbarMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsAppbarMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Appbar", JSImport.Default)
  @js.native
  val default: ComponentType[PickPartialViewPropsRefAt] & (NonReactStatics[
    ComponentType[PartialViewPropsRefAttrib] & (js.Function1[/* hasChildrenDarkStyleThemeRest */ Props, Element]), 
    js.Object
  ]) & Action = js.native
  
  type _To = ComponentType[PickPartialViewPropsRefAt] & (NonReactStatics[
    ComponentType[PartialViewPropsRefAttrib] & (js.Function1[/* hasChildrenDarkStyleThemeRest */ Props, Element]), 
    js.Object
  ]) & Action
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsAppbarMod.foo` */
  override def _to: ComponentType[PickPartialViewPropsRefAt] & (NonReactStatics[
    ComponentType[PartialViewPropsRefAttrib] & (js.Function1[/* hasChildrenDarkStyleThemeRest */ Props, Element]), 
    js.Object
  ]) & Action = default
}
