package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhir.fhir.Questionnaire
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyQuestionnaire extends js.Object {
  var body: Questionnaire
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Questionnaire
}

object AnonBodyQuestionnaire {
  @scala.inline
  def apply(
    body: Questionnaire,
    resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Questionnaire,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyQuestionnaire = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyQuestionnaire]
  }
}

