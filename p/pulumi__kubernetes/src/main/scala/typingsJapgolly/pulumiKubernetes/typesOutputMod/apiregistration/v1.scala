package typingsJapgolly.pulumiKubernetes.typesOutputMod.apiregistration

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.apiregistrationDotk8sDotioSlashv1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1 {
  
  /**
    * APIService represents a server for a particular GroupVersion. Name must be "version.group".
    */
  trait APIService extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: apiregistrationDotk8sDotioSlashv1
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.APIService
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: ObjectMeta
    
    /**
      * Spec contains information for locating and communicating with a server
      */
    var spec: APIServiceSpec
    
    /**
      * Status contains derived information about an API server
      */
    var status: APIServiceStatus
  }
  object APIService {
    
    inline def apply(metadata: ObjectMeta, spec: APIServiceSpec, status: APIServiceStatus): APIService = {
      val __obj = js.Dynamic.literal(apiVersion = "apiregistration.k8s.io/v1", kind = "APIService", metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIService]
    }
    
    extension [Self <: APIService](x: Self) {
      
      inline def setApiVersion(value: apiregistrationDotk8sDotioSlashv1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setKind(value: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.APIService): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: APIServiceSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: APIServiceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * APIServiceCondition describes the state of an APIService at a particular point
    */
  trait APIServiceCondition extends StObject {
    
    /**
      * Last time the condition transitioned from one status to another.
      */
    var lastTransitionTime: String
    
    /**
      * Human-readable message indicating details about last transition.
      */
    var message: String
    
    /**
      * Unique, one-word, CamelCase reason for the condition's last transition.
      */
    var reason: String
    
    /**
      * Status is the status of the condition. Can be True, False, Unknown.
      */
    var status: String
    
    /**
      * Type is the type of the condition.
      */
    var `type`: String
  }
  object APIServiceCondition {
    
    inline def apply(lastTransitionTime: String, message: String, reason: String, status: String, `type`: String): APIServiceCondition = {
      val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIServiceCondition]
    }
    
    extension [Self <: APIServiceCondition](x: Self) {
      
      inline def setLastTransitionTime(value: String): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * APIServiceCondition describes the state of an APIService at a particular point
    */
  trait APIServiceConditionPatch extends StObject {
    
    /**
      * Last time the condition transitioned from one status to another.
      */
    var lastTransitionTime: String
    
    /**
      * Human-readable message indicating details about last transition.
      */
    var message: String
    
    /**
      * Unique, one-word, CamelCase reason for the condition's last transition.
      */
    var reason: String
    
    /**
      * Status is the status of the condition. Can be True, False, Unknown.
      */
    var status: String
    
    /**
      * Type is the type of the condition.
      */
    var `type`: String
  }
  object APIServiceConditionPatch {
    
    inline def apply(lastTransitionTime: String, message: String, reason: String, status: String, `type`: String): APIServiceConditionPatch = {
      val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIServiceConditionPatch]
    }
    
    extension [Self <: APIServiceConditionPatch](x: Self) {
      
      inline def setLastTransitionTime(value: String): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * APIServiceSpec contains information for locating and communicating with a server. Only https is supported, though you are able to disable certificate verification.
    */
  trait APIServiceSpec extends StObject {
    
    /**
      * CABundle is a PEM encoded CA bundle which will be used to validate an API server's serving certificate. If unspecified, system trust roots on the apiserver are used.
      */
    var caBundle: String
    
    /**
      * Group is the API group name this server hosts
      */
    var group: String
    
    /**
      * GroupPriorityMininum is the priority this group should have at least. Higher priority means that the group is preferred by clients over lower priority ones. Note that other versions of this group might specify even higher GroupPriorityMininum values such that the whole group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered highest number to lowest (20 before 10). The secondary sort is based on the alphabetical comparison of the name of the object.  (v1.bar before v1.foo) We'd recommend something like: *.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to be in the 2000s
      */
    var groupPriorityMinimum: Double
    
    /**
      * InsecureSkipTLSVerify disables TLS certificate verification when communicating with this server. This is strongly discouraged.  You should use the CABundle instead.
      */
    var insecureSkipTLSVerify: Boolean
    
    /**
      * Service is a reference to the service for this API server.  It must communicate on port 443. If the Service is nil, that means the handling for the API groupversion is handled locally on this server. The call will simply delegate to the normal handler chain to be fulfilled.
      */
    var service: ServiceReference
    
    /**
      * Version is the API version this server hosts.  For example, "v1"
      */
    var version: String
    
    /**
      * VersionPriority controls the ordering of this API version inside of its group.  Must be greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest (20 before 10). Since it's inside of a group, the number can be small, probably in the 10s. In case of equal version priorities, the version string will be used to compute the order inside a group. If the version string is "kube-like", it will sort above non "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a number (the major version), then optionally the string "alpha" or "beta" and another number (the minor version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
      */
    var versionPriority: Double
  }
  object APIServiceSpec {
    
    inline def apply(
      caBundle: String,
      group: String,
      groupPriorityMinimum: Double,
      insecureSkipTLSVerify: Boolean,
      service: ServiceReference,
      version: String,
      versionPriority: Double
    ): APIServiceSpec = {
      val __obj = js.Dynamic.literal(caBundle = caBundle.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], groupPriorityMinimum = groupPriorityMinimum.asInstanceOf[js.Any], insecureSkipTLSVerify = insecureSkipTLSVerify.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionPriority = versionPriority.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIServiceSpec]
    }
    
    extension [Self <: APIServiceSpec](x: Self) {
      
      inline def setCaBundle(value: String): Self = StObject.set(x, "caBundle", value.asInstanceOf[js.Any])
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupPriorityMinimum(value: Double): Self = StObject.set(x, "groupPriorityMinimum", value.asInstanceOf[js.Any])
      
      inline def setInsecureSkipTLSVerify(value: Boolean): Self = StObject.set(x, "insecureSkipTLSVerify", value.asInstanceOf[js.Any])
      
      inline def setService(value: ServiceReference): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionPriority(value: Double): Self = StObject.set(x, "versionPriority", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * APIServiceSpec contains information for locating and communicating with a server. Only https is supported, though you are able to disable certificate verification.
    */
  trait APIServiceSpecPatch extends StObject {
    
    /**
      * CABundle is a PEM encoded CA bundle which will be used to validate an API server's serving certificate. If unspecified, system trust roots on the apiserver are used.
      */
    var caBundle: String
    
    /**
      * Group is the API group name this server hosts
      */
    var group: String
    
    /**
      * GroupPriorityMininum is the priority this group should have at least. Higher priority means that the group is preferred by clients over lower priority ones. Note that other versions of this group might specify even higher GroupPriorityMininum values such that the whole group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered highest number to lowest (20 before 10). The secondary sort is based on the alphabetical comparison of the name of the object.  (v1.bar before v1.foo) We'd recommend something like: *.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to be in the 2000s
      */
    var groupPriorityMinimum: Double
    
    /**
      * InsecureSkipTLSVerify disables TLS certificate verification when communicating with this server. This is strongly discouraged.  You should use the CABundle instead.
      */
    var insecureSkipTLSVerify: Boolean
    
    /**
      * Service is a reference to the service for this API server.  It must communicate on port 443. If the Service is nil, that means the handling for the API groupversion is handled locally on this server. The call will simply delegate to the normal handler chain to be fulfilled.
      */
    var service: ServiceReferencePatch
    
    /**
      * Version is the API version this server hosts.  For example, "v1"
      */
    var version: String
    
    /**
      * VersionPriority controls the ordering of this API version inside of its group.  Must be greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest (20 before 10). Since it's inside of a group, the number can be small, probably in the 10s. In case of equal version priorities, the version string will be used to compute the order inside a group. If the version string is "kube-like", it will sort above non "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a number (the major version), then optionally the string "alpha" or "beta" and another number (the minor version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
      */
    var versionPriority: Double
  }
  object APIServiceSpecPatch {
    
    inline def apply(
      caBundle: String,
      group: String,
      groupPriorityMinimum: Double,
      insecureSkipTLSVerify: Boolean,
      service: ServiceReferencePatch,
      version: String,
      versionPriority: Double
    ): APIServiceSpecPatch = {
      val __obj = js.Dynamic.literal(caBundle = caBundle.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], groupPriorityMinimum = groupPriorityMinimum.asInstanceOf[js.Any], insecureSkipTLSVerify = insecureSkipTLSVerify.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionPriority = versionPriority.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIServiceSpecPatch]
    }
    
    extension [Self <: APIServiceSpecPatch](x: Self) {
      
      inline def setCaBundle(value: String): Self = StObject.set(x, "caBundle", value.asInstanceOf[js.Any])
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupPriorityMinimum(value: Double): Self = StObject.set(x, "groupPriorityMinimum", value.asInstanceOf[js.Any])
      
      inline def setInsecureSkipTLSVerify(value: Boolean): Self = StObject.set(x, "insecureSkipTLSVerify", value.asInstanceOf[js.Any])
      
      inline def setService(value: ServiceReferencePatch): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionPriority(value: Double): Self = StObject.set(x, "versionPriority", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * APIServiceStatus contains derived information about an API server
    */
  trait APIServiceStatus extends StObject {
    
    /**
      * Current service state of apiService.
      */
    var conditions: js.Array[APIServiceCondition]
  }
  object APIServiceStatus {
    
    inline def apply(conditions: js.Array[APIServiceCondition]): APIServiceStatus = {
      val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIServiceStatus]
    }
    
    extension [Self <: APIServiceStatus](x: Self) {
      
      inline def setConditions(value: js.Array[APIServiceCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsVarargs(value: APIServiceCondition*): Self = StObject.set(x, "conditions", js.Array(value*))
    }
  }
  
  /**
    * APIServiceStatus contains derived information about an API server
    */
  trait APIServiceStatusPatch extends StObject {
    
    /**
      * Current service state of apiService.
      */
    var conditions: js.Array[APIServiceConditionPatch]
  }
  object APIServiceStatusPatch {
    
    inline def apply(conditions: js.Array[APIServiceConditionPatch]): APIServiceStatusPatch = {
      val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIServiceStatusPatch]
    }
    
    extension [Self <: APIServiceStatusPatch](x: Self) {
      
      inline def setConditions(value: js.Array[APIServiceConditionPatch]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsVarargs(value: APIServiceConditionPatch*): Self = StObject.set(x, "conditions", js.Array(value*))
    }
  }
  
  /**
    * ServiceReference holds a reference to Service.legacy.k8s.io
    */
  trait ServiceReference extends StObject {
    
    /**
      * Name is the name of the service
      */
    var name: String
    
    /**
      * Namespace is the namespace of the service
      */
    var namespace: String
    
    /**
      * If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).
      */
    var port: Double
  }
  object ServiceReference {
    
    inline def apply(name: String, namespace: String, port: Double): ServiceReference = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceReference]
    }
    
    extension [Self <: ServiceReference](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * ServiceReference holds a reference to Service.legacy.k8s.io
    */
  trait ServiceReferencePatch extends StObject {
    
    /**
      * Name is the name of the service
      */
    var name: String
    
    /**
      * Namespace is the namespace of the service
      */
    var namespace: String
    
    /**
      * If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).
      */
    var port: Double
  }
  object ServiceReferencePatch {
    
    inline def apply(name: String, namespace: String, port: Double): ServiceReferencePatch = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceReferencePatch]
    }
    
    extension [Self <: ServiceReferencePatch](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
}
