package typingsJapgolly.reactNativePaper

import typingsJapgolly.react.mod.ComponentPropsWithoutRef
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNativePaper.anon.Accent
import typingsJapgolly.reactNativePaper.anon.Scale
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`100`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`200`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`300`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`400`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`500`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`600`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`700`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`800`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`900`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.bold
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.children
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.normal
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativePaper.reactNativePaperStrings.head
    - typingsJapgolly.reactNativePaper.reactNativePaperStrings.middle
    - typingsJapgolly.reactNativePaper.reactNativePaperStrings.tail
    - typingsJapgolly.reactNativePaper.reactNativePaperStrings.clip
  */
  trait EllipsizeProp extends StObject
  object EllipsizeProp {
    
    inline def clip: typingsJapgolly.reactNativePaper.reactNativePaperStrings.clip = "clip".asInstanceOf[typingsJapgolly.reactNativePaper.reactNativePaperStrings.clip]
    
    inline def head: typingsJapgolly.reactNativePaper.reactNativePaperStrings.head = "head".asInstanceOf[typingsJapgolly.reactNativePaper.reactNativePaperStrings.head]
    
    inline def middle: typingsJapgolly.reactNativePaper.reactNativePaperStrings.middle = "middle".asInstanceOf[typingsJapgolly.reactNativePaper.reactNativePaperStrings.middle]
    
    inline def tail: typingsJapgolly.reactNativePaper.reactNativePaperStrings.tail = "tail".asInstanceOf[typingsJapgolly.reactNativePaper.reactNativePaperStrings.tail]
  }
  
  trait Font extends StObject {
    
    var fontFamily: String
    
    var fontWeight: js.UndefOr[
        normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
      ] = js.undefined
  }
  object Font {
    
    inline def apply(fontFamily: String): Font = {
      val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any])
      __obj.asInstanceOf[Font]
    }
    
    extension [Self <: Font](x: Self) {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontWeight(value: normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    }
  }
  
  trait Fonts extends StObject {
    
    var light: Font
    
    var medium: Font
    
    var regular: Font
    
    var thin: Font
  }
  object Fonts {
    
    inline def apply(light: Font, medium: Font, regular: Font, thin: Font): Fonts = {
      val __obj = js.Dynamic.literal(light = light.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], regular = regular.asInstanceOf[js.Any], thin = thin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fonts]
    }
    
    extension [Self <: Fonts](x: Self) {
      
      inline def setLight(value: Font): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      inline def setMedium(value: Font): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      inline def setRegular(value: Font): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
      
      inline def setThin(value: Font): Self = StObject.set(x, "thin", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativePaper.reactNativePaperStrings.adaptive
    - typingsJapgolly.reactNativePaper.reactNativePaperStrings.exact
  */
  trait Mode extends StObject
  object Mode {
    
    inline def adaptive: typingsJapgolly.reactNativePaper.reactNativePaperStrings.adaptive = "adaptive".asInstanceOf[typingsJapgolly.reactNativePaper.reactNativePaperStrings.adaptive]
    
    inline def exact: typingsJapgolly.reactNativePaper.reactNativePaperStrings.exact = "exact".asInstanceOf[typingsJapgolly.reactNativePaper.reactNativePaperStrings.exact]
  }
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type RemoveChildren[T /* <: ComponentType[Any] */] = Omit[ComponentPropsWithoutRef[T], children]
  
  trait Theme extends StObject {
    
    var animation: Scale
    
    var colors: Accent
    
    var dark: Boolean
    
    var fonts: Fonts
    
    var mode: js.UndefOr[Mode] = js.undefined
    
    var roundness: Double
  }
  object Theme {
    
    inline def apply(animation: Scale, colors: Accent, dark: Boolean, fonts: Fonts, roundness: Double): Theme = {
      val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], dark = dark.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], roundness = roundness.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    extension [Self <: Theme](x: Self) {
      
      inline def setAnimation(value: Scale): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setColors(value: Accent): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setDark(value: Boolean): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
      
      inline def setFonts(value: Fonts): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setRoundness(value: Double): Self = StObject.set(x, "roundness", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    object ReactNativePaper {
      
      trait Theme extends StObject {
        
        var animation: ThemeAnimation
        
        var colors: ThemeColors
        
        var dark: Boolean
        
        var fonts: ThemeFonts
        
        var mode: js.UndefOr[Mode] = js.undefined
        
        var roundness: Double
      }
      object Theme {
        
        inline def apply(
          animation: ThemeAnimation,
          colors: ThemeColors,
          dark: Boolean,
          fonts: ThemeFonts,
          roundness: Double
        ): typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme = {
          val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], dark = dark.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], roundness = roundness.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme]
        }
        
        extension [Self <: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme](x: Self) {
          
          inline def setAnimation(value: ThemeAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
          
          inline def setColors(value: ThemeColors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
          
          inline def setDark(value: Boolean): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
          
          inline def setFonts(value: ThemeFonts): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
          
          inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
          
          inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
          
          inline def setRoundness(value: Double): Self = StObject.set(x, "roundness", value.asInstanceOf[js.Any])
        }
      }
      
      trait ThemeAnimation extends StObject {
        
        var scale: Double
      }
      object ThemeAnimation {
        
        inline def apply(scale: Double): ThemeAnimation = {
          val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
          __obj.asInstanceOf[ThemeAnimation]
        }
        
        extension [Self <: ThemeAnimation](x: Self) {
          
          inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
        }
      }
      
      trait ThemeColors extends StObject {
        
        var accent: String
        
        var backdrop: String
        
        var background: String
        
        var disabled: String
        
        var error: String
        
        var notification: String
        
        var onSurface: String
        
        var placeholder: String
        
        var primary: String
        
        var surface: String
        
        var text: String
      }
      object ThemeColors {
        
        inline def apply(
          accent: String,
          backdrop: String,
          background: String,
          disabled: String,
          error: String,
          notification: String,
          onSurface: String,
          placeholder: String,
          primary: String,
          surface: String,
          text: String
        ): ThemeColors = {
          val __obj = js.Dynamic.literal(accent = accent.asInstanceOf[js.Any], backdrop = backdrop.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any], onSurface = onSurface.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], surface = surface.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
          __obj.asInstanceOf[ThemeColors]
        }
        
        extension [Self <: ThemeColors](x: Self) {
          
          inline def setAccent(value: String): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
          
          inline def setBackdrop(value: String): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
          
          inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
          
          inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
          
          inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
          
          inline def setNotification(value: String): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
          
          inline def setOnSurface(value: String): Self = StObject.set(x, "onSurface", value.asInstanceOf[js.Any])
          
          inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
          
          inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
          
          inline def setSurface(value: String): Self = StObject.set(x, "surface", value.asInstanceOf[js.Any])
          
          inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        }
      }
      
      trait ThemeFont extends StObject {
        
        var fontFamily: String
        
        var fontWeight: js.UndefOr[
                normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
              ] = js.undefined
      }
      object ThemeFont {
        
        inline def apply(fontFamily: String): ThemeFont = {
          val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any])
          __obj.asInstanceOf[ThemeFont]
        }
        
        extension [Self <: ThemeFont](x: Self) {
          
          inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
          
          inline def setFontWeight(value: normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
          
          inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
        }
      }
      
      trait ThemeFonts extends StObject {
        
        var light: ThemeFont
        
        var medium: ThemeFont
        
        var regular: ThemeFont
        
        var thin: ThemeFont
      }
      object ThemeFonts {
        
        inline def apply(light: ThemeFont, medium: ThemeFont, regular: ThemeFont, thin: ThemeFont): ThemeFonts = {
          val __obj = js.Dynamic.literal(light = light.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], regular = regular.asInstanceOf[js.Any], thin = thin.asInstanceOf[js.Any])
          __obj.asInstanceOf[ThemeFonts]
        }
        
        extension [Self <: ThemeFonts](x: Self) {
          
          inline def setLight(value: ThemeFont): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
          
          inline def setMedium(value: ThemeFont): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
          
          inline def setRegular(value: ThemeFont): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
          
          inline def setThin(value: ThemeFont): Self = StObject.set(x, "thin", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
