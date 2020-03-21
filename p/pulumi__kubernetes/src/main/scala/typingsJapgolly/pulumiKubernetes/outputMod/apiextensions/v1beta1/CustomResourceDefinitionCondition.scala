package typingsJapgolly.pulumiKubernetes.outputMod.apiextensions.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceDefinitionCondition contains details for the current condition of this pod.
  */
trait CustomResourceDefinitionCondition extends js.Object {
  /**
    * lastTransitionTime last time the condition transitioned from one status to another.
    */
  val lastTransitionTime: String
  /**
    * message is a human-readable message indicating details about last transition.
    */
  val message: String
  /**
    * reason is a unique, one-word, CamelCase reason for the condition's last transition.
    */
  val reason: String
  /**
    * status is the status of the condition. Can be True, False, Unknown.
    */
  val status: String
  /**
    * type is the type of the condition. Types include Established, NamesAccepted and
    * Terminating.
    */
  val `type`: String
}

object CustomResourceDefinitionCondition {
  @scala.inline
  def apply(lastTransitionTime: String, message: String, reason: String, status: String, `type`: String): CustomResourceDefinitionCondition = {
    val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceDefinitionCondition]
  }
}

