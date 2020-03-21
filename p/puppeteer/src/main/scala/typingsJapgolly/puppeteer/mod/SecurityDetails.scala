package typingsJapgolly.puppeteer.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityDetails extends js.Object {
  /** A string with the name of issuer of the certificate. (e.g. "Let's Encrypt Authority X3"). */
  def issuer(): String
  /** String with the security protocol (e.g. TLS 1.2). */
  def protocol(): String
  /** Name of the subject to which the certificate was issued to (e.g. "www.example.com"). */
  def subjectName(): String
  /** Timestamp stating the start of validity of the certificate. */
  def validFrom(): Double
  /** Timestamp stating the end of validity of the certificate. */
  def validTo(): Double
}

object SecurityDetails {
  @scala.inline
  def apply(
    issuer: CallbackTo[String],
    protocol: CallbackTo[String],
    subjectName: CallbackTo[String],
    validFrom: CallbackTo[Double],
    validTo: CallbackTo[Double]
  ): SecurityDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("issuer")(issuer.toJsFn)
    __obj.updateDynamic("protocol")(protocol.toJsFn)
    __obj.updateDynamic("subjectName")(subjectName.toJsFn)
    __obj.updateDynamic("validFrom")(validFrom.toJsFn)
    __obj.updateDynamic("validTo")(validTo.toJsFn)
    __obj.asInstanceOf[SecurityDetails]
  }
}

