package typingsJapgolly.pulumiKubernetes.outputMod.policy.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AllowedHostPath defines the host volume conditions that will be enabled by a policy for pods
  * to use. It requires the path prefix to be defined.
  */
trait AllowedHostPath extends js.Object {
  /**
    * pathPrefix is the path prefix that the host volume must match. It does not support `*`.
    * Trailing slashes are trimmed when validating the path prefix with a host path.
    *
    * Examples: `/foo` would allow `/foo`, `/foo/` and `/foo/bar` `/foo` would not allow `/food`
    * or `/etc/foo`
    */
  val pathPrefix: String
  /**
    * when set to true, will allow host volumes matching the pathPrefix only if all volume mounts
    * are readOnly.
    */
  val readOnly: Boolean
}

object AllowedHostPath {
  @scala.inline
  def apply(pathPrefix: String, readOnly: Boolean): AllowedHostPath = {
    val __obj = js.Dynamic.literal(pathPrefix = pathPrefix.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AllowedHostPath]
  }
}

