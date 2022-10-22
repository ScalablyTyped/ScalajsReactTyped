package typingsJapgolly.reactNativeElements.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements/dist/card/Card.CardProps & std.Partial<react-native-elements.react-native-elements/dist/config.ThemeProps<react-native-elements.react-native-elements/dist/card/Card.CardProps>>> */
trait PartialCardPropsPartialTh extends StObject {
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var replaceTheme: js.UndefOr[js.Function1[/* updates */ RecursivePartialFullThemeAirbnbRating, Unit]] = js.undefined
  
  var theme: js.UndefOr[ThemeCardProps] = js.undefined
  
  var updateTheme: js.UndefOr[js.Function1[/* updates */ RecursivePartialFullThemeAirbnbRating, Unit]] = js.undefined
  
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object PartialCardPropsPartialTh {
  
  inline def apply(): PartialCardPropsPartialTh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCardPropsPartialTh]
  }
  
  extension [Self <: PartialCardPropsPartialTh](x: Self) {
    
    inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setReplaceTheme(value: /* updates */ RecursivePartialFullThemeAirbnbRating => Callback): Self = StObject.set(x, "replaceTheme", js.Any.fromFunction1((t0: /* updates */ RecursivePartialFullThemeAirbnbRating) => value(t0).runNow()))
    
    inline def setReplaceThemeUndefined: Self = StObject.set(x, "replaceTheme", js.undefined)
    
    inline def setTheme(value: ThemeCardProps): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setUpdateTheme(value: /* updates */ RecursivePartialFullThemeAirbnbRating => Callback): Self = StObject.set(x, "updateTheme", js.Any.fromFunction1((t0: /* updates */ RecursivePartialFullThemeAirbnbRating) => value(t0).runNow()))
    
    inline def setUpdateThemeUndefined: Self = StObject.set(x, "updateTheme", js.undefined)
    
    inline def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
