package typingsJapgolly.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NonResourcePolicyRule is a predicate that matches non-resource requests according to their
  * verb and the target non-resource URL. A NonResourcePolicyRule matches a request if and only
  * if both (a) at least one member of verbs matches the request and (b) at least one member of
  * nonResourceURLs matches the request.
  */
trait NonResourcePolicyRule extends js.Object {
  /**
    * `nonResourceURLs` is a set of url prefixes that a user should have access to and may not be
    * empty. For example:
    *   - "/healthz" is legal
    *   - "/hea*" is illegal
    *   - "/hea" is legal but matches nothing
    *   - "/hea/ *" also matches nothing
    *   - "/healthz/ *" matches all per-component health checks.
    * "*" matches all non-resource urls. if it is present, it must be the only entry. Required.
    */
  val nonResourceURLs: js.Array[String]
  /**
    * `verbs` is a list of matching verbs and may not be empty. "*" matches all verbs. If it is
    * present, it must be the only entry. Required.
    */
  val verbs: js.Array[String]
}

object NonResourcePolicyRule {
  @scala.inline
  def apply(nonResourceURLs: js.Array[String], verbs: js.Array[String]): NonResourcePolicyRule = {
    val __obj = js.Dynamic.literal(nonResourceURLs = nonResourceURLs.asInstanceOf[js.Any], verbs = verbs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NonResourcePolicyRule]
  }
}

