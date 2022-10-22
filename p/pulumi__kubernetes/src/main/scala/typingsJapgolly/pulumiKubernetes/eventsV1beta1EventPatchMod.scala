package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.Event
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.eventsDotk8sDotioSlashv1beta1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.EventSourcePatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.ObjectReferencePatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.events.v1beta1.EventSeriesPatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMetaPatch
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsV1beta1EventPatchMod {
  
  @JSImport("@pulumi/kubernetes/events/v1beta1/eventPatch", "EventPatch")
  @js.native
  open class EventPatch protected () extends CustomResource {
    /**
      * Create a EventPatch resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: EventPatchArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: EventPatchArgs, opts: CustomResourceOptions) = this()
    
    /**
      * What action was taken/failed regarding to the regarding object.
      */
    val action: Output_[String] = js.native
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[eventsDotk8sDotioSlashv1beta1] = js.native
    
    /**
      * Deprecated field assuring backward compatibility with core.v1 Event type
      */
    val deprecatedCount: Output_[Double] = js.native
    
    /**
      * Deprecated field assuring backward compatibility with core.v1 Event type
      */
    val deprecatedFirstTimestamp: Output_[String] = js.native
    
    /**
      * Deprecated field assuring backward compatibility with core.v1 Event type
      */
    val deprecatedLastTimestamp: Output_[String] = js.native
    
    /**
      * Deprecated field assuring backward compatibility with core.v1 Event type
      */
    val deprecatedSource: Output_[EventSourcePatch] = js.native
    
    /**
      * Required. Time when this Event was first observed.
      */
    val eventTime: Output_[String] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[Event] = js.native
    
    val metadata: Output_[ObjectMetaPatch] = js.native
    
    /**
      * Optional. A human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
      */
    val note: Output_[String] = js.native
    
    /**
      * Why the action was taken.
      */
    val reason: Output_[String] = js.native
    
    /**
      * The object this Event is about. In most cases it's an Object reporting controller implements. E.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
      */
    val regarding: Output_[ObjectReferencePatch] = js.native
    
    /**
      * Optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.
      */
    val related: Output_[ObjectReferencePatch] = js.native
    
    /**
      * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
      */
    val reportingController: Output_[String] = js.native
    
    /**
      * ID of the controller instance, e.g. `kubelet-xyzf`.
      */
    val reportingInstance: Output_[String] = js.native
    
    /**
      * Data about the Event series this event represents or nil if it's a singleton Event.
      */
    val series: Output_[EventSeriesPatch] = js.native
    
    /**
      * Type of this event (Normal, Warning), new types could be added in the future.
      */
    val `type`: Output_[String] = js.native
  }
  /* static members */
  object EventPatch {
    
    @JSImport("@pulumi/kubernetes/events/v1beta1/eventPatch", "EventPatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing EventPatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): EventPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[EventPatch]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): EventPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EventPatch]
    
    /**
      * Returns true if the given object is an instance of EventPatch.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/events/v1beta1/eventPatch.EventPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/events/v1beta1/eventPatch.EventPatch */ Boolean]
  }
  
  trait EventPatchArgs extends StObject {
    
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
    var deprecatedSource: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.EventSourcePatch]] = js.undefined
    
    /**
      * Required. Time when this Event was first observed.
      */
    var eventTime: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[Event]] = js.undefined
    
    var metadata: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMetaPatch]] = js.undefined
    
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
    var regarding: js.UndefOr[
        Input[typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.ObjectReferencePatch]
      ] = js.undefined
    
    /**
      * Optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.
      */
    var related: js.UndefOr[
        Input[typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.ObjectReferencePatch]
      ] = js.undefined
    
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
    var series: js.UndefOr[
        Input[typingsJapgolly.pulumiKubernetes.typesInputMod.events.v1beta1.EventSeriesPatch]
      ] = js.undefined
    
    /**
      * Type of this event (Normal, Warning), new types could be added in the future.
      */
    var `type`: js.UndefOr[Input[String]] = js.undefined
  }
  object EventPatchArgs {
    
    inline def apply(): EventPatchArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventPatchArgs]
    }
    
    extension [Self <: EventPatchArgs](x: Self) {
      
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
      
      inline def setDeprecatedSource(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.EventSourcePatch]): Self = StObject.set(x, "deprecatedSource", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedSourceUndefined: Self = StObject.set(x, "deprecatedSource", js.undefined)
      
      inline def setEventTime(value: Input[String]): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
      
      inline def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
      
      inline def setKind(value: Input[Event]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMetaPatch]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setNote(value: Input[String]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
      
      inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
      
      inline def setReason(value: Input[String]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setRegarding(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.ObjectReferencePatch]): Self = StObject.set(x, "regarding", value.asInstanceOf[js.Any])
      
      inline def setRegardingUndefined: Self = StObject.set(x, "regarding", js.undefined)
      
      inline def setRelated(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.ObjectReferencePatch]): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
      
      inline def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
      
      inline def setReportingController(value: Input[String]): Self = StObject.set(x, "reportingController", value.asInstanceOf[js.Any])
      
      inline def setReportingControllerUndefined: Self = StObject.set(x, "reportingController", js.undefined)
      
      inline def setReportingInstance(value: Input[String]): Self = StObject.set(x, "reportingInstance", value.asInstanceOf[js.Any])
      
      inline def setReportingInstanceUndefined: Self = StObject.set(x, "reportingInstance", js.undefined)
      
      inline def setSeries(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.events.v1beta1.EventSeriesPatch]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
      
      inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
