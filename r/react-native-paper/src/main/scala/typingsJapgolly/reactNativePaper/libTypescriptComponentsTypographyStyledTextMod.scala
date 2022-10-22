package typingsJapgolly.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativePaper.anon.Alpha
import typingsJapgolly.reactNativePaper.anon.PickTextPropsstyleStylePr
import typingsJapgolly.reactNativePaper.anon.PickthemeDeepPartialThemeAlpha
import typingsJapgolly.reactNativePaper.anon.PickthemeDeepPartialThemeAndroidhyphenationFrequency
import typingsJapgolly.reactNativePaper.anon.TextPropsstyleStylePropTe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsTypographyStyledTextMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Typography/StyledText", JSImport.Default)
  @js.native
  val default: (ComponentType[
    PickthemeDeepPartialThemeAlpha | PickthemeDeepPartialThemeAndroidhyphenationFrequency
  ]) & (NonReactStatics[
    ComponentType[Props] & (js.Function1[/* hasThemeAlphaFamilyStyleRest */ Props, Element]), 
    js.Object
  ]) = js.native
  
  type Props = (ComponentProps[
    ComponentType[PickTextPropsstyleStylePr] & (NonReactStatics[
      ComponentType[TextPropsstyleStylePropTe] & ForwardRefExoticComponent[TextPropsstyleStylePropTe], 
      js.Object
    ])
  ]) & Alpha
  
  type _To = (ComponentType[
    PickthemeDeepPartialThemeAlpha | PickthemeDeepPartialThemeAndroidhyphenationFrequency
  ]) & (NonReactStatics[
    ComponentType[Props] & (js.Function1[/* hasThemeAlphaFamilyStyleRest */ Props, Element]), 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsTypographyStyledTextMod.foo` */
  override def _to: (ComponentType[
    PickthemeDeepPartialThemeAlpha | PickthemeDeepPartialThemeAndroidhyphenationFrequency
  ]) & (NonReactStatics[
    ComponentType[Props] & (js.Function1[/* hasThemeAlphaFamilyStyleRest */ Props, Element]), 
    js.Object
  ]) = default
}
