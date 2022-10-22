package typingsJapgolly.reactNativeElements.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeElements.distInputInputMod.InputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements/dist/config.ThemeProps<react-native-elements.react-native-elements/dist/input/Input.InputProps>> */
trait PartialThemePropsInputPro extends StObject {
  
  var replaceTheme: js.UndefOr[js.Function1[/* updates */ RecursivePartialFullTheme, Unit]] = js.undefined
  
  var theme: js.UndefOr[typingsJapgolly.reactNativeElements.distConfigThemeMod.Theme[InputProps]] = js.undefined
  
  var updateTheme: js.UndefOr[js.Function1[/* updates */ RecursivePartialFullTheme, Unit]] = js.undefined
}
object PartialThemePropsInputPro {
  
  inline def apply(): PartialThemePropsInputPro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialThemePropsInputPro]
  }
  
  extension [Self <: PartialThemePropsInputPro](x: Self) {
    
    inline def setReplaceTheme(value: /* updates */ RecursivePartialFullTheme => Callback): Self = StObject.set(x, "replaceTheme", js.Any.fromFunction1((t0: /* updates */ RecursivePartialFullTheme) => value(t0).runNow()))
    
    inline def setReplaceThemeUndefined: Self = StObject.set(x, "replaceTheme", js.undefined)
    
    inline def setTheme(value: typingsJapgolly.reactNativeElements.distConfigThemeMod.Theme[InputProps]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setUpdateTheme(value: /* updates */ RecursivePartialFullTheme => Callback): Self = StObject.set(x, "updateTheme", js.Any.fromFunction1((t0: /* updates */ RecursivePartialFullTheme) => value(t0).runNow()))
    
    inline def setUpdateThemeUndefined: Self = StObject.set(x, "updateTheme", js.undefined)
  }
}
