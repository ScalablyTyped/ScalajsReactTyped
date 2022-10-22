package typingsJapgolly.reactNativePaper

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.reactNative.mod.Text
import typingsJapgolly.reactNativePaper.anon.PickTextPropsstyleStylePr
import typingsJapgolly.reactNativePaper.anon.StyleThemeTheme
import typingsJapgolly.reactNativePaper.anon.TextPropsstyleStylePropTe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsTypographyTextMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Typography/Text", JSImport.Default)
  @js.native
  val default: ComponentType[PickTextPropsstyleStylePr] & (NonReactStatics[
    ComponentType[TextPropsstyleStylePropTe] & ForwardRefExoticComponent[TextPropsstyleStylePropTe], 
    js.Object
  ]) = js.native
  
  type Props = ComponentProps[Instantiable0[Text]] & StyleThemeTheme
  
  type _To = ComponentType[PickTextPropsstyleStylePr] & (NonReactStatics[
    ComponentType[TextPropsstyleStylePropTe] & ForwardRefExoticComponent[TextPropsstyleStylePropTe], 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsTypographyTextMod.foo` */
  override def _to: ComponentType[PickTextPropsstyleStylePr] & (NonReactStatics[
    ComponentType[TextPropsstyleStylePropTe] & ForwardRefExoticComponent[TextPropsstyleStylePropTe], 
    js.Object
  ]) = default
}
