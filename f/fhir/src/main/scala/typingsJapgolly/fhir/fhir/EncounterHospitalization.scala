package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about the admission to a healthcare service
  */
trait EncounterHospitalization extends BackboneElement {
  /**
    * From where patient was admitted (physician referral, transfer)
    */
  var admitSource: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Location to which the patient is discharged
    */
  var destination: js.UndefOr[Reference] = js.undefined
  /**
    * Diet preferences reported by the patient
    */
  var dietPreference: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Category or kind of location after discharge
    */
  var dischargeDisposition: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * The location from which the patient came before admission
    */
  var origin: js.UndefOr[Reference] = js.undefined
  /**
    * Pre-admission identifier
    */
  var preAdmissionIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
    * The type of hospital re-admission that has occurred (if any). If the value is absent, then this is not identified as a readmission
    */
  var reAdmission: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Wheelchair, translator, stretcher, etc.
    */
  var specialArrangement: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Special courtesies (VIP, board member)
    */
  var specialCourtesy: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}

object EncounterHospitalization {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    admitSource: CodeableConcept = null,
    destination: Reference = null,
    dietPreference: js.Array[CodeableConcept] = null,
    dischargeDisposition: CodeableConcept = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    origin: Reference = null,
    preAdmissionIdentifier: Identifier = null,
    reAdmission: CodeableConcept = null,
    specialArrangement: js.Array[CodeableConcept] = null,
    specialCourtesy: js.Array[CodeableConcept] = null
  ): EncounterHospitalization = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (admitSource != null) __obj.updateDynamic("admitSource")(admitSource.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (dietPreference != null) __obj.updateDynamic("dietPreference")(dietPreference.asInstanceOf[js.Any])
    if (dischargeDisposition != null) __obj.updateDynamic("dischargeDisposition")(dischargeDisposition.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (preAdmissionIdentifier != null) __obj.updateDynamic("preAdmissionIdentifier")(preAdmissionIdentifier.asInstanceOf[js.Any])
    if (reAdmission != null) __obj.updateDynamic("reAdmission")(reAdmission.asInstanceOf[js.Any])
    if (specialArrangement != null) __obj.updateDynamic("specialArrangement")(specialArrangement.asInstanceOf[js.Any])
    if (specialCourtesy != null) __obj.updateDynamic("specialCourtesy")(specialCourtesy.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncounterHospitalization]
  }
}

