package typingsJapgolly.materialUiSystem

import typingsJapgolly.materialUiSystem.materialUiSystemStrings.theme
import typingsJapgolly.materialUiSystem.mod.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Css[Props] extends StObject {
    
    var css: js.UndefOr[Omit[Props, theme]] = js.undefined
    
    var sx: js.UndefOr[Omit[Props, theme]] = js.undefined
  }
  object Css {
    
    inline def apply[Props](): Css[Props] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Css[Props]]
    }
    
    extension [Self <: Css[?], Props](x: Self & Css[Props]) {
      
      inline def setCss(value: Omit[Props, theme]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setSx(value: Omit[Props, theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    }
  }
  
  trait Sx[Props] extends StObject {
    
    var css: js.UndefOr[Omit[Props, theme]] = js.undefined
    
    var sx: js.UndefOr[Omit[Props, theme]] = js.undefined
  }
  object Sx {
    
    inline def apply[Props](): Sx[Props] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Sx[Props]]
    }
    
    extension [Self <: Sx[?], Props](x: Self & Sx[Props]) {
      
      inline def setCss(value: Omit[Props, theme]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setSx(value: Omit[Props, theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    }
  }
  
  trait ThemeTheme[Theme /* <: js.Object */] extends StObject {
    
    var theme: Theme
  }
  object ThemeTheme {
    
    inline def apply[Theme /* <: js.Object */](theme: Theme): ThemeTheme[Theme] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeTheme[Theme]]
    }
    
    extension [Self <: ThemeTheme[?], Theme /* <: js.Object */](x: Self & ThemeTheme[Theme]) {
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
