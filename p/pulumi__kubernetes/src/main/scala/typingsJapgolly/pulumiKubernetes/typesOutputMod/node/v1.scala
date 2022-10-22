package typingsJapgolly.pulumiKubernetes.typesOutputMod.node

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.nodeDotk8sDotioSlashv1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.Toleration
import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.TolerationPatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1 {
  
  /**
    * Overhead structure represents the resource overhead associated with running a pod.
    */
  trait Overhead extends StObject {
    
    /**
      * PodFixed represents the fixed resource overhead associated with running a pod.
      */
    var podFixed: StringDictionary[String]
  }
  object Overhead {
    
    inline def apply(podFixed: StringDictionary[String]): Overhead = {
      val __obj = js.Dynamic.literal(podFixed = podFixed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Overhead]
    }
    
    extension [Self <: Overhead](x: Self) {
      
      inline def setPodFixed(value: StringDictionary[String]): Self = StObject.set(x, "podFixed", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Overhead structure represents the resource overhead associated with running a pod.
    */
  trait OverheadPatch extends StObject {
    
    /**
      * PodFixed represents the fixed resource overhead associated with running a pod.
      */
    var podFixed: StringDictionary[String]
  }
  object OverheadPatch {
    
    inline def apply(podFixed: StringDictionary[String]): OverheadPatch = {
      val __obj = js.Dynamic.literal(podFixed = podFixed.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverheadPatch]
    }
    
    extension [Self <: OverheadPatch](x: Self) {
      
      inline def setPodFixed(value: StringDictionary[String]): Self = StObject.set(x, "podFixed", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * RuntimeClass defines a class of container runtime supported in the cluster. The RuntimeClass is used to determine which container runtime is used to run all containers in a pod. RuntimeClasses are manually defined by a user or cluster provisioner, and referenced in the PodSpec. The Kubelet is responsible for resolving the RuntimeClassName reference before running the pod.  For more details, see https://kubernetes.io/docs/concepts/containers/runtime-class/
    */
  trait RuntimeClass extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: nodeDotk8sDotioSlashv1
    
    /**
      * Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node & CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must be lowercase, conform to the DNS Label (RFC 1123) requirements, and is immutable.
      */
    var handler: String
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.RuntimeClass
    
    /**
      * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: ObjectMeta
    
    /**
      * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see
      *  https://kubernetes.io/docs/concepts/scheduling-eviction/pod-overhead/
      */
    var overhead: Overhead
    
    /**
      * Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
      */
    var scheduling: Scheduling
  }
  object RuntimeClass {
    
    inline def apply(handler: String, metadata: ObjectMeta, overhead: Overhead, scheduling: Scheduling): RuntimeClass = {
      val __obj = js.Dynamic.literal(apiVersion = "node.k8s.io/v1", handler = handler.asInstanceOf[js.Any], kind = "RuntimeClass", metadata = metadata.asInstanceOf[js.Any], overhead = overhead.asInstanceOf[js.Any], scheduling = scheduling.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeClass]
    }
    
    extension [Self <: RuntimeClass](x: Self) {
      
      inline def setApiVersion(value: nodeDotk8sDotioSlashv1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setHandler(value: String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setKind(value: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.RuntimeClass): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setOverhead(value: Overhead): Self = StObject.set(x, "overhead", value.asInstanceOf[js.Any])
      
      inline def setScheduling(value: Scheduling): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Scheduling specifies the scheduling constraints for nodes supporting a RuntimeClass.
    */
  trait Scheduling extends StObject {
    
    /**
      * nodeSelector lists labels that must be present on nodes that support this RuntimeClass. Pods using this RuntimeClass can only be scheduled to a node matched by this selector. The RuntimeClass nodeSelector is merged with a pod's existing nodeSelector. Any conflicts will cause the pod to be rejected in admission.
      */
    var nodeSelector: StringDictionary[String]
    
    /**
      * tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively unioning the set of nodes tolerated by the pod and the RuntimeClass.
      */
    var tolerations: js.Array[Toleration]
  }
  object Scheduling {
    
    inline def apply(nodeSelector: StringDictionary[String], tolerations: js.Array[Toleration]): Scheduling = {
      val __obj = js.Dynamic.literal(nodeSelector = nodeSelector.asInstanceOf[js.Any], tolerations = tolerations.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scheduling]
    }
    
    extension [Self <: Scheduling](x: Self) {
      
      inline def setNodeSelector(value: StringDictionary[String]): Self = StObject.set(x, "nodeSelector", value.asInstanceOf[js.Any])
      
      inline def setTolerations(value: js.Array[Toleration]): Self = StObject.set(x, "tolerations", value.asInstanceOf[js.Any])
      
      inline def setTolerationsVarargs(value: Toleration*): Self = StObject.set(x, "tolerations", js.Array(value*))
    }
  }
  
  /**
    * Scheduling specifies the scheduling constraints for nodes supporting a RuntimeClass.
    */
  trait SchedulingPatch extends StObject {
    
    /**
      * nodeSelector lists labels that must be present on nodes that support this RuntimeClass. Pods using this RuntimeClass can only be scheduled to a node matched by this selector. The RuntimeClass nodeSelector is merged with a pod's existing nodeSelector. Any conflicts will cause the pod to be rejected in admission.
      */
    var nodeSelector: StringDictionary[String]
    
    /**
      * tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively unioning the set of nodes tolerated by the pod and the RuntimeClass.
      */
    var tolerations: js.Array[TolerationPatch]
  }
  object SchedulingPatch {
    
    inline def apply(nodeSelector: StringDictionary[String], tolerations: js.Array[TolerationPatch]): SchedulingPatch = {
      val __obj = js.Dynamic.literal(nodeSelector = nodeSelector.asInstanceOf[js.Any], tolerations = tolerations.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchedulingPatch]
    }
    
    extension [Self <: SchedulingPatch](x: Self) {
      
      inline def setNodeSelector(value: StringDictionary[String]): Self = StObject.set(x, "nodeSelector", value.asInstanceOf[js.Any])
      
      inline def setTolerations(value: js.Array[TolerationPatch]): Self = StObject.set(x, "tolerations", value.asInstanceOf[js.Any])
      
      inline def setTolerationsVarargs(value: TolerationPatch*): Self = StObject.set(x, "tolerations", js.Array(value*))
    }
  }
}
