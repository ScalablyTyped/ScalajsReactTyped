package typingsJapgolly.cloudeventsSdk

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.cloudeventsSdk.libCloudeventMod.CE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBindingsHttpReceiverStructuredMod {
  
  /** @typedef {import("../../cloudevent")} CloudEvent */
  /**
    * A utility class used to receive structured CloudEvents
    * over HTTP.
    * @see {StructuredReceiver}
    */
  @JSImport("cloudevents-sdk/lib/bindings/http/receiver_structured", JSImport.Namespace)
  @js.native
  /**
    * Creates a new StructuredHTTPReceiver. Supports Cloud Events specification
    * versions 0.3 and 1.0 (default).
    *
    * @param {string} version the Cloud Events specification version. Default: 1.0.
    */
  open class ^ ()
    extends StObject
       with StructuredHTTPReceiver {
    def this(version: String) = this()
    
    /**
      * Checks whether the provided payload and headers conform to the Cloud Events
      * specification version supported by this instance.
      *
      * @param {object} payload the cloud event data payload
      * @param {object} headers the HTTP headers received for this cloud event
      * @returns {boolean} true if the payload and header combination are valid
      * @throws {ValidationError} if the payload and header combination do not conform to the spec
      */
    /* CompleteClass */
    override def check(payload: js.Object, headers: js.Object): Boolean = js.native
    
    /**
      * Creates a new CloudEvent instance based on the provided payload and headers.
      *
      * @param {object} payload the cloud event data payload
      * @param {object} headers  the HTTP headers received for this cloud event
      * @returns {CloudEvent} a new CloudEvent instance for the provided headers and payload
      * @throws {ValidationError} if the payload and header combination do not conform to the spec
      */
    /* CompleteClass */
    override def parse(payload: js.Object, headers: js.Object): CloudEvent = js.native
    
    /* CompleteClass */
    var receiver: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_receiver_structured_1 */ Any = js.native
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
  
  /** @typedef {import("../../cloudevent")} CloudEvent */
  /**
    * A utility class used to receive structured CloudEvents
    * over HTTP.
    * @see {StructuredReceiver}
    */
  trait StructuredHTTPReceiver extends StObject {
    
    /**
      * Checks whether the provided payload and headers conform to the Cloud Events
      * specification version supported by this instance.
      *
      * @param {object} payload the cloud event data payload
      * @param {object} headers the HTTP headers received for this cloud event
      * @returns {boolean} true if the payload and header combination are valid
      * @throws {ValidationError} if the payload and header combination do not conform to the spec
      */
    def check(payload: js.Object, headers: js.Object): Boolean
    
    /**
      * Creates a new CloudEvent instance based on the provided payload and headers.
      *
      * @param {object} payload the cloud event data payload
      * @param {object} headers  the HTTP headers received for this cloud event
      * @returns {CloudEvent} a new CloudEvent instance for the provided headers and payload
      * @throws {ValidationError} if the payload and header combination do not conform to the spec
      */
    def parse(payload: js.Object, headers: js.Object): CloudEvent
    
    var receiver: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_receiver_structured_1 */ Any
  }
  object StructuredHTTPReceiver {
    
    inline def apply(
      check: (js.Object, js.Object) => Boolean,
      parse: (js.Object, js.Object) => CloudEvent,
      receiver: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_receiver_structured_1 */ Any
    ): StructuredHTTPReceiver = {
      val __obj = js.Dynamic.literal(check = js.Any.fromFunction2(check), parse = js.Any.fromFunction2(parse), receiver = receiver.asInstanceOf[js.Any])
      __obj.asInstanceOf[StructuredHTTPReceiver]
    }
    
    extension [Self <: StructuredHTTPReceiver](x: Self) {
      
      inline def setCheck(value: (js.Object, js.Object) => Boolean): Self = StObject.set(x, "check", js.Any.fromFunction2(value))
      
      inline def setParse(value: (js.Object, js.Object) => CloudEvent): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
      
      inline def setReceiver(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_receiver_structured_1 */ Any
      ): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    }
  }
}
