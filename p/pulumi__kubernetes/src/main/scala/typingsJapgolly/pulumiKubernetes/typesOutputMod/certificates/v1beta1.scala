package typingsJapgolly.pulumiKubernetes.typesOutputMod.certificates

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.certificatesDotk8sDotioSlashv1beta1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1beta1 {
  
  /**
    * Describes a certificate signing request
    */
  trait CertificateSigningRequest extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: certificatesDotk8sDotioSlashv1beta1
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequest
    
    var metadata: ObjectMeta
    
    /**
      * The certificate request itself and any additional information.
      */
    var spec: CertificateSigningRequestSpec
    
    /**
      * Derived information about the request.
      */
    var status: CertificateSigningRequestStatus
  }
  object CertificateSigningRequest {
    
    inline def apply(metadata: ObjectMeta, spec: CertificateSigningRequestSpec, status: CertificateSigningRequestStatus): CertificateSigningRequest = {
      val __obj = js.Dynamic.literal(apiVersion = "certificates.k8s.io/v1beta1", kind = "CertificateSigningRequest", metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateSigningRequest]
    }
    
    extension [Self <: CertificateSigningRequest](x: Self) {
      
      inline def setApiVersion(value: certificatesDotk8sDotioSlashv1beta1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setKind(value: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequest): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: CertificateSigningRequestSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: CertificateSigningRequestStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait CertificateSigningRequestCondition extends StObject {
    
    /**
      * lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition's status is changed, the server defaults this to the current time.
      */
    var lastTransitionTime: String
    
    /**
      * timestamp for the last update to this condition
      */
    var lastUpdateTime: String
    
    /**
      * human readable message with details about the request state
      */
    var message: String
    
    /**
      * brief reason for the request state
      */
    var reason: String
    
    /**
      * Status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be "False" or "Unknown". Defaults to "True". If unset, should be treated as "True".
      */
    var status: String
    
    /**
      * request approval state, currently Approved or Denied.
      */
    var `type`: String
  }
  object CertificateSigningRequestCondition {
    
    inline def apply(
      lastTransitionTime: String,
      lastUpdateTime: String,
      message: String,
      reason: String,
      status: String,
      `type`: String
    ): CertificateSigningRequestCondition = {
      val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], lastUpdateTime = lastUpdateTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateSigningRequestCondition]
    }
    
    extension [Self <: CertificateSigningRequestCondition](x: Self) {
      
      inline def setLastTransitionTime(value: String): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
      
      inline def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait CertificateSigningRequestConditionPatch extends StObject {
    
    /**
      * lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition's status is changed, the server defaults this to the current time.
      */
    var lastTransitionTime: String
    
    /**
      * timestamp for the last update to this condition
      */
    var lastUpdateTime: String
    
    /**
      * human readable message with details about the request state
      */
    var message: String
    
    /**
      * brief reason for the request state
      */
    var reason: String
    
    /**
      * Status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be "False" or "Unknown". Defaults to "True". If unset, should be treated as "True".
      */
    var status: String
    
    /**
      * request approval state, currently Approved or Denied.
      */
    var `type`: String
  }
  object CertificateSigningRequestConditionPatch {
    
    inline def apply(
      lastTransitionTime: String,
      lastUpdateTime: String,
      message: String,
      reason: String,
      status: String,
      `type`: String
    ): CertificateSigningRequestConditionPatch = {
      val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], lastUpdateTime = lastUpdateTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateSigningRequestConditionPatch]
    }
    
    extension [Self <: CertificateSigningRequestConditionPatch](x: Self) {
      
      inline def setLastTransitionTime(value: String): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
      
      inline def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * This information is immutable after the request is created. Only the Request and Usages fields can be set on creation, other fields are derived by Kubernetes and cannot be modified by users.
    */
  trait CertificateSigningRequestSpec extends StObject {
    
    /**
      * Extra information about the requesting user. See user.Info interface for details.
      */
    var extra: StringDictionary[js.Array[String]]
    
    /**
      * Group information about the requesting user. See user.Info interface for details.
      */
    var groups: js.Array[String]
    
    /**
      * Base64-encoded PKCS#10 CSR data
      */
    var request: String
    
    /**
      * Requested signer for the request. It is a qualified name in the form: `scope-hostname.io/name`. If empty, it will be defaulted:
      *  1. If it's a kubelet client certificate, it is assigned
      *     "kubernetes.io/kube-apiserver-client-kubelet".
      *  2. If it's a kubelet serving certificate, it is assigned
      *     "kubernetes.io/kubelet-serving".
      *  3. Otherwise, it is assigned "kubernetes.io/legacy-unknown".
      * Distribution of trust for signers happens out of band. You can select on this field using `spec.signerName`.
      */
    var signerName: String
    
    /**
      * UID information about the requesting user. See user.Info interface for details.
      */
    var uid: String
    
    /**
      * allowedUsages specifies a set of usage contexts the key will be valid for. See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
      *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
      */
    var usages: js.Array[String]
    
    /**
      * Information about the requesting user. See user.Info interface for details.
      */
    var username: String
  }
  object CertificateSigningRequestSpec {
    
    inline def apply(
      extra: StringDictionary[js.Array[String]],
      groups: js.Array[String],
      request: String,
      signerName: String,
      uid: String,
      usages: js.Array[String],
      username: String
    ): CertificateSigningRequestSpec = {
      val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], signerName = signerName.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateSigningRequestSpec]
    }
    
    extension [Self <: CertificateSigningRequestSpec](x: Self) {
      
      inline def setExtra(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
      
      inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setSignerName(value: String): Self = StObject.set(x, "signerName", value.asInstanceOf[js.Any])
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUsages(value: js.Array[String]): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
      
      inline def setUsagesVarargs(value: String*): Self = StObject.set(x, "usages", js.Array(value*))
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * This information is immutable after the request is created. Only the Request and Usages fields can be set on creation, other fields are derived by Kubernetes and cannot be modified by users.
    */
  trait CertificateSigningRequestSpecPatch extends StObject {
    
    /**
      * Extra information about the requesting user. See user.Info interface for details.
      */
    var extra: StringDictionary[js.Array[String]]
    
    /**
      * Group information about the requesting user. See user.Info interface for details.
      */
    var groups: js.Array[String]
    
    /**
      * Base64-encoded PKCS#10 CSR data
      */
    var request: String
    
    /**
      * Requested signer for the request. It is a qualified name in the form: `scope-hostname.io/name`. If empty, it will be defaulted:
      *  1. If it's a kubelet client certificate, it is assigned
      *     "kubernetes.io/kube-apiserver-client-kubelet".
      *  2. If it's a kubelet serving certificate, it is assigned
      *     "kubernetes.io/kubelet-serving".
      *  3. Otherwise, it is assigned "kubernetes.io/legacy-unknown".
      * Distribution of trust for signers happens out of band. You can select on this field using `spec.signerName`.
      */
    var signerName: String
    
    /**
      * UID information about the requesting user. See user.Info interface for details.
      */
    var uid: String
    
    /**
      * allowedUsages specifies a set of usage contexts the key will be valid for. See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
      *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
      */
    var usages: js.Array[String]
    
    /**
      * Information about the requesting user. See user.Info interface for details.
      */
    var username: String
  }
  object CertificateSigningRequestSpecPatch {
    
    inline def apply(
      extra: StringDictionary[js.Array[String]],
      groups: js.Array[String],
      request: String,
      signerName: String,
      uid: String,
      usages: js.Array[String],
      username: String
    ): CertificateSigningRequestSpecPatch = {
      val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], signerName = signerName.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateSigningRequestSpecPatch]
    }
    
    extension [Self <: CertificateSigningRequestSpecPatch](x: Self) {
      
      inline def setExtra(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
      
      inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setSignerName(value: String): Self = StObject.set(x, "signerName", value.asInstanceOf[js.Any])
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUsages(value: js.Array[String]): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
      
      inline def setUsagesVarargs(value: String*): Self = StObject.set(x, "usages", js.Array(value*))
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait CertificateSigningRequestStatus extends StObject {
    
    /**
      * If request was approved, the controller will place the issued certificate here.
      */
    var certificate: String
    
    /**
      * Conditions applied to the request, such as approval or denial.
      */
    var conditions: js.Array[CertificateSigningRequestCondition]
  }
  object CertificateSigningRequestStatus {
    
    inline def apply(certificate: String, conditions: js.Array[CertificateSigningRequestCondition]): CertificateSigningRequestStatus = {
      val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateSigningRequestStatus]
    }
    
    extension [Self <: CertificateSigningRequestStatus](x: Self) {
      
      inline def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      inline def setConditions(value: js.Array[CertificateSigningRequestCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsVarargs(value: CertificateSigningRequestCondition*): Self = StObject.set(x, "conditions", js.Array(value*))
    }
  }
  
  trait CertificateSigningRequestStatusPatch extends StObject {
    
    /**
      * If request was approved, the controller will place the issued certificate here.
      */
    var certificate: String
    
    /**
      * Conditions applied to the request, such as approval or denial.
      */
    var conditions: js.Array[CertificateSigningRequestConditionPatch]
  }
  object CertificateSigningRequestStatusPatch {
    
    inline def apply(certificate: String, conditions: js.Array[CertificateSigningRequestConditionPatch]): CertificateSigningRequestStatusPatch = {
      val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateSigningRequestStatusPatch]
    }
    
    extension [Self <: CertificateSigningRequestStatusPatch](x: Self) {
      
      inline def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      inline def setConditions(value: js.Array[CertificateSigningRequestConditionPatch]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsVarargs(value: CertificateSigningRequestConditionPatch*): Self = StObject.set(x, "conditions", js.Array(value*))
    }
  }
}
