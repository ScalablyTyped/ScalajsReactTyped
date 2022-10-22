package typingsJapgolly.blissfuljs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.ProgressEvent
import typingsJapgolly.std.XMLHttpRequestUpload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Add extends StObject {
    
    def add(name: String, callback: js.Function): Unit
    
    def run(name: String, env: js.Object): Unit
  }
  object Add {
    
    inline def apply(add: (String, js.Function) => Callback, run: (String, js.Object) => Callback): Add = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2((t0: String, t1: js.Function) => (add(t0, t1)).runNow()), run = js.Any.fromFunction2((t0: String, t1: js.Object) => (run(t0, t1)).runNow()))
      __obj.asInstanceOf[Add]
    }
    
    extension [Self <: Add](x: Self) {
      
      inline def setAdd(value: (String, js.Function) => Callback): Self = StObject.set(x, "add", js.Any.fromFunction2((t0: String, t1: js.Function) => (value(t0, t1)).runNow()))
      
      inline def setRun(value: (String, js.Object) => Callback): Self = StObject.set(x, "run", js.Any.fromFunction2((t0: String, t1: js.Object) => (value(t0, t1)).runNow()))
    }
  }
  
  trait Data
    extends StObject
       with /* propertyName */ StringDictionary[Any] {
    
    var data: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var onreadystatechange: js.UndefOr[js.Function1[/* ev */ ProgressEvent, Any]] = js.undefined
    
    var readyState: js.UndefOr[Double] = js.undefined
    
    var response: js.UndefOr[Any] = js.undefined
    
    var responseBody: js.UndefOr[Any] = js.undefined
    
    var responseText: js.UndefOr[String] = js.undefined
    
    var responseType: js.UndefOr[String] = js.undefined
    
    var responseXML: js.UndefOr[Any] = js.undefined
    
    var status: js.UndefOr[Double] = js.undefined
    
    var statusText: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var upload: js.UndefOr[XMLHttpRequestUpload] = js.undefined
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object Data {
    
    inline def apply(): Data = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setOnreadystatechange(value: /* ev */ ProgressEvent => Any): Self = StObject.set(x, "onreadystatechange", js.Any.fromFunction1(value))
      
      inline def setOnreadystatechangeUndefined: Self = StObject.set(x, "onreadystatechange", js.undefined)
      
      inline def setReadyState(value: Double): Self = StObject.set(x, "readyState", value.asInstanceOf[js.Any])
      
      inline def setReadyStateUndefined: Self = StObject.set(x, "readyState", js.undefined)
      
      inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseBody(value: Any): Self = StObject.set(x, "responseBody", value.asInstanceOf[js.Any])
      
      inline def setResponseBodyUndefined: Self = StObject.set(x, "responseBody", js.undefined)
      
      inline def setResponseText(value: String): Self = StObject.set(x, "responseText", value.asInstanceOf[js.Any])
      
      inline def setResponseTextUndefined: Self = StObject.set(x, "responseText", js.undefined)
      
      inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      inline def setResponseXML(value: Any): Self = StObject.set(x, "responseXML", value.asInstanceOf[js.Any])
      
      inline def setResponseXMLUndefined: Self = StObject.set(x, "responseXML", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUpload(value: XMLHttpRequestUpload): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
      
      inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  trait DictpropertyName
    extends StObject
       with /* propertyName */ StringDictionary[Any] {
    
    var `abstract`: js.UndefOr[Boolean] = js.undefined
    
    var constructor: js.UndefOr[js.Function] = js.undefined
    
    var `extends`: js.UndefOr[js.Function] = js.undefined
    
    var `lazy`: js.UndefOr[js.Object] = js.undefined
    
    var live: js.UndefOr[js.Object] = js.undefined
    
    var static: js.UndefOr[js.Object] = js.undefined
  }
  object DictpropertyName {
    
    inline def apply(): DictpropertyName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DictpropertyName]
    }
    
    extension [Self <: DictpropertyName](x: Self) {
      
      inline def setAbstract(value: Boolean): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
      
      inline def setAbstractUndefined: Self = StObject.set(x, "abstract", js.undefined)
      
      inline def setConstructor(value: js.Function): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
      
      inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
      
      inline def setExtends(value: js.Function): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      inline def setLazy(value: js.Object): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setLive(value: js.Object): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
      
      inline def setLiveUndefined: Self = StObject.set(x, "live", js.undefined)
      
      inline def setStatic(value: js.Object): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    }
  }
}
