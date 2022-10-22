package typingsJapgolly.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMapGlyphsResponse extends StObject {
  
  /**
    * The blob's content type.
    */
  var Blob: js.UndefOr[_Blob] = js.undefined
  
  /**
    * The map glyph content type. For example, application/octet-stream.
    */
  var ContentType: js.UndefOr[String] = js.undefined
}
object GetMapGlyphsResponse {
  
  inline def apply(): GetMapGlyphsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMapGlyphsResponse]
  }
  
  extension [Self <: GetMapGlyphsResponse](x: Self) {
    
    inline def setBlob(value: _Blob): Self = StObject.set(x, "Blob", value.asInstanceOf[js.Any])
    
    inline def setBlobUndefined: Self = StObject.set(x, "Blob", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
  }
}
