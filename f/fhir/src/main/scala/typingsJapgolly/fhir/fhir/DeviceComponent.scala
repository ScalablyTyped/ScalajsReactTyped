package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of a medical-related component of a medical device
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.fhir.fhir.Resource because Already inherited */ trait DeviceComponent extends DomainResource {
  /**
    * Contains extended information for property 'lastSystemChange'.
    */
  var _lastSystemChange: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'measurementPrinciple'.
    */
  var _measurementPrinciple: js.UndefOr[Element] = js.undefined
  /**
    * Instance id assigned by the software stack
    */
  var identifier: Identifier
  /**
    * Language code for the human-readable text strings produced by the device
    */
  var languageCode: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Recent system change timestamp
    */
  var lastSystemChange: js.UndefOr[instant] = js.undefined
  /**
    * other | chemical | electrical | impedance | nuclear | optical | thermal | biological | mechanical | acoustical | manual+
    */
  var measurementPrinciple: js.UndefOr[code] = js.undefined
  /**
    * Current operational status of the component, for example On, Off or Standby
    */
  var operationalStatus: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Current supported parameter group
    */
  var parameterGroup: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Parent resource link
    */
  var parent: js.UndefOr[Reference] = js.undefined
  /**
    * Specification details such as Component Revisions, or Serial Numbers
    */
  var productionSpecification: js.UndefOr[js.Array[DeviceComponentProductionSpecification]] = js.undefined
  /**
    * Top-level device resource link
    */
  var source: js.UndefOr[Reference] = js.undefined
  /**
    * What kind of component it is
    */
  var `type`: CodeableConcept
}

object DeviceComponent {
  @scala.inline
  def apply(
    identifier: Identifier,
    `type`: CodeableConcept,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _lastSystemChange: Element = null,
    _measurementPrinciple: Element = null,
    _resourceType: Element = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    implicitRules: uri = null,
    language: code = null,
    languageCode: CodeableConcept = null,
    lastSystemChange: instant = null,
    measurementPrinciple: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    operationalStatus: js.Array[CodeableConcept] = null,
    parameterGroup: CodeableConcept = null,
    parent: Reference = null,
    productionSpecification: js.Array[DeviceComponentProductionSpecification] = null,
    resourceType: code = null,
    source: Reference = null,
    text: Narrative = null
  ): DeviceComponent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_lastSystemChange != null) __obj.updateDynamic("_lastSystemChange")(_lastSystemChange.asInstanceOf[js.Any])
    if (_measurementPrinciple != null) __obj.updateDynamic("_measurementPrinciple")(_measurementPrinciple.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (lastSystemChange != null) __obj.updateDynamic("lastSystemChange")(lastSystemChange.asInstanceOf[js.Any])
    if (measurementPrinciple != null) __obj.updateDynamic("measurementPrinciple")(measurementPrinciple.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (operationalStatus != null) __obj.updateDynamic("operationalStatus")(operationalStatus.asInstanceOf[js.Any])
    if (parameterGroup != null) __obj.updateDynamic("parameterGroup")(parameterGroup.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (productionSpecification != null) __obj.updateDynamic("productionSpecification")(productionSpecification.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceComponent]
  }
}

