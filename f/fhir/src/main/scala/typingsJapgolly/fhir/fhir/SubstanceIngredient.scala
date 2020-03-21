package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Composition information about the substance
  */
trait SubstanceIngredient extends BackboneElement {
  /**
    * Optional amount (concentration)
    */
  var quantity: js.UndefOr[Ratio] = js.undefined
  /**
    * A component of the substance
    */
  var substanceCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * A component of the substance
    */
  var substanceReference: js.UndefOr[Reference] = js.undefined
}

object SubstanceIngredient {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    quantity: Ratio = null,
    substanceCodeableConcept: CodeableConcept = null,
    substanceReference: Reference = null
  ): SubstanceIngredient = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (substanceCodeableConcept != null) __obj.updateDynamic("substanceCodeableConcept")(substanceCodeableConcept.asInstanceOf[js.Any])
    if (substanceReference != null) __obj.updateDynamic("substanceReference")(substanceReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubstanceIngredient]
  }
}

