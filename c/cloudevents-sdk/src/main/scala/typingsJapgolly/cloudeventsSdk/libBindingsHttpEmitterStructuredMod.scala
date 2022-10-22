package typingsJapgolly.cloudeventsSdk

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.cloudeventsSdk.anon.UrlURL
import typingsJapgolly.cloudeventsSdk.libCloudeventMod.CE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBindingsHttpEmitterStructuredMod {
  
  /**
    * A class for sending {CloudEvent} instances over HTTP.
    */
  @JSImport("cloudevents-sdk/lib/bindings/http/emitter_structured", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with StructuredHTTPEmitter {
    
    /**
      * Sends the event over HTTP
      * @param {Object} options The configuration options for this event. Options
      * provided will be passed along to Node.js `http.request()`.
      * https://nodejs.org/api/http.html#http_http_request_options_callback
      * @param {URL} options.url The HTTP/S url that should receive this event
      * @param {CloudEvent} cloudevent The CloudEvent to be sent
      * @returns {Promise} Promise with an eventual response from the receiver
      */
    /* CompleteClass */
    override def emit(options: UrlURL, cloudevent: CloudEvent): js.Promise[Any] = js.native
  }
  
  trait CloudEvent extends StObject {
    
    var CloudEvent: Instantiable1[/* event */ CE, typingsJapgolly.cloudeventsSdk.libCloudeventMod.CloudEvent]
  }
  object CloudEvent {
    
    inline def apply(
      CloudEvent: Instantiable1[/* event */ CE, typingsJapgolly.cloudeventsSdk.libCloudeventMod.CloudEvent]
    ): CloudEvent = {
      val __obj = js.Dynamic.literal(CloudEvent = CloudEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudEvent]
    }
    
    extension [Self <: CloudEvent](x: Self) {
      
      inline def setCloudEvent(value: Instantiable1[/* event */ CE, typingsJapgolly.cloudeventsSdk.libCloudeventMod.CloudEvent]): Self = StObject.set(x, "CloudEvent", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A class for sending {CloudEvent} instances over HTTP.
    */
  trait StructuredHTTPEmitter extends StObject {
    
    /**
      * Sends the event over HTTP
      * @param {Object} options The configuration options for this event. Options
      * provided will be passed along to Node.js `http.request()`.
      * https://nodejs.org/api/http.html#http_http_request_options_callback
      * @param {URL} options.url The HTTP/S url that should receive this event
      * @param {CloudEvent} cloudevent The CloudEvent to be sent
      * @returns {Promise} Promise with an eventual response from the receiver
      */
    def emit(options: UrlURL, cloudevent: CloudEvent): js.Promise[Any]
  }
  object StructuredHTTPEmitter {
    
    inline def apply(emit: (UrlURL, CloudEvent) => js.Promise[Any]): StructuredHTTPEmitter = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit))
      __obj.asInstanceOf[StructuredHTTPEmitter]
    }
    
    extension [Self <: StructuredHTTPEmitter](x: Self) {
      
      inline def setEmit(value: (UrlURL, CloudEvent) => js.Promise[Any]): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
    }
  }
}
