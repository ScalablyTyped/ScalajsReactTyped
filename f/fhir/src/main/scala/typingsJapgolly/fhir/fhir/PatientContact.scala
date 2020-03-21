package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A contact party (e.g. guardian, partner, friend) for the patient
  */
trait PatientContact extends BackboneElement {
  /**
    * Contains extended information for property 'gender'.
    */
  var _gender: js.UndefOr[Element] = js.undefined
  /**
    * Address for the contact person
    */
  var address: js.UndefOr[Address] = js.undefined
  /**
    * male | female | other | unknown
    */
  var gender: js.UndefOr[code] = js.undefined
  /**
    * A name associated with the contact person
    */
  var name: js.UndefOr[HumanName] = js.undefined
  /**
    * Organization that is associated with the contact
    */
  var organization: js.UndefOr[Reference] = js.undefined
  /**
    * The period during which this contact person or organization is valid to be contacted relating to this patient
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * The kind of relationship
    */
  var relationship: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * A contact detail for the person
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}

object PatientContact {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _gender: Element = null,
    _id: Element = null,
    address: Address = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    gender: code = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    name: HumanName = null,
    organization: Reference = null,
    period: Period = null,
    relationship: js.Array[CodeableConcept] = null,
    telecom: js.Array[ContactPoint] = null
  ): PatientContact = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_gender != null) __obj.updateDynamic("_gender")(_gender.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (relationship != null) __obj.updateDynamic("relationship")(relationship.asInstanceOf[js.Any])
    if (telecom != null) __obj.updateDynamic("telecom")(telecom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatientContact]
  }
}

