package typingsJapgolly.pulumiKubernetes.typesOutputMod.apps.v1

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.appsSlashv1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DaemonSet represents the configuration of a daemon set.
  */
trait DaemonSet extends StObject {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: appsSlashv1
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.DaemonSet
  
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta
  
  /**
    * The desired behavior of this daemon set. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  var spec: DaemonSetSpec
  
  /**
    * The current status of this daemon set. This data may be out of date by some window of time. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  var status: DaemonSetStatus
}
object DaemonSet {
  
  inline def apply(metadata: ObjectMeta, spec: DaemonSetSpec, status: DaemonSetStatus): DaemonSet = {
    val __obj = js.Dynamic.literal(apiVersion = "apps/v1", kind = "DaemonSet", metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaemonSet]
  }
  
  extension [Self <: DaemonSet](x: Self) {
    
    inline def setApiVersion(value: appsSlashv1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setKind(value: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.DaemonSet): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: DaemonSetSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: DaemonSetStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
