package typingsJapgolly.angularCommon.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularCommon.angularCommonStrings.events
import typingsJapgolly.angularCommon.angularCommonStrings.text
import typingsJapgolly.angularCommon.httpMod.HttpContext
import typingsJapgolly.angularCommon.httpMod.HttpHeaders
import typingsJapgolly.angularCommon.httpMod.HttpParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextHeadersObserveParamsReportProgressResponseTypeWithCredentials extends StObject {
  
  var context: js.UndefOr[HttpContext] = js.undefined
  
  var headers: js.UndefOr[HttpHeaders | (StringDictionary[String | js.Array[String]])] = js.undefined
  
  var observe: events
  
  var params: js.UndefOr[
    HttpParams | (StringDictionary[String | Double | Boolean | (js.Array[String | Double | Boolean])])
  ] = js.undefined
  
  var reportProgress: js.UndefOr[Boolean] = js.undefined
  
  var responseType: text
  
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object ContextHeadersObserveParamsReportProgressResponseTypeWithCredentials {
  
  inline def apply(): ContextHeadersObserveParamsReportProgressResponseTypeWithCredentials = {
    val __obj = js.Dynamic.literal(observe = "events", responseType = "text")
    __obj.asInstanceOf[ContextHeadersObserveParamsReportProgressResponseTypeWithCredentials]
  }
  
  extension [Self <: ContextHeadersObserveParamsReportProgressResponseTypeWithCredentials](x: Self) {
    
    inline def setContext(value: HttpContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setHeaders(value: HttpHeaders | (StringDictionary[String | js.Array[String]])): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setObserve(value: events): Self = StObject.set(x, "observe", value.asInstanceOf[js.Any])
    
    inline def setParams(
      value: HttpParams | (StringDictionary[String | Double | Boolean | (js.Array[String | Double | Boolean])])
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setReportProgress(value: Boolean): Self = StObject.set(x, "reportProgress", value.asInstanceOf[js.Any])
    
    inline def setReportProgressUndefined: Self = StObject.set(x, "reportProgress", js.undefined)
    
    inline def setResponseType(value: text): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
