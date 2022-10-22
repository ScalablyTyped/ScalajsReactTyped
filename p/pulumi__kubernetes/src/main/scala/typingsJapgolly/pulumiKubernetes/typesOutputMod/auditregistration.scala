package typingsJapgolly.pulumiKubernetes.typesOutputMod

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.auditregistrationDotk8sDotioSlashv1alpha1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auditregistration {
  
  object v1alpha1 {
    
    /**
      * AuditSink represents a cluster level audit sink
      */
    trait AuditSink extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: auditregistrationDotk8sDotioSlashv1alpha1
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.AuditSink
      
      var metadata: ObjectMeta
      
      /**
        * Spec defines the audit configuration spec
        */
      var spec: AuditSinkSpec
    }
    object AuditSink {
      
      inline def apply(metadata: ObjectMeta, spec: AuditSinkSpec): AuditSink = {
        val __obj = js.Dynamic.literal(apiVersion = "auditregistration.k8s.io/v1alpha1", kind = "AuditSink", metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
        __obj.asInstanceOf[AuditSink]
      }
      
      extension [Self <: AuditSink](x: Self) {
        
        inline def setApiVersion(value: auditregistrationDotk8sDotioSlashv1alpha1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        inline def setKind(value: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.AuditSink): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setSpec(value: AuditSinkSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * AuditSinkSpec holds the spec for the audit sink
      */
    trait AuditSinkSpec extends StObject {
      
      /**
        * Policy defines the policy for selecting which events should be sent to the webhook required
        */
      var policy: Policy
      
      /**
        * Webhook to send events required
        */
      var webhook: Webhook
    }
    object AuditSinkSpec {
      
      inline def apply(policy: Policy, webhook: Webhook): AuditSinkSpec = {
        val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], webhook = webhook.asInstanceOf[js.Any])
        __obj.asInstanceOf[AuditSinkSpec]
      }
      
      extension [Self <: AuditSinkSpec](x: Self) {
        
        inline def setPolicy(value: Policy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
        
        inline def setWebhook(value: Webhook): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * AuditSinkSpec holds the spec for the audit sink
      */
    trait AuditSinkSpecPatch extends StObject {
      
      /**
        * Policy defines the policy for selecting which events should be sent to the webhook required
        */
      var policy: PolicyPatch
      
      /**
        * Webhook to send events required
        */
      var webhook: WebhookPatch
    }
    object AuditSinkSpecPatch {
      
      inline def apply(policy: PolicyPatch, webhook: WebhookPatch): AuditSinkSpecPatch = {
        val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], webhook = webhook.asInstanceOf[js.Any])
        __obj.asInstanceOf[AuditSinkSpecPatch]
      }
      
      extension [Self <: AuditSinkSpecPatch](x: Self) {
        
        inline def setPolicy(value: PolicyPatch): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
        
        inline def setWebhook(value: WebhookPatch): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Policy defines the configuration of how audit events are logged
      */
    trait Policy extends StObject {
      
      /**
        * The Level that all requests are recorded at. available options: None, Metadata, Request, RequestResponse required
        */
      var level: String
      
      /**
        * Stages is a list of stages for which events are created.
        */
      var stages: js.Array[String]
    }
    object Policy {
      
      inline def apply(level: String, stages: js.Array[String]): Policy = {
        val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], stages = stages.asInstanceOf[js.Any])
        __obj.asInstanceOf[Policy]
      }
      
      extension [Self <: Policy](x: Self) {
        
        inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
        
        inline def setStages(value: js.Array[String]): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
        
        inline def setStagesVarargs(value: String*): Self = StObject.set(x, "stages", js.Array(value*))
      }
    }
    
    /**
      * Policy defines the configuration of how audit events are logged
      */
    trait PolicyPatch extends StObject {
      
      /**
        * The Level that all requests are recorded at. available options: None, Metadata, Request, RequestResponse required
        */
      var level: String
      
      /**
        * Stages is a list of stages for which events are created.
        */
      var stages: js.Array[String]
    }
    object PolicyPatch {
      
      inline def apply(level: String, stages: js.Array[String]): PolicyPatch = {
        val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], stages = stages.asInstanceOf[js.Any])
        __obj.asInstanceOf[PolicyPatch]
      }
      
      extension [Self <: PolicyPatch](x: Self) {
        
        inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
        
        inline def setStages(value: js.Array[String]): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
        
        inline def setStagesVarargs(value: String*): Self = StObject.set(x, "stages", js.Array(value*))
      }
    }
    
    /**
      * ServiceReference holds a reference to Service.legacy.k8s.io
      */
    trait ServiceReference extends StObject {
      
      /**
        * `name` is the name of the service. Required
        */
      var name: String
      
      /**
        * `namespace` is the namespace of the service. Required
        */
      var namespace: String
      
      /**
        * `path` is an optional URL path which will be sent in any request to this service.
        */
      var path: String
      
      /**
        * If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).
        */
      var port: Double
    }
    object ServiceReference {
      
      inline def apply(name: String, namespace: String, path: String, port: Double): ServiceReference = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
        __obj.asInstanceOf[ServiceReference]
      }
      
      extension [Self <: ServiceReference](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * ServiceReference holds a reference to Service.legacy.k8s.io
      */
    trait ServiceReferencePatch extends StObject {
      
      /**
        * `name` is the name of the service. Required
        */
      var name: String
      
      /**
        * `namespace` is the namespace of the service. Required
        */
      var namespace: String
      
      /**
        * `path` is an optional URL path which will be sent in any request to this service.
        */
      var path: String
      
      /**
        * If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).
        */
      var port: Double
    }
    object ServiceReferencePatch {
      
      inline def apply(name: String, namespace: String, path: String, port: Double): ServiceReferencePatch = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
        __obj.asInstanceOf[ServiceReferencePatch]
      }
      
      extension [Self <: ServiceReferencePatch](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Webhook holds the configuration of the webhook
      */
    trait Webhook extends StObject {
      
      /**
        * ClientConfig holds the connection parameters for the webhook required
        */
      var clientConfig: WebhookClientConfig
      
      /**
        * Throttle holds the options for throttling the webhook
        */
      var throttle: WebhookThrottleConfig
    }
    object Webhook {
      
      inline def apply(clientConfig: WebhookClientConfig, throttle: WebhookThrottleConfig): Webhook = {
        val __obj = js.Dynamic.literal(clientConfig = clientConfig.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any])
        __obj.asInstanceOf[Webhook]
      }
      
      extension [Self <: Webhook](x: Self) {
        
        inline def setClientConfig(value: WebhookClientConfig): Self = StObject.set(x, "clientConfig", value.asInstanceOf[js.Any])
        
        inline def setThrottle(value: WebhookThrottleConfig): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * WebhookClientConfig contains the information to make a connection with the webhook
      */
    trait WebhookClientConfig extends StObject {
      
      /**
        * `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate. If unspecified, system trust roots on the apiserver are used.
        */
      var caBundle: String
      
      /**
        * `service` is a reference to the service for this webhook. Either `service` or `url` must be specified.
        *
        * If the webhook is running within the cluster, then you should use `service`.
        */
      var service: ServiceReference
      
      /**
        * `url` gives the location of the webhook, in standard URL form (`scheme://host:port/path`). Exactly one of `url` or `service` must be specified.
        *
        * The `host` should not refer to a service running in the cluster; use the `service` field instead. The host might be resolved via external DNS in some apiservers (e.g., `kube-apiserver` cannot resolve in-cluster DNS as that would be a layering violation). `host` may also be an IP address.
        *
        * Please note that using `localhost` or `127.0.0.1` as a `host` is risky unless you take great care to run this webhook on all hosts which run an apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn up in a new cluster.
        *
        * The scheme must be "https"; the URL must begin with "https://".
        *
        * A path is optional, and if present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for example, a cluster identifier.
        *
        * Attempting to use a user or basic auth e.g. "user:password@" is not allowed. Fragments ("#...") and query parameters ("?...") are not allowed, either.
        */
      var url: String
    }
    object WebhookClientConfig {
      
      inline def apply(caBundle: String, service: ServiceReference, url: String): WebhookClientConfig = {
        val __obj = js.Dynamic.literal(caBundle = caBundle.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[WebhookClientConfig]
      }
      
      extension [Self <: WebhookClientConfig](x: Self) {
        
        inline def setCaBundle(value: String): Self = StObject.set(x, "caBundle", value.asInstanceOf[js.Any])
        
        inline def setService(value: ServiceReference): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * WebhookClientConfig contains the information to make a connection with the webhook
      */
    trait WebhookClientConfigPatch extends StObject {
      
      /**
        * `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate. If unspecified, system trust roots on the apiserver are used.
        */
      var caBundle: String
      
      /**
        * `service` is a reference to the service for this webhook. Either `service` or `url` must be specified.
        *
        * If the webhook is running within the cluster, then you should use `service`.
        */
      var service: ServiceReferencePatch
      
      /**
        * `url` gives the location of the webhook, in standard URL form (`scheme://host:port/path`). Exactly one of `url` or `service` must be specified.
        *
        * The `host` should not refer to a service running in the cluster; use the `service` field instead. The host might be resolved via external DNS in some apiservers (e.g., `kube-apiserver` cannot resolve in-cluster DNS as that would be a layering violation). `host` may also be an IP address.
        *
        * Please note that using `localhost` or `127.0.0.1` as a `host` is risky unless you take great care to run this webhook on all hosts which run an apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn up in a new cluster.
        *
        * The scheme must be "https"; the URL must begin with "https://".
        *
        * A path is optional, and if present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for example, a cluster identifier.
        *
        * Attempting to use a user or basic auth e.g. "user:password@" is not allowed. Fragments ("#...") and query parameters ("?...") are not allowed, either.
        */
      var url: String
    }
    object WebhookClientConfigPatch {
      
      inline def apply(caBundle: String, service: ServiceReferencePatch, url: String): WebhookClientConfigPatch = {
        val __obj = js.Dynamic.literal(caBundle = caBundle.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[WebhookClientConfigPatch]
      }
      
      extension [Self <: WebhookClientConfigPatch](x: Self) {
        
        inline def setCaBundle(value: String): Self = StObject.set(x, "caBundle", value.asInstanceOf[js.Any])
        
        inline def setService(value: ServiceReferencePatch): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Webhook holds the configuration of the webhook
      */
    trait WebhookPatch extends StObject {
      
      /**
        * ClientConfig holds the connection parameters for the webhook required
        */
      var clientConfig: WebhookClientConfigPatch
      
      /**
        * Throttle holds the options for throttling the webhook
        */
      var throttle: WebhookThrottleConfigPatch
    }
    object WebhookPatch {
      
      inline def apply(clientConfig: WebhookClientConfigPatch, throttle: WebhookThrottleConfigPatch): WebhookPatch = {
        val __obj = js.Dynamic.literal(clientConfig = clientConfig.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any])
        __obj.asInstanceOf[WebhookPatch]
      }
      
      extension [Self <: WebhookPatch](x: Self) {
        
        inline def setClientConfig(value: WebhookClientConfigPatch): Self = StObject.set(x, "clientConfig", value.asInstanceOf[js.Any])
        
        inline def setThrottle(value: WebhookThrottleConfigPatch): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * WebhookThrottleConfig holds the configuration for throttling events
      */
    trait WebhookThrottleConfig extends StObject {
      
      /**
        * ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS
        */
      var burst: Double
      
      /**
        * ThrottleQPS maximum number of batches per second default 10 QPS
        */
      var qps: Double
    }
    object WebhookThrottleConfig {
      
      inline def apply(burst: Double, qps: Double): WebhookThrottleConfig = {
        val __obj = js.Dynamic.literal(burst = burst.asInstanceOf[js.Any], qps = qps.asInstanceOf[js.Any])
        __obj.asInstanceOf[WebhookThrottleConfig]
      }
      
      extension [Self <: WebhookThrottleConfig](x: Self) {
        
        inline def setBurst(value: Double): Self = StObject.set(x, "burst", value.asInstanceOf[js.Any])
        
        inline def setQps(value: Double): Self = StObject.set(x, "qps", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * WebhookThrottleConfig holds the configuration for throttling events
      */
    trait WebhookThrottleConfigPatch extends StObject {
      
      /**
        * ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS
        */
      var burst: Double
      
      /**
        * ThrottleQPS maximum number of batches per second default 10 QPS
        */
      var qps: Double
    }
    object WebhookThrottleConfigPatch {
      
      inline def apply(burst: Double, qps: Double): WebhookThrottleConfigPatch = {
        val __obj = js.Dynamic.literal(burst = burst.asInstanceOf[js.Any], qps = qps.asInstanceOf[js.Any])
        __obj.asInstanceOf[WebhookThrottleConfigPatch]
      }
      
      extension [Self <: WebhookThrottleConfigPatch](x: Self) {
        
        inline def setBurst(value: Double): Self = StObject.set(x, "burst", value.asInstanceOf[js.Any])
        
        inline def setQps(value: Double): Self = StObject.set(x, "qps", value.asInstanceOf[js.Any])
      }
    }
  }
}
