package typingsJapgolly.awsSdkMiddlewareSerde

import org.scalajs.dom.URL
import typingsJapgolly.awsSdkTypes.distTypesHttpMod.Endpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait UrlParser extends StObject {
    
    var urlParser: js.UndefOr[typingsJapgolly.awsSdkTypes.distTypesUtilMod.UrlParser] = js.undefined
  }
  object UrlParser {
    
    inline def apply(): UrlParser = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlParser]
    }
    
    extension [Self <: UrlParser](x: Self) {
      
      inline def setUrlParser(value: /* url */ String | URL => Endpoint): Self = StObject.set(x, "urlParser", js.Any.fromFunction1(value))
      
      inline def setUrlParserUndefined: Self = StObject.set(x, "urlParser", js.undefined)
    }
  }
}
