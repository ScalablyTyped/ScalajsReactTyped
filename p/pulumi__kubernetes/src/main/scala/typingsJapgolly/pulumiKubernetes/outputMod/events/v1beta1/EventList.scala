package typingsJapgolly.pulumiKubernetes.outputMod.events.v1beta1

import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.ListMeta
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.eventsDotk8sDotioSlashv1beta1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EventList is a list of Event objects.
  */
trait EventList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: eventsDotk8sDotioSlashv1beta1
  /**
    * Items is a list of schema objects.
    */
  val items: js.Array[Event]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.EventList
  /**
    * Standard list metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ListMeta
}

object EventList {
  @scala.inline
  def apply(
    apiVersion: eventsDotk8sDotioSlashv1beta1,
    items: js.Array[Event],
    kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.EventList,
    metadata: ListMeta
  ): EventList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventList]
  }
}

