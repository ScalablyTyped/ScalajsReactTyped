package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transform Rule from source to target
  */
trait StructureMapGroupRule extends BackboneElement {
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Which other rules to apply in the context of this rule
    */
  var dependent: js.UndefOr[js.Array[StructureMapGroupRuleDependent]] = js.undefined
  /**
    * Documentation for this instance of data
    */
  var documentation: js.UndefOr[String] = js.undefined
  /**
    * Name of the rule for internal references
    */
  var name: id
  /**
    * Rules contained in this rule
    */
  var rule: js.UndefOr[js.Array[StructureMapGroupRule]] = js.undefined
  /**
    * Source inputs to the mapping
    */
  var source: js.Array[StructureMapGroupRuleSource]
  /**
    * Content to create because of this mapping rule
    */
  var target: js.UndefOr[js.Array[StructureMapGroupRuleTarget]] = js.undefined
}

object StructureMapGroupRule {
  @scala.inline
  def apply(
    name: id,
    source: js.Array[StructureMapGroupRuleSource],
    _documentation: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _name: Element = null,
    dependent: js.Array[StructureMapGroupRuleDependent] = null,
    documentation: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    rule: js.Array[StructureMapGroupRule] = null,
    target: js.Array[StructureMapGroupRuleTarget] = null
  ): StructureMapGroupRule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (_documentation != null) __obj.updateDynamic("_documentation")(_documentation.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (dependent != null) __obj.updateDynamic("dependent")(dependent.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMapGroupRule]
  }
}

