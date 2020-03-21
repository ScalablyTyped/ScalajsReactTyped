package typingsJapgolly.pulumiKubernetes.outputMod.auditregistration.v1alpha1

import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.auditregistrationDotk8sDotioSlashv1alpha1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AuditSink represents a cluster level audit sink
  */
trait AuditSink extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: auditregistrationDotk8sDotioSlashv1alpha1
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.AuditSink
  val metadata: ObjectMeta
  /**
    * Spec defines the audit configuration spec
    */
  val spec: AuditSinkSpec
}

object AuditSink {
  @scala.inline
  def apply(
    apiVersion: auditregistrationDotk8sDotioSlashv1alpha1,
    kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.AuditSink,
    metadata: ObjectMeta,
    spec: AuditSinkSpec
  ): AuditSink = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuditSink]
  }
}

