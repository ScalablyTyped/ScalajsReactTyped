package typingsJapgolly.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.reactNativePaper.anon.CallHasStyleThemeRest
import typingsJapgolly.reactNativePaper.anon.PickTextPropsstyleStylePr
import typingsJapgolly.reactNativePaper.anon.PickthemeDeepPartialThemeAdjustsFontSizeToFit
import typingsJapgolly.reactNativePaper.anon.PickthemeDeepPartialThemeAllowFontScaling
import typingsJapgolly.reactNativePaper.anon.TextPropsstyleStylePropTe
import typingsJapgolly.reactNativePaper.anon.ThemeTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsListListSubheaderMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/List/ListSubheader", JSImport.Default)
  @js.native
  val default: (ComponentType[
    PickthemeDeepPartialThemeAdjustsFontSizeToFit | PickthemeDeepPartialThemeAllowFontScaling
  ]) & (NonReactStatics[ComponentType[Props] & CallHasStyleThemeRest, js.Object]) = js.native
  
  type Props = (ComponentProps[
    ComponentType[PickTextPropsstyleStylePr] & (NonReactStatics[
      ComponentType[TextPropsstyleStylePropTe] & ForwardRefExoticComponent[TextPropsstyleStylePropTe], 
      js.Object
    ])
  ]) & ThemeTheme
  
  type _To = (ComponentType[
    PickthemeDeepPartialThemeAdjustsFontSizeToFit | PickthemeDeepPartialThemeAllowFontScaling
  ]) & (NonReactStatics[ComponentType[Props] & CallHasStyleThemeRest, js.Object])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsListListSubheaderMod.foo` */
  override def _to: (ComponentType[
    PickthemeDeepPartialThemeAdjustsFontSizeToFit | PickthemeDeepPartialThemeAllowFontScaling
  ]) & (NonReactStatics[ComponentType[Props] & CallHasStyleThemeRest, js.Object]) = default
}
