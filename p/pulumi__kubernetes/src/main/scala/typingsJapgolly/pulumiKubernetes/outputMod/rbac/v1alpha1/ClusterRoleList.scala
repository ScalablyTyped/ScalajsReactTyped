package typingsJapgolly.pulumiKubernetes.outputMod.rbac.v1alpha1

import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.ListMeta
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1alpha1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ClusterRoleList is a collection of ClusterRoles. Deprecated in v1.17 in favor of
  * rbac.authorization.k8s.io/v1 ClusterRoles, and will no longer be served in v1.20.
  */
trait ClusterRoleList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: rbacDotauthorizationDotk8sDotioSlashv1alpha1
  /**
    * Items is a list of ClusterRoles
    */
  val items: js.Array[ClusterRole]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.ClusterRoleList
  /**
    * Standard object's metadata.
    */
  val metadata: ListMeta
}

object ClusterRoleList {
  @scala.inline
  def apply(
    apiVersion: rbacDotauthorizationDotk8sDotioSlashv1alpha1,
    items: js.Array[ClusterRole],
    kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.ClusterRoleList,
    metadata: ListMeta
  ): ClusterRoleList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClusterRoleList]
  }
}

