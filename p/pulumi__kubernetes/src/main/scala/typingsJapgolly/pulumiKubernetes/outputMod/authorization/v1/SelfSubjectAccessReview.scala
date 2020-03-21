package typingsJapgolly.pulumiKubernetes.outputMod.authorization.v1

import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.authorizationDotk8sDotioSlashv1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SelfSubjectAccessReview checks whether or the current user can perform an action.  Not
  * filling in a spec.namespace means "in all namespaces".  Self is a special case, because users
  * should always be able to check whether they can perform an action
  */
trait SelfSubjectAccessReview extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: authorizationDotk8sDotioSlashv1
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.SelfSubjectAccessReview
  val metadata: ObjectMeta
  /**
    * Spec holds information about the request being evaluated.  user and groups must be empty
    */
  val spec: SelfSubjectAccessReviewSpec
  /**
    * Status is filled in by the server and indicates whether the request is allowed or not
    */
  val status: SubjectAccessReviewStatus
}

object SelfSubjectAccessReview {
  @scala.inline
  def apply(
    apiVersion: authorizationDotk8sDotioSlashv1,
    kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.SelfSubjectAccessReview,
    metadata: ObjectMeta,
    spec: SelfSubjectAccessReviewSpec,
    status: SubjectAccessReviewStatus
  ): SelfSubjectAccessReview = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelfSubjectAccessReview]
  }
}

