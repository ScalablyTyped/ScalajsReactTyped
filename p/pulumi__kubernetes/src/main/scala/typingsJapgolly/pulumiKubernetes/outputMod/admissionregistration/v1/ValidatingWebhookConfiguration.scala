package typingsJapgolly.pulumiKubernetes.outputMod.admissionregistration.v1

import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.admissionregistrationDotk8sDotioSlashv1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ValidatingWebhookConfiguration describes the configuration of and admission webhook that
  * accept or reject and object without changing it.
  */
trait ValidatingWebhookConfiguration extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: admissionregistrationDotk8sDotioSlashv1
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.ValidatingWebhookConfiguration
  /**
    * Standard object metadata; More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
    */
  val metadata: ObjectMeta
  /**
    * Webhooks is a list of webhooks and the affected resources and operations.
    */
  val webhooks: js.Array[ValidatingWebhook]
}

object ValidatingWebhookConfiguration {
  @scala.inline
  def apply(
    apiVersion: admissionregistrationDotk8sDotioSlashv1,
    kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.ValidatingWebhookConfiguration,
    metadata: ObjectMeta,
    webhooks: js.Array[ValidatingWebhook]
  ): ValidatingWebhookConfiguration = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], webhooks = webhooks.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ValidatingWebhookConfiguration]
  }
}

