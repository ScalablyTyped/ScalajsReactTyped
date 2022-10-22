package typingsJapgolly.expoImageUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildImageDottypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.input
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.jpeg
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.jpg
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.png
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.raw
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.tiff
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.webp
  */
  trait ImageFormat extends StObject
  object ImageFormat {
    
    inline def input: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.input = "input".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.input]
    
    inline def jpeg: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.jpeg = "jpeg".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.jpeg]
    
    inline def jpg: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.jpg = "jpg".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.jpg]
    
    inline def png: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.png = "png".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.png]
    
    inline def raw: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.raw = "raw".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.raw]
    
    inline def tiff: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.tiff = "tiff".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.tiff]
    
    inline def webp: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.webp = "webp".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.webp]
  }
  
  trait ImageOptions extends StObject {
    
    var backgroundColor: String
    
    var borderRadius: js.UndefOr[Double] = js.undefined
    
    var height: Double
    
    var name: js.UndefOr[String] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var removeTransparency: js.UndefOr[Boolean] = js.undefined
    
    var resizeMode: ResizeMode
    
    var src: String
    
    var width: Double
  }
  object ImageOptions {
    
    inline def apply(backgroundColor: String, height: Double, resizeMode: ResizeMode, src: String, width: Double): ImageOptions = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], resizeMode = resizeMode.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageOptions]
    }
    
    extension [Self <: ImageOptions](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setRemoveTransparency(value: Boolean): Self = StObject.set(x, "removeTransparency", value.asInstanceOf[js.Any])
      
      inline def setRemoveTransparencyUndefined: Self = StObject.set(x, "removeTransparency", js.undefined)
      
      inline def setResizeMode(value: ResizeMode): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.contain
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.cover
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.fill
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.inside
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.outside
  */
  trait ResizeMode extends StObject
  object ResizeMode {
    
    inline def contain: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.contain = "contain".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.contain]
    
    inline def cover: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.cover = "cover".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.cover]
    
    inline def fill: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.fill = "fill".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.fill]
    
    inline def inside: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.inside = "inside".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.inside]
    
    inline def outside: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.outside = "outside".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.outside]
  }
}
