package typingsJapgolly.openseadragon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  var Format: String
  
  var Overlap: String
  
  var Size: Width
  
  var TileSize: String
  
  var Url: String
  
  var xmlns: js.UndefOr[String] = js.undefined
}
object Format {
  
  inline def apply(Format: String, Overlap: String, Size: Width, TileSize: String, Url: String): Format = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any], Overlap = Overlap.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TileSize = TileSize.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
  
  extension [Self <: Format](x: Self) {
    
    inline def setFormat(value: String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setOverlap(value: String): Self = StObject.set(x, "Overlap", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Width): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setTileSize(value: String): Self = StObject.set(x, "TileSize", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setXmlns(value: String): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
    
    inline def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
  }
}
