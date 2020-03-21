package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Links this graph makes rules about
  */
trait GraphDefinitionLink extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'max'.
    */
  var _max: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'min'.
    */
  var _min: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'sliceName'.
    */
  var _sliceName: js.UndefOr[Element] = js.undefined
  /**
    * Why this link is specified
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Maximum occurrences for this link
    */
  var max: js.UndefOr[String] = js.undefined
  /**
    * Minimum occurrences for this link
    */
  var min: js.UndefOr[integer] = js.undefined
  /**
    * Path in the resource that contains the link
    */
  var path: String
  /**
    * Which slice (if profiled)
    */
  var sliceName: js.UndefOr[String] = js.undefined
  /**
    * Potential target for the link
    */
  var target: js.Array[GraphDefinitionLinkTarget]
}

object GraphDefinitionLink {
  @scala.inline
  def apply(
    path: String,
    target: js.Array[GraphDefinitionLinkTarget],
    _description: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _max: Element = null,
    _min: Element = null,
    _path: Element = null,
    _sliceName: Element = null,
    description: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    max: String = null,
    min: Int | Double = null,
    modifierExtension: js.Array[Extension] = null,
    sliceName: String = null
  ): GraphDefinitionLink = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_max != null) __obj.updateDynamic("_max")(_max.asInstanceOf[js.Any])
    if (_min != null) __obj.updateDynamic("_min")(_min.asInstanceOf[js.Any])
    if (_path != null) __obj.updateDynamic("_path")(_path.asInstanceOf[js.Any])
    if (_sliceName != null) __obj.updateDynamic("_sliceName")(_sliceName.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (sliceName != null) __obj.updateDynamic("sliceName")(sliceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphDefinitionLink]
  }
}

