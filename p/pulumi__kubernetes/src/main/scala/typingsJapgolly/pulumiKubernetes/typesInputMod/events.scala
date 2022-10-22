package typingsJapgolly.pulumiKubernetes.typesInputMod

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.eventsDotk8sDotioSlashv1
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.eventsDotk8sDotioSlashv1beta1
import typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.EventSource
import typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.ObjectReference
import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object events {
  
  object v1 {
    
    /**
      * Event is a report of an event somewhere in the cluster. It generally denotes some state change in the system. Events have a limited retention time and triggers and messages may evolve with time.  Event consumers should not rely on the timing of an event with a given Reason reflecting a consistent underlying trigger, or the continued existence of events with that Reason.  Events should be treated as informative, best-effort, supplemental data.
      */
    trait Event extends StObject {
      
      /**
        * action is what action was taken/failed regarding to the regarding object. It is machine-readable. This field cannot be empty for new Events and it can have at most 128 characters.
        */
      var action: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[eventsDotk8sDotioSlashv1]] = js.undefined
      
      /**
        * deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event type.
        */
      var deprecatedCount: js.UndefOr[Input[Double]] = js.undefined
      
      /**
        * deprecatedFirstTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
        */
      var deprecatedFirstTimestamp: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * deprecatedLastTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
        */
      var deprecatedLastTimestamp: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * deprecatedSource is the deprecated field assuring backward compatibility with core.v1 Event type.
        */
      var deprecatedSource: js.UndefOr[Input[EventSource]] = js.undefined
      
      /**
        * eventTime is the time when this Event was first observed. It is required.
        */
      var eventTime: Input[String]
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.Event]] = js.undefined
      
      /**
        * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      
      /**
        * note is a human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
        */
      var note: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * reason is why the action was taken. It is human-readable. This field cannot be empty for new Events and it can have at most 128 characters.
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * regarding contains the object this Event is about. In most cases it's an Object reporting controller implements, e.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
        */
      var regarding: js.UndefOr[Input[ObjectReference]] = js.undefined
      
      /**
        * related is the optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.
        */
      var related: js.UndefOr[Input[ObjectReference]] = js.undefined
      
      /**
        * reportingController is the name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This field cannot be empty for new Events.
        */
      var reportingController: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * reportingInstance is the ID of the controller instance, e.g. `kubelet-xyzf`. This field cannot be empty for new Events and it can have at most 128 characters.
        */
      var reportingInstance: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * series is data about the Event series this event represents or nil if it's a singleton Event.
        */
      var series: js.UndefOr[Input[EventSeries]] = js.undefined
      
      /**
        * type is the type of this event (Normal, Warning), new types could be added in the future. It is machine-readable. This field cannot be empty for new Events.
        */
      var `type`: js.UndefOr[Input[String]] = js.undefined
    }
    object Event {
      
      inline def apply(eventTime: Input[String]): Event = {
        val __obj = js.Dynamic.literal(eventTime = eventTime.asInstanceOf[js.Any])
        __obj.asInstanceOf[Event]
      }
      
      extension [Self <: Event](x: Self) {
        
        inline def setAction(value: Input[String]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
        
        inline def setApiVersion(value: Input[eventsDotk8sDotioSlashv1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
        
        inline def setDeprecatedCount(value: Input[Double]): Self = StObject.set(x, "deprecatedCount", value.asInstanceOf[js.Any])
        
        inline def setDeprecatedCountUndefined: Self = StObject.set(x, "deprecatedCount", js.undefined)
        
        inline def setDeprecatedFirstTimestamp(value: Input[String]): Self = StObject.set(x, "deprecatedFirstTimestamp", value.asInstanceOf[js.Any])
        
        inline def setDeprecatedFirstTimestampUndefined: Self = StObject.set(x, "deprecatedFirstTimestamp", js.undefined)
        
        inline def setDeprecatedLastTimestamp(value: Input[String]): Self = StObject.set(x, "deprecatedLastTimestamp", value.asInstanceOf[js.Any])
        
        inline def setDeprecatedLastTimestampUndefined: Self = StObject.set(x, "deprecatedLastTimestamp", js.undefined)
        
        inline def setDeprecatedSource(value: Input[EventSource]): Self = StObject.set(x, "deprecatedSource", value.asInstanceOf[js.Any])
        
        inline def setDeprecatedSourceUndefined: Self = StObject.set(x, "deprecatedSource", js.undefined)
        
        inline def setEventTime(value: Input[String]): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
        
        inline def setKind(value: Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.Event]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setNote(value: Input[String]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
        
        inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
        
        inline def setReason(value: Input[String]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
        
        inline def setRegarding(value: Input[ObjectReference]): Self = StObject.set(x, "regarding", value.asInstanceOf[js.Any])
        
        inline def setRegardingUndefined: Self = StObject.set(x, "regarding", js.undefined)
        
        inline def setRelated(value: Input[ObjectReference]): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
        
        inline def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
        
        inline def setReportingController(value: Input[String]): Self = StObject.set(x, "reportingController", value.asInstanceOf[js.Any])
        
        inline def setReportingControllerUndefined: Self = StObject.set(x, "reportingController", js.undefined)
        
        inline def setReportingInstance(value: Input[String]): Self = StObject.set(x, "reportingInstance", value.asInstanceOf[js.Any])
        
        inline def setReportingInstanceUndefined: Self = StObject.set(x, "reportingInstance", js.undefined)
        
        inline def setSeries(value: Input[EventSeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
        
        inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
        
        inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    /**
      * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time. How often to update the EventSeries is up to the event reporters. The default event reporter in "k8s.io/client-go/tools/events/event_broadcaster.go" shows how this struct is updated on heartbeats and can guide customized reporter implementations.
      */
    trait EventSeries extends StObject {
      
      /**
        * count is the number of occurrences in this series up to the last heartbeat time.
        */
      var count: Input[Double]
      
      /**
        * lastObservedTime is the time when last Event from the series was seen before last heartbeat.
        */
      var lastObservedTime: Input[String]
    }
    object EventSeries {
      
      inline def apply(count: Input[Double], lastObservedTime: Input[String]): EventSeries = {
        val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], lastObservedTime = lastObservedTime.asInstanceOf[js.Any])
        __obj.asInstanceOf[EventSeries]
      }
      
      extension [Self <: EventSeries](x: Self) {
        
        inline def setCount(value: Input[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        inline def setLastObservedTime(value: Input[String]): Self = StObject.set(x, "lastObservedTime", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time. How often to update the EventSeries is up to the event reporters. The default event reporter in "k8s.io/client-go/tools/events/event_broadcaster.go" shows how this struct is updated on heartbeats and can guide customized reporter implementations.
      */
    trait EventSeriesPatch extends StObject {
      
      /**
        * count is the number of occurrences in this series up to the last heartbeat time.
        */
      var count: js.UndefOr[Input[Double]] = js.undefined
      
      /**
        * lastObservedTime is the time when last Event from the series was seen before last heartbeat.
        */
      var lastObservedTime: js.UndefOr[Input[String]] = js.undefined
    }
    object EventSeriesPatch {
      
      inline def apply(): EventSeriesPatch = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EventSeriesPatch]
      }
      
      extension [Self <: EventSeriesPatch](x: Self) {
        
        inline def setCount(value: Input[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
        
        inline def setLastObservedTime(value: Input[String]): Self = StObject.set(x, "lastObservedTime", value.asInstanceOf[js.Any])
        
        inline def setLastObservedTimeUndefined: Self = StObject.set(x, "lastObservedTime", js.undefined)
      }
    }
  }
  
  object v1beta1 {
    
    /**
      * Event is a report of an event somewhere in the cluster. It generally denotes some state change in the system.
      */
    trait Event extends StObject {
      
      /**
        * What action was taken/failed regarding to the regarding object.
        */
      var action: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[eventsDotk8sDotioSlashv1beta1]] = js.undefined
      
      /**
        * Deprecated field assuring backward compatibility with core.v1 Event type
        */
      var deprecatedCount: js.UndefOr[Input[Double]] = js.undefined
      
      /**
        * Deprecated field assuring backward compatibility with core.v1 Event type
        */
      var deprecatedFirstTimestamp: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Deprecated field assuring backward compatibility with core.v1 Event type
        */
      var deprecatedLastTimestamp: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Deprecated field assuring backward compatibility with core.v1 Event type
        */
      var deprecatedSource: js.UndefOr[Input[EventSource]] = js.undefined
      
      /**
        * Required. Time when this Event was first observed.
        */
      var eventTime: Input[String]
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.Event]] = js.undefined
      
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      
      /**
        * Optional. A human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
        */
      var note: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Why the action was taken.
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * The object this Event is about. In most cases it's an Object reporting controller implements. E.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
        */
      var regarding: js.UndefOr[Input[ObjectReference]] = js.undefined
      
      /**
        * Optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.
        */
      var related: js.UndefOr[Input[ObjectReference]] = js.undefined
      
      /**
        * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
        */
      var reportingController: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * ID of the controller instance, e.g. `kubelet-xyzf`.
        */
      var reportingInstance: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Data about the Event series this event represents or nil if it's a singleton Event.
        */
      var series: js.UndefOr[Input[EventSeries]] = js.undefined
      
      /**
        * Type of this event (Normal, Warning), new types could be added in the future.
        */
      var `type`: js.UndefOr[Input[String]] = js.undefined
    }
    object Event {
      
      inline def apply(eventTime: Input[String]): Event = {
        val __obj = js.Dynamic.literal(eventTime = eventTime.asInstanceOf[js.Any])
        __obj.asInstanceOf[Event]
      }
      
      extension [Self <: Event](x: Self) {
        
        inline def setAction(value: Input[String]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
        
        inline def setApiVersion(value: Input[eventsDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
        
        inline def setDeprecatedCount(value: Input[Double]): Self = StObject.set(x, "deprecatedCount", value.asInstanceOf[js.Any])
        
        inline def setDeprecatedCountUndefined: Self = StObject.set(x, "deprecatedCount", js.undefined)
        
        inline def setDeprecatedFirstTimestamp(value: Input[String]): Self = StObject.set(x, "deprecatedFirstTimestamp", value.asInstanceOf[js.Any])
        
        inline def setDeprecatedFirstTimestampUndefined: Self = StObject.set(x, "deprecatedFirstTimestamp", js.undefined)
        
        inline def setDeprecatedLastTimestamp(value: Input[String]): Self = StObject.set(x, "deprecatedLastTimestamp", value.asInstanceOf[js.Any])
        
        inline def setDeprecatedLastTimestampUndefined: Self = StObject.set(x, "deprecatedLastTimestamp", js.undefined)
        
        inline def setDeprecatedSource(value: Input[EventSource]): Self = StObject.set(x, "deprecatedSource", value.asInstanceOf[js.Any])
        
        inline def setDeprecatedSourceUndefined: Self = StObject.set(x, "deprecatedSource", js.undefined)
        
        inline def setEventTime(value: Input[String]): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
        
        inline def setKind(value: Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.Event]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setNote(value: Input[String]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
        
        inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
        
        inline def setReason(value: Input[String]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
        
        inline def setRegarding(value: Input[ObjectReference]): Self = StObject.set(x, "regarding", value.asInstanceOf[js.Any])
        
        inline def setRegardingUndefined: Self = StObject.set(x, "regarding", js.undefined)
        
        inline def setRelated(value: Input[ObjectReference]): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
        
        inline def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
        
        inline def setReportingController(value: Input[String]): Self = StObject.set(x, "reportingController", value.asInstanceOf[js.Any])
        
        inline def setReportingControllerUndefined: Self = StObject.set(x, "reportingController", js.undefined)
        
        inline def setReportingInstance(value: Input[String]): Self = StObject.set(x, "reportingInstance", value.asInstanceOf[js.Any])
        
        inline def setReportingInstanceUndefined: Self = StObject.set(x, "reportingInstance", js.undefined)
        
        inline def setSeries(value: Input[EventSeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
        
        inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
        
        inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    /**
      * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.
      */
    trait EventSeries extends StObject {
      
      /**
        * Number of occurrences in this series up to the last heartbeat time
        */
      var count: Input[Double]
      
      /**
        * Time when last Event from the series was seen before last heartbeat.
        */
      var lastObservedTime: Input[String]
      
      /**
        * Information whether this series is ongoing or finished. Deprecated. Planned removal for 1.18
        */
      var state: Input[String]
    }
    object EventSeries {
      
      inline def apply(count: Input[Double], lastObservedTime: Input[String], state: Input[String]): EventSeries = {
        val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], lastObservedTime = lastObservedTime.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
        __obj.asInstanceOf[EventSeries]
      }
      
      extension [Self <: EventSeries](x: Self) {
        
        inline def setCount(value: Input[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        inline def setLastObservedTime(value: Input[String]): Self = StObject.set(x, "lastObservedTime", value.asInstanceOf[js.Any])
        
        inline def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.
      */
    trait EventSeriesPatch extends StObject {
      
      /**
        * Number of occurrences in this series up to the last heartbeat time
        */
      var count: js.UndefOr[Input[Double]] = js.undefined
      
      /**
        * Time when last Event from the series was seen before last heartbeat.
        */
      var lastObservedTime: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Information whether this series is ongoing or finished. Deprecated. Planned removal for 1.18
        */
      var state: js.UndefOr[Input[String]] = js.undefined
    }
    object EventSeriesPatch {
      
      inline def apply(): EventSeriesPatch = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EventSeriesPatch]
      }
      
      extension [Self <: EventSeriesPatch](x: Self) {
        
        inline def setCount(value: Input[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
        
        inline def setLastObservedTime(value: Input[String]): Self = StObject.set(x, "lastObservedTime", value.asInstanceOf[js.Any])
        
        inline def setLastObservedTimeUndefined: Self = StObject.set(x, "lastObservedTime", js.undefined)
        
        inline def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      }
    }
  }
}
