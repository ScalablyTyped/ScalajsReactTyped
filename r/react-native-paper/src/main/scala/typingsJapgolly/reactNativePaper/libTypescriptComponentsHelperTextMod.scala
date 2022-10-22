package typingsJapgolly.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativePaper.anon.AnimatedPropsTextPropsRefAccessibilityActions
import typingsJapgolly.reactNativePaper.anon.Padding
import typingsJapgolly.reactNativePaper.anon.PickAnimatedPropsTextPropAccessibilityActions
import typingsJapgolly.reactNativePaper.anon.PickOmitOmitPickPickAnima
import typingsJapgolly.reactNativePaper.anon.PickPickAnimatedPropsText
import typingsJapgolly.reactNativePaper.anon.Type
import typingsJapgolly.reactNativePaper.anon.themeDeepPartialThemeunde
import typingsJapgolly.reactNativePaper.libTypescriptTypesMod.Omit
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`type`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.padding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsHelperTextMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/HelperText", JSImport.Default)
  @js.native
  val default: ComponentType[PickOmitOmitPickPickAnima] & (NonReactStatics[
    (ComponentType[
      (Omit[Omit[PickPickAnimatedPropsText | themeDeepPartialThemeunde, padding], `type`]) & Type
    ]) & (js.Function1[/* hasStyleTypeVisibleThemeOnLayoutPaddingRest */ Props, Element]), 
    js.Object
  ]) = js.native
  
  type Props = (Omit[
    Omit[
      ComponentPropsWithRef[
        ComponentType[PickAnimatedPropsTextPropAccessibilityActions] & (NonReactStatics[
          ComponentType[AnimatedPropsTextPropsRefAccessibilityActions] & (/* import warning: importer.ImportType#apply Failed type conversion: typeof AnimatedText */ js.Any), 
          js.Object
        ])
      ], 
      padding
    ], 
    `type`
  ]) & Padding
  
  type _To = ComponentType[PickOmitOmitPickPickAnima] & (NonReactStatics[
    (ComponentType[
      (Omit[Omit[PickPickAnimatedPropsText | themeDeepPartialThemeunde, padding], `type`]) & Type
    ]) & (js.Function1[/* hasStyleTypeVisibleThemeOnLayoutPaddingRest */ Props, Element]), 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsHelperTextMod.foo` */
  override def _to: ComponentType[PickOmitOmitPickPickAnima] & (NonReactStatics[
    (ComponentType[
      (Omit[Omit[PickPickAnimatedPropsText | themeDeepPartialThemeunde, padding], `type`]) & Type
    ]) & (js.Function1[/* hasStyleTypeVisibleThemeOnLayoutPaddingRest */ Props, Element]), 
    js.Object
  ]) = default
}
