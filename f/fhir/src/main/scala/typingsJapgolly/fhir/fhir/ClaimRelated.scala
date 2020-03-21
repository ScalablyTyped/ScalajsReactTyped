package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Related Claims which may be revelant to processing this claimn
  */
trait ClaimRelated extends BackboneElement {
  /**
    * Reference to the related claim
    */
  var claim: js.UndefOr[Reference] = js.undefined
  /**
    * Related file or case reference
    */
  var reference: js.UndefOr[Identifier] = js.undefined
  /**
    * How the reference claim is related
    */
  var relationship: js.UndefOr[CodeableConcept] = js.undefined
}

object ClaimRelated {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    claim: Reference = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    reference: Identifier = null,
    relationship: CodeableConcept = null
  ): ClaimRelated = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (claim != null) __obj.updateDynamic("claim")(claim.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (reference != null) __obj.updateDynamic("reference")(reference.asInstanceOf[js.Any])
    if (relationship != null) __obj.updateDynamic("relationship")(relationship.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimRelated]
  }
}

