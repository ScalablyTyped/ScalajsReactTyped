package typingsJapgolly.stripeV2.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeBankAccount extends js.Object {
  def createToken(
    params: StripeBankTokenParams,
    stripeResponseHandler: js.Function2[/* status */ Double, /* response */ StripeBankTokenResponse, Unit]
  ): Unit = js.native
  def validateAccountNumber(accountNumber: String, countryCode: String): Boolean = js.native
  def validateAccountNumber(accountNumber: Double, countryCode: String): Boolean = js.native
  def validateRoutingNumber(routingNumber: String, countryCode: String): Boolean = js.native
  def validateRoutingNumber(routingNumber: Double, countryCode: String): Boolean = js.native
}

