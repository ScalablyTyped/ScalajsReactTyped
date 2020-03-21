package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.fhir.fhir.Resource because Already inherited */ trait Media extends DomainResource {
  /**
    * Contains extended information for property 'duration'.
    */
  var _duration: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'frames'.
    */
  var _frames: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'height'.
    */
  var _height: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'width'.
    */
  var _width: js.UndefOr[Element] = js.undefined
  /**
    * Procedure that caused this media to be created
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Body part in media
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Actual Media - reference or data
    */
  var content: Attachment
  /**
    * Encounter / Episode associated with media
    */
  var context: js.UndefOr[Reference] = js.undefined
  /**
    * Observing Device
    */
  var device: js.UndefOr[Reference] = js.undefined
  /**
    * Length in seconds (audio / video)
    */
  var duration: js.UndefOr[unsignedInt] = js.undefined
  /**
    * Number of frames if > 1 (photo)
    */
  var frames: js.UndefOr[positiveInt] = js.undefined
  /**
    * Height of the image in pixels (photo/video)
    */
  var height: js.UndefOr[positiveInt] = js.undefined
  /**
    * Identifier(s) for the image
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Comments made about the media
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * When Media was collected
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * When Media was collected
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  /**
    * The person who generated the image
    */
  var operator: js.UndefOr[Reference] = js.undefined
  /**
    * Why was event performed?
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Who/What this Media is a record of
    */
  var subject: js.UndefOr[Reference] = js.undefined
  /**
    * The type of acquisition equipment/process
    */
  var subtype: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * photo | video | audio
    */
  var `type`: code
  /**
    * Imaging view, e.g. Lateral or Antero-posterior
    */
  var view: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Width of the image in pixels (photo/video)
    */
  var width: js.UndefOr[positiveInt] = js.undefined
}

object Media {
  @scala.inline
  def apply(
    content: Attachment,
    `type`: code,
    _duration: Element = null,
    _frames: Element = null,
    _height: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _occurrenceDateTime: Element = null,
    _resourceType: Element = null,
    _type: Element = null,
    _width: Element = null,
    basedOn: js.Array[Reference] = null,
    bodySite: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    device: Reference = null,
    duration: Int | Double = null,
    extension: js.Array[Extension] = null,
    frames: Int | Double = null,
    height: Int | Double = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    occurrenceDateTime: dateTime = null,
    occurrencePeriod: Period = null,
    operator: Reference = null,
    reasonCode: js.Array[CodeableConcept] = null,
    resourceType: code = null,
    subject: Reference = null,
    subtype: CodeableConcept = null,
    text: Narrative = null,
    view: CodeableConcept = null,
    width: Int | Double = null
  ): Media = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_duration != null) __obj.updateDynamic("_duration")(_duration.asInstanceOf[js.Any])
    if (_frames != null) __obj.updateDynamic("_frames")(_frames.asInstanceOf[js.Any])
    if (_height != null) __obj.updateDynamic("_height")(_height.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_occurrenceDateTime != null) __obj.updateDynamic("_occurrenceDateTime")(_occurrenceDateTime.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_type != null) __obj.updateDynamic("_type")(_type.asInstanceOf[js.Any])
    if (_width != null) __obj.updateDynamic("_width")(_width.asInstanceOf[js.Any])
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn.asInstanceOf[js.Any])
    if (bodySite != null) __obj.updateDynamic("bodySite")(bodySite.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (frames != null) __obj.updateDynamic("frames")(frames.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (occurrenceDateTime != null) __obj.updateDynamic("occurrenceDateTime")(occurrenceDateTime.asInstanceOf[js.Any])
    if (occurrencePeriod != null) __obj.updateDynamic("occurrencePeriod")(occurrencePeriod.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (subtype != null) __obj.updateDynamic("subtype")(subtype.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Media]
  }
}

