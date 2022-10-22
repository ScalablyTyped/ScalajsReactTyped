package typingsJapgolly.reactNativeFirebase.mod.RNFirebase

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseBooleans.`false`
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object perf {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.CONNECT
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.DELETE
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.GET
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.HEAD
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.OPTIONS
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.PATCH
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.POST
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.PUT
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.TRACE
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    inline def CONNECT: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.CONNECT = "CONNECT".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.CONNECT]
    
    inline def DELETE: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.DELETE = "DELETE".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.DELETE]
    
    inline def GET: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.GET = "GET".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.GET]
    
    inline def HEAD: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.HEAD = "HEAD".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.HEAD]
    
    inline def OPTIONS: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.OPTIONS = "OPTIONS".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.OPTIONS]
    
    inline def PATCH: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.PATCH = "PATCH".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.PATCH]
    
    inline def POST: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.POST = "POST".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.POST]
    
    inline def PUT: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.PUT = "PUT".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.PUT]
    
    inline def TRACE: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.TRACE = "TRACE".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.TRACE]
  }
  
  trait HttpMetric extends StObject {
    
    /**
      * Return an attribute by name, or null if it does not exist.
      */
    def getAttribute(attribute: String): js.Promise[String | Null]
    
    /**
      * Return an object of key-value attributes.
      */
    def getAttributes(): js.Promise[js.Object]
    
    /**
      * Set an attribute. Returns true if it was set, false if it was not.
      */
    def putAttribute(attribute: String, value: String): js.Promise[`true` | `false`]
    
    /**
      * Remove an attribute by name.
      */
    def removeAttribute(attribute: String): js.Promise[Null]
    
    /**
      * Set the request HTTP response code.
      */
    def setHttpResponseCode(code: Double): js.Promise[Null]
    
    /**
      * Set the request payload size, in bytes.
      */
    def setRequestPayloadSize(bytes: Double): js.Promise[Null]
    
    /**
      * Set the response content type.
      */
    def setResponseContentType(`type`: String): js.Promise[Null]
    
    /**
      * Set the response payload size, in bytes.
      */
    def setResponsePayloadSize(bytes: Double): js.Promise[Null]
    
    /**
      * Start a HttpMetric instance.
      */
    def start(): js.Promise[Null]
    
    /**
      * Stop a HttpMetric instance.
      */
    def stop(): js.Promise[Null]
  }
  object HttpMetric {
    
    inline def apply(
      getAttribute: String => js.Promise[String | Null],
      getAttributes: CallbackTo[js.Promise[js.Object]],
      putAttribute: (String, String) => js.Promise[`true` | `false`],
      removeAttribute: String => js.Promise[Null],
      setHttpResponseCode: Double => js.Promise[Null],
      setRequestPayloadSize: Double => js.Promise[Null],
      setResponseContentType: String => js.Promise[Null],
      setResponsePayloadSize: Double => js.Promise[Null],
      start: CallbackTo[js.Promise[Null]],
      stop: CallbackTo[js.Promise[Null]]
    ): HttpMetric = {
      val __obj = js.Dynamic.literal(getAttribute = js.Any.fromFunction1(getAttribute), getAttributes = getAttributes.toJsFn, putAttribute = js.Any.fromFunction2(putAttribute), removeAttribute = js.Any.fromFunction1(removeAttribute), setHttpResponseCode = js.Any.fromFunction1(setHttpResponseCode), setRequestPayloadSize = js.Any.fromFunction1(setRequestPayloadSize), setResponseContentType = js.Any.fromFunction1(setResponseContentType), setResponsePayloadSize = js.Any.fromFunction1(setResponsePayloadSize), start = start.toJsFn, stop = stop.toJsFn)
      __obj.asInstanceOf[HttpMetric]
    }
    
    extension [Self <: HttpMetric](x: Self) {
      
      inline def setGetAttribute(value: String => js.Promise[String | Null]): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetAttributes(value: CallbackTo[js.Promise[js.Object]]): Self = StObject.set(x, "getAttributes", value.toJsFn)
      
      inline def setPutAttribute(value: (String, String) => js.Promise[`true` | `false`]): Self = StObject.set(x, "putAttribute", js.Any.fromFunction2(value))
      
      inline def setRemoveAttribute(value: String => js.Promise[Null]): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1(value))
      
      inline def setSetHttpResponseCode(value: Double => js.Promise[Null]): Self = StObject.set(x, "setHttpResponseCode", js.Any.fromFunction1(value))
      
      inline def setSetRequestPayloadSize(value: Double => js.Promise[Null]): Self = StObject.set(x, "setRequestPayloadSize", js.Any.fromFunction1(value))
      
      inline def setSetResponseContentType(value: String => js.Promise[Null]): Self = StObject.set(x, "setResponseContentType", js.Any.fromFunction1(value))
      
      inline def setSetResponsePayloadSize(value: Double => js.Promise[Null]): Self = StObject.set(x, "setResponsePayloadSize", js.Any.fromFunction1(value))
      
      inline def setStart(value: CallbackTo[js.Promise[Null]]): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setStop(value: CallbackTo[js.Promise[Null]]): Self = StObject.set(x, "stop", value.toJsFn)
    }
  }
  
  trait Perf extends StObject {
    
    /**
      * Returns a new HTTP Metric instance.
      */
    def newHttpMetric(url: String, httpMethod: HttpMethod): HttpMetric
    
    /**
      * Returns a new Trace instance.
      */
    def newTrace(trace: String): Trace
    
    /**
      * Globally enable or disable performance monitoring.
      */
    def setPerformanceCollectionEnabled(enabled: Boolean): Unit
  }
  object Perf {
    
    inline def apply(
      newHttpMetric: (String, HttpMethod) => HttpMetric,
      newTrace: String => Trace,
      setPerformanceCollectionEnabled: Boolean => Callback
    ): Perf = {
      val __obj = js.Dynamic.literal(newHttpMetric = js.Any.fromFunction2(newHttpMetric), newTrace = js.Any.fromFunction1(newTrace), setPerformanceCollectionEnabled = js.Any.fromFunction1((t0: Boolean) => setPerformanceCollectionEnabled(t0).runNow()))
      __obj.asInstanceOf[Perf]
    }
    
    extension [Self <: Perf](x: Self) {
      
      inline def setNewHttpMetric(value: (String, HttpMethod) => HttpMetric): Self = StObject.set(x, "newHttpMetric", js.Any.fromFunction2(value))
      
      inline def setNewTrace(value: String => Trace): Self = StObject.set(x, "newTrace", js.Any.fromFunction1(value))
      
      inline def setSetPerformanceCollectionEnabled(value: Boolean => Callback): Self = StObject.set(x, "setPerformanceCollectionEnabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    }
  }
  
  trait Trace extends StObject {
    
    /**
      * Return an attribute by name, or null if it does not exist.
      */
    def getAttribute(attribute: String): js.Promise[String | Null]
    
    /**
      * Return an object of key-value attributes.
      */
    def getAttributes(): js.Promise[js.Object]
    
    /**
      * Get a metric by name. Returns 0 if it does not exist.
      */
    def getMetric(metricName: String): js.Promise[Double]
    
    /**
      * Increment a metric by name and value.
      */
    def incrementMetric(metricName: String, incrementBy: Double): js.Promise[Null]
    
    /**
      * Set an attribute. Returns true if it was set, false if it was not.
      */
    def putAttribute(attribute: String, value: String): js.Promise[`true` | `false`]
    
    /**
      * Set a metric.
      */
    def putMetric(metricName: String, value: Double): js.Promise[Null]
    
    /**
      * Remove an attribute by name.
      */
    def removeAttribute(attribute: String): js.Promise[Null]
    
    /**
      * Start a Trace instance.
      */
    def start(): js.Promise[Null]
    
    /**
      * Stop a Trace instance.
      */
    def stop(): js.Promise[Null]
  }
  object Trace {
    
    inline def apply(
      getAttribute: String => js.Promise[String | Null],
      getAttributes: CallbackTo[js.Promise[js.Object]],
      getMetric: String => js.Promise[Double],
      incrementMetric: (String, Double) => js.Promise[Null],
      putAttribute: (String, String) => js.Promise[`true` | `false`],
      putMetric: (String, Double) => js.Promise[Null],
      removeAttribute: String => js.Promise[Null],
      start: CallbackTo[js.Promise[Null]],
      stop: CallbackTo[js.Promise[Null]]
    ): Trace = {
      val __obj = js.Dynamic.literal(getAttribute = js.Any.fromFunction1(getAttribute), getAttributes = getAttributes.toJsFn, getMetric = js.Any.fromFunction1(getMetric), incrementMetric = js.Any.fromFunction2(incrementMetric), putAttribute = js.Any.fromFunction2(putAttribute), putMetric = js.Any.fromFunction2(putMetric), removeAttribute = js.Any.fromFunction1(removeAttribute), start = start.toJsFn, stop = stop.toJsFn)
      __obj.asInstanceOf[Trace]
    }
    
    extension [Self <: Trace](x: Self) {
      
      inline def setGetAttribute(value: String => js.Promise[String | Null]): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetAttributes(value: CallbackTo[js.Promise[js.Object]]): Self = StObject.set(x, "getAttributes", value.toJsFn)
      
      inline def setGetMetric(value: String => js.Promise[Double]): Self = StObject.set(x, "getMetric", js.Any.fromFunction1(value))
      
      inline def setIncrementMetric(value: (String, Double) => js.Promise[Null]): Self = StObject.set(x, "incrementMetric", js.Any.fromFunction2(value))
      
      inline def setPutAttribute(value: (String, String) => js.Promise[`true` | `false`]): Self = StObject.set(x, "putAttribute", js.Any.fromFunction2(value))
      
      inline def setPutMetric(value: (String, Double) => js.Promise[Null]): Self = StObject.set(x, "putMetric", js.Any.fromFunction2(value))
      
      inline def setRemoveAttribute(value: String => js.Promise[Null]): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1(value))
      
      inline def setStart(value: CallbackTo[js.Promise[Null]]): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setStop(value: CallbackTo[js.Promise[Null]]): Self = StObject.set(x, "stop", value.toJsFn)
    }
  }
}
