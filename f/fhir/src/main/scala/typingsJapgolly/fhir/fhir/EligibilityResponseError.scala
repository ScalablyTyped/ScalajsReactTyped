package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Processing errors
  */
trait EligibilityResponseError extends BackboneElement {
  /**
    * Error code detailing processing issues
    */
  var code: CodeableConcept
}

object EligibilityResponseError {
  @scala.inline
  def apply(
    code: CodeableConcept,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): EligibilityResponseError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[EligibilityResponseError]
  }
}

