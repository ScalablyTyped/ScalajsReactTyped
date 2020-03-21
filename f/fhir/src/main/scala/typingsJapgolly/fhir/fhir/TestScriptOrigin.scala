package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An abstract server representing a client or sender in a message exchange
  */
trait TestScriptOrigin extends BackboneElement {
  /**
    * Contains extended information for property 'index'.
    */
  var _index: js.UndefOr[Element] = js.undefined
  /**
    * The index of the abstract origin server starting at 1
    */
  var index: integer
  /**
    * FHIR-Client | FHIR-SDC-FormFiller
    */
  var profile: Coding
}

object TestScriptOrigin {
  @scala.inline
  def apply(
    index: integer,
    profile: Coding,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _index: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): TestScriptOrigin = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_index != null) __obj.updateDynamic("_index")(_index.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptOrigin]
  }
}

