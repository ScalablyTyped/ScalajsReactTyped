package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhir.fhir.PaymentNotice
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyPaymentNotice extends js.Object {
  var body: PaymentNotice
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.PaymentNotice
}

object AnonBodyPaymentNotice {
  @scala.inline
  def apply(
    body: PaymentNotice,
    resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.PaymentNotice,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyPaymentNotice = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyPaymentNotice]
  }
}

