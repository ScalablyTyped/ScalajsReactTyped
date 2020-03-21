package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Link to another patient resource that concerns the same actual person
  */
trait PatientLink extends BackboneElement {
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * The other patient or related person resource that the link refers to
    */
  var other: Reference
  /**
    * replaced-by | replaces | refer | seealso - type of link
    */
  var `type`: code
}

object PatientLink {
  @scala.inline
  def apply(
    other: Reference,
    `type`: code,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _type: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): PatientLink = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_type != null) __obj.updateDynamic("_type")(_type.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatientLink]
  }
}

