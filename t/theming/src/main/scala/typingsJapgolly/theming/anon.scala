package typingsJapgolly.theming

import typingsJapgolly.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[Theme] extends StObject {
    
    var theme: js.UndefOr[NonNullable[Theme]] = js.undefined
  }
  object `0` {
    
    inline def apply[Theme](): `0`[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`[Theme]]
    }
    
    extension [Self <: `0`[?], Theme](x: Self & `0`[Theme]) {
      
      inline def setTheme(value: NonNullable[Theme]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait ThemeNonNullable[Theme] extends StObject {
    
    var theme: NonNullable[Theme]
  }
  object ThemeNonNullable {
    
    inline def apply[Theme](theme: NonNullable[Theme]): ThemeNonNullable[Theme] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeNonNullable[Theme]]
    }
    
    extension [Self <: ThemeNonNullable[?], Theme](x: Self & ThemeNonNullable[Theme]) {
      
      inline def setTheme(value: NonNullable[Theme]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
