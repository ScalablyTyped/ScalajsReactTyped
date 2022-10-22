package typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
  */
trait ObjectMetaPatch extends StObject {
  
  /**
    * Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
    */
  var annotations: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * The name of the cluster which the object belongs to. This is used to distinguish resources with same name and namespace in different clusters. This field is not set anywhere right now and apiserver is going to ignore it if set in create or update request.
    */
  var clusterName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * CreationTimestamp is a timestamp representing the server time when this object was created. It is not guaranteed to be set in happens-before order across separate operations. Clients may not set this value. It is represented in RFC3339 form and is in UTC.
    *
    * Populated by the system. Read-only. Null for lists. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var creationTimestamp: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Number of seconds allowed for this object to gracefully terminate before it will be removed from the system. Only set when deletionTimestamp is also set. May only be shortened. Read-only.
    */
  var deletionGracePeriodSeconds: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * DeletionTimestamp is RFC 3339 date and time at which this resource will be deleted. This field is set by the server when a graceful deletion is requested by the user, and is not directly settable by a client. The resource is expected to be deleted (no longer visible from resource lists, and not reachable by name) after the time in this field, once the finalizers list is empty. As long as the finalizers list contains items, deletion is blocked. Once the deletionTimestamp is set, this value may not be unset or be set further into the future, although it may be shortened or the resource may be deleted prior to this time. For example, a user may request that a pod is deleted in 30 seconds. The Kubelet will react by sending a graceful termination signal to the containers in the pod. After that 30 seconds, the Kubelet will send a hard termination signal (SIGKILL) to the container and after cleanup, remove the pod from the API. In the presence of network partitions, this object may still exist after this timestamp, until an administrator or automated process can determine the resource is fully terminated. If not set, graceful deletion of the object has not been requested.
    *
    * Populated by the system when a graceful deletion is requested. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var deletionTimestamp: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Must be empty before the object is deleted from the registry. Each entry is an identifier for the responsible component that will remove the entry from the list. If the deletionTimestamp of the object is non-nil, entries in this list can only be removed. Finalizers may be processed and removed in any order.  Order is NOT enforced because it introduces significant risk of stuck finalizers. finalizers is a shared field, any actor with permission can reorder it. If the finalizer list is processed in order, then this can lead to a situation in which the component responsible for the first finalizer in the list is waiting for a signal (field value, external system, or other) produced by a component responsible for a finalizer later in the list, resulting in a deadlock. Without enforced ordering finalizers are free to order amongst themselves and are not vulnerable to ordering changes in the list.
    */
  var finalizers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF the Name field has not been provided. If this field is used, the name returned to the client will be different than the name passed. This value will also be combined with a unique suffix. The provided value has the same validation rules as the Name field, and may be truncated by the length of the suffix required to make the value unique on the server.
    *
    * If this field is specified and the generated name exists, the server will return a 409.
    *
    * Applied only if Name is not specified. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#idempotency
    */
  var generateName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * A sequence number representing a specific generation of the desired state. Populated by the system. Read-only.
    */
  var generation: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels
    */
  var labels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * ManagedFields maps workflow-id and version to the set of fields that are managed by that workflow. This is mostly for internal housekeeping, and users typically shouldn't need to set or understand this field. A workflow can be the user's name, a controller's name, or the name of a specific apply path like "ci-cd". The set of fields is always in the version that the workflow used when modifying the object.
    */
  var managedFields: js.UndefOr[Input[js.Array[Input[ManagedFieldsEntryPatch]]]] = js.undefined
  
  /**
    * Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Namespace defines the space within which each name must be unique. An empty namespace is equivalent to the "default" namespace, but "default" is the canonical representation. Not all objects are required to be scoped to a namespace - the value of this field for those objects will be empty.
    *
    * Must be a DNS_LABEL. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/namespaces
    */
  var namespace: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the controller field set to true. There cannot be more than one managing controller.
    */
  var ownerReferences: js.UndefOr[Input[js.Array[Input[OwnerReferencePatch]]]] = js.undefined
  
  /**
    * An opaque value that represents the internal version of this object that can be used by clients to determine when objects have changed. May be used for optimistic concurrency, change detection, and the watch operation on a resource or set of resources. Clients must treat these values as opaque and passed unmodified back to the server. They may only be valid for a particular resource or set of resources.
    *
    * Populated by the system. Read-only. Value must be treated as opaque by clients and . More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
    */
  var resourceVersion: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Deprecated: selfLink is a legacy read-only field that is no longer populated by the system.
    */
  var selfLink: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * UID is the unique in time and space value for this object. It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations.
    *
    * Populated by the system. Read-only. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
    */
  var uid: js.UndefOr[Input[String]] = js.undefined
}
object ObjectMetaPatch {
  
  inline def apply(): ObjectMetaPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectMetaPatch]
  }
  
  extension [Self <: ObjectMetaPatch](x: Self) {
    
    inline def setAnnotations(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setClusterName(value: Input[String]): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    inline def setCreationTimestamp(value: Input[String]): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDeletionGracePeriodSeconds(value: Input[Double]): Self = StObject.set(x, "deletionGracePeriodSeconds", value.asInstanceOf[js.Any])
    
    inline def setDeletionGracePeriodSecondsUndefined: Self = StObject.set(x, "deletionGracePeriodSeconds", js.undefined)
    
    inline def setDeletionTimestamp(value: Input[String]): Self = StObject.set(x, "deletionTimestamp", value.asInstanceOf[js.Any])
    
    inline def setDeletionTimestampUndefined: Self = StObject.set(x, "deletionTimestamp", js.undefined)
    
    inline def setFinalizers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "finalizers", value.asInstanceOf[js.Any])
    
    inline def setFinalizersUndefined: Self = StObject.set(x, "finalizers", js.undefined)
    
    inline def setFinalizersVarargs(value: Input[String]*): Self = StObject.set(x, "finalizers", js.Array(value*))
    
    inline def setGenerateName(value: Input[String]): Self = StObject.set(x, "generateName", value.asInstanceOf[js.Any])
    
    inline def setGenerateNameUndefined: Self = StObject.set(x, "generateName", js.undefined)
    
    inline def setGeneration(value: Input[Double]): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    inline def setLabels(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setManagedFields(value: Input[js.Array[Input[ManagedFieldsEntryPatch]]]): Self = StObject.set(x, "managedFields", value.asInstanceOf[js.Any])
    
    inline def setManagedFieldsUndefined: Self = StObject.set(x, "managedFields", js.undefined)
    
    inline def setManagedFieldsVarargs(value: Input[ManagedFieldsEntryPatch]*): Self = StObject.set(x, "managedFields", js.Array(value*))
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setOwnerReferences(value: Input[js.Array[Input[OwnerReferencePatch]]]): Self = StObject.set(x, "ownerReferences", value.asInstanceOf[js.Any])
    
    inline def setOwnerReferencesUndefined: Self = StObject.set(x, "ownerReferences", js.undefined)
    
    inline def setOwnerReferencesVarargs(value: Input[OwnerReferencePatch]*): Self = StObject.set(x, "ownerReferences", js.Array(value*))
    
    inline def setResourceVersion(value: Input[String]): Self = StObject.set(x, "resourceVersion", value.asInstanceOf[js.Any])
    
    inline def setResourceVersionUndefined: Self = StObject.set(x, "resourceVersion", js.undefined)
    
    inline def setSelfLink(value: Input[String]): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setUid(value: Input[String]): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
