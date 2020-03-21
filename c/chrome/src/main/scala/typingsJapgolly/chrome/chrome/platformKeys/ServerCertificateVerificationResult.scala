package typingsJapgolly.chrome.chrome.platformKeys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerCertificateVerificationResult extends js.Object {
  /**
    * If the trust verification failed, this array contains the errors reported by the underlying network layer. Otherwise, this array is empty.
    * Note: This list is meant for debugging only and may not contain all relevant errors. The errors returned may change in future revisions of this API, and are not guaranteed to be forwards or backwards compatible.
    */
  var debug_errors: js.Array[String]
  /** The result of the trust verification: true if trust for the given verification details could be established and false if trust is rejected for any reason. */
  var trusted: Boolean
}

object ServerCertificateVerificationResult {
  @scala.inline
  def apply(debug_errors: js.Array[String], trusted: Boolean): ServerCertificateVerificationResult = {
    val __obj = js.Dynamic.literal(debug_errors = debug_errors.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServerCertificateVerificationResult]
  }
}

