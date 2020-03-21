package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhir.fhir.QuestionnaireResponse
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyQuestionnaireResponseHeadersHeaders extends js.Object {
  var body: QuestionnaireResponse
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.QuestionnaireResponse
}

object AnonBodyQuestionnaireResponseHeadersHeaders {
  @scala.inline
  def apply(
    body: QuestionnaireResponse,
    id: String,
    resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.QuestionnaireResponse,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyQuestionnaireResponseHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyQuestionnaireResponseHeadersHeaders]
  }
}

