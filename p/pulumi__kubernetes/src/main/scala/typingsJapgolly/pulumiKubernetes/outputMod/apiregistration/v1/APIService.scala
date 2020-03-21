package typingsJapgolly.pulumiKubernetes.outputMod.apiregistration.v1

import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.apiregistrationDotk8sDotioSlashv1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * APIService represents a server for a particular GroupVersion. Name must be "version.group".
  */
trait APIService extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: apiregistrationDotk8sDotioSlashv1
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.APIService
  val metadata: ObjectMeta
  /**
    * Spec contains information for locating and communicating with a server
    */
  val spec: APIServiceSpec
  /**
    * Status contains derived information about an API server
    */
  val status: APIServiceStatus
}

object APIService {
  @scala.inline
  def apply(
    apiVersion: apiregistrationDotk8sDotioSlashv1,
    kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.APIService,
    metadata: ObjectMeta,
    spec: APIServiceSpec,
    status: APIServiceStatus
  ): APIService = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[APIService]
  }
}

