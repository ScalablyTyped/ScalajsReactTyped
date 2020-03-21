package typingsJapgolly.pulumiKubernetes.outputMod.apiregistration.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * APIServiceSpec contains information for locating and communicating with a server. Only https
  * is supported, though you are able to disable certificate verification.
  */
trait APIServiceSpec extends js.Object {
  /**
    * CABundle is a PEM encoded CA bundle which will be used to validate an API server's serving
    * certificate. If unspecified, system trust roots on the apiserver are used.
    */
  val caBundle: String
  /**
    * Group is the API group name this server hosts
    */
  val group: String
  /**
    * GroupPriorityMininum is the priority this group should have at least. Higher priority means
    * that the group is preferred by clients over lower priority ones. Note that other versions
    * of this group might specify even higher GroupPriorityMininum values such that the whole
    * group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered
    * highest number to lowest (20 before 10). The secondary sort is based on the alphabetical
    * comparison of the name of the object.  (v1.bar before v1.foo) We'd recommend something
    * like: *.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to
    * be in the 2000s
    */
  val groupPriorityMinimum: Double
  /**
    * InsecureSkipTLSVerify disables TLS certificate verification when communicating with this
    * server. This is strongly discouraged.  You should use the CABundle instead.
    */
  val insecureSkipTLSVerify: Boolean
  /**
    * Service is a reference to the service for this API server.  It must communicate on port 443
    * If the Service is nil, that means the handling for the API groupversion is handled locally
    * on this server. The call will simply delegate to the normal handler chain to be fulfilled.
    */
  val service: ServiceReference
  /**
    * Version is the API version this server hosts.  For example, "v1"
    */
  val version: String
  /**
    * VersionPriority controls the ordering of this API version inside of its group.  Must be
    * greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest
    * (20 before 10). Since it's inside of a group, the number can be small, probably in the 10s.
    * In case of equal version priorities, the version string will be used to compute the order
    * inside a group. If the version string is "kube-like", it will sort above non "kube-like"
    * version strings, which are ordered lexicographically. "Kube-like" versions start with a
    * "v", then are followed by a number (the major version), then optionally the string "alpha"
    * or "beta" and another number (the minor version). These are sorted first by GA > beta >
    * alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing
    * major version, then minor version. An example sorted list of versions: v10, v2, v1,
    * v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
    */
  val versionPriority: Double
}

object APIServiceSpec {
  @scala.inline
  def apply(
    caBundle: String,
    group: String,
    groupPriorityMinimum: Double,
    insecureSkipTLSVerify: Boolean,
    service: ServiceReference,
    version: String,
    versionPriority: Double
  ): APIServiceSpec = {
    val __obj = js.Dynamic.literal(caBundle = caBundle.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], groupPriorityMinimum = groupPriorityMinimum.asInstanceOf[js.Any], insecureSkipTLSVerify = insecureSkipTLSVerify.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionPriority = versionPriority.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[APIServiceSpec]
  }
}

