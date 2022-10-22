package typingsJapgolly.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locale extends StObject {
  
  var locale: typingsJapgolly.baseui.localeTypesMod.Locale
  
  var theme: typingsJapgolly.baseui.stylesTypesMod.Theme
}
object Locale {
  
  inline def apply(
    locale: typingsJapgolly.baseui.localeTypesMod.Locale,
    theme: typingsJapgolly.baseui.stylesTypesMod.Theme
  ): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  
  extension [Self <: Locale](x: Self) {
    
    inline def setLocale(value: typingsJapgolly.baseui.localeTypesMod.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: typingsJapgolly.baseui.stylesTypesMod.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
