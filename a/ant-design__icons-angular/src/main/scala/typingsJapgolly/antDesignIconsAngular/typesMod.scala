package typingsJapgolly.antDesignIconsAngular

import org.scalajs.dom.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait CachedIconDefinition extends StObject {
    
    var icon: SVGElement
    
    var name: String
    
    var theme: String
  }
  object CachedIconDefinition {
    
    inline def apply(icon: SVGElement, name: String, theme: String): CachedIconDefinition = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[CachedIconDefinition]
    }
    
    extension [Self <: CachedIconDefinition](x: Self) {
      
      inline def setIcon(value: SVGElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IconDefinition extends StObject {
    
    var icon: String
    
    var name: String
    
    var theme: js.UndefOr[ThemeType] = js.undefined
  }
  object IconDefinition {
    
    inline def apply(icon: String, name: String): IconDefinition = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconDefinition]
    }
    
    extension [Self <: IconDefinition](x: Self) {
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: ThemeType): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait Manifest extends StObject {
    
    var fill: js.Array[String]
    
    var outline: js.Array[String]
    
    var twotone: js.Array[String]
  }
  object Manifest {
    
    inline def apply(fill: js.Array[String], outline: js.Array[String], twotone: js.Array[String]): Manifest = {
      val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], twotone = twotone.asInstanceOf[js.Any])
      __obj.asInstanceOf[Manifest]
    }
    
    extension [Self <: Manifest](x: Self) {
      
      inline def setFill(value: js.Array[String]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillVarargs(value: String*): Self = StObject.set(x, "fill", js.Array(value*))
      
      inline def setOutline(value: js.Array[String]): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
      
      inline def setOutlineVarargs(value: String*): Self = StObject.set(x, "outline", js.Array(value*))
      
      inline def setTwotone(value: js.Array[String]): Self = StObject.set(x, "twotone", value.asInstanceOf[js.Any])
      
      inline def setTwotoneVarargs(value: String*): Self = StObject.set(x, "twotone", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antDesignIconsAngular.antDesignIconsAngularStrings.fill
    - typingsJapgolly.antDesignIconsAngular.antDesignIconsAngularStrings.outline
    - typingsJapgolly.antDesignIconsAngular.antDesignIconsAngularStrings.twotone
  */
  trait ThemeType extends StObject
  object ThemeType {
    
    inline def fill: typingsJapgolly.antDesignIconsAngular.antDesignIconsAngularStrings.fill = "fill".asInstanceOf[typingsJapgolly.antDesignIconsAngular.antDesignIconsAngularStrings.fill]
    
    inline def outline: typingsJapgolly.antDesignIconsAngular.antDesignIconsAngularStrings.outline = "outline".asInstanceOf[typingsJapgolly.antDesignIconsAngular.antDesignIconsAngularStrings.outline]
    
    inline def twotone: typingsJapgolly.antDesignIconsAngular.antDesignIconsAngularStrings.twotone = "twotone".asInstanceOf[typingsJapgolly.antDesignIconsAngular.antDesignIconsAngularStrings.twotone]
  }
  
  trait TwoToneColorPalette
    extends StObject
       with TwoToneColorPaletteSetter {
    
    @JSName("secondaryColor")
    var secondaryColor_TwoToneColorPalette: String
  }
  object TwoToneColorPalette {
    
    inline def apply(primaryColor: String, secondaryColor: String): TwoToneColorPalette = {
      val __obj = js.Dynamic.literal(primaryColor = primaryColor.asInstanceOf[js.Any], secondaryColor = secondaryColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwoToneColorPalette]
    }
    
    extension [Self <: TwoToneColorPalette](x: Self) {
      
      inline def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
    }
  }
  
  trait TwoToneColorPaletteSetter extends StObject {
    
    var primaryColor: String
    
    var secondaryColor: js.UndefOr[String] = js.undefined
  }
  object TwoToneColorPaletteSetter {
    
    inline def apply(primaryColor: String): TwoToneColorPaletteSetter = {
      val __obj = js.Dynamic.literal(primaryColor = primaryColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwoToneColorPaletteSetter]
    }
    
    extension [Self <: TwoToneColorPaletteSetter](x: Self) {
      
      inline def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
      
      inline def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
      
      inline def setSecondaryColorUndefined: Self = StObject.set(x, "secondaryColor", js.undefined)
    }
  }
}
