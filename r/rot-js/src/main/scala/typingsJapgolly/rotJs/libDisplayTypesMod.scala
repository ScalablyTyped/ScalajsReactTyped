package typingsJapgolly.rotJs

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLVideoElement
import typingsJapgolly.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDisplayTypesMod {
  
  type DisplayData = js.Tuple5[Double, Double, String | js.Array[String] | Null, String, String]
  
  trait DisplayOptions extends StObject {
    
    var bg: String
    
    var border: Double
    
    var fg: String
    
    var fontFamily: String
    
    var fontSize: Double
    
    var fontStyle: String
    
    var forceSquareRatio: Boolean
    
    var height: Double
    
    var layout: LayoutType
    
    var spacing: Double
    
    var tileColorize: Boolean
    
    var tileHeight: Double
    
    var tileMap: StringDictionary[js.Tuple2[Double, Double]]
    
    var tileSet: Null | HTMLCanvasElement | HTMLImageElement | HTMLVideoElement | ImageBitmap
    
    var tileWidth: Double
    
    var transpose: Boolean
    
    var width: Double
  }
  object DisplayOptions {
    
    inline def apply(
      bg: String,
      border: Double,
      fg: String,
      fontFamily: String,
      fontSize: Double,
      fontStyle: String,
      forceSquareRatio: Boolean,
      height: Double,
      layout: LayoutType,
      spacing: Double,
      tileColorize: Boolean,
      tileHeight: Double,
      tileMap: StringDictionary[js.Tuple2[Double, Double]],
      tileWidth: Double,
      transpose: Boolean,
      width: Double
    ): DisplayOptions = {
      val __obj = js.Dynamic.literal(bg = bg.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], fg = fg.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], forceSquareRatio = forceSquareRatio.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], tileColorize = tileColorize.asInstanceOf[js.Any], tileHeight = tileHeight.asInstanceOf[js.Any], tileMap = tileMap.asInstanceOf[js.Any], tileWidth = tileWidth.asInstanceOf[js.Any], transpose = transpose.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], tileSet = null)
      __obj.asInstanceOf[DisplayOptions]
    }
    
    extension [Self <: DisplayOptions](x: Self) {
      
      inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBorder(value: Double): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setForceSquareRatio(value: Boolean): Self = StObject.set(x, "forceSquareRatio", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: LayoutType): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setTileColorize(value: Boolean): Self = StObject.set(x, "tileColorize", value.asInstanceOf[js.Any])
      
      inline def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
      
      inline def setTileMap(value: StringDictionary[js.Tuple2[Double, Double]]): Self = StObject.set(x, "tileMap", value.asInstanceOf[js.Any])
      
      inline def setTileSet(value: HTMLCanvasElement | HTMLImageElement | HTMLVideoElement | ImageBitmap): Self = StObject.set(x, "tileSet", value.asInstanceOf[js.Any])
      
      inline def setTileSetNull: Self = StObject.set(x, "tileSet", null)
      
      inline def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
      
      inline def setTranspose(value: Boolean): Self = StObject.set(x, "transpose", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rotJs.rotJsStrings.hex
    - typingsJapgolly.rotJs.rotJsStrings.rect
    - typingsJapgolly.rotJs.rotJsStrings.tile
    - typingsJapgolly.rotJs.rotJsStrings.`tile-gl`
    - typingsJapgolly.rotJs.rotJsStrings.term
  */
  trait LayoutType extends StObject
  object LayoutType {
    
    inline def hex: typingsJapgolly.rotJs.rotJsStrings.hex = "hex".asInstanceOf[typingsJapgolly.rotJs.rotJsStrings.hex]
    
    inline def rect: typingsJapgolly.rotJs.rotJsStrings.rect = "rect".asInstanceOf[typingsJapgolly.rotJs.rotJsStrings.rect]
    
    inline def term: typingsJapgolly.rotJs.rotJsStrings.term = "term".asInstanceOf[typingsJapgolly.rotJs.rotJsStrings.term]
    
    inline def tile: typingsJapgolly.rotJs.rotJsStrings.tile = "tile".asInstanceOf[typingsJapgolly.rotJs.rotJsStrings.tile]
    
    inline def `tile-gl`: typingsJapgolly.rotJs.rotJsStrings.`tile-gl` = "tile-gl".asInstanceOf[typingsJapgolly.rotJs.rotJsStrings.`tile-gl`]
  }
}
