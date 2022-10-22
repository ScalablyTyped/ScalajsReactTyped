package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event is a report of an event somewhere in the cluster.  Events have a limited retention time and triggers and messages may evolve with time.  Event consumers should not rely on the timing of an event with a given Reason reflecting a consistent underlying trigger, or the continued existence of events with that Reason.  Events should be treated as informative, best-effort, supplemental data.
  */
trait Event extends StObject {
  
  /**
    * What action was taken/failed regarding to the Regarding object.
    */
  var action: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.v1]] = js.undefined
  
  /**
    * The number of times this event has occurred.
    */
  var count: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Time when this Event was first observed.
    */
  var eventTime: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)
    */
  var firstTimestamp: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The object that this event is about.
    */
  var involvedObject: Input[ObjectReference]
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.Event]] = js.undefined
  
  /**
    * The time at which the most recent occurrence of this event was recorded.
    */
  var lastTimestamp: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * A human-readable description of the status of this operation.
    */
  var message: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: Input[ObjectMeta]
  
  /**
    * This should be a short, machine understandable string that gives the reason for the transition into the object's current status.
    */
  var reason: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Optional secondary object for more complex actions.
    */
  var related: js.UndefOr[Input[ObjectReference]] = js.undefined
  
  /**
    * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
    */
  var reportingComponent: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * ID of the controller instance, e.g. `kubelet-xyzf`.
    */
  var reportingInstance: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Data about the Event series this event represents or nil if it's a singleton Event.
    */
  var series: js.UndefOr[Input[EventSeries]] = js.undefined
  
  /**
    * The component reporting this event. Should be a short machine understandable string.
    */
  var source: js.UndefOr[Input[EventSource]] = js.undefined
  
  /**
    * Type of this event (Normal, Warning), new types could be added in the future
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}
object Event {
  
  inline def apply(involvedObject: Input[ObjectReference], metadata: Input[ObjectMeta]): Event = {
    val __obj = js.Dynamic.literal(involvedObject = involvedObject.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setAction(value: Input[String]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setApiVersion(value: Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.v1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setCount(value: Input[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setEventTime(value: Input[String]): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
    
    inline def setFirstTimestamp(value: Input[String]): Self = StObject.set(x, "firstTimestamp", value.asInstanceOf[js.Any])
    
    inline def setFirstTimestampUndefined: Self = StObject.set(x, "firstTimestamp", js.undefined)
    
    inline def setInvolvedObject(value: Input[ObjectReference]): Self = StObject.set(x, "involvedObject", value.asInstanceOf[js.Any])
    
    inline def setKind(value: Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.Event]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastTimestamp(value: Input[String]): Self = StObject.set(x, "lastTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastTimestampUndefined: Self = StObject.set(x, "lastTimestamp", js.undefined)
    
    inline def setMessage(value: Input[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setReason(value: Input[String]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setRelated(value: Input[ObjectReference]): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
    
    inline def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
    
    inline def setReportingComponent(value: Input[String]): Self = StObject.set(x, "reportingComponent", value.asInstanceOf[js.Any])
    
    inline def setReportingComponentUndefined: Self = StObject.set(x, "reportingComponent", js.undefined)
    
    inline def setReportingInstance(value: Input[String]): Self = StObject.set(x, "reportingInstance", value.asInstanceOf[js.Any])
    
    inline def setReportingInstanceUndefined: Self = StObject.set(x, "reportingInstance", js.undefined)
    
    inline def setSeries(value: Input[EventSeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSource(value: Input[EventSource]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
