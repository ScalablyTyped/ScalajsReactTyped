package typingsJapgolly.googlepay.google.payments.api

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.googlepay.AnonProtocolVersion
import typingsJapgolly.googlepay.googlepayStrings.DIRECT
import typingsJapgolly.googlepay.googlepayStrings.PAYMENT_GATEWAY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googlepay.google.payments.api.PaymentGatewayTokenizationSpecification
  - typingsJapgolly.googlepay.google.payments.api.DirectTokenizationSpecification
*/
trait PaymentMethodTokenizationSpecification extends js.Object

object PaymentMethodTokenizationSpecification {
  @scala.inline
  def PaymentGatewayTokenizationSpecification(parameters: StringDictionary[String], `type`: PAYMENT_GATEWAY): PaymentMethodTokenizationSpecification = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodTokenizationSpecification]
  }
  @scala.inline
  def DirectTokenizationSpecification(parameters: AnonProtocolVersion, `type`: DIRECT): PaymentMethodTokenizationSpecification = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodTokenizationSpecification]
  }
}

