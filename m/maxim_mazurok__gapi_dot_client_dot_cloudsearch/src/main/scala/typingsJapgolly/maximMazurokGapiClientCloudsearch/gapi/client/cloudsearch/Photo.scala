package typingsJapgolly.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Photo extends StObject {
  
  /** The URL of the photo. */
  var url: js.UndefOr[String] = js.undefined
}
object Photo {
  
  inline def apply(): Photo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Photo]
  }
  
  extension [Self <: Photo](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
