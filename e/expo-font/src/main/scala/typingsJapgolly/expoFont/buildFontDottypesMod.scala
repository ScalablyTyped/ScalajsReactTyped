package typingsJapgolly.expoFont

import typingsJapgolly.expoAsset.mod.Asset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildFontDottypesMod {
  
  @js.native
  sealed trait FontDisplay extends StObject
  @JSImport("expo-font/build/Font.types", "FontDisplay")
  @js.native
  object FontDisplay extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FontDisplay & String] = js.native
    
    /**
      * __(Default)__ The font display strategy is defined by the user agent or platform.
      * This generally defaults to the text being invisible until the font is loaded.
      * Good for buttons or banners that require a specific treatment.
      */
    @js.native
    sealed trait AUTO
      extends StObject
         with FontDisplay
    /* "auto" */ val AUTO: typingsJapgolly.expoFont.buildFontDottypesMod.FontDisplay.AUTO & String = js.native
    
    /**
      * The text will be invisible until the font has loaded. If the font fails to load then nothing
      * will appear - it's best to turn this off when debugging missing text.
      */
    @js.native
    sealed trait BLOCK
      extends StObject
         with FontDisplay
    /* "block" */ val BLOCK: typingsJapgolly.expoFont.buildFontDottypesMod.FontDisplay.BLOCK & String = js.native
    
    /**
      * Splits the behavior between `SWAP` and `BLOCK`.
      * There will be a [100ms timeout](https://developers.google.com/web/updates/2016/02/font-display?hl=en)
      * where the text with a custom font is invisible, after that the text will either swap to the
      * styled text or it'll show the unstyled text and continue to load the custom font. This is good
      * for buttons that need a custom font but should also be quickly available to screen-readers.
      */
    @js.native
    sealed trait FALLBACK
      extends StObject
         with FontDisplay
    /* "fallback" */ val FALLBACK: typingsJapgolly.expoFont.buildFontDottypesMod.FontDisplay.FALLBACK & String = js.native
    
    /**
      * This works almost identically to `FALLBACK`, the only difference is that the browser will
      * decide to load the font based on slow connection speed or critical resource demand.
      */
    @js.native
    sealed trait OPTIONAL
      extends StObject
         with FontDisplay
    /* "optional" */ val OPTIONAL: typingsJapgolly.expoFont.buildFontDottypesMod.FontDisplay.OPTIONAL & String = js.native
    
    /**
      * Fallback text is rendered immediately with a default font while the desired font is loaded.
      * This is good for making the content appear to load instantly and is usually preferred.
      */
    @js.native
    sealed trait SWAP
      extends StObject
         with FontDisplay
    /* "swap" */ val SWAP: typingsJapgolly.expoFont.buildFontDottypesMod.FontDisplay.SWAP & String = js.native
  }
  
  trait FontResource extends StObject {
    
    /**
      * _Web Only._ Sets the [`font-display`](#fontdisplay) property for a given typeface in the
      * browser.
      */
    var display: js.UndefOr[FontDisplay] = js.undefined
    
    var uri: String | Double
  }
  object FontResource {
    
    inline def apply(uri: String | Double): FontResource = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontResource]
    }
    
    extension [Self <: FontResource](x: Self) {
      
      inline def setDisplay(value: FontDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setUri(value: String | Double): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  type FontSource = String | Double | Asset | FontResource
  
  /* Inlined std.Pick<expo-font.expo-font/build/Font.types.FontResource, 'display'> */
  trait UnloadFontOptions extends StObject {
    
    var display: js.UndefOr[FontDisplay] = js.undefined
  }
  object UnloadFontOptions {
    
    inline def apply(): UnloadFontOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnloadFontOptions]
    }
    
    extension [Self <: UnloadFontOptions](x: Self) {
      
      inline def setDisplay(value: FontDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    }
  }
}
