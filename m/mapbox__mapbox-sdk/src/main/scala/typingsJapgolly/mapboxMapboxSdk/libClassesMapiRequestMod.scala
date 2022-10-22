package typingsJapgolly.mapboxMapboxSdk

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Blob
import org.scalajs.dom.ProgressEvent
import typingsJapgolly.mapboxMapboxSdk.libClassesMapiClientMod.default
import typingsJapgolly.mapboxMapboxSdk.libClassesMapiErrorMod.MapiError
import typingsJapgolly.mapboxMapboxSdk.libClassesMapiResponseMod.MapiResponse
import typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.data
import typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.form
import typingsJapgolly.node.processMod.global.NodeJS.ReadStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassesMapiRequestMod {
  
  type Coordinates = js.Tuple2[Double, Double]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.unrestricted
    - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.curb
  */
  trait DirectionsApproach extends StObject
  object DirectionsApproach {
    
    inline def curb: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.curb = "curb".asInstanceOf[typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.curb]
    
    inline def unrestricted: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.unrestricted = "unrestricted".asInstanceOf[typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.unrestricted]
  }
  
  trait EventEmitter[T] extends StObject {
    
    var downloadProgress: ProgressEvent
    
    var error: MapiError[T]
    
    var response: MapiResponse[T]
    
    var uploadProgress: ProgressEvent
  }
  object EventEmitter {
    
    inline def apply[T](
      downloadProgress: ProgressEvent,
      error: MapiError[T],
      response: MapiResponse[T],
      uploadProgress: ProgressEvent
    ): EventEmitter[T] = {
      val __obj = js.Dynamic.literal(downloadProgress = downloadProgress.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], uploadProgress = uploadProgress.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventEmitter[T]]
    }
    
    extension [Self <: EventEmitter[?], T](x: Self & EventEmitter[T]) {
      
      inline def setDownloadProgress(value: ProgressEvent): Self = StObject.set(x, "downloadProgress", value.asInstanceOf[js.Any])
      
      inline def setError(value: MapiError[T]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: MapiResponse[T]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setUploadProgress(value: ProgressEvent): Self = StObject.set(x, "uploadProgress", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.driving
    - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.walking
    - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.cycling
    - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.`driving-traffic`
  */
  trait MapboxProfile extends StObject
  object MapboxProfile {
    
    inline def cycling: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.cycling = "cycling".asInstanceOf[typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.cycling]
    
    inline def driving: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.driving = "driving".asInstanceOf[typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.driving]
    
    inline def `driving-traffic`: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.`driving-traffic` = "driving-traffic".asInstanceOf[typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.`driving-traffic`]
    
    inline def walking: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.walking = "walking".asInstanceOf[typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.walking]
  }
  
  @js.native
  trait MapiRequest[T]
    extends StObject
       with MapiRequestOptions {
    
    def abort(): Unit = js.native
    
    /**
      * If the request has been aborted (via abort), this property will be true.
      */
    var aborted: Boolean = js.native
    
    /**
      * This request's MapiClient.
      */
    var client: default = js.native
    
    def eachPage(callback: PageCallbackFunction[T]): Unit = js.native
    
    /**
      * An event emitter.
      */
    var emitter: EventEmitter[T] = js.native
    
    /**
      * If this request has been sent and received an error in response, the error is available on this property.
      */
    var error: js.UndefOr[MapiError[T] | js.Error] = js.native
    
    /**
      * If this request has been sent and received a response, the response is available on this property.
      */
    var response: js.UndefOr[MapiResponse[T]] = js.native
    
    def send(): js.Promise[MapiResponse[T]] = js.native
    
    /**
      * If the request has been sent, this property will be true.
      * You cannot send the same request twice, so if you need to create a new request
      * that is the equivalent of an existing one, use clone.
      */
    var sent: Boolean = js.native
    
    def url(): String = js.native
    def url(accessToken: String): String = js.native
  }
  
  trait MapiRequestOptions extends StObject {
    
    /**
      * Data to send with the request. If the request has a body, it will also be sent with the header 'Content-Type: application/json'.
      */
    var body: js.UndefOr[Any] = js.undefined
    
    /**
      * The encoding of the response.
      */
    var encoding: String
    
    /**
      * A file to send with the request. The browser client accepts Blobs and ArrayBuffers.
      */
    var file: Blob | js.typedarray.ArrayBuffer | String | ReadStream
    
    /**
      * The request's headers.
      */
    var headers: Any
    
    /**
      * The request's HTTP method.
      */
    var method: String
    
    /**
      * The request's origin.
      */
    var origin: String
    
    /**
      * A route parameters object, whose values will be interpolated the path.
      */
    var params: Any
    
    /**
      * The request's path, including colon-prefixed route parameters.
      */
    var path: String
    
    /**
      * A query object, which will be transformed into a URL query string.
      */
    var query: Any
    
    /**
      * The method to send the `file`. Options are `data` (x-www-form-urlencoded) or `form` (multipart/form-data)
      */
    var sendFileAs: data | form
  }
  object MapiRequestOptions {
    
    inline def apply(
      encoding: String,
      file: Blob | js.typedarray.ArrayBuffer | String | ReadStream,
      headers: Any,
      method: String,
      origin: String,
      params: Any,
      path: String,
      query: Any,
      sendFileAs: data | form
    ): MapiRequestOptions = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], sendFileAs = sendFileAs.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapiRequestOptions]
    }
    
    extension [Self <: MapiRequestOptions](x: Self) {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setFile(value: Blob | js.typedarray.ArrayBuffer | String | ReadStream): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setSendFileAs(value: data | form): Self = StObject.set(x, "sendFileAs", value.asInstanceOf[js.Any])
    }
  }
  
  trait PageCallbackFunction[T] extends StObject {
    
    var error: MapiError[T]
    
    def next(): Unit
    
    var response: MapiResponse[T]
  }
  object PageCallbackFunction {
    
    inline def apply[T](error: MapiError[T], next: Callback, response: MapiResponse[T]): PageCallbackFunction[T] = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], next = next.toJsFn, response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageCallbackFunction[T]]
    }
    
    extension [Self <: PageCallbackFunction[?], T](x: Self & PageCallbackFunction[T]) {
      
      inline def setError(value: MapiError[T]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setNext(value: Callback): Self = StObject.set(x, "next", value.toJsFn)
      
      inline def setResponse(value: MapiResponse[T]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
