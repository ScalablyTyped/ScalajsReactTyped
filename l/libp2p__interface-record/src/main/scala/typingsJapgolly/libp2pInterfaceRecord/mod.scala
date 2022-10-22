package typingsJapgolly.libp2pInterfaceRecord

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import typingsJapgolly.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait Envelope extends StObject {
    
    def equals(other: Envelope): Boolean
    
    def marshal(): js.typedarray.Uint8Array
    
    var payload: js.typedarray.Uint8Array
    
    var payloadType: js.typedarray.Uint8Array | Uint8ArrayList
    
    var peerId: PeerId
    
    var signature: js.typedarray.Uint8Array | Uint8ArrayList
    
    def validate(domain: String): js.Promise[Boolean]
  }
  object Envelope {
    
    inline def apply(
      equals_ : Envelope => Boolean,
      marshal: CallbackTo[js.typedarray.Uint8Array],
      payload: js.typedarray.Uint8Array,
      payloadType: js.typedarray.Uint8Array | Uint8ArrayList,
      peerId: PeerId,
      signature: js.typedarray.Uint8Array | Uint8ArrayList,
      validate: String => js.Promise[Boolean]
    ): Envelope = {
      val __obj = js.Dynamic.literal(marshal = marshal.toJsFn, payload = payload.asInstanceOf[js.Any], payloadType = payloadType.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[Envelope]
    }
    
    extension [Self <: Envelope](x: Self) {
      
      inline def setEquals_(value: Envelope => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setMarshal(value: CallbackTo[js.typedarray.Uint8Array]): Self = StObject.set(x, "marshal", value.toJsFn)
      
      inline def setPayload(value: js.typedarray.Uint8Array): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadType(value: js.typedarray.Uint8Array | Uint8ArrayList): Self = StObject.set(x, "payloadType", value.asInstanceOf[js.Any])
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: js.typedarray.Uint8Array | Uint8ArrayList): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setValidate(value: String => js.Promise[Boolean]): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    }
  }
  
  trait Record extends StObject {
    
    /**
      * identifier of the type of record
      */
    var codec: js.typedarray.Uint8Array
    
    /**
      * signature domain.
      */
    var domain: String
    
    /**
      * Verifies if the other provided Record is identical to this one.
      */
    def equals(other: Record): Boolean
    
    /**
      * Marshal a record to be used in an envelope.
      */
    def marshal(): js.typedarray.Uint8Array
  }
  object Record {
    
    inline def apply(
      codec: js.typedarray.Uint8Array,
      domain: String,
      equals_ : Record => Boolean,
      marshal: CallbackTo[js.typedarray.Uint8Array]
    ): Record = {
      val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], marshal = marshal.toJsFn)
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[Record]
    }
    
    extension [Self <: Record](x: Self) {
      
      inline def setCodec(value: js.typedarray.Uint8Array): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setEquals_(value: Record => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setMarshal(value: CallbackTo[js.typedarray.Uint8Array]): Self = StObject.set(x, "marshal", value.toJsFn)
    }
  }
}
