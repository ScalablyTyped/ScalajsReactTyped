package typingsJapgolly.reactNativeElements.anon

import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-native-elements.react-native-elements/dist/card/Card.CardProps & std.Partial<react-native-elements.react-native-elements/dist/config.ThemeProps<react-native-elements.react-native-elements/dist/card/Card.CardProps>>, 'containerStyle' | 'wrapperStyle'> */
trait PickCardPropsPartialTheme extends StObject {
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object PickCardPropsPartialTheme {
  
  inline def apply(): PickCardPropsPartialTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickCardPropsPartialTheme]
  }
  
  extension [Self <: PickCardPropsPartialTheme](x: Self) {
    
    inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
