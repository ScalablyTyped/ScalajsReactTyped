package typingsJapgolly.pulumiKubernetes.outputMod.core.v1

import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event is a report of an event somewhere in the cluster.
  */
trait Event extends js.Object {
  /**
    * What action was taken/failed regarding to the Regarding object.
    */
  val action: String
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.v1
  /**
    * The number of times this event has occurred.
    */
  val count: Double
  /**
    * Time when this Event was first observed.
    */
  val eventTime: String
  /**
    * The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)
    */
  val firstTimestamp: String
  /**
    * The object that this event is about.
    */
  val involvedObject: ObjectReference
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.Event
  /**
    * The time at which the most recent occurrence of this event was recorded.
    */
  val lastTimestamp: String
  /**
    * A human-readable description of the status of this operation.
    */
  val message: String
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ObjectMeta
  /**
    * This should be a short, machine understandable string that gives the reason for the
    * transition into the object's current status.
    */
  val reason: String
  /**
    * Optional secondary object for more complex actions.
    */
  val related: ObjectReference
  /**
    * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
    */
  val reportingComponent: String
  /**
    * ID of the controller instance, e.g. `kubelet-xyzf`.
    */
  val reportingInstance: String
  /**
    * Data about the Event series this event represents or nil if it's a singleton Event.
    */
  val series: EventSeries
  /**
    * The component reporting this event. Should be a short machine understandable string.
    */
  val source: EventSource
  /**
    * Type of this event (Normal, Warning), new types could be added in the future
    */
  val `type`: String
}

object Event {
  @scala.inline
  def apply(
    action: String,
    apiVersion: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.v1,
    count: Double,
    eventTime: String,
    firstTimestamp: String,
    involvedObject: ObjectReference,
    kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.Event,
    lastTimestamp: String,
    message: String,
    metadata: ObjectMeta,
    reason: String,
    related: ObjectReference,
    reportingComponent: String,
    reportingInstance: String,
    series: EventSeries,
    source: EventSource,
    `type`: String
  ): Event = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], apiVersion = apiVersion.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], eventTime = eventTime.asInstanceOf[js.Any], firstTimestamp = firstTimestamp.asInstanceOf[js.Any], involvedObject = involvedObject.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], lastTimestamp = lastTimestamp.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], related = related.asInstanceOf[js.Any], reportingComponent = reportingComponent.asInstanceOf[js.Any], reportingInstance = reportingInstance.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

