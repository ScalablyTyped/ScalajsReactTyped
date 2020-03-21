package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Other elements required for this mapping (from context)
  */
trait ConceptMapGroupElementTargetDependsOn extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'property'.
    */
  var _property: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.undefined
  /**
    * Value of the referenced element
    */
  var code: String
  /**
    * Display for the code
    */
  var display: js.UndefOr[String] = js.undefined
  /**
    * Reference to property mapping depends on
    */
  var property: uri
  /**
    * Code System (if necessary)
    */
  var system: js.UndefOr[uri] = js.undefined
}

object ConceptMapGroupElementTargetDependsOn {
  @scala.inline
  def apply(
    code: String,
    property: uri,
    _code: Element = null,
    _display: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _property: Element = null,
    _system: Element = null,
    display: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    system: uri = null
  ): ConceptMapGroupElementTargetDependsOn = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    if (_code != null) __obj.updateDynamic("_code")(_code.asInstanceOf[js.Any])
    if (_display != null) __obj.updateDynamic("_display")(_display.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_property != null) __obj.updateDynamic("_property")(_property.asInstanceOf[js.Any])
    if (_system != null) __obj.updateDynamic("_system")(_system.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConceptMapGroupElementTargetDependsOn]
  }
}

