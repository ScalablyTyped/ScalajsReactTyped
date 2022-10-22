package typingsJapgolly.imageType

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("image-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(input: js.typedarray.Uint8Array): js.Promise[js.UndefOr[ImageTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[ImageTypeResult]]]
  inline def default(input: Buffer): js.Promise[js.UndefOr[ImageTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[ImageTypeResult]]]
  
  @JSImport("image-type", "minimumBytes")
  @js.native
  val minimumBytes: Double = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.imageType.imageTypeStrings.jpg
    - typingsJapgolly.imageType.imageTypeStrings.png
    - typingsJapgolly.imageType.imageTypeStrings.gif
    - typingsJapgolly.imageType.imageTypeStrings.webp
    - typingsJapgolly.imageType.imageTypeStrings.flif
    - typingsJapgolly.imageType.imageTypeStrings.cr2
    - typingsJapgolly.imageType.imageTypeStrings.tif
    - typingsJapgolly.imageType.imageTypeStrings.bmp
    - typingsJapgolly.imageType.imageTypeStrings.jxr
    - typingsJapgolly.imageType.imageTypeStrings.psd
    - typingsJapgolly.imageType.imageTypeStrings.ico
    - typingsJapgolly.imageType.imageTypeStrings.bpg
    - typingsJapgolly.imageType.imageTypeStrings.jp2
    - typingsJapgolly.imageType.imageTypeStrings.jpm
    - typingsJapgolly.imageType.imageTypeStrings.jpx
    - typingsJapgolly.imageType.imageTypeStrings.heic
    - typingsJapgolly.imageType.imageTypeStrings.cur
    - typingsJapgolly.imageType.imageTypeStrings.dcm
    - typingsJapgolly.imageType.imageTypeStrings.avif
  */
  trait ImageFileExtension extends StObject
  object ImageFileExtension {
    
    inline def avif: typingsJapgolly.imageType.imageTypeStrings.avif = "avif".asInstanceOf[typingsJapgolly.imageType.imageTypeStrings.avif]
    
    inline def bmp: typingsJapgolly.imageType.imageTypeStrings.bmp = "bmp".asInstanceOf[typingsJapgolly.imageType.imageTypeStrings.bmp]
    
    inline def bpg: typingsJapgolly.imageType.imageTypeStrings.bpg = "bpg".asInstanceOf[typingsJapgolly.imageType.imageTypeStrings.bpg]
    
    inline def cr2: typingsJapgolly.imageType.imageTypeStrings.cr2 = "cr2".asInstanceOf[typingsJapgolly.imageType.imageTypeStrings.cr2]
    
    inline def cur: typingsJapgolly.imageType.imageTypeStrings.cur = "cur".asInstanceOf[typingsJapgolly.imageType.imageTypeStrings.cur]
    
    inline def dcm: typingsJapgolly.imageType.imageTypeStrings.dcm = "dcm".asInstanceOf[typingsJapgolly.imageType.imageTypeStrings.dcm]
    
    inline def flif: typingsJapgolly.imageType.imageTypeStrings.flif = "flif".asInstanceOf[typingsJapgolly.imageType.imageTypeStrings.flif]
    
    inline def gif: typingsJapgolly.imageType.imageTypeStrings.gif = "gif".asInstanceOf[typingsJapgolly.imageType.imageTypeStrings.gif]
    
    inline def heic: typingsJapgolly.imageType.imageTypeStrings.heic = "heic".asInstanceOf[typingsJapgolly.imageType.imageTypeStrings.heic]
    
    inline def ico: typingsJapgolly.imageType.imageTypeStrings.ico = "ico".asInstanceOf[typingsJapgolly.imageType.imageTypeStrings.ico]
    
    inline def jp2: typingsJapgolly.imageType.imageTypeStrings.jp2 = "jp2".asInstanceOf[typingsJapgolly.imageType.imageTypeStrings.jp2]
    
    inline def jpg: typingsJapgolly.imageType.imageTypeStrings.jpg = "jpg".asInstanceOf[typingsJapgolly.imageType.imageTypeStrings.jpg]
    
    inline def jpm: typingsJapgolly.imageType.imageTypeStrings.jpm = "jpm".asInstanceOf[typingsJapgolly.imageType.imageTypeStrings.jpm]
    
    inline def jpx: typingsJapgolly.imageType.imageTypeStrings.jpx = "jpx".asInstanceOf[typingsJapgolly.imageType.imageTypeStrings.jpx]
    
    inline def jxr: typingsJapgolly.imageType.imageTypeStrings.jxr = "jxr".asInstanceOf[typingsJapgolly.imageType.imageTypeStrings.jxr]
    
    inline def png: typingsJapgolly.imageType.imageTypeStrings.png = "png".asInstanceOf[typingsJapgolly.imageType.imageTypeStrings.png]
    
    inline def psd: typingsJapgolly.imageType.imageTypeStrings.psd = "psd".asInstanceOf[typingsJapgolly.imageType.imageTypeStrings.psd]
    
    inline def tif: typingsJapgolly.imageType.imageTypeStrings.tif = "tif".asInstanceOf[typingsJapgolly.imageType.imageTypeStrings.tif]
    
    inline def webp: typingsJapgolly.imageType.imageTypeStrings.webp = "webp".asInstanceOf[typingsJapgolly.imageType.imageTypeStrings.webp]
  }
  
  trait ImageTypeResult extends StObject {
    
    /**
    	One of the supported [file types](https://github.com/sindresorhus/image-type#supported-file-types).
    	*/
    var ext: ImageFileExtension
    
    /**
    	The detected [MIME type](https://en.wikipedia.org/wiki/Internet_media_type).
    	*/
    var mime: String
  }
  object ImageTypeResult {
    
    inline def apply(ext: ImageFileExtension, mime: String): ImageTypeResult = {
      val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageTypeResult]
    }
    
    extension [Self <: ImageTypeResult](x: Self) {
      
      inline def setExt(value: ImageFileExtension): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    }
  }
}
