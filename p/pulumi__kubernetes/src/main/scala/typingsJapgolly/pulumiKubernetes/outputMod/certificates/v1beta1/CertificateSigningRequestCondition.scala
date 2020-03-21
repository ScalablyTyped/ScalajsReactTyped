package typingsJapgolly.pulumiKubernetes.outputMod.certificates.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  */
trait CertificateSigningRequestCondition extends js.Object {
  /**
    * timestamp for the last update to this condition
    */
  val lastUpdateTime: String
  /**
    * human readable message with details about the request state
    */
  val message: String
  /**
    * brief reason for the request state
    */
  val reason: String
  /**
    * request approval state, currently Approved or Denied.
    */
  val `type`: String
}

object CertificateSigningRequestCondition {
  @scala.inline
  def apply(lastUpdateTime: String, message: String, reason: String, `type`: String): CertificateSigningRequestCondition = {
    val __obj = js.Dynamic.literal(lastUpdateTime = lastUpdateTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateSigningRequestCondition]
  }
}

