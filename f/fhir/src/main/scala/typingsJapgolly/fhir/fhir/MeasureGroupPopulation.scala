package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Population criteria
  */
trait MeasureGroupPopulation extends BackboneElement {
  /**
    * Contains extended information for property 'criteria'.
    */
  var _criteria: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * initial-population | numerator | numerator-exclusion | denominator | denominator-exclusion | denominator-exception | measure-population | measure-population-exclusion | measure-observation
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * The name of a valid referenced CQL expression (may be namespaced) that defines this population criteria
    */
  var criteria: String
  /**
    * The human readable description of this population criteria
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Unique identifier
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Short name
    */
  var name: js.UndefOr[String] = js.undefined
}

object MeasureGroupPopulation {
  @scala.inline
  def apply(
    criteria: String,
    _criteria: Element = null,
    _description: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _name: Element = null,
    code: CodeableConcept = null,
    description: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    identifier: Identifier = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null
  ): MeasureGroupPopulation = {
    val __obj = js.Dynamic.literal(criteria = criteria.asInstanceOf[js.Any])
    if (_criteria != null) __obj.updateDynamic("_criteria")(_criteria.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureGroupPopulation]
  }
}

