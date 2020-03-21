package typingsJapgolly.pulumiKubernetes.outputMod.discovery.v1beta1

import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.discoveryDotk8sDotioSlashv1beta1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EndpointSlice represents a subset of the endpoints that implement a service. For a given
  * service there may be multiple EndpointSlice objects, selected by labels, which must be joined
  * to produce the full set of endpoints.
  */
trait EndpointSlice extends js.Object {
  /**
    * addressType specifies the type of address carried by this EndpointSlice. All addresses in
    * this slice must be the same type. This field is immutable after creation. The following
    * address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6:
    * Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
    */
  val addressType: String
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: discoveryDotk8sDotioSlashv1beta1
  /**
    * endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of
    * 1000 endpoints.
    */
  val endpoints: js.Array[Endpoint]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.EndpointSlice
  /**
    * Standard object's metadata.
    */
  val metadata: ObjectMeta
  /**
    * ports specifies the list of network ports exposed by each endpoint in this slice. Each port
    * must have a unique name. When ports is empty, it indicates that there are no defined ports.
    * When a port is defined with a nil port value, it indicates "all ports". Each slice may
    * include a maximum of 100 ports.
    */
  val ports: js.Array[EndpointPort]
}

object EndpointSlice {
  @scala.inline
  def apply(
    addressType: String,
    apiVersion: discoveryDotk8sDotioSlashv1beta1,
    endpoints: js.Array[Endpoint],
    kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.EndpointSlice,
    metadata: ObjectMeta,
    ports: js.Array[EndpointPort]
  ): EndpointSlice = {
    val __obj = js.Dynamic.literal(addressType = addressType.asInstanceOf[js.Any], apiVersion = apiVersion.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EndpointSlice]
  }
}

