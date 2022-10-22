package typingsJapgolly.resizeImg

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(input: Buffer): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def apply(input: Buffer, options: ResizeImgOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  @JSImport("resize-img", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.resizeImg.resizeImgStrings.bmp
    - typingsJapgolly.resizeImg.resizeImgStrings.jpg
    - typingsJapgolly.resizeImg.resizeImgStrings.png
  */
  trait Formats extends StObject
  object Formats {
    
    inline def bmp: typingsJapgolly.resizeImg.resizeImgStrings.bmp = "bmp".asInstanceOf[typingsJapgolly.resizeImg.resizeImgStrings.bmp]
    
    inline def jpg: typingsJapgolly.resizeImg.resizeImgStrings.jpg = "jpg".asInstanceOf[typingsJapgolly.resizeImg.resizeImgStrings.jpg]
    
    inline def png: typingsJapgolly.resizeImg.resizeImgStrings.png = "png".asInstanceOf[typingsJapgolly.resizeImg.resizeImgStrings.png]
  }
  
  trait ResizeImgOptions extends StObject {
    
    var format: js.UndefOr[Formats] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ResizeImgOptions {
    
    inline def apply(): ResizeImgOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeImgOptions]
    }
    
    extension [Self <: ResizeImgOptions](x: Self) {
      
      inline def setFormat(value: Formats): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
