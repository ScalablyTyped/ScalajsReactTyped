package typingsJapgolly.pulumiKubernetes.outputMod.apps.v1

import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.appsSlashv1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ControllerRevision implements an immutable snapshot of state data. Clients are responsible
  * for serializing and deserializing the objects that contain their internal state. Once a
  * ControllerRevision has been successfully created, it can not be updated. The API Server will
  * fail validation of all requests that attempt to mutate the Data field. ControllerRevisions
  * may, however, be deleted. Note that, due to its use by both the DaemonSet and StatefulSet
  * controllers for update and rollback, this object is beta. However, it may be subject to name
  * and representation changes in future releases, and clients should not depend on its
  * stability. It is primarily for internal use by controllers.
  */
trait ControllerRevision extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: appsSlashv1
  /**
    * Data is the serialized representation of the state.
    */
  val data: js.Object
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.ControllerRevision
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ObjectMeta
  /**
    * Revision indicates the revision of the state represented by Data.
    */
  val revision: Double
}

object ControllerRevision {
  @scala.inline
  def apply(
    apiVersion: appsSlashv1,
    data: js.Object,
    kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.ControllerRevision,
    metadata: ObjectMeta,
    revision: Double
  ): ControllerRevision = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ControllerRevision]
  }
}

