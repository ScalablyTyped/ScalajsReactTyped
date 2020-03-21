package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * What codes are expected
  */
trait DataRequirementCodeFilter extends Element {
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueCode'.
    */
  var _valueCode: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'valueSetString'.
    */
  var _valueSetString: js.UndefOr[Element] = js.undefined
  /**
    * The code-valued attribute of the filter
    */
  var path: String
  /**
    * What code is expected
    */
  var valueCode: js.UndefOr[js.Array[code]] = js.undefined
  /**
    * What CodeableConcept is expected
    */
  var valueCodeableConcept: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * What Coding is expected
    */
  var valueCoding: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * Valueset for the filter
    */
  var valueSetReference: js.UndefOr[Reference] = js.undefined
  /**
    * Valueset for the filter
    */
  var valueSetString: js.UndefOr[String] = js.undefined
}

object DataRequirementCodeFilter {
  @scala.inline
  def apply(
    path: String,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _path: Element = null,
    _valueCode: js.Array[Element] = null,
    _valueSetString: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    valueCode: js.Array[code] = null,
    valueCodeableConcept: js.Array[CodeableConcept] = null,
    valueCoding: js.Array[Coding] = null,
    valueSetReference: Reference = null,
    valueSetString: String = null
  ): DataRequirementCodeFilter = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_path != null) __obj.updateDynamic("_path")(_path.asInstanceOf[js.Any])
    if (_valueCode != null) __obj.updateDynamic("_valueCode")(_valueCode.asInstanceOf[js.Any])
    if (_valueSetString != null) __obj.updateDynamic("_valueSetString")(_valueSetString.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (valueCode != null) __obj.updateDynamic("valueCode")(valueCode.asInstanceOf[js.Any])
    if (valueCodeableConcept != null) __obj.updateDynamic("valueCodeableConcept")(valueCodeableConcept.asInstanceOf[js.Any])
    if (valueCoding != null) __obj.updateDynamic("valueCoding")(valueCoding.asInstanceOf[js.Any])
    if (valueSetReference != null) __obj.updateDynamic("valueSetReference")(valueSetReference.asInstanceOf[js.Any])
    if (valueSetString != null) __obj.updateDynamic("valueSetString")(valueSetString.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRequirementCodeFilter]
  }
}

