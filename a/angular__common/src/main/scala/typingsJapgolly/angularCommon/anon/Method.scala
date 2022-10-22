package typingsJapgolly.angularCommon.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularCommon.angularCommonStrings.arraybuffer
import typingsJapgolly.angularCommon.angularCommonStrings.blob
import typingsJapgolly.angularCommon.angularCommonStrings.json
import typingsJapgolly.angularCommon.angularCommonStrings.text
import typingsJapgolly.angularCommon.httpMod.HttpContext
import typingsJapgolly.angularCommon.httpMod.HttpHeaders
import typingsJapgolly.angularCommon.httpMod.HttpParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Method[T] extends StObject {
  
  var body: js.UndefOr[T | Null] = js.undefined
  
  var context: js.UndefOr[HttpContext] = js.undefined
  
  var headers: js.UndefOr[HttpHeaders] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var params: js.UndefOr[HttpParams] = js.undefined
  
  var reportProgress: js.UndefOr[Boolean] = js.undefined
  
  var responseType: js.UndefOr[arraybuffer | blob | json | text] = js.undefined
  
  var setHeaders: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
  
  var setParams: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object Method {
  
  inline def apply[T](): Method[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Method[T]]
  }
  
  extension [Self <: Method[?], T](x: Self & Method[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setContext(value: HttpContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setHeaders(value: HttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setParams(value: HttpParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setReportProgress(value: Boolean): Self = StObject.set(x, "reportProgress", value.asInstanceOf[js.Any])
    
    inline def setReportProgressUndefined: Self = StObject.set(x, "reportProgress", js.undefined)
    
    inline def setResponseType(value: arraybuffer | blob | json | text): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setSetHeaders(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "setHeaders", value.asInstanceOf[js.Any])
    
    inline def setSetHeadersUndefined: Self = StObject.set(x, "setHeaders", js.undefined)
    
    inline def setSetParams(value: StringDictionary[String]): Self = StObject.set(x, "setParams", value.asInstanceOf[js.Any])
    
    inline def setSetParamsUndefined: Self = StObject.set(x, "setParams", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
