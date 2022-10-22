package typingsJapgolly.meteor

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.meteor.Meteor.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HTTP {
  
  type AsyncCallback = js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[HTTPResponse], Unit]
  
  trait HTTPRequest extends StObject {
    
    var auth: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var followRedirects: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var params: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var query: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object HTTPRequest {
    
    inline def apply(): HTTPRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HTTPRequest]
    }
    
    extension [Self <: HTTPRequest](x: Self) {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      inline def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait HTTPResponse extends StObject {
    
    var content: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var statusCode: js.UndefOr[Double] = js.undefined
  }
  object HTTPResponse {
    
    inline def apply(): HTTPResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HTTPResponse]
    }
    
    extension [Self <: HTTPResponse](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
}
