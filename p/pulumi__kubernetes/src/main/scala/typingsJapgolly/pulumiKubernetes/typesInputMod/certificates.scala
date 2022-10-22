package typingsJapgolly.pulumiKubernetes.typesInputMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.certificatesDotk8sDotioSlashv1
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.certificatesDotk8sDotioSlashv1beta1
import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certificates {
  
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
      var apiVersion: js.UndefOr[Input[certificatesDotk8sDotioSlashv1]] = js.undefined
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[
              typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequest
            ]
          ] = js.undefined
      
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      
      /**
        * spec contains the certificate request, and is immutable after creation. Only the request, signerName, expirationSeconds, and usages fields can be set on creation. Other fields are derived by Kubernetes and cannot be modified by users.
        */
      var spec: Input[CertificateSigningRequestSpec]
      
      /**
        * status contains information about whether the request is approved or denied, and the certificate issued by the signer, or the failure condition indicating signer failure.
        */
      var status: js.UndefOr[Input[CertificateSigningRequestStatus]] = js.undefined
    }
    object CertificateSigningRequest {
      
      inline def apply(spec: Input[CertificateSigningRequestSpec]): CertificateSigningRequest = {
        val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
        __obj.asInstanceOf[CertificateSigningRequest]
      }
      
      extension [Self <: CertificateSigningRequest](x: Self) {
        
        inline def setApiVersion(value: Input[certificatesDotk8sDotioSlashv1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
        
        inline def setKind(
          value: Input[
                  typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequest
                ]
        ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setSpec(value: Input[CertificateSigningRequestSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: Input[CertificateSigningRequestStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    /**
      * CertificateSigningRequestCondition describes a condition of a CertificateSigningRequest object
      */
    trait CertificateSigningRequestCondition extends StObject {
      
      /**
        * lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition's status is changed, the server defaults this to the current time.
        */
      var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * lastUpdateTime is the time of the last update to this condition
        */
      var lastUpdateTime: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * message contains a human readable message with details about the request state
        */
      var message: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * reason indicates a brief reason for the request state
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be "False" or "Unknown".
        */
      var status: Input[String]
      
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
      var `type`: Input[String]
    }
    object CertificateSigningRequestCondition {
      
      inline def apply(status: Input[String], `type`: Input[String]): CertificateSigningRequestCondition = {
        val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[CertificateSigningRequestCondition]
      }
      
      extension [Self <: CertificateSigningRequestCondition](x: Self) {
        
        inline def setLastTransitionTime(value: Input[String]): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
        
        inline def setLastTransitionTimeUndefined: Self = StObject.set(x, "lastTransitionTime", js.undefined)
        
        inline def setLastUpdateTime(value: Input[String]): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
        
        inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
        
        inline def setMessage(value: Input[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
        
        inline def setReason(value: Input[String]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
        
        inline def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
      var expirationSeconds: js.UndefOr[Input[Double]] = js.undefined
      
      /**
        * extra contains extra attributes of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
        */
      var extra: js.UndefOr[Input[StringDictionary[Input[js.Array[Input[String]]]]]] = js.undefined
      
      /**
        * groups contains group membership of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
        */
      var groups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      
      /**
        * request contains an x509 certificate signing request encoded in a "CERTIFICATE REQUEST" PEM block. When serialized as JSON or YAML, the data is additionally base64-encoded.
        */
      var request: Input[String]
      
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
      var signerName: Input[String]
      
      /**
        * uid contains the uid of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
        */
      var uid: js.UndefOr[Input[String]] = js.undefined
      
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
      var usages: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      
      /**
        * username contains the name of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
        */
      var username: js.UndefOr[Input[String]] = js.undefined
    }
    object CertificateSigningRequestSpec {
      
      inline def apply(request: Input[String], signerName: Input[String]): CertificateSigningRequestSpec = {
        val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], signerName = signerName.asInstanceOf[js.Any])
        __obj.asInstanceOf[CertificateSigningRequestSpec]
      }
      
      extension [Self <: CertificateSigningRequestSpec](x: Self) {
        
        inline def setExpirationSeconds(value: Input[Double]): Self = StObject.set(x, "expirationSeconds", value.asInstanceOf[js.Any])
        
        inline def setExpirationSecondsUndefined: Self = StObject.set(x, "expirationSeconds", js.undefined)
        
        inline def setExtra(value: Input[StringDictionary[Input[js.Array[Input[String]]]]]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
        
        inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
        
        inline def setGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
        
        inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
        
        inline def setGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "groups", js.Array(value*))
        
        inline def setRequest(value: Input[String]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        inline def setSignerName(value: Input[String]): Self = StObject.set(x, "signerName", value.asInstanceOf[js.Any])
        
        inline def setUid(value: Input[String]): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
        
        inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
        
        inline def setUsages(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
        
        inline def setUsagesUndefined: Self = StObject.set(x, "usages", js.undefined)
        
        inline def setUsagesVarargs(value: Input[String]*): Self = StObject.set(x, "usages", js.Array(value*))
        
        inline def setUsername(value: Input[String]): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
        
        inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
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
      var expirationSeconds: js.UndefOr[Input[Double]] = js.undefined
      
      /**
        * extra contains extra attributes of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
        */
      var extra: js.UndefOr[Input[StringDictionary[Input[js.Array[Input[String]]]]]] = js.undefined
      
      /**
        * groups contains group membership of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
        */
      var groups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      
      /**
        * request contains an x509 certificate signing request encoded in a "CERTIFICATE REQUEST" PEM block. When serialized as JSON or YAML, the data is additionally base64-encoded.
        */
      var request: js.UndefOr[Input[String]] = js.undefined
      
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
      var signerName: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * uid contains the uid of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
        */
      var uid: js.UndefOr[Input[String]] = js.undefined
      
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
      var usages: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      
      /**
        * username contains the name of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
        */
      var username: js.UndefOr[Input[String]] = js.undefined
    }
    object CertificateSigningRequestSpecPatch {
      
      inline def apply(): CertificateSigningRequestSpecPatch = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CertificateSigningRequestSpecPatch]
      }
      
      extension [Self <: CertificateSigningRequestSpecPatch](x: Self) {
        
        inline def setExpirationSeconds(value: Input[Double]): Self = StObject.set(x, "expirationSeconds", value.asInstanceOf[js.Any])
        
        inline def setExpirationSecondsUndefined: Self = StObject.set(x, "expirationSeconds", js.undefined)
        
        inline def setExtra(value: Input[StringDictionary[Input[js.Array[Input[String]]]]]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
        
        inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
        
        inline def setGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
        
        inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
        
        inline def setGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "groups", js.Array(value*))
        
        inline def setRequest(value: Input[String]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
        
        inline def setSignerName(value: Input[String]): Self = StObject.set(x, "signerName", value.asInstanceOf[js.Any])
        
        inline def setSignerNameUndefined: Self = StObject.set(x, "signerName", js.undefined)
        
        inline def setUid(value: Input[String]): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
        
        inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
        
        inline def setUsages(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
        
        inline def setUsagesUndefined: Self = StObject.set(x, "usages", js.undefined)
        
        inline def setUsagesVarargs(value: Input[String]*): Self = StObject.set(x, "usages", js.Array(value*))
        
        inline def setUsername(value: Input[String]): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
        
        inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
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
      var certificate: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * conditions applied to the request. Known conditions are "Approved", "Denied", and "Failed".
        */
      var conditions: js.UndefOr[Input[js.Array[Input[CertificateSigningRequestCondition]]]] = js.undefined
    }
    object CertificateSigningRequestStatus {
      
      inline def apply(): CertificateSigningRequestStatus = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CertificateSigningRequestStatus]
      }
      
      extension [Self <: CertificateSigningRequestStatus](x: Self) {
        
        inline def setCertificate(value: Input[String]): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
        
        inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
        
        inline def setConditions(value: Input[js.Array[Input[CertificateSigningRequestCondition]]]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
        
        inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
        
        inline def setConditionsVarargs(value: Input[CertificateSigningRequestCondition]*): Self = StObject.set(x, "conditions", js.Array(value*))
      }
    }
  }
  
  object v1beta1 {
    
    /**
      * Describes a certificate signing request
      */
    trait CertificateSigningRequest extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[certificatesDotk8sDotioSlashv1beta1]] = js.undefined
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[
              typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequest
            ]
          ] = js.undefined
      
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      
      /**
        * The certificate request itself and any additional information.
        */
      var spec: js.UndefOr[Input[CertificateSigningRequestSpec]] = js.undefined
      
      /**
        * Derived information about the request.
        */
      var status: js.UndefOr[Input[CertificateSigningRequestStatus]] = js.undefined
    }
    object CertificateSigningRequest {
      
      inline def apply(): CertificateSigningRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CertificateSigningRequest]
      }
      
      extension [Self <: CertificateSigningRequest](x: Self) {
        
        inline def setApiVersion(value: Input[certificatesDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
        
        inline def setKind(
          value: Input[
                  typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequest
                ]
        ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setSpec(value: Input[CertificateSigningRequestSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
        
        inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
        
        inline def setStatus(value: Input[CertificateSigningRequestStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    trait CertificateSigningRequestCondition extends StObject {
      
      /**
        * lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition's status is changed, the server defaults this to the current time.
        */
      var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * timestamp for the last update to this condition
        */
      var lastUpdateTime: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * human readable message with details about the request state
        */
      var message: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * brief reason for the request state
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be "False" or "Unknown". Defaults to "True". If unset, should be treated as "True".
        */
      var status: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * request approval state, currently Approved or Denied.
        */
      var `type`: Input[String]
    }
    object CertificateSigningRequestCondition {
      
      inline def apply(`type`: Input[String]): CertificateSigningRequestCondition = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[CertificateSigningRequestCondition]
      }
      
      extension [Self <: CertificateSigningRequestCondition](x: Self) {
        
        inline def setLastTransitionTime(value: Input[String]): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
        
        inline def setLastTransitionTimeUndefined: Self = StObject.set(x, "lastTransitionTime", js.undefined)
        
        inline def setLastUpdateTime(value: Input[String]): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
        
        inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
        
        inline def setMessage(value: Input[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
        
        inline def setReason(value: Input[String]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
        
        inline def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
        
        inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * This information is immutable after the request is created. Only the Request and Usages fields can be set on creation, other fields are derived by Kubernetes and cannot be modified by users.
      */
    trait CertificateSigningRequestSpec extends StObject {
      
      /**
        * Extra information about the requesting user. See user.Info interface for details.
        */
      var extra: js.UndefOr[Input[StringDictionary[Input[js.Array[Input[String]]]]]] = js.undefined
      
      /**
        * Group information about the requesting user. See user.Info interface for details.
        */
      var groups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      
      /**
        * Base64-encoded PKCS#10 CSR data
        */
      var request: Input[String]
      
      /**
        * Requested signer for the request. It is a qualified name in the form: `scope-hostname.io/name`. If empty, it will be defaulted:
        *  1. If it's a kubelet client certificate, it is assigned
        *     "kubernetes.io/kube-apiserver-client-kubelet".
        *  2. If it's a kubelet serving certificate, it is assigned
        *     "kubernetes.io/kubelet-serving".
        *  3. Otherwise, it is assigned "kubernetes.io/legacy-unknown".
        * Distribution of trust for signers happens out of band. You can select on this field using `spec.signerName`.
        */
      var signerName: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * UID information about the requesting user. See user.Info interface for details.
        */
      var uid: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * allowedUsages specifies a set of usage contexts the key will be valid for. See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
        *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
        */
      var usages: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      
      /**
        * Information about the requesting user. See user.Info interface for details.
        */
      var username: js.UndefOr[Input[String]] = js.undefined
    }
    object CertificateSigningRequestSpec {
      
      inline def apply(request: Input[String]): CertificateSigningRequestSpec = {
        val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
        __obj.asInstanceOf[CertificateSigningRequestSpec]
      }
      
      extension [Self <: CertificateSigningRequestSpec](x: Self) {
        
        inline def setExtra(value: Input[StringDictionary[Input[js.Array[Input[String]]]]]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
        
        inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
        
        inline def setGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
        
        inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
        
        inline def setGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "groups", js.Array(value*))
        
        inline def setRequest(value: Input[String]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        inline def setSignerName(value: Input[String]): Self = StObject.set(x, "signerName", value.asInstanceOf[js.Any])
        
        inline def setSignerNameUndefined: Self = StObject.set(x, "signerName", js.undefined)
        
        inline def setUid(value: Input[String]): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
        
        inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
        
        inline def setUsages(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
        
        inline def setUsagesUndefined: Self = StObject.set(x, "usages", js.undefined)
        
        inline def setUsagesVarargs(value: Input[String]*): Self = StObject.set(x, "usages", js.Array(value*))
        
        inline def setUsername(value: Input[String]): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
        
        inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      }
    }
    
    /**
      * This information is immutable after the request is created. Only the Request and Usages fields can be set on creation, other fields are derived by Kubernetes and cannot be modified by users.
      */
    trait CertificateSigningRequestSpecPatch extends StObject {
      
      /**
        * Extra information about the requesting user. See user.Info interface for details.
        */
      var extra: js.UndefOr[Input[StringDictionary[Input[js.Array[Input[String]]]]]] = js.undefined
      
      /**
        * Group information about the requesting user. See user.Info interface for details.
        */
      var groups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      
      /**
        * Base64-encoded PKCS#10 CSR data
        */
      var request: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Requested signer for the request. It is a qualified name in the form: `scope-hostname.io/name`. If empty, it will be defaulted:
        *  1. If it's a kubelet client certificate, it is assigned
        *     "kubernetes.io/kube-apiserver-client-kubelet".
        *  2. If it's a kubelet serving certificate, it is assigned
        *     "kubernetes.io/kubelet-serving".
        *  3. Otherwise, it is assigned "kubernetes.io/legacy-unknown".
        * Distribution of trust for signers happens out of band. You can select on this field using `spec.signerName`.
        */
      var signerName: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * UID information about the requesting user. See user.Info interface for details.
        */
      var uid: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * allowedUsages specifies a set of usage contexts the key will be valid for. See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
        *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
        */
      var usages: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      
      /**
        * Information about the requesting user. See user.Info interface for details.
        */
      var username: js.UndefOr[Input[String]] = js.undefined
    }
    object CertificateSigningRequestSpecPatch {
      
      inline def apply(): CertificateSigningRequestSpecPatch = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CertificateSigningRequestSpecPatch]
      }
      
      extension [Self <: CertificateSigningRequestSpecPatch](x: Self) {
        
        inline def setExtra(value: Input[StringDictionary[Input[js.Array[Input[String]]]]]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
        
        inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
        
        inline def setGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
        
        inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
        
        inline def setGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "groups", js.Array(value*))
        
        inline def setRequest(value: Input[String]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
        
        inline def setSignerName(value: Input[String]): Self = StObject.set(x, "signerName", value.asInstanceOf[js.Any])
        
        inline def setSignerNameUndefined: Self = StObject.set(x, "signerName", js.undefined)
        
        inline def setUid(value: Input[String]): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
        
        inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
        
        inline def setUsages(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
        
        inline def setUsagesUndefined: Self = StObject.set(x, "usages", js.undefined)
        
        inline def setUsagesVarargs(value: Input[String]*): Self = StObject.set(x, "usages", js.Array(value*))
        
        inline def setUsername(value: Input[String]): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
        
        inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      }
    }
    
    trait CertificateSigningRequestStatus extends StObject {
      
      /**
        * If request was approved, the controller will place the issued certificate here.
        */
      var certificate: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Conditions applied to the request, such as approval or denial.
        */
      var conditions: js.UndefOr[Input[js.Array[Input[CertificateSigningRequestCondition]]]] = js.undefined
    }
    object CertificateSigningRequestStatus {
      
      inline def apply(): CertificateSigningRequestStatus = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CertificateSigningRequestStatus]
      }
      
      extension [Self <: CertificateSigningRequestStatus](x: Self) {
        
        inline def setCertificate(value: Input[String]): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
        
        inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
        
        inline def setConditions(value: Input[js.Array[Input[CertificateSigningRequestCondition]]]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
        
        inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
        
        inline def setConditionsVarargs(value: Input[CertificateSigningRequestCondition]*): Self = StObject.set(x, "conditions", js.Array(value*))
      }
    }
  }
}
