package typingsJapgolly.leafletIconGlyph

import typingsJapgolly.leaflet.mod.BaseIconOptions
import typingsJapgolly.leaflet.mod.IconOptions
import typingsJapgolly.leaflet.mod.PointExpression
import typingsJapgolly.leafletIconGlyph.leafletMod.Icon_.Glyph
import typingsJapgolly.leafletIconGlyph.leafletMod.Icon_.GlyphIconOptions
import typingsJapgolly.leafletIconGlyph.leafletMod.Icon_.GlyphOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  object Icon_ {
    
    @JSImport("leaflet", "Icon.Glyph")
    @js.native
    open class Glyph ()
      extends typingsJapgolly.leaflet.mod.Icon_[IconOptions] {
      def this(options: GlyphIconOptions) = this()
      def this(options: GlyphOptions) = this()
      
      @JSName("options")
      var options_Glyph: GlyphIconOptions = js.native
    }
    
    trait GlyphIconOptions
      extends StObject
         with IconOptions {
      
      var bgPos: js.UndefOr[PointExpression] = js.undefined
      
      var bgSize: js.UndefOr[PointExpression] = js.undefined
      
      var glyph: js.UndefOr[String] = js.undefined
      
      var glyphAnchor: js.UndefOr[PointExpression] = js.undefined
      
      var glyphColor: js.UndefOr[String] = js.undefined
      
      var glyphSize: js.UndefOr[String] = js.undefined
      
      var prefix: js.UndefOr[String] = js.undefined
    }
    object GlyphIconOptions {
      
      inline def apply(iconUrl: String): GlyphIconOptions = {
        val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any])
        __obj.asInstanceOf[GlyphIconOptions]
      }
      
      extension [Self <: GlyphIconOptions](x: Self) {
        
        inline def setBgPos(value: PointExpression): Self = StObject.set(x, "bgPos", value.asInstanceOf[js.Any])
        
        inline def setBgPosUndefined: Self = StObject.set(x, "bgPos", js.undefined)
        
        inline def setBgSize(value: PointExpression): Self = StObject.set(x, "bgSize", value.asInstanceOf[js.Any])
        
        inline def setBgSizeUndefined: Self = StObject.set(x, "bgSize", js.undefined)
        
        inline def setGlyph(value: String): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
        
        inline def setGlyphAnchor(value: PointExpression): Self = StObject.set(x, "glyphAnchor", value.asInstanceOf[js.Any])
        
        inline def setGlyphAnchorUndefined: Self = StObject.set(x, "glyphAnchor", js.undefined)
        
        inline def setGlyphColor(value: String): Self = StObject.set(x, "glyphColor", value.asInstanceOf[js.Any])
        
        inline def setGlyphColorUndefined: Self = StObject.set(x, "glyphColor", js.undefined)
        
        inline def setGlyphSize(value: String): Self = StObject.set(x, "glyphSize", value.asInstanceOf[js.Any])
        
        inline def setGlyphSizeUndefined: Self = StObject.set(x, "glyphSize", js.undefined)
        
        inline def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
        
        inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      }
    }
    
    trait GlyphOptions
      extends StObject
         with BaseIconOptions {
      
      var bgPos: js.UndefOr[PointExpression] = js.undefined
      
      var bgSize: js.UndefOr[PointExpression] = js.undefined
      
      var glyph: js.UndefOr[String] = js.undefined
      
      var glyphAnchor: js.UndefOr[PointExpression] = js.undefined
      
      var glyphColor: js.UndefOr[String] = js.undefined
      
      var glyphSize: js.UndefOr[String] = js.undefined
      
      var prefix: js.UndefOr[String] = js.undefined
    }
    object GlyphOptions {
      
      inline def apply(): GlyphOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GlyphOptions]
      }
      
      extension [Self <: GlyphOptions](x: Self) {
        
        inline def setBgPos(value: PointExpression): Self = StObject.set(x, "bgPos", value.asInstanceOf[js.Any])
        
        inline def setBgPosUndefined: Self = StObject.set(x, "bgPos", js.undefined)
        
        inline def setBgSize(value: PointExpression): Self = StObject.set(x, "bgSize", value.asInstanceOf[js.Any])
        
        inline def setBgSizeUndefined: Self = StObject.set(x, "bgSize", js.undefined)
        
        inline def setGlyph(value: String): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
        
        inline def setGlyphAnchor(value: PointExpression): Self = StObject.set(x, "glyphAnchor", value.asInstanceOf[js.Any])
        
        inline def setGlyphAnchorUndefined: Self = StObject.set(x, "glyphAnchor", js.undefined)
        
        inline def setGlyphColor(value: String): Self = StObject.set(x, "glyphColor", value.asInstanceOf[js.Any])
        
        inline def setGlyphColorUndefined: Self = StObject.set(x, "glyphColor", js.undefined)
        
        inline def setGlyphSize(value: String): Self = StObject.set(x, "glyphSize", value.asInstanceOf[js.Any])
        
        inline def setGlyphSizeUndefined: Self = StObject.set(x, "glyphSize", js.undefined)
        
        inline def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
        
        inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      }
    }
  }
  
  object icon {
    
    @JSImport("leaflet", "icon")
    @js.native
    val ^ : js.Any = js.native
    
    inline def glyph(): Glyph = ^.asInstanceOf[js.Dynamic].applyDynamic("glyph")().asInstanceOf[Glyph]
    inline def glyph(options: GlyphIconOptions): Glyph = ^.asInstanceOf[js.Dynamic].applyDynamic("glyph")(options.asInstanceOf[js.Any]).asInstanceOf[Glyph]
    inline def glyph(options: GlyphOptions): Glyph = ^.asInstanceOf[js.Dynamic].applyDynamic("glyph")(options.asInstanceOf[js.Any]).asInstanceOf[Glyph]
  }
}
