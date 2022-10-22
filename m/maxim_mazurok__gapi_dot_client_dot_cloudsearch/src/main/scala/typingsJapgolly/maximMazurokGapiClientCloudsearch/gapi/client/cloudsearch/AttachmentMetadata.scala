package typingsJapgolly.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentMetadata extends StObject {
  
  var filename: js.UndefOr[String] = js.undefined
}
object AttachmentMetadata {
  
  inline def apply(): AttachmentMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentMetadata]
  }
  
  extension [Self <: AttachmentMetadata](x: Self) {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
  }
}
