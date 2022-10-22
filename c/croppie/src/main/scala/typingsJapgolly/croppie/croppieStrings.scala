package typingsJapgolly.croppie

import typingsJapgolly.croppie.mod.CropType
import typingsJapgolly.croppie.mod.Format
import typingsJapgolly.croppie.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object croppieStrings {
  
  @js.native
  sealed trait base64
    extends StObject
       with Type
  inline def base64: base64 = "base64".asInstanceOf[base64]
  
  @js.native
  sealed trait blob
    extends StObject
       with Type
  inline def blob: blob = "blob".asInstanceOf[blob]
  
  @js.native
  sealed trait canvas
    extends StObject
       with Type
  inline def canvas: canvas = "canvas".asInstanceOf[canvas]
  
  @js.native
  sealed trait circle
    extends StObject
       with CropType
  inline def circle: circle = "circle".asInstanceOf[circle]
  
  @js.native
  sealed trait ctrl extends StObject
  inline def ctrl: ctrl = "ctrl".asInstanceOf[ctrl]
  
  @js.native
  sealed trait html
    extends StObject
       with Type
  inline def html: html = "html".asInstanceOf[html]
  
  @js.native
  sealed trait jpeg
    extends StObject
       with Format
  inline def jpeg: jpeg = "jpeg".asInstanceOf[jpeg]
  
  @js.native
  sealed trait original extends StObject
  inline def original: original = "original".asInstanceOf[original]
  
  @js.native
  sealed trait png
    extends StObject
       with Format
  inline def png: png = "png".asInstanceOf[png]
  
  @js.native
  sealed trait rawcanvas
    extends StObject
       with Type
  inline def rawcanvas: rawcanvas = "rawcanvas".asInstanceOf[rawcanvas]
  
  @js.native
  sealed trait square
    extends StObject
       with CropType
  inline def square: square = "square".asInstanceOf[square]
  
  @js.native
  sealed trait viewport extends StObject
  inline def viewport: viewport = "viewport".asInstanceOf[viewport]
  
  @js.native
  sealed trait webp
    extends StObject
       with Format
  inline def webp: webp = "webp".asInstanceOf[webp]
}
