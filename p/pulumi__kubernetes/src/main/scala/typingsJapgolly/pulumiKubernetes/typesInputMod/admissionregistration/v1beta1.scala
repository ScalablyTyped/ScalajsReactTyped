package typingsJapgolly.pulumiKubernetes.typesInputMod.admissionregistration

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.admissionregistrationDotk8sDotioSlashv1beta1
import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.LabelSelector
import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.LabelSelectorPatch
import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1beta1 {
  
  /**
    * MutatingWebhook describes an admission webhook and the resources and operations it applies to.
    */
  trait MutatingWebhook extends StObject {
    
    /**
      * AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy. Default to `['v1beta1']`.
      */
    var admissionReviewVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * ClientConfig defines how to communicate with the hook. Required
      */
    var clientConfig: Input[WebhookClientConfig]
    
    /**
      * FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Ignore.
      */
    var failurePolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * matchPolicy defines how the "rules" list is used to match incoming requests. Allowed values are "Exact" or "Equivalent".
      *
      * - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules" only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.
      *
      * - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and "rules" only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.
      *
      * Defaults to "Exact"
      */
    var matchPolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where "imagepolicy" is the name of the webhook, and kubernetes.io is the name of the organization. Required.
      */
    var name: Input[String]
    
    /**
      * NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.
      *
      * For example, to run the webhook on any objects whose namespace is not associated with "runlevel" of "0" or "1";  you will set the selector as follows: "namespaceSelector": {
      *   "matchExpressions": [
      *     {
      *       "key": "runlevel",
      *       "operator": "NotIn",
      *       "values": [
      *         "0",
      *         "1"
      *       ]
      *     }
      *   ]
      * }
      *
      * If instead you want to only run the webhook on any objects whose namespace is associated with the "environment" of "prod" or "staging"; you will set the selector as follows: "namespaceSelector": {
      *   "matchExpressions": [
      *     {
      *       "key": "environment",
      *       "operator": "In",
      *       "values": [
      *         "prod",
      *         "staging"
      *       ]
      *     }
      *   ]
      * }
      *
      * See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/ for more examples of label selectors.
      *
      * Default to the empty LabelSelector, which matches everything.
      */
    var namespaceSelector: js.UndefOr[Input[LabelSelector]] = js.undefined
    
    /**
      * ObjectSelector decides whether to run the webhook based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
      */
    var objectSelector: js.UndefOr[Input[LabelSelector]] = js.undefined
    
    /**
      * reinvocationPolicy indicates whether this webhook should be called multiple times as part of a single admission evaluation. Allowed values are "Never" and "IfNeeded".
      *
      * Never: the webhook will not be called more than once in a single admission evaluation.
      *
      * IfNeeded: the webhook will be called at least one additional time as part of the admission evaluation if the object being admitted is modified by other admission plugins after the initial webhook call. Webhooks that specify this option *must* be idempotent, able to process objects they previously admitted. Note: * the number of additional invocations is not guaranteed to be exactly one. * if additional invocations result in further modifications to the object, webhooks are not guaranteed to be invoked again. * webhooks that use this option may be reordered to minimize the number of additional invocations. * to validate an object after all mutations are guaranteed complete, use a validating admission webhook instead.
      *
      * Defaults to "Never".
      */
    var reinvocationPolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
      */
    var rules: js.UndefOr[Input[js.Array[Input[RuleWithOperations]]]] = js.undefined
    
    /**
      * SideEffects states whether this webhook has side effects. Acceptable values are: Unknown, None, Some, NoneOnDryRun Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some. Defaults to Unknown.
      */
    var sideEffects: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 30 seconds.
      */
    var timeoutSeconds: js.UndefOr[Input[Double]] = js.undefined
  }
  object MutatingWebhook {
    
    inline def apply(clientConfig: Input[WebhookClientConfig], name: Input[String]): MutatingWebhook = {
      val __obj = js.Dynamic.literal(clientConfig = clientConfig.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MutatingWebhook]
    }
    
    extension [Self <: MutatingWebhook](x: Self) {
      
      inline def setAdmissionReviewVersions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "admissionReviewVersions", value.asInstanceOf[js.Any])
      
      inline def setAdmissionReviewVersionsUndefined: Self = StObject.set(x, "admissionReviewVersions", js.undefined)
      
      inline def setAdmissionReviewVersionsVarargs(value: Input[String]*): Self = StObject.set(x, "admissionReviewVersions", js.Array(value*))
      
      inline def setClientConfig(value: Input[WebhookClientConfig]): Self = StObject.set(x, "clientConfig", value.asInstanceOf[js.Any])
      
      inline def setFailurePolicy(value: Input[String]): Self = StObject.set(x, "failurePolicy", value.asInstanceOf[js.Any])
      
      inline def setFailurePolicyUndefined: Self = StObject.set(x, "failurePolicy", js.undefined)
      
      inline def setMatchPolicy(value: Input[String]): Self = StObject.set(x, "matchPolicy", value.asInstanceOf[js.Any])
      
      inline def setMatchPolicyUndefined: Self = StObject.set(x, "matchPolicy", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespaceSelector(value: Input[LabelSelector]): Self = StObject.set(x, "namespaceSelector", value.asInstanceOf[js.Any])
      
      inline def setNamespaceSelectorUndefined: Self = StObject.set(x, "namespaceSelector", js.undefined)
      
      inline def setObjectSelector(value: Input[LabelSelector]): Self = StObject.set(x, "objectSelector", value.asInstanceOf[js.Any])
      
      inline def setObjectSelectorUndefined: Self = StObject.set(x, "objectSelector", js.undefined)
      
      inline def setReinvocationPolicy(value: Input[String]): Self = StObject.set(x, "reinvocationPolicy", value.asInstanceOf[js.Any])
      
      inline def setReinvocationPolicyUndefined: Self = StObject.set(x, "reinvocationPolicy", js.undefined)
      
      inline def setRules(value: Input[js.Array[Input[RuleWithOperations]]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: Input[RuleWithOperations]*): Self = StObject.set(x, "rules", js.Array(value*))
      
      inline def setSideEffects(value: Input[String]): Self = StObject.set(x, "sideEffects", value.asInstanceOf[js.Any])
      
      inline def setSideEffectsUndefined: Self = StObject.set(x, "sideEffects", js.undefined)
      
      inline def setTimeoutSeconds(value: Input[Double]): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
      
      inline def setTimeoutSecondsUndefined: Self = StObject.set(x, "timeoutSeconds", js.undefined)
    }
  }
  
  /**
    * MutatingWebhookConfiguration describes the configuration of and admission webhook that accept or reject and may change the object. Deprecated in v1.16, planned for removal in v1.19. Use admissionregistration.k8s.io/v1 MutatingWebhookConfiguration instead.
    */
  trait MutatingWebhookConfiguration extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[admissionregistrationDotk8sDotioSlashv1beta1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[
        Input[
          typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.MutatingWebhookConfiguration
        ]
      ] = js.undefined
    
    /**
      * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
      */
    var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
    
    /**
      * Webhooks is a list of webhooks and the affected resources and operations.
      */
    var webhooks: js.UndefOr[Input[js.Array[Input[MutatingWebhook]]]] = js.undefined
  }
  object MutatingWebhookConfiguration {
    
    inline def apply(): MutatingWebhookConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MutatingWebhookConfiguration]
    }
    
    extension [Self <: MutatingWebhookConfiguration](x: Self) {
      
      inline def setApiVersion(value: Input[admissionregistrationDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setKind(
        value: Input[
              typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.MutatingWebhookConfiguration
            ]
      ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setWebhooks(value: Input[js.Array[Input[MutatingWebhook]]]): Self = StObject.set(x, "webhooks", value.asInstanceOf[js.Any])
      
      inline def setWebhooksUndefined: Self = StObject.set(x, "webhooks", js.undefined)
      
      inline def setWebhooksVarargs(value: Input[MutatingWebhook]*): Self = StObject.set(x, "webhooks", js.Array(value*))
    }
  }
  
  /**
    * MutatingWebhook describes an admission webhook and the resources and operations it applies to.
    */
  trait MutatingWebhookPatch extends StObject {
    
    /**
      * AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy. Default to `['v1beta1']`.
      */
    var admissionReviewVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * ClientConfig defines how to communicate with the hook. Required
      */
    var clientConfig: js.UndefOr[Input[WebhookClientConfigPatch]] = js.undefined
    
    /**
      * FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Ignore.
      */
    var failurePolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * matchPolicy defines how the "rules" list is used to match incoming requests. Allowed values are "Exact" or "Equivalent".
      *
      * - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules" only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.
      *
      * - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and "rules" only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.
      *
      * Defaults to "Exact"
      */
    var matchPolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where "imagepolicy" is the name of the webhook, and kubernetes.io is the name of the organization. Required.
      */
    var name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.
      *
      * For example, to run the webhook on any objects whose namespace is not associated with "runlevel" of "0" or "1";  you will set the selector as follows: "namespaceSelector": {
      *   "matchExpressions": [
      *     {
      *       "key": "runlevel",
      *       "operator": "NotIn",
      *       "values": [
      *         "0",
      *         "1"
      *       ]
      *     }
      *   ]
      * }
      *
      * If instead you want to only run the webhook on any objects whose namespace is associated with the "environment" of "prod" or "staging"; you will set the selector as follows: "namespaceSelector": {
      *   "matchExpressions": [
      *     {
      *       "key": "environment",
      *       "operator": "In",
      *       "values": [
      *         "prod",
      *         "staging"
      *       ]
      *     }
      *   ]
      * }
      *
      * See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/ for more examples of label selectors.
      *
      * Default to the empty LabelSelector, which matches everything.
      */
    var namespaceSelector: js.UndefOr[Input[LabelSelectorPatch]] = js.undefined
    
    /**
      * ObjectSelector decides whether to run the webhook based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
      */
    var objectSelector: js.UndefOr[Input[LabelSelectorPatch]] = js.undefined
    
    /**
      * reinvocationPolicy indicates whether this webhook should be called multiple times as part of a single admission evaluation. Allowed values are "Never" and "IfNeeded".
      *
      * Never: the webhook will not be called more than once in a single admission evaluation.
      *
      * IfNeeded: the webhook will be called at least one additional time as part of the admission evaluation if the object being admitted is modified by other admission plugins after the initial webhook call. Webhooks that specify this option *must* be idempotent, able to process objects they previously admitted. Note: * the number of additional invocations is not guaranteed to be exactly one. * if additional invocations result in further modifications to the object, webhooks are not guaranteed to be invoked again. * webhooks that use this option may be reordered to minimize the number of additional invocations. * to validate an object after all mutations are guaranteed complete, use a validating admission webhook instead.
      *
      * Defaults to "Never".
      */
    var reinvocationPolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
      */
    var rules: js.UndefOr[Input[js.Array[Input[RuleWithOperationsPatch]]]] = js.undefined
    
    /**
      * SideEffects states whether this webhook has side effects. Acceptable values are: Unknown, None, Some, NoneOnDryRun Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some. Defaults to Unknown.
      */
    var sideEffects: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 30 seconds.
      */
    var timeoutSeconds: js.UndefOr[Input[Double]] = js.undefined
  }
  object MutatingWebhookPatch {
    
    inline def apply(): MutatingWebhookPatch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MutatingWebhookPatch]
    }
    
    extension [Self <: MutatingWebhookPatch](x: Self) {
      
      inline def setAdmissionReviewVersions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "admissionReviewVersions", value.asInstanceOf[js.Any])
      
      inline def setAdmissionReviewVersionsUndefined: Self = StObject.set(x, "admissionReviewVersions", js.undefined)
      
      inline def setAdmissionReviewVersionsVarargs(value: Input[String]*): Self = StObject.set(x, "admissionReviewVersions", js.Array(value*))
      
      inline def setClientConfig(value: Input[WebhookClientConfigPatch]): Self = StObject.set(x, "clientConfig", value.asInstanceOf[js.Any])
      
      inline def setClientConfigUndefined: Self = StObject.set(x, "clientConfig", js.undefined)
      
      inline def setFailurePolicy(value: Input[String]): Self = StObject.set(x, "failurePolicy", value.asInstanceOf[js.Any])
      
      inline def setFailurePolicyUndefined: Self = StObject.set(x, "failurePolicy", js.undefined)
      
      inline def setMatchPolicy(value: Input[String]): Self = StObject.set(x, "matchPolicy", value.asInstanceOf[js.Any])
      
      inline def setMatchPolicyUndefined: Self = StObject.set(x, "matchPolicy", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNamespaceSelector(value: Input[LabelSelectorPatch]): Self = StObject.set(x, "namespaceSelector", value.asInstanceOf[js.Any])
      
      inline def setNamespaceSelectorUndefined: Self = StObject.set(x, "namespaceSelector", js.undefined)
      
      inline def setObjectSelector(value: Input[LabelSelectorPatch]): Self = StObject.set(x, "objectSelector", value.asInstanceOf[js.Any])
      
      inline def setObjectSelectorUndefined: Self = StObject.set(x, "objectSelector", js.undefined)
      
      inline def setReinvocationPolicy(value: Input[String]): Self = StObject.set(x, "reinvocationPolicy", value.asInstanceOf[js.Any])
      
      inline def setReinvocationPolicyUndefined: Self = StObject.set(x, "reinvocationPolicy", js.undefined)
      
      inline def setRules(value: Input[js.Array[Input[RuleWithOperationsPatch]]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: Input[RuleWithOperationsPatch]*): Self = StObject.set(x, "rules", js.Array(value*))
      
      inline def setSideEffects(value: Input[String]): Self = StObject.set(x, "sideEffects", value.asInstanceOf[js.Any])
      
      inline def setSideEffectsUndefined: Self = StObject.set(x, "sideEffects", js.undefined)
      
      inline def setTimeoutSeconds(value: Input[Double]): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
      
      inline def setTimeoutSecondsUndefined: Self = StObject.set(x, "timeoutSeconds", js.undefined)
    }
  }
  
  /**
    * RuleWithOperations is a tuple of Operations and Resources. It is recommended to make sure that all the tuple expansions are valid.
    */
  trait RuleWithOperations extends StObject {
    
    /**
      * APIGroups is the API groups the resources belong to. '*' is all groups. If '*' is present, the length of the slice must be one. Required.
      */
    var apiGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * APIVersions is the API versions the resources belong to. '*' is all versions. If '*' is present, the length of the slice must be one. Required.
      */
    var apiVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Operations is the operations the admission hook cares about - CREATE, UPDATE, or * for all operations. If '*' is present, the length of the slice must be one. Required.
      */
    var operations: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Resources is a list of resources this rule applies to.
      *
      * For example: 'pods' means pods. 'pods/log' means the log subresource of pods. '*' means all resources, but not subresources. 'pods/ *' means all subresources of pods. '*&#47;scale' means all scale subresources. '*&#47;*' means all resources and their subresources.
      *
      * If wildcard is present, the validation rule will ensure resources do not overlap with each other.
      *
      * Depending on the enclosing object, subresources might not be allowed. Required.
      */
    var resources: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * scope specifies the scope of this rule. Valid values are "Cluster", "Namespaced", and "*" "Cluster" means that only cluster-scoped resources will match this rule. Namespace API objects are cluster-scoped. "Namespaced" means that only namespaced resources will match this rule. "*" means that there are no scope restrictions. Subresources match the scope of their parent resource. Default is "*".
      */
    var scope: js.UndefOr[Input[String]] = js.undefined
  }
  object RuleWithOperations {
    
    inline def apply(): RuleWithOperations = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuleWithOperations]
    }
    
    extension [Self <: RuleWithOperations](x: Self) {
      
      inline def setApiGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "apiGroups", value.asInstanceOf[js.Any])
      
      inline def setApiGroupsUndefined: Self = StObject.set(x, "apiGroups", js.undefined)
      
      inline def setApiGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "apiGroups", js.Array(value*))
      
      inline def setApiVersions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "apiVersions", value.asInstanceOf[js.Any])
      
      inline def setApiVersionsUndefined: Self = StObject.set(x, "apiVersions", js.undefined)
      
      inline def setApiVersionsVarargs(value: Input[String]*): Self = StObject.set(x, "apiVersions", js.Array(value*))
      
      inline def setOperations(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
      
      inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
      
      inline def setOperationsVarargs(value: Input[String]*): Self = StObject.set(x, "operations", js.Array(value*))
      
      inline def setResources(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      inline def setResourcesVarargs(value: Input[String]*): Self = StObject.set(x, "resources", js.Array(value*))
      
      inline def setScope(value: Input[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  /**
    * RuleWithOperations is a tuple of Operations and Resources. It is recommended to make sure that all the tuple expansions are valid.
    */
  trait RuleWithOperationsPatch extends StObject {
    
    /**
      * APIGroups is the API groups the resources belong to. '*' is all groups. If '*' is present, the length of the slice must be one. Required.
      */
    var apiGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * APIVersions is the API versions the resources belong to. '*' is all versions. If '*' is present, the length of the slice must be one. Required.
      */
    var apiVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Operations is the operations the admission hook cares about - CREATE, UPDATE, or * for all operations. If '*' is present, the length of the slice must be one. Required.
      */
    var operations: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Resources is a list of resources this rule applies to.
      *
      * For example: 'pods' means pods. 'pods/log' means the log subresource of pods. '*' means all resources, but not subresources. 'pods/ *' means all subresources of pods. '*&#47;scale' means all scale subresources. '*&#47;*' means all resources and their subresources.
      *
      * If wildcard is present, the validation rule will ensure resources do not overlap with each other.
      *
      * Depending on the enclosing object, subresources might not be allowed. Required.
      */
    var resources: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * scope specifies the scope of this rule. Valid values are "Cluster", "Namespaced", and "*" "Cluster" means that only cluster-scoped resources will match this rule. Namespace API objects are cluster-scoped. "Namespaced" means that only namespaced resources will match this rule. "*" means that there are no scope restrictions. Subresources match the scope of their parent resource. Default is "*".
      */
    var scope: js.UndefOr[Input[String]] = js.undefined
  }
  object RuleWithOperationsPatch {
    
    inline def apply(): RuleWithOperationsPatch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuleWithOperationsPatch]
    }
    
    extension [Self <: RuleWithOperationsPatch](x: Self) {
      
      inline def setApiGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "apiGroups", value.asInstanceOf[js.Any])
      
      inline def setApiGroupsUndefined: Self = StObject.set(x, "apiGroups", js.undefined)
      
      inline def setApiGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "apiGroups", js.Array(value*))
      
      inline def setApiVersions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "apiVersions", value.asInstanceOf[js.Any])
      
      inline def setApiVersionsUndefined: Self = StObject.set(x, "apiVersions", js.undefined)
      
      inline def setApiVersionsVarargs(value: Input[String]*): Self = StObject.set(x, "apiVersions", js.Array(value*))
      
      inline def setOperations(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
      
      inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
      
      inline def setOperationsVarargs(value: Input[String]*): Self = StObject.set(x, "operations", js.Array(value*))
      
      inline def setResources(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      inline def setResourcesVarargs(value: Input[String]*): Self = StObject.set(x, "resources", js.Array(value*))
      
      inline def setScope(value: Input[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  /**
    * ServiceReference holds a reference to Service.legacy.k8s.io
    */
  trait ServiceReference extends StObject {
    
    /**
      * `name` is the name of the service. Required
      */
    var name: Input[String]
    
    /**
      * `namespace` is the namespace of the service. Required
      */
    var namespace: Input[String]
    
    /**
      * `path` is an optional URL path which will be sent in any request to this service.
      */
    var path: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).
      */
    var port: js.UndefOr[Input[Double]] = js.undefined
  }
  object ServiceReference {
    
    inline def apply(name: Input[String], namespace: Input[String]): ServiceReference = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceReference]
    }
    
    extension [Self <: ServiceReference](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  /**
    * ServiceReference holds a reference to Service.legacy.k8s.io
    */
  trait ServiceReferencePatch extends StObject {
    
    /**
      * `name` is the name of the service. Required
      */
    var name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * `namespace` is the namespace of the service. Required
      */
    var namespace: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * `path` is an optional URL path which will be sent in any request to this service.
      */
    var path: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).
      */
    var port: js.UndefOr[Input[Double]] = js.undefined
  }
  object ServiceReferencePatch {
    
    inline def apply(): ServiceReferencePatch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceReferencePatch]
    }
    
    extension [Self <: ServiceReferencePatch](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  /**
    * ValidatingWebhook describes an admission webhook and the resources and operations it applies to.
    */
  trait ValidatingWebhook extends StObject {
    
    /**
      * AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy. Default to `['v1beta1']`.
      */
    var admissionReviewVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * ClientConfig defines how to communicate with the hook. Required
      */
    var clientConfig: Input[WebhookClientConfig]
    
    /**
      * FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Ignore.
      */
    var failurePolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * matchPolicy defines how the "rules" list is used to match incoming requests. Allowed values are "Exact" or "Equivalent".
      *
      * - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules" only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.
      *
      * - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and "rules" only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.
      *
      * Defaults to "Exact"
      */
    var matchPolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where "imagepolicy" is the name of the webhook, and kubernetes.io is the name of the organization. Required.
      */
    var name: Input[String]
    
    /**
      * NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.
      *
      * For example, to run the webhook on any objects whose namespace is not associated with "runlevel" of "0" or "1";  you will set the selector as follows: "namespaceSelector": {
      *   "matchExpressions": [
      *     {
      *       "key": "runlevel",
      *       "operator": "NotIn",
      *       "values": [
      *         "0",
      *         "1"
      *       ]
      *     }
      *   ]
      * }
      *
      * If instead you want to only run the webhook on any objects whose namespace is associated with the "environment" of "prod" or "staging"; you will set the selector as follows: "namespaceSelector": {
      *   "matchExpressions": [
      *     {
      *       "key": "environment",
      *       "operator": "In",
      *       "values": [
      *         "prod",
      *         "staging"
      *       ]
      *     }
      *   ]
      * }
      *
      * See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels for more examples of label selectors.
      *
      * Default to the empty LabelSelector, which matches everything.
      */
    var namespaceSelector: js.UndefOr[Input[LabelSelector]] = js.undefined
    
    /**
      * ObjectSelector decides whether to run the webhook based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
      */
    var objectSelector: js.UndefOr[Input[LabelSelector]] = js.undefined
    
    /**
      * Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
      */
    var rules: js.UndefOr[Input[js.Array[Input[RuleWithOperations]]]] = js.undefined
    
    /**
      * SideEffects states whether this webhook has side effects. Acceptable values are: Unknown, None, Some, NoneOnDryRun Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some. Defaults to Unknown.
      */
    var sideEffects: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 30 seconds.
      */
    var timeoutSeconds: js.UndefOr[Input[Double]] = js.undefined
  }
  object ValidatingWebhook {
    
    inline def apply(clientConfig: Input[WebhookClientConfig], name: Input[String]): ValidatingWebhook = {
      val __obj = js.Dynamic.literal(clientConfig = clientConfig.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidatingWebhook]
    }
    
    extension [Self <: ValidatingWebhook](x: Self) {
      
      inline def setAdmissionReviewVersions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "admissionReviewVersions", value.asInstanceOf[js.Any])
      
      inline def setAdmissionReviewVersionsUndefined: Self = StObject.set(x, "admissionReviewVersions", js.undefined)
      
      inline def setAdmissionReviewVersionsVarargs(value: Input[String]*): Self = StObject.set(x, "admissionReviewVersions", js.Array(value*))
      
      inline def setClientConfig(value: Input[WebhookClientConfig]): Self = StObject.set(x, "clientConfig", value.asInstanceOf[js.Any])
      
      inline def setFailurePolicy(value: Input[String]): Self = StObject.set(x, "failurePolicy", value.asInstanceOf[js.Any])
      
      inline def setFailurePolicyUndefined: Self = StObject.set(x, "failurePolicy", js.undefined)
      
      inline def setMatchPolicy(value: Input[String]): Self = StObject.set(x, "matchPolicy", value.asInstanceOf[js.Any])
      
      inline def setMatchPolicyUndefined: Self = StObject.set(x, "matchPolicy", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespaceSelector(value: Input[LabelSelector]): Self = StObject.set(x, "namespaceSelector", value.asInstanceOf[js.Any])
      
      inline def setNamespaceSelectorUndefined: Self = StObject.set(x, "namespaceSelector", js.undefined)
      
      inline def setObjectSelector(value: Input[LabelSelector]): Self = StObject.set(x, "objectSelector", value.asInstanceOf[js.Any])
      
      inline def setObjectSelectorUndefined: Self = StObject.set(x, "objectSelector", js.undefined)
      
      inline def setRules(value: Input[js.Array[Input[RuleWithOperations]]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: Input[RuleWithOperations]*): Self = StObject.set(x, "rules", js.Array(value*))
      
      inline def setSideEffects(value: Input[String]): Self = StObject.set(x, "sideEffects", value.asInstanceOf[js.Any])
      
      inline def setSideEffectsUndefined: Self = StObject.set(x, "sideEffects", js.undefined)
      
      inline def setTimeoutSeconds(value: Input[Double]): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
      
      inline def setTimeoutSecondsUndefined: Self = StObject.set(x, "timeoutSeconds", js.undefined)
    }
  }
  
  /**
    * ValidatingWebhookConfiguration describes the configuration of and admission webhook that accept or reject and object without changing it. Deprecated in v1.16, planned for removal in v1.19. Use admissionregistration.k8s.io/v1 ValidatingWebhookConfiguration instead.
    */
  trait ValidatingWebhookConfiguration extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[admissionregistrationDotk8sDotioSlashv1beta1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[
        Input[
          typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.ValidatingWebhookConfiguration
        ]
      ] = js.undefined
    
    /**
      * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
      */
    var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
    
    /**
      * Webhooks is a list of webhooks and the affected resources and operations.
      */
    var webhooks: js.UndefOr[Input[js.Array[Input[ValidatingWebhook]]]] = js.undefined
  }
  object ValidatingWebhookConfiguration {
    
    inline def apply(): ValidatingWebhookConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidatingWebhookConfiguration]
    }
    
    extension [Self <: ValidatingWebhookConfiguration](x: Self) {
      
      inline def setApiVersion(value: Input[admissionregistrationDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setKind(
        value: Input[
              typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.ValidatingWebhookConfiguration
            ]
      ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setWebhooks(value: Input[js.Array[Input[ValidatingWebhook]]]): Self = StObject.set(x, "webhooks", value.asInstanceOf[js.Any])
      
      inline def setWebhooksUndefined: Self = StObject.set(x, "webhooks", js.undefined)
      
      inline def setWebhooksVarargs(value: Input[ValidatingWebhook]*): Self = StObject.set(x, "webhooks", js.Array(value*))
    }
  }
  
  /**
    * ValidatingWebhook describes an admission webhook and the resources and operations it applies to.
    */
  trait ValidatingWebhookPatch extends StObject {
    
    /**
      * AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy. Default to `['v1beta1']`.
      */
    var admissionReviewVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * ClientConfig defines how to communicate with the hook. Required
      */
    var clientConfig: js.UndefOr[Input[WebhookClientConfigPatch]] = js.undefined
    
    /**
      * FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Ignore.
      */
    var failurePolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * matchPolicy defines how the "rules" list is used to match incoming requests. Allowed values are "Exact" or "Equivalent".
      *
      * - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules" only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.
      *
      * - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and "rules" only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.
      *
      * Defaults to "Exact"
      */
    var matchPolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where "imagepolicy" is the name of the webhook, and kubernetes.io is the name of the organization. Required.
      */
    var name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.
      *
      * For example, to run the webhook on any objects whose namespace is not associated with "runlevel" of "0" or "1";  you will set the selector as follows: "namespaceSelector": {
      *   "matchExpressions": [
      *     {
      *       "key": "runlevel",
      *       "operator": "NotIn",
      *       "values": [
      *         "0",
      *         "1"
      *       ]
      *     }
      *   ]
      * }
      *
      * If instead you want to only run the webhook on any objects whose namespace is associated with the "environment" of "prod" or "staging"; you will set the selector as follows: "namespaceSelector": {
      *   "matchExpressions": [
      *     {
      *       "key": "environment",
      *       "operator": "In",
      *       "values": [
      *         "prod",
      *         "staging"
      *       ]
      *     }
      *   ]
      * }
      *
      * See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels for more examples of label selectors.
      *
      * Default to the empty LabelSelector, which matches everything.
      */
    var namespaceSelector: js.UndefOr[Input[LabelSelectorPatch]] = js.undefined
    
    /**
      * ObjectSelector decides whether to run the webhook based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
      */
    var objectSelector: js.UndefOr[Input[LabelSelectorPatch]] = js.undefined
    
    /**
      * Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
      */
    var rules: js.UndefOr[Input[js.Array[Input[RuleWithOperationsPatch]]]] = js.undefined
    
    /**
      * SideEffects states whether this webhook has side effects. Acceptable values are: Unknown, None, Some, NoneOnDryRun Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some. Defaults to Unknown.
      */
    var sideEffects: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 30 seconds.
      */
    var timeoutSeconds: js.UndefOr[Input[Double]] = js.undefined
  }
  object ValidatingWebhookPatch {
    
    inline def apply(): ValidatingWebhookPatch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidatingWebhookPatch]
    }
    
    extension [Self <: ValidatingWebhookPatch](x: Self) {
      
      inline def setAdmissionReviewVersions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "admissionReviewVersions", value.asInstanceOf[js.Any])
      
      inline def setAdmissionReviewVersionsUndefined: Self = StObject.set(x, "admissionReviewVersions", js.undefined)
      
      inline def setAdmissionReviewVersionsVarargs(value: Input[String]*): Self = StObject.set(x, "admissionReviewVersions", js.Array(value*))
      
      inline def setClientConfig(value: Input[WebhookClientConfigPatch]): Self = StObject.set(x, "clientConfig", value.asInstanceOf[js.Any])
      
      inline def setClientConfigUndefined: Self = StObject.set(x, "clientConfig", js.undefined)
      
      inline def setFailurePolicy(value: Input[String]): Self = StObject.set(x, "failurePolicy", value.asInstanceOf[js.Any])
      
      inline def setFailurePolicyUndefined: Self = StObject.set(x, "failurePolicy", js.undefined)
      
      inline def setMatchPolicy(value: Input[String]): Self = StObject.set(x, "matchPolicy", value.asInstanceOf[js.Any])
      
      inline def setMatchPolicyUndefined: Self = StObject.set(x, "matchPolicy", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNamespaceSelector(value: Input[LabelSelectorPatch]): Self = StObject.set(x, "namespaceSelector", value.asInstanceOf[js.Any])
      
      inline def setNamespaceSelectorUndefined: Self = StObject.set(x, "namespaceSelector", js.undefined)
      
      inline def setObjectSelector(value: Input[LabelSelectorPatch]): Self = StObject.set(x, "objectSelector", value.asInstanceOf[js.Any])
      
      inline def setObjectSelectorUndefined: Self = StObject.set(x, "objectSelector", js.undefined)
      
      inline def setRules(value: Input[js.Array[Input[RuleWithOperationsPatch]]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: Input[RuleWithOperationsPatch]*): Self = StObject.set(x, "rules", js.Array(value*))
      
      inline def setSideEffects(value: Input[String]): Self = StObject.set(x, "sideEffects", value.asInstanceOf[js.Any])
      
      inline def setSideEffectsUndefined: Self = StObject.set(x, "sideEffects", js.undefined)
      
      inline def setTimeoutSeconds(value: Input[Double]): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
      
      inline def setTimeoutSecondsUndefined: Self = StObject.set(x, "timeoutSeconds", js.undefined)
    }
  }
  
  /**
    * WebhookClientConfig contains the information to make a TLS connection with the webhook
    */
  trait WebhookClientConfig extends StObject {
    
    /**
      * `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate. If unspecified, system trust roots on the apiserver are used.
      */
    var caBundle: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * `service` is a reference to the service for this webhook. Either `service` or `url` must be specified.
      *
      * If the webhook is running within the cluster, then you should use `service`.
      */
    var service: js.UndefOr[Input[ServiceReference]] = js.undefined
    
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
    var url: js.UndefOr[Input[String]] = js.undefined
  }
  object WebhookClientConfig {
    
    inline def apply(): WebhookClientConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebhookClientConfig]
    }
    
    extension [Self <: WebhookClientConfig](x: Self) {
      
      inline def setCaBundle(value: Input[String]): Self = StObject.set(x, "caBundle", value.asInstanceOf[js.Any])
      
      inline def setCaBundleUndefined: Self = StObject.set(x, "caBundle", js.undefined)
      
      inline def setService(value: Input[ServiceReference]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      inline def setUrl(value: Input[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /**
    * WebhookClientConfig contains the information to make a TLS connection with the webhook
    */
  trait WebhookClientConfigPatch extends StObject {
    
    /**
      * `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate. If unspecified, system trust roots on the apiserver are used.
      */
    var caBundle: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * `service` is a reference to the service for this webhook. Either `service` or `url` must be specified.
      *
      * If the webhook is running within the cluster, then you should use `service`.
      */
    var service: js.UndefOr[Input[ServiceReferencePatch]] = js.undefined
    
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
    var url: js.UndefOr[Input[String]] = js.undefined
  }
  object WebhookClientConfigPatch {
    
    inline def apply(): WebhookClientConfigPatch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebhookClientConfigPatch]
    }
    
    extension [Self <: WebhookClientConfigPatch](x: Self) {
      
      inline def setCaBundle(value: Input[String]): Self = StObject.set(x, "caBundle", value.asInstanceOf[js.Any])
      
      inline def setCaBundleUndefined: Self = StObject.set(x, "caBundle", js.undefined)
      
      inline def setService(value: Input[ServiceReferencePatch]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      inline def setUrl(value: Input[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
