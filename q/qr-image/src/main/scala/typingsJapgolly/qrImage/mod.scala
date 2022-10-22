package typingsJapgolly.qrImage

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("qr-image", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def image(text: String): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("image")(text.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  inline def image(text: String, level: ecLevel): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(text.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def image(text: String, options: Options): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  
  inline def imageSync(text: String): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("imageSync")(text.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
  inline def imageSync(text: String, level: ecLevel): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("imageSync")(text.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def imageSync(text: String, options: Options): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("imageSync")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  
  inline def imageSync_Buffer(text: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("imageSync")(text.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def matrix(text: String): js.Array[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("matrix")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Any]]]
  inline def matrix(text: String, level: ecLevel): js.Array[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matrix")(text.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Any]]]
  
  inline def svgObject(text: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("svgObject")(text.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def svgObject(text: String, level: ecLevel): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("svgObject")(text.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def svgObject(text: String, options: Options): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("svgObject")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait Bitmap extends StObject {
    
    /**
      * @summary
      * Buffer with image data. It's a linear representation
      * of image in format:
      *
      * @example
      * <00> <xx> <xx> ..        <xx>
      * <00> <xx> <xx> ..        <xx>
      * ..
      * <00> <xx> <xx> ..        <xx>
      * ^    | size number of bytes |
      * \ do not modify. Must be 00
      *
      * @description
      * Each `<xx>` is a pixel of image.
      * It's value `0` — black, `255` — white, everything between are shades of gray.
      */
    var data: Buffer
    
    /**
      * width (and height) of resulting image in pixels
      */
    var size: Double
  }
  object Bitmap {
    
    inline def apply(data: Buffer, size: Double): Bitmap = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bitmap]
    }
    
    extension [Self <: Bitmap](x: Self) {
      
      inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * (only png) — function to customize qr bitmap before encoding to PNG
      */
    var customize: js.UndefOr[js.Function1[/* bitmap */ Bitmap, Unit]] = js.undefined
    
    // error correction level. One of L, M, Q, H. Default M.
    var ec_level: js.UndefOr[ecLevel] = js.undefined
    
    // (only png)for png and 1 for others.-white space around QR image in modules.
    var margin: js.UndefOr[Double] = js.undefined
    
    // (experimental, default false) try to optimize QR-code for URLs.
    var parse_url: js.UndefOr[Boolean] = js.undefined
    
    // (png and svg only) for png and undefined for svg.-(png and svg only) — size of one module in pixels.
    var size: js.UndefOr[Double] = js.undefined
    
    // image type. Possible values png(default), svg, pdf and eps.
    var `type`: js.UndefOr[imageType] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCustomize(value: /* bitmap */ Bitmap => Callback): Self = StObject.set(x, "customize", js.Any.fromFunction1((t0: /* bitmap */ Bitmap) => value(t0).runNow()))
      
      inline def setCustomizeUndefined: Self = StObject.set(x, "customize", js.undefined)
      
      inline def setEc_level(value: ecLevel): Self = StObject.set(x, "ec_level", value.asInstanceOf[js.Any])
      
      inline def setEc_levelUndefined: Self = StObject.set(x, "ec_level", js.undefined)
      
      inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setParse_url(value: Boolean): Self = StObject.set(x, "parse_url", value.asInstanceOf[js.Any])
      
      inline def setParse_urlUndefined: Self = StObject.set(x, "parse_url", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: imageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.qrImage.qrImageStrings.L
    - typingsJapgolly.qrImage.qrImageStrings.M
    - typingsJapgolly.qrImage.qrImageStrings.Q
    - typingsJapgolly.qrImage.qrImageStrings.H
  */
  trait ecLevel extends StObject
  object ecLevel {
    
    inline def H: typingsJapgolly.qrImage.qrImageStrings.H = "H".asInstanceOf[typingsJapgolly.qrImage.qrImageStrings.H]
    
    inline def L: typingsJapgolly.qrImage.qrImageStrings.L = "L".asInstanceOf[typingsJapgolly.qrImage.qrImageStrings.L]
    
    inline def M: typingsJapgolly.qrImage.qrImageStrings.M = "M".asInstanceOf[typingsJapgolly.qrImage.qrImageStrings.M]
    
    inline def Q: typingsJapgolly.qrImage.qrImageStrings.Q = "Q".asInstanceOf[typingsJapgolly.qrImage.qrImageStrings.Q]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.qrImage.qrImageStrings.png
    - typingsJapgolly.qrImage.qrImageStrings.svg
    - typingsJapgolly.qrImage.qrImageStrings.pdf
    - typingsJapgolly.qrImage.qrImageStrings.eps
  */
  trait imageType extends StObject
  object imageType {
    
    inline def eps: typingsJapgolly.qrImage.qrImageStrings.eps = "eps".asInstanceOf[typingsJapgolly.qrImage.qrImageStrings.eps]
    
    inline def pdf: typingsJapgolly.qrImage.qrImageStrings.pdf = "pdf".asInstanceOf[typingsJapgolly.qrImage.qrImageStrings.pdf]
    
    inline def png: typingsJapgolly.qrImage.qrImageStrings.png = "png".asInstanceOf[typingsJapgolly.qrImage.qrImageStrings.png]
    
    inline def svg: typingsJapgolly.qrImage.qrImageStrings.svg = "svg".asInstanceOf[typingsJapgolly.qrImage.qrImageStrings.svg]
  }
}
