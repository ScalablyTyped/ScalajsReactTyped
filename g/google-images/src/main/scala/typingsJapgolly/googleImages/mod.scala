package typingsJapgolly.googleImages

import typingsJapgolly.googleImages.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("google-images", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with GoogleImages {
    def this(engineId: String, apiKey: String) = this()
  }
  
  @js.native
  trait GoogleImages extends StObject {
    
    def search(searchTerm: String): js.Promise[js.Array[Image]] = js.native
    def search(searchTerm: String, options: SearchOptions): js.Promise[js.Array[Image]] = js.native
  }
  
  trait Image extends StObject {
    
    var height: Double
    
    var size: Double
    
    var thumbnail: Height
    
    var `type`: String
    
    var url: String
    
    var width: Double
  }
  object Image {
    
    inline def apply(height: Double, size: Double, thumbnail: Height, `type`: String, url: String, width: Double): Image = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    extension [Self <: Image](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setThumbnail(value: Height): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.googleImages.googleImagesStrings.color
    - typingsJapgolly.googleImages.googleImagesStrings.gray
    - typingsJapgolly.googleImages.googleImagesStrings.mono
  */
  trait SearchColorType extends StObject
  object SearchColorType {
    
    inline def color: typingsJapgolly.googleImages.googleImagesStrings.color = "color".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.color]
    
    inline def gray: typingsJapgolly.googleImages.googleImagesStrings.gray = "gray".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.gray]
    
    inline def mono: typingsJapgolly.googleImages.googleImagesStrings.mono = "mono".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.mono]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.googleImages.googleImagesStrings.black
    - typingsJapgolly.googleImages.googleImagesStrings.blue
    - typingsJapgolly.googleImages.googleImagesStrings.brown
    - typingsJapgolly.googleImages.googleImagesStrings.gray
    - typingsJapgolly.googleImages.googleImagesStrings.green
    - typingsJapgolly.googleImages.googleImagesStrings.pink
    - typingsJapgolly.googleImages.googleImagesStrings.purple
    - typingsJapgolly.googleImages.googleImagesStrings.teal
    - typingsJapgolly.googleImages.googleImagesStrings.white
    - typingsJapgolly.googleImages.googleImagesStrings.yellow
  */
  trait SearchDominantColor extends StObject
  object SearchDominantColor {
    
    inline def black: typingsJapgolly.googleImages.googleImagesStrings.black = "black".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.black]
    
    inline def blue: typingsJapgolly.googleImages.googleImagesStrings.blue = "blue".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.blue]
    
    inline def brown: typingsJapgolly.googleImages.googleImagesStrings.brown = "brown".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.brown]
    
    inline def gray: typingsJapgolly.googleImages.googleImagesStrings.gray = "gray".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.gray]
    
    inline def green: typingsJapgolly.googleImages.googleImagesStrings.green = "green".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.green]
    
    inline def pink: typingsJapgolly.googleImages.googleImagesStrings.pink = "pink".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.pink]
    
    inline def purple: typingsJapgolly.googleImages.googleImagesStrings.purple = "purple".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.purple]
    
    inline def teal: typingsJapgolly.googleImages.googleImagesStrings.teal = "teal".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.teal]
    
    inline def white: typingsJapgolly.googleImages.googleImagesStrings.white = "white".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.white]
    
    inline def yellow: typingsJapgolly.googleImages.googleImagesStrings.yellow = "yellow".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.yellow]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.googleImages.googleImagesStrings.icon
    - typingsJapgolly.googleImages.googleImagesStrings.small
    - typingsJapgolly.googleImages.googleImagesStrings.medium
    - typingsJapgolly.googleImages.googleImagesStrings.large
    - typingsJapgolly.googleImages.googleImagesStrings.xlarge
    - typingsJapgolly.googleImages.googleImagesStrings.xxlarge
    - typingsJapgolly.googleImages.googleImagesStrings.huge
  */
  trait SearchImageSize extends StObject
  object SearchImageSize {
    
    inline def huge: typingsJapgolly.googleImages.googleImagesStrings.huge = "huge".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.huge]
    
    inline def icon: typingsJapgolly.googleImages.googleImagesStrings.icon = "icon".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.icon]
    
    inline def large: typingsJapgolly.googleImages.googleImagesStrings.large = "large".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.large]
    
    inline def medium: typingsJapgolly.googleImages.googleImagesStrings.medium = "medium".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.medium]
    
    inline def small: typingsJapgolly.googleImages.googleImagesStrings.small = "small".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.small]
    
    inline def xlarge: typingsJapgolly.googleImages.googleImagesStrings.xlarge = "xlarge".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.xlarge]
    
    inline def xxlarge: typingsJapgolly.googleImages.googleImagesStrings.xxlarge = "xxlarge".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.xxlarge]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.googleImages.googleImagesStrings.clipart
    - typingsJapgolly.googleImages.googleImagesStrings.face
    - typingsJapgolly.googleImages.googleImagesStrings.lineart
    - typingsJapgolly.googleImages.googleImagesStrings.news
    - typingsJapgolly.googleImages.googleImagesStrings.photo
  */
  trait SearchImageType extends StObject
  object SearchImageType {
    
    inline def clipart: typingsJapgolly.googleImages.googleImagesStrings.clipart = "clipart".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.clipart]
    
    inline def face: typingsJapgolly.googleImages.googleImagesStrings.face = "face".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.face]
    
    inline def lineart: typingsJapgolly.googleImages.googleImagesStrings.lineart = "lineart".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.lineart]
    
    inline def news: typingsJapgolly.googleImages.googleImagesStrings.news = "news".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.news]
    
    inline def photo: typingsJapgolly.googleImages.googleImagesStrings.photo = "photo".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.photo]
  }
  
  trait SearchOptions extends StObject {
    
    var colorType: js.UndefOr[SearchColorType] = js.undefined
    
    var dominantColor: js.UndefOr[SearchDominantColor] = js.undefined
    
    var page: js.UndefOr[Double] = js.undefined
    
    var safe: js.UndefOr[SearchSafe] = js.undefined
    
    var size: js.UndefOr[SearchImageSize] = js.undefined
    
    var `type`: js.UndefOr[SearchImageType] = js.undefined
  }
  object SearchOptions {
    
    inline def apply(): SearchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchOptions]
    }
    
    extension [Self <: SearchOptions](x: Self) {
      
      inline def setColorType(value: SearchColorType): Self = StObject.set(x, "colorType", value.asInstanceOf[js.Any])
      
      inline def setColorTypeUndefined: Self = StObject.set(x, "colorType", js.undefined)
      
      inline def setDominantColor(value: SearchDominantColor): Self = StObject.set(x, "dominantColor", value.asInstanceOf[js.Any])
      
      inline def setDominantColorUndefined: Self = StObject.set(x, "dominantColor", js.undefined)
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setSafe(value: SearchSafe): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
      
      inline def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
      
      inline def setSize(value: SearchImageSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: SearchImageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.googleImages.googleImagesStrings.high
    - typingsJapgolly.googleImages.googleImagesStrings.medium
    - typingsJapgolly.googleImages.googleImagesStrings.off
  */
  trait SearchSafe extends StObject
  object SearchSafe {
    
    inline def high: typingsJapgolly.googleImages.googleImagesStrings.high = "high".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.high]
    
    inline def medium: typingsJapgolly.googleImages.googleImagesStrings.medium = "medium".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.medium]
    
    inline def off: typingsJapgolly.googleImages.googleImagesStrings.off = "off".asInstanceOf[typingsJapgolly.googleImages.googleImagesStrings.off]
  }
}
