package typingsJapgolly.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrawledUrl extends StObject {
  
  /** Output only. The body of the request that was used to visit the URL. */
  var body: js.UndefOr[String] = js.undefined
  
  /** Output only. The http method of the request that was used to visit the URL, in uppercase. */
  var httpMethod: js.UndefOr[String] = js.undefined
  
  /** Output only. The URL that was crawled. */
  var url: js.UndefOr[String] = js.undefined
}
object CrawledUrl {
  
  inline def apply(): CrawledUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrawledUrl]
  }
  
  extension [Self <: CrawledUrl](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    inline def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
