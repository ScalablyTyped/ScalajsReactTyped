package typingsJapgolly.reactNativePaper.anon

import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeTheme extends StObject {
  
  /**
    * Style that is passed to Text element.
    */
  var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @optional
    */
  var theme: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
}
object ThemeTheme {
  
  inline def apply(theme: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): ThemeTheme = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeTheme]
  }
  
  extension [Self <: ThemeTheme](x: Self) {
    
    inline def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
