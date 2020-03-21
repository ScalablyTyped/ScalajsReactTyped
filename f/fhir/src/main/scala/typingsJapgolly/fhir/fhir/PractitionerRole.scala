package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Roles/organizations the practitioner is associated with
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.fhir.fhir.Resource because Already inherited */ trait PractitionerRole extends DomainResource {
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'availabilityExceptions'.
    */
  var _availabilityExceptions: js.UndefOr[Element] = js.undefined
  /**
    * Whether this practitioner's record is in active use
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * Description of availability exceptions
    */
  var availabilityExceptions: js.UndefOr[String] = js.undefined
  /**
    * Times the Service Site is available
    */
  var availableTime: js.UndefOr[js.Array[PractitionerRoleAvailableTime]] = js.undefined
  /**
    * Roles which this practitioner may perform
    */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Technical endpoints providing access to services operated for the practitioner with this role
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * The list of healthcare services that this worker provides for this role's Organization/Location(s)
    */
  var healthcareService: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Business Identifiers that are specific to a role/location
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * The location(s) at which this practitioner provides care
    */
  var location: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Not available during this time due to provided reason
    */
  var notAvailable: js.UndefOr[js.Array[PractitionerRoleNotAvailable]] = js.undefined
  /**
    * Organization where the roles are available
    */
  var organization: js.UndefOr[Reference] = js.undefined
  /**
    * The period during which the practitioner is authorized to perform in these role(s)
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * Practitioner that is able to provide the defined services for the organation
    */
  var practitioner: js.UndefOr[Reference] = js.undefined
  /**
    * Specific specialty of the practitioner
    */
  var specialty: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Contact details that are specific to the role/location/service
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}

object PractitionerRole {
  @scala.inline
  def apply(
    _active: Element = null,
    _availabilityExceptions: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    active: js.UndefOr[Boolean] = js.undefined,
    availabilityExceptions: String = null,
    availableTime: js.Array[PractitionerRoleAvailableTime] = null,
    code: js.Array[CodeableConcept] = null,
    contained: js.Array[Resource] = null,
    endpoint: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    healthcareService: js.Array[Reference] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    location: js.Array[Reference] = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    notAvailable: js.Array[PractitionerRoleNotAvailable] = null,
    organization: Reference = null,
    period: Period = null,
    practitioner: Reference = null,
    resourceType: code = null,
    specialty: js.Array[CodeableConcept] = null,
    telecom: js.Array[ContactPoint] = null,
    text: Narrative = null
  ): PractitionerRole = {
    val __obj = js.Dynamic.literal()
    if (_active != null) __obj.updateDynamic("_active")(_active.asInstanceOf[js.Any])
    if (_availabilityExceptions != null) __obj.updateDynamic("_availabilityExceptions")(_availabilityExceptions.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (availabilityExceptions != null) __obj.updateDynamic("availabilityExceptions")(availabilityExceptions.asInstanceOf[js.Any])
    if (availableTime != null) __obj.updateDynamic("availableTime")(availableTime.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (healthcareService != null) __obj.updateDynamic("healthcareService")(healthcareService.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (notAvailable != null) __obj.updateDynamic("notAvailable")(notAvailable.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (practitioner != null) __obj.updateDynamic("practitioner")(practitioner.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (specialty != null) __obj.updateDynamic("specialty")(specialty.asInstanceOf[js.Any])
    if (telecom != null) __obj.updateDynamic("telecom")(telecom.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PractitionerRole]
  }
}

