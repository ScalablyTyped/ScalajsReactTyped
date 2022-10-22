package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.typesSubscribeToShardEventMod.SubscribeToShardEvent
import typingsJapgolly.awsSdkClientKinesisBrowser.typesSubscribeToShardEventMod.UnmarshalledSubscribeToShardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSubscribeToShardEventStreamMod {
  
  trait SubscribeToShardEventStream extends StObject {
    
    /**
      * <p>After you call <a>SubscribeToShard</a>, Kinesis Data Streams sends events of this type to your consumer. </p>
      */
    var SubscribeToShardEvent: typingsJapgolly.awsSdkClientKinesisBrowser.typesSubscribeToShardEventMod.SubscribeToShardEvent
  }
  object SubscribeToShardEventStream {
    
    inline def apply(SubscribeToShardEvent: SubscribeToShardEvent): SubscribeToShardEventStream = {
      val __obj = js.Dynamic.literal(SubscribeToShardEvent = SubscribeToShardEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscribeToShardEventStream]
    }
    
    extension [Self <: SubscribeToShardEventStream](x: Self) {
      
      inline def setSubscribeToShardEvent(value: SubscribeToShardEvent): Self = StObject.set(x, "SubscribeToShardEvent", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledSubscribeToShardEventStream
    extends StObject
       with SubscribeToShardEventStream {
    
    /**
      * <p>After you call <a>SubscribeToShard</a>, Kinesis Data Streams sends events of this type to your consumer. </p>
      */
    @JSName("SubscribeToShardEvent")
    var SubscribeToShardEvent_UnmarshalledSubscribeToShardEventStream: UnmarshalledSubscribeToShardEvent
  }
  object UnmarshalledSubscribeToShardEventStream {
    
    inline def apply(SubscribeToShardEvent: UnmarshalledSubscribeToShardEvent): UnmarshalledSubscribeToShardEventStream = {
      val __obj = js.Dynamic.literal(SubscribeToShardEvent = SubscribeToShardEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledSubscribeToShardEventStream]
    }
    
    extension [Self <: UnmarshalledSubscribeToShardEventStream](x: Self) {
      
      inline def setSubscribeToShardEvent(value: UnmarshalledSubscribeToShardEvent): Self = StObject.set(x, "SubscribeToShardEvent", value.asInstanceOf[js.Any])
    }
  }
}
