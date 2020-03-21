package typingsJapgolly.pulumiKubernetes.inputMod.networking.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IngressTLS describes the transport layer security associated with an Ingress.
  */
trait IngressTLS extends js.Object {
  /**
    * Hosts are a list of hosts included in the TLS certificate. The values in this list must
    * match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the
    * loadbalancer controller fulfilling this Ingress, if left unspecified.
    */
  var hosts: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * SecretName is the name of the secret used to terminate SSL traffic on 443. Field is left
    * optional to allow SSL routing based on SNI hostname alone. If the SNI host in a listener
    * conflicts with the "Host" header field used by an IngressRule, the SNI host is used for
    * termination and value of the Host header is used for routing.
    */
  var secretName: js.UndefOr[Input[String]] = js.undefined
}

object IngressTLS {
  @scala.inline
  def apply(hosts: Input[js.Array[Input[String]]] = null, secretName: Input[String] = null): IngressTLS = {
    val __obj = js.Dynamic.literal()
    if (hosts != null) __obj.updateDynamic("hosts")(hosts.asInstanceOf[js.Any])
    if (secretName != null) __obj.updateDynamic("secretName")(secretName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressTLS]
  }
}

