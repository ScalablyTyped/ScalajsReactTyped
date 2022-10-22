package typingsJapgolly.pulumiKubernetes.typesOutputMod.certificates

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.certificatesDotk8sDotioSlashv1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1 {
  
  /**
    * CertificateSigningRequest objects provide a mechanism to obtain x509 certificates by submitting a certificate signing request, and having it asynchronously approved and issued.
    *
    * Kubelets use this API to obtain:
    *  1. client certificates to authenticate to kube-apiserver (with the "kubernetes.io/kube-apiserver-client-kubelet" signerName).
    *  2. serving certificates for TLS endpoints kube-apiserver can connect to securely (with the "kubernetes.io/kubelet-serving" signerName).
    *
    * This API can be used to request client certificates to authenticate to kube-apiserver (with the "kubernetes.io/kube-apiserver-client" signerName), or to obtain certificates from custom non-Kubernetes signers.
    */
  trait CertificateSigningRequest extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: certificatesDotk8sDotioSlashv1
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequest
    
    var metadata: ObjectMeta
    
    /**
      * spec contains the certificate request, and is immutable after creation. Only the request, signerName, expirationSeconds, and usages fields can be set on creation. Other fields are derived by Kubernetes and cannot be modified by users.
      */
    var spec: CertificateSigningRequestSpec
    
    /**
      * status contains information about whether the request is approved or denied, and the certificate issued by the signer, or the failure condition indicating signer failure.
      */
    var status: CertificateSigningRequestStatus
  }
  object CertificateSigningRequest {
    
    inline def apply(metadata: ObjectMeta, spec: CertificateSigningRequestSpec, status: CertificateSigningRequestStatus): CertificateSigningRequest = {
      val __obj = js.Dynamic.literal(apiVersion = "certificates.k8s.io/v1", kind = "CertificateSigningRequest", metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateSigningRequest]
    }
    
    extension [Self <: CertificateSigningRequest](x: Self) {
      
      inline def setApiVersion(value: certificatesDotk8sDotioSlashv1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setKind(value: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequest): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: CertificateSigningRequestSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: CertificateSigningRequestStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * CertificateSigningRequestCondition describes a condition of a CertificateSigningRequest object
    */
  trait CertificateSigningRequestCondition extends StObject {
    
    /**
      * lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition's status is changed, the server defaults this to the current time.
      */
    var lastTransitionTime: String
    
    /**
      * lastUpdateTime is the time of the last update to this condition
      */
    var lastUpdateTime: String
    
    /**
      * message contains a human readable message with details about the request state
      */
    var message: String
    
    /**
      * reason indicates a brief reason for the request state
      */
    var reason: String
    
    /**
      * status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be "False" or "Unknown".
      */
    var status: String
    
    /**
      * type of the condition. Known conditions are "Approved", "Denied", and "Failed".
      *
      * An "Approved" condition is added via the /approval subresource, indicating the request was approved and should be issued by the signer.
      *
      * A "Denied" condition is added via the /approval subresource, indicating the request was denied and should not be issued by the signer.
      *
      * A "Failed" condition is added via the /status subresource, indicating the signer failed to issue the certificate.
      *
      * Approved and Denied conditions are mutually exclusive. Approved, Denied, and Failed conditions cannot be removed once added.
      *
      * Only one condition of a given type is allowed.
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
  
  /**
    * CertificateSigningRequestCondition describes a condition of a CertificateSigningRequest object
    */
  trait CertificateSigningRequestConditionPatch extends StObject {
    
    /**
      * lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition's status is changed, the server defaults this to the current time.
      */
    var lastTransitionTime: String
    
    /**
      * lastUpdateTime is the time of the last update to this condition
      */
    var lastUpdateTime: String
    
    /**
      * message contains a human readable message with details about the request state
      */
    var message: String
    
    /**
      * reason indicates a brief reason for the request state
      */
    var reason: String
    
    /**
      * status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be "False" or "Unknown".
      */
    var status: String
    
    /**
      * type of the condition. Known conditions are "Approved", "Denied", and "Failed".
      *
      * An "Approved" condition is added via the /approval subresource, indicating the request was approved and should be issued by the signer.
      *
      * A "Denied" condition is added via the /approval subresource, indicating the request was denied and should not be issued by the signer.
      *
      * A "Failed" condition is added via the /status subresource, indicating the signer failed to issue the certificate.
      *
      * Approved and Denied conditions are mutually exclusive. Approved, Denied, and Failed conditions cannot be removed once added.
      *
      * Only one condition of a given type is allowed.
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
    * CertificateSigningRequestSpec contains the certificate request.
    */
  trait CertificateSigningRequestSpec extends StObject {
    
    /**
      * expirationSeconds is the requested duration of validity of the issued certificate. The certificate signer may issue a certificate with a different validity duration so a client must check the delta between the notBefore and and notAfter fields in the issued certificate to determine the actual duration.
      *
      * The v1.22+ in-tree implementations of the well-known Kubernetes signers will honor this field as long as the requested duration is not greater than the maximum duration they will honor per the --cluster-signing-duration CLI flag to the Kubernetes controller manager.
      *
      * Certificate signers may not honor this field for various reasons:
      *
      *   1. Old signer that is unaware of the field (such as the in-tree
      *      implementations prior to v1.22)
      *   2. Signer whose configured maximum is shorter than the requested duration
      *   3. Signer whose configured minimum is longer than the requested duration
      *
      * The minimum valid value for expirationSeconds is 600, i.e. 10 minutes.
      */
    var expirationSeconds: Double
    
    /**
      * extra contains extra attributes of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
      */
    var extra: StringDictionary[js.Array[String]]
    
    /**
      * groups contains group membership of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
      */
    var groups: js.Array[String]
    
    /**
      * request contains an x509 certificate signing request encoded in a "CERTIFICATE REQUEST" PEM block. When serialized as JSON or YAML, the data is additionally base64-encoded.
      */
    var request: String
    
    /**
      * signerName indicates the requested signer, and is a qualified name.
      *
      * List/watch requests for CertificateSigningRequests can filter on this field using a "spec.signerName=NAME" fieldSelector.
      *
      * Well-known Kubernetes signers are:
      *  1. "kubernetes.io/kube-apiserver-client": issues client certificates that can be used to authenticate to kube-apiserver.
      *   Requests for this signer are never auto-approved by kube-controller-manager, can be issued by the "csrsigning" controller in kube-controller-manager.
      *  2. "kubernetes.io/kube-apiserver-client-kubelet": issues client certificates that kubelets use to authenticate to kube-apiserver.
      *   Requests for this signer can be auto-approved by the "csrapproving" controller in kube-controller-manager, and can be issued by the "csrsigning" controller in kube-controller-manager.
      *  3. "kubernetes.io/kubelet-serving" issues serving certificates that kubelets use to serve TLS endpoints, which kube-apiserver can connect to securely.
      *   Requests for this signer are never auto-approved by kube-controller-manager, and can be issued by the "csrsigning" controller in kube-controller-manager.
      *
      * More details are available at https://k8s.io/docs/reference/access-authn-authz/certificate-signing-requests/#kubernetes-signers
      *
      * Custom signerNames can also be specified. The signer defines:
      *  1. Trust distribution: how trust (CA bundles) are distributed.
      *  2. Permitted subjects: and behavior when a disallowed subject is requested.
      *  3. Required, permitted, or forbidden x509 extensions in the request (including whether subjectAltNames are allowed, which types, restrictions on allowed values) and behavior when a disallowed extension is requested.
      *  4. Required, permitted, or forbidden key usages / extended key usages.
      *  5. Expiration/certificate lifetime: whether it is fixed by the signer, configurable by the admin.
      *  6. Whether or not requests for CA certificates are allowed.
      */
    var signerName: String
    
    /**
      * uid contains the uid of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
      */
    var uid: String
    
    /**
      * usages specifies a set of key usages requested in the issued certificate.
      *
      * Requests for TLS client certificates typically request: "digital signature", "key encipherment", "client auth".
      *
      * Requests for TLS serving certificates typically request: "key encipherment", "digital signature", "server auth".
      *
      * Valid values are:
      *  "signing", "digital signature", "content commitment",
      *  "key encipherment", "key agreement", "data encipherment",
      *  "cert sign", "crl sign", "encipher only", "decipher only", "any",
      *  "server auth", "client auth",
      *  "code signing", "email protection", "s/mime",
      *  "ipsec end system", "ipsec tunnel", "ipsec user",
      *  "timestamping", "ocsp signing", "microsoft sgc", "netscape sgc"
      */
    var usages: js.Array[String]
    
    /**
      * username contains the name of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
      */
    var username: String
  }
  object CertificateSigningRequestSpec {
    
    inline def apply(
      expirationSeconds: Double,
      extra: StringDictionary[js.Array[String]],
      groups: js.Array[String],
      request: String,
      signerName: String,
      uid: String,
      usages: js.Array[String],
      username: String
    ): CertificateSigningRequestSpec = {
      val __obj = js.Dynamic.literal(expirationSeconds = expirationSeconds.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], signerName = signerName.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateSigningRequestSpec]
    }
    
    extension [Self <: CertificateSigningRequestSpec](x: Self) {
      
      inline def setExpirationSeconds(value: Double): Self = StObject.set(x, "expirationSeconds", value.asInstanceOf[js.Any])
      
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
    * CertificateSigningRequestSpec contains the certificate request.
    */
  trait CertificateSigningRequestSpecPatch extends StObject {
    
    /**
      * expirationSeconds is the requested duration of validity of the issued certificate. The certificate signer may issue a certificate with a different validity duration so a client must check the delta between the notBefore and and notAfter fields in the issued certificate to determine the actual duration.
      *
      * The v1.22+ in-tree implementations of the well-known Kubernetes signers will honor this field as long as the requested duration is not greater than the maximum duration they will honor per the --cluster-signing-duration CLI flag to the Kubernetes controller manager.
      *
      * Certificate signers may not honor this field for various reasons:
      *
      *   1. Old signer that is unaware of the field (such as the in-tree
      *      implementations prior to v1.22)
      *   2. Signer whose configured maximum is shorter than the requested duration
      *   3. Signer whose configured minimum is longer than the requested duration
      *
      * The minimum valid value for expirationSeconds is 600, i.e. 10 minutes.
      */
    var expirationSeconds: Double
    
    /**
      * extra contains extra attributes of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
      */
    var extra: StringDictionary[js.Array[String]]
    
    /**
      * groups contains group membership of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
      */
    var groups: js.Array[String]
    
    /**
      * request contains an x509 certificate signing request encoded in a "CERTIFICATE REQUEST" PEM block. When serialized as JSON or YAML, the data is additionally base64-encoded.
      */
    var request: String
    
    /**
      * signerName indicates the requested signer, and is a qualified name.
      *
      * List/watch requests for CertificateSigningRequests can filter on this field using a "spec.signerName=NAME" fieldSelector.
      *
      * Well-known Kubernetes signers are:
      *  1. "kubernetes.io/kube-apiserver-client": issues client certificates that can be used to authenticate to kube-apiserver.
      *   Requests for this signer are never auto-approved by kube-controller-manager, can be issued by the "csrsigning" controller in kube-controller-manager.
      *  2. "kubernetes.io/kube-apiserver-client-kubelet": issues client certificates that kubelets use to authenticate to kube-apiserver.
      *   Requests for this signer can be auto-approved by the "csrapproving" controller in kube-controller-manager, and can be issued by the "csrsigning" controller in kube-controller-manager.
      *  3. "kubernetes.io/kubelet-serving" issues serving certificates that kubelets use to serve TLS endpoints, which kube-apiserver can connect to securely.
      *   Requests for this signer are never auto-approved by kube-controller-manager, and can be issued by the "csrsigning" controller in kube-controller-manager.
      *
      * More details are available at https://k8s.io/docs/reference/access-authn-authz/certificate-signing-requests/#kubernetes-signers
      *
      * Custom signerNames can also be specified. The signer defines:
      *  1. Trust distribution: how trust (CA bundles) are distributed.
      *  2. Permitted subjects: and behavior when a disallowed subject is requested.
      *  3. Required, permitted, or forbidden x509 extensions in the request (including whether subjectAltNames are allowed, which types, restrictions on allowed values) and behavior when a disallowed extension is requested.
      *  4. Required, permitted, or forbidden key usages / extended key usages.
      *  5. Expiration/certificate lifetime: whether it is fixed by the signer, configurable by the admin.
      *  6. Whether or not requests for CA certificates are allowed.
      */
    var signerName: String
    
    /**
      * uid contains the uid of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
      */
    var uid: String
    
    /**
      * usages specifies a set of key usages requested in the issued certificate.
      *
      * Requests for TLS client certificates typically request: "digital signature", "key encipherment", "client auth".
      *
      * Requests for TLS serving certificates typically request: "key encipherment", "digital signature", "server auth".
      *
      * Valid values are:
      *  "signing", "digital signature", "content commitment",
      *  "key encipherment", "key agreement", "data encipherment",
      *  "cert sign", "crl sign", "encipher only", "decipher only", "any",
      *  "server auth", "client auth",
      *  "code signing", "email protection", "s/mime",
      *  "ipsec end system", "ipsec tunnel", "ipsec user",
      *  "timestamping", "ocsp signing", "microsoft sgc", "netscape sgc"
      */
    var usages: js.Array[String]
    
    /**
      * username contains the name of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
      */
    var username: String
  }
  object CertificateSigningRequestSpecPatch {
    
    inline def apply(
      expirationSeconds: Double,
      extra: StringDictionary[js.Array[String]],
      groups: js.Array[String],
      request: String,
      signerName: String,
      uid: String,
      usages: js.Array[String],
      username: String
    ): CertificateSigningRequestSpecPatch = {
      val __obj = js.Dynamic.literal(expirationSeconds = expirationSeconds.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], signerName = signerName.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateSigningRequestSpecPatch]
    }
    
    extension [Self <: CertificateSigningRequestSpecPatch](x: Self) {
      
      inline def setExpirationSeconds(value: Double): Self = StObject.set(x, "expirationSeconds", value.asInstanceOf[js.Any])
      
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
    * CertificateSigningRequestStatus contains conditions used to indicate approved/denied/failed status of the request, and the issued certificate.
    */
  trait CertificateSigningRequestStatus extends StObject {
    
    /**
      * certificate is populated with an issued certificate by the signer after an Approved condition is present. This field is set via the /status subresource. Once populated, this field is immutable.
      *
      * If the certificate signing request is denied, a condition of type "Denied" is added and this field remains empty. If the signer cannot issue the certificate, a condition of type "Failed" is added and this field remains empty.
      *
      * Validation requirements:
      *  1. certificate must contain one or more PEM blocks.
      *  2. All PEM blocks must have the "CERTIFICATE" label, contain no headers, and the encoded data
      *   must be a BER-encoded ASN.1 Certificate structure as described in section 4 of RFC5280.
      *  3. Non-PEM content may appear before or after the "CERTIFICATE" PEM blocks and is unvalidated,
      *   to allow for explanatory text as described in section 5.2 of RFC7468.
      *
      * If more than one PEM block is present, and the definition of the requested spec.signerName does not indicate otherwise, the first block is the issued certificate, and subsequent blocks should be treated as intermediate certificates and presented in TLS handshakes.
      *
      * The certificate is encoded in PEM format.
      *
      * When serialized as JSON or YAML, the data is additionally base64-encoded, so it consists of:
      *
      *     base64(
      *     -----BEGIN CERTIFICATE-----
      *     ...
      *     -----END CERTIFICATE-----
      *     )
      */
    var certificate: String
    
    /**
      * conditions applied to the request. Known conditions are "Approved", "Denied", and "Failed".
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
  
  /**
    * CertificateSigningRequestStatus contains conditions used to indicate approved/denied/failed status of the request, and the issued certificate.
    */
  trait CertificateSigningRequestStatusPatch extends StObject {
    
    /**
      * certificate is populated with an issued certificate by the signer after an Approved condition is present. This field is set via the /status subresource. Once populated, this field is immutable.
      *
      * If the certificate signing request is denied, a condition of type "Denied" is added and this field remains empty. If the signer cannot issue the certificate, a condition of type "Failed" is added and this field remains empty.
      *
      * Validation requirements:
      *  1. certificate must contain one or more PEM blocks.
      *  2. All PEM blocks must have the "CERTIFICATE" label, contain no headers, and the encoded data
      *   must be a BER-encoded ASN.1 Certificate structure as described in section 4 of RFC5280.
      *  3. Non-PEM content may appear before or after the "CERTIFICATE" PEM blocks and is unvalidated,
      *   to allow for explanatory text as described in section 5.2 of RFC7468.
      *
      * If more than one PEM block is present, and the definition of the requested spec.signerName does not indicate otherwise, the first block is the issued certificate, and subsequent blocks should be treated as intermediate certificates and presented in TLS handshakes.
      *
      * The certificate is encoded in PEM format.
      *
      * When serialized as JSON or YAML, the data is additionally base64-encoded, so it consists of:
      *
      *     base64(
      *     -----BEGIN CERTIFICATE-----
      *     ...
      *     -----END CERTIFICATE-----
      *     )
      */
    var certificate: String
    
    /**
      * conditions applied to the request. Known conditions are "Approved", "Denied", and "Failed".
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
