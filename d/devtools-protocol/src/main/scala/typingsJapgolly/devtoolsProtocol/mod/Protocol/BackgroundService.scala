package typingsJapgolly.devtoolsProtocol.mod.Protocol

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.TimeSinceEpoch
import typingsJapgolly.devtoolsProtocol.mod.Protocol.ServiceWorker.RegistrationID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BackgroundService {
  
  trait BackgroundServiceEvent extends StObject {
    
    /**
      * A list of event-specific information.
      */
    var eventMetadata: js.Array[EventMetadata]
    
    /**
      * A description of the event.
      */
    var eventName: String
    
    /**
      * An identifier that groups related events together.
      */
    var instanceId: String
    
    /**
      * The origin this event belongs to.
      */
    var origin: String
    
    /**
      * The Background Service this event belongs to.
      */
    var service: ServiceName
    
    /**
      * The Service Worker ID that initiated the event.
      */
    var serviceWorkerRegistrationId: RegistrationID
    
    /**
      * Timestamp of the event (in seconds).
      */
    var timestamp: TimeSinceEpoch
  }
  object BackgroundServiceEvent {
    
    inline def apply(
      eventMetadata: js.Array[EventMetadata],
      eventName: String,
      instanceId: String,
      origin: String,
      service: ServiceName,
      serviceWorkerRegistrationId: RegistrationID,
      timestamp: TimeSinceEpoch
    ): BackgroundServiceEvent = {
      val __obj = js.Dynamic.literal(eventMetadata = eventMetadata.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], serviceWorkerRegistrationId = serviceWorkerRegistrationId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackgroundServiceEvent]
    }
    
    extension [Self <: BackgroundServiceEvent](x: Self) {
      
      inline def setEventMetadata(value: js.Array[EventMetadata]): Self = StObject.set(x, "eventMetadata", value.asInstanceOf[js.Any])
      
      inline def setEventMetadataVarargs(value: EventMetadata*): Self = StObject.set(x, "eventMetadata", js.Array(value*))
      
      inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setService(value: ServiceName): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceWorkerRegistrationId(value: RegistrationID): Self = StObject.set(x, "serviceWorkerRegistrationId", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: TimeSinceEpoch): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait BackgroundServiceEventReceivedEvent extends StObject {
    
    var backgroundServiceEvent: BackgroundServiceEvent
  }
  object BackgroundServiceEventReceivedEvent {
    
    inline def apply(backgroundServiceEvent: BackgroundServiceEvent): BackgroundServiceEventReceivedEvent = {
      val __obj = js.Dynamic.literal(backgroundServiceEvent = backgroundServiceEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackgroundServiceEventReceivedEvent]
    }
    
    extension [Self <: BackgroundServiceEventReceivedEvent](x: Self) {
      
      inline def setBackgroundServiceEvent(value: BackgroundServiceEvent): Self = StObject.set(x, "backgroundServiceEvent", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClearEventsRequest extends StObject {
    
    var service: ServiceName
  }
  object ClearEventsRequest {
    
    inline def apply(service: ServiceName): ClearEventsRequest = {
      val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClearEventsRequest]
    }
    
    extension [Self <: ClearEventsRequest](x: Self) {
      
      inline def setService(value: ServiceName): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventMetadata extends StObject {
    
    var key: String
    
    var value: String
  }
  object EventMetadata {
    
    inline def apply(key: String, value: String): EventMetadata = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMetadata]
    }
    
    extension [Self <: EventMetadata](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait RecordingStateChangedEvent extends StObject {
    
    var isRecording: Boolean
    
    var service: ServiceName
  }
  object RecordingStateChangedEvent {
    
    inline def apply(isRecording: Boolean, service: ServiceName): RecordingStateChangedEvent = {
      val __obj = js.Dynamic.literal(isRecording = isRecording.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordingStateChangedEvent]
    }
    
    extension [Self <: RecordingStateChangedEvent](x: Self) {
      
      inline def setIsRecording(value: Boolean): Self = StObject.set(x, "isRecording", value.asInstanceOf[js.Any])
      
      inline def setService(value: ServiceName): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.backgroundFetch
    - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.backgroundSync
    - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.pushMessaging
    - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.notifications
    - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.paymentHandler
    - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.periodicBackgroundSync
  */
  trait ServiceName extends StObject
  object ServiceName {
    
    inline def backgroundFetch: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.backgroundFetch = "backgroundFetch".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.backgroundFetch]
    
    inline def backgroundSync: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.backgroundSync = "backgroundSync".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.backgroundSync]
    
    inline def notifications: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.notifications = "notifications".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.notifications]
    
    inline def paymentHandler: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.paymentHandler = "paymentHandler".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.paymentHandler]
    
    inline def periodicBackgroundSync: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.periodicBackgroundSync = "periodicBackgroundSync".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.periodicBackgroundSync]
    
    inline def pushMessaging: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.pushMessaging = "pushMessaging".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.pushMessaging]
  }
  
  trait SetRecordingRequest extends StObject {
    
    var service: ServiceName
    
    var shouldRecord: Boolean
  }
  object SetRecordingRequest {
    
    inline def apply(service: ServiceName, shouldRecord: Boolean): SetRecordingRequest = {
      val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any], shouldRecord = shouldRecord.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetRecordingRequest]
    }
    
    extension [Self <: SetRecordingRequest](x: Self) {
      
      inline def setService(value: ServiceName): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setShouldRecord(value: Boolean): Self = StObject.set(x, "shouldRecord", value.asInstanceOf[js.Any])
    }
  }
  
  trait StartObservingRequest extends StObject {
    
    var service: ServiceName
  }
  object StartObservingRequest {
    
    inline def apply(service: ServiceName): StartObservingRequest = {
      val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartObservingRequest]
    }
    
    extension [Self <: StartObservingRequest](x: Self) {
      
      inline def setService(value: ServiceName): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  trait StopObservingRequest extends StObject {
    
    var service: ServiceName
  }
  object StopObservingRequest {
    
    inline def apply(service: ServiceName): StopObservingRequest = {
      val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[StopObservingRequest]
    }
    
    extension [Self <: StopObservingRequest](x: Self) {
      
      inline def setService(value: ServiceName): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
}
