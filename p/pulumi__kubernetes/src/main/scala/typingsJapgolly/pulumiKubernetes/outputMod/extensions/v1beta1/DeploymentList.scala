package typingsJapgolly.pulumiKubernetes.outputMod.extensions.v1beta1

import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.ListMeta
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.extensionsSlashv1beta1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DeploymentList is a list of Deployments.
  */
trait DeploymentList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: extensionsSlashv1beta1
  /**
    * Items is the list of Deployments.
    */
  val items: js.Array[Deployment]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.DeploymentList
  /**
    * Standard list metadata.
    */
  val metadata: ListMeta
}

object DeploymentList {
  @scala.inline
  def apply(
    apiVersion: extensionsSlashv1beta1,
    items: js.Array[Deployment],
    kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.DeploymentList,
    metadata: ListMeta
  ): DeploymentList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeploymentList]
  }
}

