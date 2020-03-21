package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Select codes/concepts by their properties (including relationships)
  */
trait ValueSetComposeIncludeFilter extends BackboneElement {
  /**
    * Contains extended information for property 'op'.
    */
  var _op: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'property'.
    */
  var _property: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.undefined
  /**
    * = | is-a | descendent-of | is-not-a | regex | in | not-in | generalizes | exists
    */
  var op: code
  /**
    * A property defined by the code system
    */
  var property: code
  /**
    * Code from the system, or regex criteria, or boolean value for exists
    */
  var value: code
}

object ValueSetComposeIncludeFilter {
  @scala.inline
  def apply(
    op: code,
    property: code,
    value: code,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _op: Element = null,
    _property: Element = null,
    _value: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): ValueSetComposeIncludeFilter = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_op != null) __obj.updateDynamic("_op")(_op.asInstanceOf[js.Any])
    if (_property != null) __obj.updateDynamic("_property")(_property.asInstanceOf[js.Any])
    if (_value != null) __obj.updateDynamic("_value")(_value.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetComposeIncludeFilter]
  }
}

