package typingsJapgolly.pulumiKubernetes.outputMod.rbac.v1beta1

import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1beta1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a
  * unit by a RoleBinding or ClusterRoleBinding. Deprecated in v1.17 in favor of
  * rbac.authorization.k8s.io/v1 ClusterRole, and will no longer be served in v1.20.
  */
trait ClusterRole extends js.Object {
  /**
    * AggregationRule is an optional field that describes how to build the Rules for this
    * ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct
    * changes to Rules will be stomped by the controller.
    */
  val aggregationRule: AggregationRule
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: rbacDotauthorizationDotk8sDotioSlashv1beta1
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.ClusterRole
  /**
    * Standard object's metadata.
    */
  val metadata: ObjectMeta
  /**
    * Rules holds all the PolicyRules for this ClusterRole
    */
  val rules: js.Array[PolicyRule]
}

object ClusterRole {
  @scala.inline
  def apply(
    aggregationRule: AggregationRule,
    apiVersion: rbacDotauthorizationDotk8sDotioSlashv1beta1,
    kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.ClusterRole,
    metadata: ObjectMeta,
    rules: js.Array[PolicyRule]
  ): ClusterRole = {
    val __obj = js.Dynamic.literal(aggregationRule = aggregationRule.asInstanceOf[js.Any], apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClusterRole]
  }
}

