package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional rule -  addition or removal of permissions
  */
trait ConsentExcept extends BackboneElement {
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Actions controlled by this exception
    */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Who|what controlled by this exception (or group, by role)
    */
  var actor: js.UndefOr[js.Array[ConsentExceptActor]] = js.undefined
  /**
    * e.g. Resource Type, Profile, or CDA etc
    */
  var `class`: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * e.g. LOINC or SNOMED CT code, etc in the content
    */
  var code: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * Data controlled by this exception
    */
  var data: js.UndefOr[js.Array[ConsentExceptData]] = js.undefined
  /**
    * Timeframe for data controlled by this exception
    */
  var dataPeriod: js.UndefOr[Period] = js.undefined
  /**
    * Timeframe for this exception
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * Context of activities covered by this exception
    */
  var purpose: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * Security Labels that define affected resources
    */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * deny | permit
    */
  var `type`: code
}

object ConsentExcept {
  @scala.inline
  def apply(
    `type`: code,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _type: Element = null,
    action: js.Array[CodeableConcept] = null,
    actor: js.Array[ConsentExceptActor] = null,
    `class`: js.Array[Coding] = null,
    code: js.Array[Coding] = null,
    data: js.Array[ConsentExceptData] = null,
    dataPeriod: Period = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    period: Period = null,
    purpose: js.Array[Coding] = null,
    securityLabel: js.Array[Coding] = null
  ): ConsentExcept = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_type != null) __obj.updateDynamic("_type")(_type.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (actor != null) __obj.updateDynamic("actor")(actor.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataPeriod != null) __obj.updateDynamic("dataPeriod")(dataPeriod.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (securityLabel != null) __obj.updateDynamic("securityLabel")(securityLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsentExcept]
  }
}

