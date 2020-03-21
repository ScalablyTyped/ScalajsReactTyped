package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sample for analysis
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.fhir.fhir.Resource because Already inherited */ trait Specimen extends DomainResource {
  /**
    * Contains extended information for property 'receivedTime'.
    */
  var _receivedTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Identifier assigned by the lab
    */
  var accessionIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Collection details
    */
  var collection: js.UndefOr[SpecimenCollection] = js.undefined
  /**
    * Direct container of specimen (tube/slide, etc.)
    */
  var container: js.UndefOr[js.Array[SpecimenContainer]] = js.undefined
  /**
    * External Identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Comments
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * Specimen from which this specimen originated
    */
  var parent: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Processing and processing step details
    */
  var processing: js.UndefOr[js.Array[SpecimenProcessing]] = js.undefined
  /**
    * The time when specimen was received for processing
    */
  var receivedTime: js.UndefOr[dateTime] = js.undefined
  /**
    * Why the specimen was collected
    */
  var request: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * available | unavailable | unsatisfactory | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
  /**
    * Where the specimen came from. This may be from the patient(s) or from the environment or a device
    */
  var subject: Reference
  /**
    * Kind of material that forms the specimen
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

object Specimen {
  @scala.inline
  def apply(
    subject: Reference,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _receivedTime: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    accessionIdentifier: Identifier = null,
    collection: SpecimenCollection = null,
    contained: js.Array[Resource] = null,
    container: js.Array[SpecimenContainer] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    parent: js.Array[Reference] = null,
    processing: js.Array[SpecimenProcessing] = null,
    receivedTime: dateTime = null,
    request: js.Array[Reference] = null,
    resourceType: code = null,
    status: code = null,
    text: Narrative = null,
    `type`: CodeableConcept = null
  ): Specimen = {
    val __obj = js.Dynamic.literal(subject = subject.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_receivedTime != null) __obj.updateDynamic("_receivedTime")(_receivedTime.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (accessionIdentifier != null) __obj.updateDynamic("accessionIdentifier")(accessionIdentifier.asInstanceOf[js.Any])
    if (collection != null) __obj.updateDynamic("collection")(collection.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (processing != null) __obj.updateDynamic("processing")(processing.asInstanceOf[js.Any])
    if (receivedTime != null) __obj.updateDynamic("receivedTime")(receivedTime.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Specimen]
  }
}

