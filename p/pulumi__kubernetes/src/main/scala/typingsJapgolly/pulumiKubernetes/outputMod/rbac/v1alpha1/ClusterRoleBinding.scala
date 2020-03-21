package typingsJapgolly.pulumiKubernetes.outputMod.rbac.v1alpha1

import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1alpha1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ClusterRoleBinding references a ClusterRole, but not contain it.  It can reference a
  * ClusterRole in the global namespace, and adds who information via Subject. Deprecated in
  * v1.17 in favor of rbac.authorization.k8s.io/v1 ClusterRoleBinding, and will no longer be
  * served in v1.20.
  */
trait ClusterRoleBinding extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: rbacDotauthorizationDotk8sDotioSlashv1alpha1
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.ClusterRoleBinding
  /**
    * Standard object's metadata.
    */
  val metadata: ObjectMeta
  /**
    * RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be
    * resolved, the Authorizer must return an error.
    */
  val roleRef: RoleRef
  /**
    * Subjects holds references to the objects the role applies to.
    */
  val subjects: js.Array[Subject]
}

object ClusterRoleBinding {
  @scala.inline
  def apply(
    apiVersion: rbacDotauthorizationDotk8sDotioSlashv1alpha1,
    kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.ClusterRoleBinding,
    metadata: ObjectMeta,
    roleRef: RoleRef,
    subjects: js.Array[Subject]
  ): ClusterRoleBinding = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], roleRef = roleRef.asInstanceOf[js.Any], subjects = subjects.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClusterRoleBinding]
  }
}

