package typingsJapgolly.mendixmodelsdk

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Blob
import typingsJapgolly.mendixmodelsdk.srcCommonMod.common.IErrorCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalTransportationMod {
  
  trait IRequestFileDownloadOptions extends StObject {
    
    var method: RequestMethod
    
    var url: String
  }
  object IRequestFileDownloadOptions {
    
    inline def apply(method: RequestMethod, url: String): IRequestFileDownloadOptions = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRequestFileDownloadOptions]
    }
    
    extension [Self <: IRequestFileDownloadOptions](x: Self) {
      
      inline def setMethod(value: RequestMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRequestMultipartBinaryFileUploadOptions extends StObject {
    
    var body: js.UndefOr[js.Object] = js.undefined
    
    var fileName: String | Blob
    
    var fileParameterName: String
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var method: RequestMethod
    
    var url: String
  }
  object IRequestMultipartBinaryFileUploadOptions {
    
    inline def apply(fileName: String | Blob, fileParameterName: String, method: RequestMethod, url: String): IRequestMultipartBinaryFileUploadOptions = {
      val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], fileParameterName = fileParameterName.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRequestMultipartBinaryFileUploadOptions]
    }
    
    extension [Self <: IRequestMultipartBinaryFileUploadOptions](x: Self) {
      
      inline def setBody(value: js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setFileName(value: String | Blob): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileParameterName(value: String): Self = StObject.set(x, "fileParameterName", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: RequestMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRequestOptions extends StObject {
    
    var body: js.UndefOr[js.Object] = js.undefined
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var longTimeout: js.UndefOr[Boolean] = js.undefined
    
    var method: RequestMethod
    
    var url: String
  }
  object IRequestOptions {
    
    inline def apply(method: RequestMethod, url: String): IRequestOptions = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRequestOptions]
    }
    
    extension [Self <: IRequestOptions](x: Self) {
      
      inline def setBody(value: js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setLongTimeout(value: Boolean): Self = StObject.set(x, "longTimeout", value.asInstanceOf[js.Any])
      
      inline def setLongTimeoutUndefined: Self = StObject.set(x, "longTimeout", js.undefined)
      
      inline def setMethod(value: RequestMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait IResponse extends StObject {
    
    var headers: StringDictionary[Any]
  }
  object IResponse {
    
    inline def apply(headers: StringDictionary[Any]): IResponse = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResponse]
    }
    
    extension [Self <: IResponse](x: Self) {
      
      inline def setHeaders(value: StringDictionary[Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  type IResponseCallback[T] = js.Function2[/* data */ T, /* response */ IResponse, Unit]
  
  trait ITransportation extends StObject {
    
    /**
      * Send a HTTP request, with specified method, url, data, success and failure callbacks.
      */
    def request[T](options: IRequestOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit
    
    def requestFileDownload[T](options: IRequestFileDownloadOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit
    
    def requestMultipartBinaryFileUpload[T](
      options: IRequestMultipartBinaryFileUploadOptions,
      success: IResponseCallback[T],
      failure: IErrorCallback
    ): Unit
    
    /**
      * Send a HTTP request that will be retried in case of network errors, with specified method, url, data, success and failure callbacks.
      */
    def retryableRequest[T](options: IRequestOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit
  }
  object ITransportation {
    
    inline def apply(
      request: (IRequestOptions, IResponseCallback[Any], IErrorCallback) => Callback,
      requestFileDownload: (IRequestFileDownloadOptions, IResponseCallback[Any], IErrorCallback) => Callback,
      requestMultipartBinaryFileUpload: (IRequestMultipartBinaryFileUploadOptions, IResponseCallback[Any], IErrorCallback) => Callback,
      retryableRequest: (IRequestOptions, IResponseCallback[Any], IErrorCallback) => Callback
    ): ITransportation = {
      val __obj = js.Dynamic.literal(request = js.Any.fromFunction3((t0: IRequestOptions, t1: IResponseCallback[Any], t2: IErrorCallback) => (request(t0, t1, t2)).runNow()), requestFileDownload = js.Any.fromFunction3((t0: IRequestFileDownloadOptions, t1: IResponseCallback[Any], t2: IErrorCallback) => (requestFileDownload(t0, t1, t2)).runNow()), requestMultipartBinaryFileUpload = js.Any.fromFunction3((t0: IRequestMultipartBinaryFileUploadOptions, t1: IResponseCallback[Any], t2: IErrorCallback) => (requestMultipartBinaryFileUpload(t0, t1, t2)).runNow()), retryableRequest = js.Any.fromFunction3((t0: IRequestOptions, t1: IResponseCallback[Any], t2: IErrorCallback) => (retryableRequest(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[ITransportation]
    }
    
    extension [Self <: ITransportation](x: Self) {
      
      inline def setRequest(value: (IRequestOptions, IResponseCallback[Any], IErrorCallback) => Callback): Self = StObject.set(x, "request", js.Any.fromFunction3((t0: IRequestOptions, t1: IResponseCallback[Any], t2: IErrorCallback) => (value(t0, t1, t2)).runNow()))
      
      inline def setRequestFileDownload(value: (IRequestFileDownloadOptions, IResponseCallback[Any], IErrorCallback) => Callback): Self = StObject.set(x, "requestFileDownload", js.Any.fromFunction3((t0: IRequestFileDownloadOptions, t1: IResponseCallback[Any], t2: IErrorCallback) => (value(t0, t1, t2)).runNow()))
      
      inline def setRequestMultipartBinaryFileUpload(
        value: (IRequestMultipartBinaryFileUploadOptions, IResponseCallback[Any], IErrorCallback) => Callback
      ): Self = StObject.set(x, "requestMultipartBinaryFileUpload", js.Any.fromFunction3((t0: IRequestMultipartBinaryFileUploadOptions, t1: IResponseCallback[Any], t2: IErrorCallback) => (value(t0, t1, t2)).runNow()))
      
      inline def setRetryableRequest(value: (IRequestOptions, IResponseCallback[Any], IErrorCallback) => Callback): Self = StObject.set(x, "retryableRequest", js.Any.fromFunction3((t0: IRequestOptions, t1: IResponseCallback[Any], t2: IErrorCallback) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.get
    - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.put
    - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.post
    - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.delete
  */
  trait RequestMethod extends StObject
  object RequestMethod {
    
    inline def delete: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.delete = "delete".asInstanceOf[typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.delete]
    
    inline def get: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.get = "get".asInstanceOf[typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.get]
    
    inline def post: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.post = "post".asInstanceOf[typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.post]
    
    inline def put: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.put = "put".asInstanceOf[typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.put]
  }
}
