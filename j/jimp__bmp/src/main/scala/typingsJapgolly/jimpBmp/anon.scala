package typingsJapgolly.jimpBmp

import typingsJapgolly.jimpBmp.jimpBmpStrings.`imageSlashx-ms-bmp`
import typingsJapgolly.jimpBmp.jimpBmpStrings.imageSlashbmp
import typingsJapgolly.jimpCore.typesEtcMod.Bitmap
import typingsJapgolly.jimpCore.typesEtcMod.DecoderFn
import typingsJapgolly.jimpCore.typesEtcMod.EncoderFn
import typingsJapgolly.jimpCore.typesEtcMod.Image
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Imagebmp extends StObject {
    
    @JSName("image/bmp")
    var imageSlashbmp: js.Array[String]
  }
  object Imagebmp {
    
    inline def apply(imageSlashbmp: js.Array[String]): Imagebmp = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("image/bmp")(imageSlashbmp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Imagebmp]
    }
    
    extension [Self <: Imagebmp](x: Self) {
      
      inline def setImageSlashbmp(value: js.Array[String]): Self = StObject.set(x, "image/bmp", value.asInstanceOf[js.Any])
      
      inline def setImageSlashbmpVarargs(value: String*): Self = StObject.set(x, "image/bmp", js.Array(value*))
    }
  }
  
  trait ImagebmpImagexmsbmp extends StObject {
    
    @JSName("image/bmp")
    def imageSlashbmp(image: Image): Buffer
    @JSName("image/bmp")
    var imageSlashbmp_Original: EncoderFn[Image]
    
    @JSName("image/x-ms-bmp")
    def `imageSlashx-ms-bmp`(image: Image): Buffer
    @JSName("image/x-ms-bmp")
    var `imageSlashx-ms-bmp_Original`: EncoderFn[Image]
  }
  object ImagebmpImagexmsbmp {
    
    inline def apply(imageSlashbmp: Image => Buffer, `imageSlashx-ms-bmp`: Image => Buffer): ImagebmpImagexmsbmp = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("image/bmp")(js.Any.fromFunction1(imageSlashbmp))
      __obj.updateDynamic("image/x-ms-bmp")(js.Any.fromFunction1(`imageSlashx-ms-bmp`))
      __obj.asInstanceOf[ImagebmpImagexmsbmp]
    }
    
    extension [Self <: ImagebmpImagexmsbmp](x: Self) {
      
      inline def setImageSlashbmp(value: Image => Buffer): Self = StObject.set(x, "image/bmp", js.Any.fromFunction1(value))
      
      inline def `setImageSlashx-ms-bmp`(value: Image => Buffer): Self = StObject.set(x, "image/x-ms-bmp", js.Any.fromFunction1(value))
    }
  }
  
  trait Imagexmsbmp extends StObject {
    
    @JSName("image/bmp")
    def imageSlashbmp(data: Buffer): Bitmap
    @JSName("image/bmp")
    var imageSlashbmp_Original: DecoderFn
    
    @JSName("image/x-ms-bmp")
    def `imageSlashx-ms-bmp`(data: Buffer): Bitmap
    @JSName("image/x-ms-bmp")
    var `imageSlashx-ms-bmp_Original`: DecoderFn
  }
  object Imagexmsbmp {
    
    inline def apply(imageSlashbmp: /* data */ Buffer => Bitmap, `imageSlashx-ms-bmp`: /* data */ Buffer => Bitmap): Imagexmsbmp = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("image/bmp")(js.Any.fromFunction1(imageSlashbmp))
      __obj.updateDynamic("image/x-ms-bmp")(js.Any.fromFunction1(`imageSlashx-ms-bmp`))
      __obj.asInstanceOf[Imagexmsbmp]
    }
    
    extension [Self <: Imagexmsbmp](x: Self) {
      
      inline def setImageSlashbmp(value: /* data */ Buffer => Bitmap): Self = StObject.set(x, "image/bmp", js.Any.fromFunction1(value))
      
      inline def `setImageSlashx-ms-bmp`(value: /* data */ Buffer => Bitmap): Self = StObject.set(x, "image/x-ms-bmp", js.Any.fromFunction1(value))
    }
  }
  
  trait MIMEBMP extends StObject {
    
    var MIME_BMP: imageSlashbmp
    
    var MIME_X_MS_BMP: `imageSlashx-ms-bmp`
  }
  object MIMEBMP {
    
    inline def apply(): MIMEBMP = {
      val __obj = js.Dynamic.literal(MIME_BMP = "image/bmp", MIME_X_MS_BMP = "image/x-ms-bmp")
      __obj.asInstanceOf[MIMEBMP]
    }
    
    extension [Self <: MIMEBMP](x: Self) {
      
      inline def setMIME_BMP(value: imageSlashbmp): Self = StObject.set(x, "MIME_BMP", value.asInstanceOf[js.Any])
      
      inline def setMIME_X_MS_BMP(value: `imageSlashx-ms-bmp`): Self = StObject.set(x, "MIME_X_MS_BMP", value.asInstanceOf[js.Any])
    }
  }
}
