package typingsJapgolly.pulumiKubernetes.inputMod.networking.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HTTPIngressPath associates a path regex with a backend. Incoming urls matching the path are
  * forwarded to the backend.
  */
trait HTTPIngressPath extends js.Object {
  /**
    * Backend defines the referenced service endpoint to which the traffic will be forwarded to.
    */
  var backend: Input[IngressBackend]
  /**
    * Path is an extended POSIX regex as defined by IEEE Std 1003.1, (i.e this follows the
    * egrep/unix syntax, not the perl syntax) matched against the path of an incoming request.
    * Currently it can contain characters disallowed from the conventional "path" part of a URL
    * as defined by RFC 3986. Paths must begin with a '/'. If unspecified, the path defaults to a
    * catch all sending traffic to the backend.
    */
  var path: js.UndefOr[Input[String]] = js.undefined
}

object HTTPIngressPath {
  @scala.inline
  def apply(backend: Input[IngressBackend], path: Input[String] = null): HTTPIngressPath = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPIngressPath]
  }
}

