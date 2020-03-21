package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the context of use for a conformance or knowledge resource
  */
trait UsageContext extends Element {
  /**
    * Type of context being specified
    */
  var code: Coding
  /**
    * Value that defines the context
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Value that defines the context
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Value that defines the context
    */
  var valueRange: js.UndefOr[Range] = js.undefined
}

object UsageContext {
  @scala.inline
  def apply(
    code: Coding,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    valueCodeableConcept: CodeableConcept = null,
    valueQuantity: Quantity = null,
    valueRange: Range = null
  ): UsageContext = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (valueCodeableConcept != null) __obj.updateDynamic("valueCodeableConcept")(valueCodeableConcept.asInstanceOf[js.Any])
    if (valueQuantity != null) __obj.updateDynamic("valueQuantity")(valueQuantity.asInstanceOf[js.Any])
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageContext]
  }
}

