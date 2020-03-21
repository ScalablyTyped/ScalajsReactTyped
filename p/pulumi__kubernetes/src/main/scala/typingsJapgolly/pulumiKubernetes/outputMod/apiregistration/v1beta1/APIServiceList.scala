package typingsJapgolly.pulumiKubernetes.outputMod.apiregistration.v1beta1

import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.ListMeta
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.apiregistrationDotk8sDotioSlashv1beta1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * APIServiceList is a list of APIService objects.
  */
trait APIServiceList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: apiregistrationDotk8sDotioSlashv1beta1
  val items: js.Array[APIService]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.APIServiceList
  val metadata: ListMeta
}

object APIServiceList {
  @scala.inline
  def apply(
    apiVersion: apiregistrationDotk8sDotioSlashv1beta1,
    items: js.Array[APIService],
    kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.APIServiceList,
    metadata: ListMeta
  ): APIServiceList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[APIServiceList]
  }
}

