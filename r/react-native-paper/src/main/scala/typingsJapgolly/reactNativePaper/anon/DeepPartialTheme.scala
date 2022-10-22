package typingsJapgolly.reactNativePaper.anon

import typingsJapgolly.callstackReactThemeProvider.mod.DeepPartial
import typingsJapgolly.reactNativePaper.libTypescriptTypesMod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @callstack/react-theme-provider.@callstack/react-theme-provider.$DeepPartial<react-native-paper.react-native-paper/lib/typescript/types.<global>.ReactNativePaper.Theme> */
trait DeepPartialTheme extends StObject {
  
  var animation: js.UndefOr[DeepPartialThemeAnimation] = js.undefined
  
  var colors: js.UndefOr[DeepPartialThemeColors] = js.undefined
  
  var dark: js.UndefOr[DeepPartial[Boolean]] = js.undefined
  
  var fonts: js.UndefOr[DeepPartialThemeFonts] = js.undefined
  
  var mode: js.UndefOr[DeepPartial[js.UndefOr[Mode]]] = js.undefined
  
  var roundness: js.UndefOr[DeepPartial[Double]] = js.undefined
}
object DeepPartialTheme {
  
  inline def apply(): DeepPartialTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepPartialTheme]
  }
  
  extension [Self <: DeepPartialTheme](x: Self) {
    
    inline def setAnimation(value: DeepPartialThemeAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setColors(value: DeepPartialThemeColors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setDark(value: DeepPartial[Boolean]): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
    
    inline def setFonts(value: DeepPartialThemeFonts): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
    
    inline def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
    
    inline def setMode(value: DeepPartial[js.UndefOr[Mode]]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setRoundness(value: DeepPartial[Double]): Self = StObject.set(x, "roundness", value.asInstanceOf[js.Any])
    
    inline def setRoundnessUndefined: Self = StObject.set(x, "roundness", js.undefined)
  }
}
